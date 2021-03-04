package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class zaikomenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("　　　　　　　                                          \n");
      out.write("    <title>JSP Page</title>\n");
      out.write("</head>\n");
      out.write("<div style=\"margin-left: 550px\">\n");
      out.write("      <a href=\"http://localhost:8080/Zaikoweb/zaikomenu.jsp\"><img src=\"/Zaikoweb/img/絵.jpg\" width=\"300px\"></a>\n");
      out.write("</div>\n");
      out.write("<body background=\"/Zaikoweb/img/木.jpg\"><!--このHTML文で画像ファイルに入っているenoshimaの画像（jpg)を背景へ定める!-->\n");
      out.write("    <div style =\"margin-left:400px\"> <!--このHTML文で上部の/Zaikoweb/img/木.jpgを左よりに表示する!-->\n");
      out.write("                  \n");
      out.write("        <div style=\"margin-left: 200px\"><!--メニュー画面という文字を中央に配置する!-->\n");
      out.write("           \n");
      out.write("                <font size=\"6\"color=\"#950000\"><marquee width=\"300\">不思議な一品があります！！！</marquee></font>\n");
      out.write("   \n");
      out.write("        </div><!--divを閉じる!-->\n");
      out.write("    <form action=\"./zaikomenu\" method=\"post\"><!--postを利用してzaikomenuのサーブレットへfromから/fromの内容を送る*/!--> \n");
      out.write("         \n");
      out.write("     　　　　　　　　　　　　　<input type=\"submit\" value=\"商品一覧ページへ\"name=\"syouhin\">\n");
      out.write("        <input type=\"submit\" value=\"検索ページへ\"name=\"kensaku\">\n");
      out.write("        <input type=\"submit\" value=\"管理人専用ページへ\"name=\"kanri\">\n");
      out.write("\n");
      out.write("        </p>\n");
      out.write("    </form>  \n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
