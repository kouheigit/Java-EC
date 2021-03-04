package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class zaiko_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     <form action=\"./zaikosss\" method=\"post\"><!--この文でkadai17twelveへ送る!-->\n");
      out.write("           <div style =\"margin-left: 800px\">\n");
      out.write("         <body background=\"/Zaikoweb/img/ザイコ.jpg\"><!--このHTML文で画像ファイルに入っているenoshimaの画像（jpg)を背景へ定める!-->\n");
      out.write("           </div>\n");
      out.write("         <BR>\n");
      out.write("         <div style=\"margin-left: 603px\">\n");
      out.write("         <font size=\"6\"><marquee width=\"200\"color=\"#fbfdff\">ようこそ</marquee></font>\n");
      out.write("         </div>\n");
      out.write("          <div style=\"margin-left: 580px\">\n");
      out.write("              <font size=\"3\"color=\"#fbfdff\"> <p><label for=\"id\"><big>ID</big></label></font>\n");
      out.write("        <input type=\"text\" name=\"id\" /></p>\n");
      out.write("          </div>\n");
      out.write("           <div style=\"margin-left: 520px\">\n");
      out.write("               <font size=\"3\"color=\"#fbfdff\">  <p><label for=\"pwd\"><big>パスワード</big></label></font>\n");
      out.write(" <input type=\"password\" name=\"name\"/>\n");
      out.write("  <BR>\n");
      out.write("   <div style=\"margin-left: 90px\">\n");
      out.write(" <p><button type=\"submit\">ログイン</button></p>\n");
      out.write("  <div style=\"margin-bottom: 200px\">\n");
      out.write("       <a href=\"http://localhost:8080/Zaikoweb/zaikopass.jsp\"> <font size=\"5\"color=\"#00FFFF\"><marquee height=\"50\" width=\"100\" behavior=\"alternate\" direction=\"up\" scrollamount=\"5\" truespeed>会員登録</font></a>\n");
      out.write("          </div>\n");
      out.write("           </div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
