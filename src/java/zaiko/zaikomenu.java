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
import java.sql.*;


/**
 *
 * @author user
 */
public class zaikomenu extends HttpServlet {
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
        try (PrintWriter out = response.getWriter()) {
             String syouhin = request.getParameter("syouhin");
              String kensaku = request.getParameter("kensaku");
               String kanrinin = request.getParameter("kanri");
               String id1 = "商品一覧ページへ";
               String id2 = "検索ページへ";
               String id3 = "管理人専用ページへ";               
              if(id1.equals(syouhin)){
                  RequestDispatcher rc = request.getRequestDispatcher("./zaikosyouhin.jsp");/*サイトを指定する場合はこの文が必須*/
                   rc.forward(request, response);
              }else if(id2.equals(kensaku)){
                  RequestDispatcher rc1 = request.getRequestDispatcher("./zaikokensaku.jsp");
                  rc1.forward(request, response);
              }else if(id3.equals(kanrinin)){
                  RequestDispatcher rc2 = request.getRequestDispatcher("./zaikokanripass.jsp");
                  rc2.forward(request, response);
                      }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet zaikomenu</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet zaikomenu at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
