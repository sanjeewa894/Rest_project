package org.apache.jsp.GUI;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class activity_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Neth Fm</title>\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7; IE=EmulateIE9\">\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\n");
      out.write("        <script src=\"js/jquery1.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("    $(function() {\n");
      out.write("       $( \"#s_date\" ).datepicker();\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("    $(function() {\n");
      out.write("       $( \"#e_date\" ).datepicker();\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t\t\t<!-- freshdesignweb top bar -->\n");
      out.write("            \n");
      out.write("            <div class=\"clr\"></div>\n");
      out.write("\t\t\t<header>\n");
      out.write("\t\t\t\t<h1>Activity</h1>\n");
      out.write("            </header>       \n");
      out.write("      <div  class=\"form\">\n");
      out.write("    \t\t\n");
      out.write("                      <form id=\"contactform\" action=\"/Projectvigo/webresources/entity.activitytab/intuser\" method=\"POST\"> \n");
      out.write("                         \n");
      out.write("                        <p class=\"contact\"><label for=\"A\">Activity_seq</label></p><br> \n");
      out.write("                        <input id=\"Activityseq\" name=\"activityseq\" placeholder=\"State\" required=\"\" type=\"text\"> <br>\n");
      out.write("         \n");
      out.write("                        <p class=\"contact\"><label for=\"activity_id\">Activity Id</label></p><br>\n");
      out.write("    \t\t\t<input id=\"activity_id\" name=\"activityid\" placeholder=\"ID\" required=\"\" tabindex=\"1\" type=\"text\"> \n");
      out.write("    \t\t\t<br>\n");
      out.write("    \t\t\t \n");
      out.write("    \t\t\t<p class=\"contact\"><label for=\"description\">Description</label></p><br>\n");
      out.write("    \t\t\t<input id=\"description\" name=\"description\" placeholder=\"Description\" required=\"\" type=\"text\"> \n");
      out.write("    \t\t\t<br>\n");
      out.write("                \n");
      out.write("                <p class=\"contact\"><label for=\"responsible\">Responsible</label></p><br>\n");
      out.write("    \t\t\t<input id=\"responsible\" name=\"responsible\" placeholder=\"Responsible\" required=\"\" tabindex=\"2\" type=\"text\"> \n");
      out.write("    \t\t\t<br>\n");
      out.write("    \t\t\n");
      out.write("                <div>\n");
      out.write("                   <label>Start Date</label><br><br>\n");
      out.write("                   <input type=\"text\" id=\"s_date\" name=\"sdate\">\n");
      out.write("               </div>\n");
      out.write("  \n");
      out.write("           \n");
      out.write("              <div>\n");
      out.write("                   <label>End Date</label><br><br>\n");
      out.write("                   <input type=\"text\" id=\"e_date\" name=\"edate\">\n");
      out.write("               </div>\n");
      out.write("              \n");
      out.write("            \n");
      out.write("            <p class=\"contact\"><label for=\"state\">State</label></p><br> \n");
      out.write("            <input id=\"state\" name=\"state\" placeholder=\"State\" required=\"\" type=\"text\"> <br>\n");
      out.write("            \n");
      out.write("            <p class=\"contact\"><label for=\"state\">site_id</label></p><br> \n");
      out.write("            <input id=\"site_id\" name=\"siteid\" placeholder=\"State\" required=\"\" type=\"text\"> <br>\n");
      out.write("            \n");
      out.write("            <p class=\"contact\"><label for=\"state\">promotion_id</label></p><br> \n");
      out.write("            <input id=\"promotion_id\" name=\"promotionid\" placeholder=\"State\" required=\"\" type=\"text\"> <br>\n");
      out.write("            \n");
      out.write("            <p class=\"contact\"><label for=\"state\">parent_id</label></p><br> \n");
      out.write("            <input id=\"parent_id\" name=\"parentid\" placeholder=\"State\" required=\"\" type=\"text\"> <br>\n");
      out.write("            \n");
      out.write("          \n");
      out.write("            <p class=\"contact\"><label for=\"state\">note</label></p><br> \n");
      out.write("            <input id=\"note\" name=\"note\" placeholder=\"State\" required=\"\" type=\"text\"> <br>\n");
      out.write("           \n");
      out.write("            <input type=\"submit\" value=\"Sumbit\" />\n");
      out.write("   </form> \n");
      out.write("</div>      \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
