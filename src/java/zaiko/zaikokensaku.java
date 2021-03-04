/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaiko;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author user
 */
public class zaikokensaku extends HttpServlet {
            Connection db_con = null;
    PreparedStatement db_st = null;
    ResultSet db_data = null;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
             
                String name = request.getParameter("name");
                String Number = request.getParameter("Number");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db", "root", "");
                db_st = db_con.prepareStatement("select * from zaiko where name like ?");
                if(name ==null){
                    RequestDispatcher rc = request.getRequestDispatcher("./zaikokensaku.jsp");/*サイトを指定する場合はこの文が必須*/
                   rc.forward(request, response);
                }else{
                    db_st.setString(1,"%"+name+"%");
                     
                }
                db_data = db_st.executeQuery();
                while (db_data.next()) {
                  out.print("<div style = margin-left: 800px>");
                   out.print("名前：" + db_data.getString("name") + "<br>");
                     out.print("値段：" + db_data.getString("Number") + "<br>");
                       /*out.print("<img src='/Zaikoweb/img/" + db_data.getString("id") +".jpg' style='width:200px' >");*/
                           out.print("<a href='./zaikolast?id="+db_data.getString("id")+"'><img src='/Zaikoweb/img/" + db_data.getString("id") +".jpg' style='width:200px' ></a>");/*imgファイルの画像をid番号順に出力するコード.jpg' の部分をjpegに変換すればjpegファイルになる*/
                    out.print("</div>");
                }
                db_con.close();
                db_st.close();
                db_con.close();
            } catch (SQLException e_sql) {
                System.out.print("接続時にエラーが発生しています" + e_sql.toString());
            } catch (Exception e) {
                System.out.print("接続時にエラーが発生しています" + e.toString());
            } finally {
                if (db_con != null) {
                    try {
                        db_con.close();

                    } catch (Exception e) {
                        System.out.print(e.getMessage());
                    }
                }
            }
        }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
