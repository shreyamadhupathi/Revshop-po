/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-09-01 07:22:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.entity.User;
import java.util.List;
import com.entity.ProductDtls;
import com.DAO.ProductDAOImpl;
import com.DB.DBConnect;

public final class all_005fmilkproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/New%20folder/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Revpro_App/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/all_component/navbar.jsp", Long.valueOf(1725174711747L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1723702673464L));
    _jspx_dependants.put("/all_component/allcss.jsp", Long.valueOf(1723742202781L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(5);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.entity.User");
    _jspx_imports_classes.add("com.DAO.ProductDAOImpl");
    _jspx_imports_classes.add("com.entity.ProductDtls");
    _jspx_imports_classes.add("com.DB.DBConnect");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>All Milk Products</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\"\r\n");
      out.write("	integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"\r\n");
      out.write("	integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js\"\r\n");
      out.write("	integrity=\"sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css\"\r\n");
      out.write("	integrity=\"sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==\"\r\n");
      out.write("	crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("	\r\n");
      out.write("<link rel=\"stylesheet\" href=\"all_component/style.css\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("    font-family: Arial, sans-serif;\r\n");
      out.write("    background-color: #f4f4f4;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-section {\r\n");
      out.write("    padding: 50px 0;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text-center {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin-bottom: 50px;\r\n");
      out.write("    font-size: 2.5rem;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    gap: 20px;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    max-width: 1600px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-md-3 {\r\n");
      out.write("    flex: 1 1 calc(25% - 20px);\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-card {\r\n");
      out.write("    background: #fff;\r\n");
      out.write("    border: 1px solid #ddd;\r\n");
      out.write("    border-radius: 8px;\r\n");
      out.write("    padding: 15px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\r\n");
      out.write("    transition: transform 0.3s ease, box-shadow 0.3s ease;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    height: 420px;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-card img {\r\n");
      out.write("    width: 150px;\r\n");
      out.write("    height: 200px;\r\n");
      out.write("    object-fit: cover;\r\n");
      out.write("    border-radius: 8px;\r\n");
      out.write("    margin: 0 auto 15px;\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-card .product-name {\r\n");
      out.write("    font-size: 1.2rem;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("    height: auto;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    text-overflow: ellipsis;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-card .description {\r\n");
      out.write("    font-size: 0.9rem;\r\n");
      out.write("    color: #555;\r\n");
      out.write("    height: auto;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    text-overflow: ellipsis;\r\n");
      out.write("    margin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-card .price {\r\n");
      out.write("    font-size: 1.4rem;\r\n");
      out.write("    color: #e67e22;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    margin: 15px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-card .button-group {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    gap: 10px;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    margin-top: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-card .button-group a {\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    font-size: 1rem;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    transition: background-color 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-card .btn-details {\r\n");
      out.write("    background-color: #3498db;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-card .btn-details:hover {\r\n");
      out.write("    background-color: #2980b9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-card .btn-cart {\r\n");
      out.write("    background-color: #e67e22;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-card .btn-cart:hover {\r\n");
      out.write("    background-color: #d35400;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-card .btn-wishlist {\r\n");
      out.write("    background-color: #2ecc71;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-card .btn-wishlist:hover {\r\n");
      out.write("    background-color: #27ae60;\r\n");
      out.write("}\r\n");
      out.write("#toast {\r\n");
      out.write("	min-width: 300px;\r\n");
      out.write("	position: fixed;\r\n");
      out.write("	bottom: 30px;\r\n");
      out.write("	left: 50%;\r\n");
      out.write("	margin-left: -125px;\r\n");
      out.write("	background: #333;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	color: white;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	z-index: 1;\r\n");
      out.write("	font-size: 18px;\r\n");
      out.write("	visibility: hidden;\r\n");
      out.write("	box-shadow: 0px 0px 100px #000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#toast.display {\r\n");
      out.write("	visibility: visible;\r\n");
      out.write("	animation: fadeIn 0.5, fadeOut 0.5s 2.5s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes fadeIn {from { bottom:0;\r\n");
      out.write("	opacity: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("to {\r\n");
      out.write("	bottom: 30px;\r\n");
      out.write("	opacity: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("@keyframes fadeOut {form { bottom:30px;\r\n");
      out.write("	opacity: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("to {\r\n");
      out.write("	bottom: 0;\r\n");
      out.write("	opacity: 0;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

User u=(User)session.getAttribute("userobj"); 

      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- First Navbar -->\r\n");
      out.write("<div class=\"container-fluid p-3\">\r\n");
      out.write("	<div class=\"row\">\r\n");
      out.write("		<!-- Left side with \"Dairy\" text -->\r\n");
      out.write("		<div class=\"col-md-3\">\r\n");
      out.write("			<h3>Dairy</h3>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- Centered search form -->\r\n");
      out.write("		<div class=\"col-md-6\">\r\n");
      out.write("			<form class=\"form-inline my-2 my-lg-0 d-flex justify-content-center\"\r\n");
      out.write("				action=\"search.jsp\" method=\"post\">\r\n");
      out.write("				<input class=\"form-control mr-sm-2\" type=\"search\" name=\"ch\"\r\n");
      out.write("					placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("				<button class=\"btn btn-primary my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- Right-side login/register/logout buttons -->\r\n");
      out.write("		<div class=\"col-md-3 d-flex justify-content-end\">\r\n");
      out.write("			");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("			");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Second Navbar -->\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom\">\r\n");
      out.write("	<a class=\"navbar-brand\" href=\"#\"><i class=\"fa-solid fa-house\"></i></a>\r\n");
      out.write("	<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("		data-target=\"#navbarSupportedContent\"\r\n");
      out.write("		aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("		aria-label=\"Toggle navigation\">\r\n");
      out.write("		<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("	</button>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("		<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("			<li class=\"nav-item active\"><a class=\"nav-link\" href=\"index.jsp\">Home\r\n");
      out.write("					<span class=\"sr-only\">(current)</span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li class=\"nav-item dropdown\"><a\r\n");
      out.write("				class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\"\r\n");
      out.write("				data-toggle=\"dropdown\" aria-expanded=\"false\"> Products </a>\r\n");
      out.write("				<div class=\"dropdown-menu\">\r\n");
      out.write("					<a class=\"dropdown-item\" href=\"all_milkproduct.jsp\">Milk</a> <a\r\n");
      out.write("						class=\"dropdown-item\" href=\"all_paneer.jsp\">Paneer</a> <a\r\n");
      out.write("						class=\"dropdown-item\" href=\"all_ghee.jsp\">Ghee</a> <a\r\n");
      out.write("						class=\"dropdown-item\" href=\"all_curd.jsp\">Curd</a> <a\r\n");
      out.write("						class=\"dropdown-item\" href=\"all_icecream.jsp\">Ice Cream</a> <a\r\n");
      out.write("						class=\"dropdown-item\" href=\"all_milkshakes.jsp\">Milk Shake</a> <a\r\n");
      out.write("						class=\"dropdown-item\" href=\"all_lassi.jsp\">Lassi</a> <a\r\n");
      out.write("						class=\"dropdown-item\" href=\"all_icebars.jsp\">Ice Bars</a> <a\r\n");
      out.write("						class=\"dropdown-item\" href=\"all_cheese.jsp\">Cheese</a> <a\r\n");
      out.write("						class=\"dropdown-item\" href=\"all_others.jsp\">Others</a>\r\n");
      out.write("				</div></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		<form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("			<a href=\"settings.jsp\" class=\"btn btn-light my-2 my-sm-0\" type=\"submit\">Setting</a>\r\n");
      out.write("			<a href=\"contact.jsp\" class=\"btn btn-light my-2 my-sm-0 ml-2\" type=\"submit\">Contact\r\n");
      out.write("				Us</a>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	function confirmLogout() {\r\n");
      out.write("		if (confirm(\"Are you sure you want to log out?\")) {\r\n");
      out.write("			document.getElementById(\"logoutForm\").submit();\r\n");
      out.write("		}\r\n");
      out.write("		return false;\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("	<section class=\"product-section\">\r\n");
      out.write("		<h2 class=\"text-center\">Milk Products</h2>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			");
 
                ProductDAOImpl dao = new ProductDAOImpl(DBConnect.getConn());
                List<ProductDtls> milkList = dao.getAllMilkProduct();
                for(ProductDtls b : milkList) {
            
      out.write("\r\n");
      out.write("			<div class=\"col-md-3\">\r\n");
      out.write("				<div class=\"product-card\">\r\n");
      out.write("					<img src=\"products/");
      out.print(b.getPhotoName());
      out.write("\"\r\n");
      out.write("						alt=\"");
      out.print(b.getProductName());
      out.write("\">\r\n");
      out.write("					<p class=\"product-name\">");
      out.print(b.getProductName());
      out.write("</p>\r\n");
      out.write("					<p class=\"price\">\r\n");
      out.write("						Rs.");
      out.print(b.getPrice());
      out.write("/-\r\n");
      out.write("					</p>\r\n");
      out.write("					<div class=\"button-group\">\r\n");
      out.write("						<a href=\"view_products.jsp?pid=");
      out.print(b.getProductId());
      out.write("\"\r\n");
      out.write("							class=\"btn-details\">Details</a>\r\n");
      out.write("						");

						if (u == null) {
						
      out.write("\r\n");
      out.write("						<a href=\"login.jsp\" class=\"btn-cart\">Add to Cart</a> <a\r\n");
      out.write("							href=\"login.jsp\" class=\"btn-wishlist\">Add to Wishlist</a>\r\n");
      out.write("						");

						} else {
						
      out.write("\r\n");
      out.write("						<a href=\"cart?pid=");
      out.print(b.getProductId());
      out.write("&&uid=");
      out.print(u.getId());
      out.write("\"\r\n");
      out.write("							class=\"btn-cart\">Add to Cart</a> <a\r\n");
      out.write("							href=\"wishlist?pid=");
      out.print(b.getProductId());
      out.write("&&uid=");
      out.print(u.getId());
      out.write("\"\r\n");
      out.write("							class=\"btn-wishlist\">Add to Wishlist</a>\r\n");
      out.write("						");

						}
						
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			");
 } 
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /all_milkproduct.jsp(197,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty addCart }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("<div id=\"toast\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${addCart}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("<script type=\"text/javascript\">\r\n");
          out.write("		showToast();\r\n");
          out.write("		function showToast(content)\r\n");
          out.write("		{\r\n");
          out.write("		    $('#toast').addClass(\"display\");\r\n");
          out.write("		    $('#toast').html(content);\r\n");
          out.write("		    setTimeout(()=>{\r\n");
          out.write("		        $(\"#toast\").removeClass(\"display\");\r\n");
          out.write("		    },2000)\r\n");
          out.write("		}	\r\n");
          out.write("</script>\r\n");
          out.write("\r\n");
          if (_jspx_meth_c_005fremove_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fremove_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_005fremove_005f0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    boolean _jspx_th_c_005fremove_005f0_reused = false;
    try {
      _jspx_th_c_005fremove_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fremove_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /all_milkproduct.jsp(213,0) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fremove_005f0.setVar("addCart");
      // /all_milkproduct.jsp(213,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fremove_005f0.setScope("session");
      int _jspx_eval_c_005fremove_005f0 = _jspx_th_c_005fremove_005f0.doStartTag();
      if (_jspx_th_c_005fremove_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.reuse(_jspx_th_c_005fremove_005f0);
      _jspx_th_c_005fremove_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fremove_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fremove_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /all_component/navbar.jsp(27,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty userobj}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("				<a href=\"login.jsp\" class=\"btn btn-success ml-2\">Login</a>\r\n");
          out.write("				<a href=\"register.jsp\" class=\"btn btn-primary ml-2\">Register</a>\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /all_component/navbar.jsp(31,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty userobj}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("				<a href=\"checkout.jsp\" class=\"btn ml-2\"\r\n");
          out.write("					style=\"font-size: 1rem; color: black; text-decoration: none;\">\r\n");
          out.write("					<i class=\"fas fa-cart-shopping\"></i>\r\n");
          out.write("				</a>\r\n");
          out.write("				<a href=\"wishlist.jsp\" class=\"btn ml-2\"\r\n");
          out.write("					style=\"font-size: 1rem; color: red; text-decoration: none;\"> <i\r\n");
          out.write("					class=\"fas fa-heart\"></i>\r\n");
          out.write("				</a>\r\n");
          out.write("				<a href=\"login.jsp\" class=\"btn btn-success ml-2\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userobj.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("				<a href=\"logout\" class=\"btn btn-success ml-2\">Logout</a>\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }
}
