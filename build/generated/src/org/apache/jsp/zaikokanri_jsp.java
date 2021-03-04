package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class zaikokanri_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("    <form action=\"./zaikokanri\" method=\"post\">\n");
      out.write("        <BR>\n");
      out.write("        <BR>\n");
      out.write("        <BR>\n");
      out.write("        <div style=\"margin-left: 550px\">\n");
      out.write("            <input type=\"submit\" value=\"商品登録ページへ\"name=\"syouhinadd\">\n");
      out.write("            <BR>\n");
      out.write("            <BR>\n");
      out.write("            <BR>\n");
      out.write("\n");
      out.write("            <input type=\"button\" value=\"商品削除ページへ\" onClick=\"location.href = 'http://localhost:8080/Zaikoweb/syouhinsakujo.jsp'\">\n");
      out.write("            <BR>\n");
      out.write("            <BR>\n");
      out.write("            <BR>\n");
      out.write("            <input type=\"button\" value=\"会員情報一覧ページへ\" onClick=\"location.href = 'http://localhost:8080/Zaikoweb/memberpass.jsp'\">\n");
      out.write("              <BR>\n");
      out.write("            <BR>\n");
      out.write("            <BR>\n");
      out.write("            <input type=\"button\" value=\"会員情報削除ページへ\" onClick=\"location.href = 'http://localhost:8080/Zaikoweb/membersakujo.jsp'\">\n");
      out.write("            </form>  \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
