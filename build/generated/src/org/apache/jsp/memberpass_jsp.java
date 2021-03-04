package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberpass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<form action=\"./memberpass\" method=\"post\">\n");
      out.write("    <!--このHTML文で画像ファイルに入っているenoshimaの画像（jpg)を背景へ定める!-->\n");
      out.write("    <div style =\"margin-left:400px\"> <!--このHTML文で上部の/Zaikoweb/img/enoshima.jpgを左よりに表示する!-->\n");
      out.write("    </div><!--</div>で文字を整えることを閉じる!-->\n");
      out.write("     <div style =\"margin-left:550px\">\n");
      out.write("                     \n");
      out.write("         <BR>\n");
      out.write("         <BR>\n");
      out.write("         <BR>\n");
      out.write("         \n");
      out.write("   　 <font size=\"3\">会員の登録情報を表示します</font>\n");
      out.write("    <BR>\n");
      out.write("               <input type=\"hidden\" name=\"id\" rows=\"\" cols=\"\">\n");
      out.write("            <input type=\"hidden\" name=\"name\" rows=\"\" cols=\"\"><br><!--input type=\"hidden\"!でname=\"name\"という値だけ./allsyouhinへと送る!-->\n");
      out.write("     </div>\n");
      out.write("             <div style =\"margin-left:625px\">\n");
      out.write("            　<input type=\"submit\" value=\"会員情報一覧へ\"name=\"name\">\n");
      out.write("             </div>\n");
      out.write("             <div style =\"margin-left:620px\">\n");
      out.write("                 <BR>\n");
      out.write("                 <BR>\n");
      out.write("                 <BR>\n");
      out.write("                 \n");
      out.write("           \n");
      out.write("             </div>\n");
      out.write("     </div>\n");
      out.write("</form>\n");
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
