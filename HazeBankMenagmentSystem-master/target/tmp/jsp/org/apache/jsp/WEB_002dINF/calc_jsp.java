package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>HazeBankCredit</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <header>\n");
      out.write("        <p class=\"logo\"><img src=\"Image/coin.png\" class=\"logo_coin_size\" alt=\"logo coin\"></img>HazeBank Credit</p>\n");
      out.write("      </header>\n");
      out.write("    <main class=\"app\">\n");
      out.write("        <p class=\"app_text\" id=\"app_text\"> Ustaw wartosci dla kredytu </p>\n");
      out.write("        <section>\n");
      out.write("            <form id=\"form\" action=\"summary\" method=\"post\">\n");
      out.write("                <table>\n");
      out.write("                  <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                <td><label>Kwota kredytu:</td><td><input class=\"test-element\" type=\"text\" name=\"summaryCredit\" required/></td></label>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                <td><label>Ilosc rat :</td><td><input class=\"test-element\" type=\"text\" name=\"stock\" required/></label></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                <td><label>Oprocentoanie:</td><td><input class=\"test-element\" type=\"text\" name=\"percentCredit\" required/></td></label>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td><label>Opłata stała:</td><td><input class=\"test-element\" type=\"text\" name=\"constantFee\" required/></td></label>\n");
      out.write("              </tr>\n");
      out.write("            </tbody>\n");
      out.write("          </table>\n");
      out.write("                <label>\n");
      out.write("                <select class=\"app_select\" name=\"select\">\n");
      out.write("                <option value=\"constant\"> Rata Stała</option>\n");
      out.write("                <option value=\"less\"> Rata malejąca </option>\n");
      out.write("                </select>\n");
      out.write("                </label>\n");
      out.write("                  <section class=\"app_buttons\">\n");
      out.write("                  <div>\n");
      out.write("                  <p class=\"app_buttons_line\"><button  class=\"app_button\" type=\"submit\" name=\"getPdf\" value=\"Get Pdf\" /><img class=\"app_button_image_pdf\" src=\"Image/button_pdf.jpg\"></img></button></p><p class=\"app_buttons_line\" >Pobierz PDF</p>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"app_buttons_row\">\n");
      out.write("                  <p class=\"app_buttons_line\"><button class=\"app_button\" type=\"submit\" name=\"getPdf\" value=\"Send\" /><img class=\"app_button_image_html\" src=\"Image/button_html.png\"></img></button></p><p class=\"app_buttons_line app_buttons_line_padding\">Wyswietl Tabele</p>\n");
      out.write("                </div>\n");
      out.write("              </section>\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("    </main>\n");
      out.write("    <footer>\n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("    <script src=\"Client/client.min.js\"></script>\n");
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
