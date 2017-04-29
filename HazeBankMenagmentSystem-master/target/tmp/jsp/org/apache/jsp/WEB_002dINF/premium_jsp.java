package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class premium_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML>\n");
      out.write("\n");
      out.write("<html lang=\"pl\">\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n");
      out.write("        <link href=\"CSS/style.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <title>Zaloguj sie</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            \n");
      out.write("        </header>\n");
      out.write("        <main>\n");
      out.write("            <section class=\"login-containter\">\n");
      out.write("                <form action=\"profile\" method=\"post\">\n");
      out.write("                    <label>Login</label>\n");
      out.write("                    <input type=\"text\" name=\"login\" required/>\n");
      out.write("                    <label>Password</label>\n");
      out.write("                    <input type=\"text\" name=\"password\" required>\n");
      out.write("                    <button type=\"submit\">\n");
      out.write("                        Submit.\n");
      out.write("                    </button>\n");
      out.write("                </form>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("        <footer>\n");
      out.write("            \n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
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
