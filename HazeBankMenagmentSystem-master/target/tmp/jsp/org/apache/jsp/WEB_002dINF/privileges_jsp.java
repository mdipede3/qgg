package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.domain.AccessSystemApplication.User.iRegisterUser;
import com.Models.UserRepository;

public final class privileges_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=windows-1250");
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

    UserRepository userRepository = new UserRepository();
    List<iRegisterUser> userList  = userRepository.getUserRepository().getUserList();

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1250\">\n");
      out.write("        <title>Privileges</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("         ");

    for (iRegisterUser user : userList ) {
        
      out.write("\n");
      out.write("        <TR>\n");
      out.write("        <TD>");
      out.print( user.getName() );
      out.write("</TD>\n");
      out.write("        ");

    if (user.getTypeUser().equals("Premium") ) {
        
      out.write("\n");
      out.write("        <td>Posiada status Premium</td>\n");
      out.write("        ");

    } else {
        
      out.write("\n");
      out.write("        <td>");
      out.print( user.getTypeUser() );
      out.write("</td>\n");
      out.write("        ");

    }

      out.write("\n");
      out.write("        </TR>\n");
      out.write("        ");

    }

      out.write("\n");
      out.write("        </table>\n");
      out.write("        <section>\n");
      out.write("            <form auction=\"changePrivileges\" method=\"post\">\n");
      out.write("            <p>Zmien uprawnienia</p>\n");
      out.write("            <select name=\"userid\">\n");
      out.write("                ");

        for (iRegisterUser user: userList ) {
        
      out.write("\n");
      out.write("        <option value=");
      out.print(user.getId() );
      out.write(" > ");
      out.print(user.getName());
      out.write("</option>\n");
      out.write("        ");

    }

      out.write("\n");
      out.write("            </select>\n");
      out.write("            <button value=\"add\"name=\"change\" type=\"submit\">Dodaj uprawnienia</button>\n");
      out.write("            <button  value=\"remove\" name=\"change\" type=\"submit\">Usun uprawnienia</button>\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("    \n");
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
