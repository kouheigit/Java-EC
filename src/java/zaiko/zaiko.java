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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;

/**
 *
 * @author user
 */
public class zaiko extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");/*この上のUTFとしたのUTFは絶対に書かなきゃだめ！！！*/
        request.setCharacterEncoding("UTF-8");
        //request オブジェクトに文字コード指定が必要

        try (PrintWriter out = response.getWriter()) {
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String id2 = "19920602";
            String name2 = "Syamugame";
            if ((id2.equals(id)) && (name2.equals(name))) {
                RequestDispatcher rc = request.getRequestDispatcher("/zaikokanri.jsp");/*サーブレットからJSPへ移動する場合はこの文章が必須*/
                rc.forward(request, response);
            } else {
                RequestDispatcher rc1 = request.getRequestDispatcher("/zaikokanripass.jsp");/*サーブレットからJSPへ移動する場合はこの文章が必須*/
                rc1.forward(request, response);
            }

            //「サーブレットとJSP」のスライドを参考に、
            //　1. リクエストスコープへの値の格納
            //  2. 次のJSPページを呼び出す
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
