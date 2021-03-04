/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaiko;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.sql.*;
import javax.servlet.RequestDispatcher;

/*問題点、サーブレットクラスの下部で大量のエラーが発生している、kadai17-8からデータが送れない*/
/**
 *
 * @author user
 */
public class zaikosss extends HttpServlet {

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
            try {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db", "root", "");
                db_st = db_con.prepareStatement("select * from pass where id = ? and name = ?");
                db_st.setString(1, id);/*この場合データベースの左側に苗字（吉田茂）がそんざいするため、%を左側につける*/
                db_st.setString(2, name);

                db_data = db_st.executeQuery();
                if (db_data.next()) {
                    RequestDispatcher rc = request.getRequestDispatcher("/zaikomenu.jsp");/*サーブレットからJSPへ移動する場合はこの文章が必須*/
                    rc.forward(request, response);

                } else {
                    RequestDispatcher rc = request.getRequestDispatcher("/zaiko.jsp");/*サーブレットからJSPへ移動する場合はこの文章が必須*/
                    rc.forward(request, response);
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
