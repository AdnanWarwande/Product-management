package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ProductManagementDAO;
import pojo.Product;
import java.util.*;

public final class addProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Add Product</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"height:97.5vh;\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

	if(session.getAttribute("userName") == null)
	{
		response.sendRedirect("login.jsp"); 
	}
	
      out.write("\r\n");
      out.write("<nav class=\"navbar\" style=\"background-image: linear-gradient(65deg,black,black);border: 1px solid #ffffff\">\r\n");
      out.write("\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t\t\t<li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"addProduct.jsp\">Add Product</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"viewProducts.jsp\">View Products</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"searchProduct.jsp\">Search Product</a></li>\r\n");
      out.write("\t\t\t<li style=\"float:right;margin-right:10px\"><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<form action=\"processAddProduct.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t<table class=\"productTable\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\tProduct Details\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Product ID</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"prodId\" size=\"20\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"productTextField\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Product Name</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"prodName\" size=\"20\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"productTextField\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Category</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"prodCategory\" size=\"20\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"productTextField\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Price</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"prodPrice\" size=\"20\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"productTextField\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("                    <button class=\"actionBtn\" style=\"margin-top:10px; border: 1px solid #ffffff\">Add</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
