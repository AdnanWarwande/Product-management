package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Login</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div align=\"center\">\n");
      out.write("            <form action=\"processLogin.jsp\" method=\"post\" class=\"loginForm\">\n");
      out.write("                <h1>PRODUCT MANAGEMENT SYSTEM</h1>                  <br><br>\n");
      out.write("\t\t\t<label for=\"userName\">User Name</label>\n");
      out.write("                        <input type=\"text\" id=\"userName\" name=\"userName\" class=\"searchTextField\"/><br><br>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<label for=\"password\">Password</label>\n");
      out.write("                                        <input type=\"password\" id=\"password\" name=\"password\" class=\"searchTextField\"/><br><br>\n");
      out.write("                                            <input type=\"submit\" value=\"Login\" class=\"actionBtn\" /><br>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("\t<br>\n");
      out.write("                <b >Don't have an  account? &nbsp;&nbsp;</b><a href='registration.jsp' style=\"color:blue;\">Register</a>\n");
      out.write("               \t\t\n");
      out.write("\t\t</form>\n");
      out.write("            \n");
      out.write("\n");
      out.write("\t</div>\n");
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
