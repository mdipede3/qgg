package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Models.Renders.HTMLPresenter;
import com.domain.AccessSystemApplication.User.iRegisterUser;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

   
    HTMLPresenter presenter = new HTMLPresenter(request,response,"user");
    
 
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n");
      out.write("        <link href=\"./CSS/style.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1250\">\n");
      out.write("        <title>Profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <header class=\"profile-header-conatainer\">\n");
      out.write("           <a href=\"logout\">LogOut</a>\n");
      out.write("       </header>\n");
      out.write("        <main class=\"profile-container\">\n");
      out.write("            <section class=\"profile-wrapper\">\n");
      out.write("                <p> Hello</p>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                    <td>UserName</td><td>");
      out.print(presenter.presentName());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password</td><td>");
      out.print(presenter.presentPassword());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email</td><td>");
      out.print(presenter.presentEmail());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </section>\n");
      out.write("             \n");
      out.write("        </main>\n");
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
