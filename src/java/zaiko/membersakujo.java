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
import java.sql.*;

/**
 *
 * @author user
 */
public class membersakujo extends HttpServlet {
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
        try (PrintWriter out = response.getWriter()) {
             try {
                 request.setCharacterEncoding("UTF-8");
                String id = request.getParameter("id");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db", "root", "");
             db_st = db_con.prepareStatement("DELETE FROM pass WHERE id = ?");
            db_st.setString(1,id);
             db_st.executeUpdate();
            db_data = db_st.executeQuery();
            while (db_data.next()) {
                System.out.print("削除が完了しました");
                System.out.print("ID：" + db_data.getString("id") + "<br>");
                System.out.print("名前：" + db_data.getString("name") + "<br>");
                System.out.print("年齢：" + db_data.getString("Numver") + "<br>");
            }
            db_data.close();
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
