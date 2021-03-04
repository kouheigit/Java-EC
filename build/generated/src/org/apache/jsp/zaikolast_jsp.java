package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class zaikolast_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String id = (String) request.getAttribute("id");
    String name = (String) request.getAttribute("name");
    String Number = (String) request.getAttribute("Number");


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style =\"margin-left: 440px\">\n");
      out.write("              <h1>以下の商品を購入でよろしいでしょうか？</h1>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <div style =\"margin-left:600px\">\n");
      out.write("            \n");
      out.write("        <form action=\"./zaikolast1\" method=\"post\">\n");
      out.write("            <BR>\n");
      out.write("     \n");
      out.write("            <BIG>");
 out.print(name); 
      out.write("</BIG><br>\n");
      out.write("            <BIG>");
 out.print(Number); 
      out.write("円</BIG><br>\n");
      out.write("            <img src='/Zaikoweb/img/");
out.print(id);
      out.write(".jpg' style='width:200px' >\n");
      out.write("            <BR>\n");
      out.write("            <BR>\n");
      out.write("            <BR>\n");
      out.write("            <a>いくつ購入されますか？</a> \n");
      out.write("            <select name=\"buy\">\n");
      out.write("                \n");
      out.write("                <option value=\"1\">1</option>\n");
      out.write("                <option value=\"2\">2</option>\n");
      out.write("                <option value=\"3\">3</option>\n");
      out.write("                <option value=\"4\">4</option>\n");
      out.write("                <option value=\"5\">5</option>\n");
      out.write("                <input type=\"hidden\" name= \"name\" value='");
 out.print( name ); 
      out.write("'>\n");
      out.write("                  <input type=\"hidden\" name=\"Number\"value='");
out.print( Number );
      out.write("'>\n");
      out.write("                  \n");
      out.write("            </select>\n");
      out.write("        </p>\n");
      out.write("        <p><input type=\"submit\" value=\"購入する\"></p>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
      out.write("</form>\n");
      out.write("</body>\n");
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
