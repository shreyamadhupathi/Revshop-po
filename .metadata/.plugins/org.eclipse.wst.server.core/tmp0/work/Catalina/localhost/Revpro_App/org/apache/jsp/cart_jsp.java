/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-08-27 17:51:07 UTC
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

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/New%20folder/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Revpro_App/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/all_component/navbar.jsp", Long.valueOf(1724780755318L));
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
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Your Cart</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        .container {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            margin: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cart, .details {\r\n");
      out.write("            width: 60%;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cart {\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            padding-bottom: 20px;\r\n");
      out.write("            box-shadow: 0 4px 8px rgba(0,0,0,0.1);\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            background-color: #f9f9f9;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h2 {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .table-responsive {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            overflow-x: auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        table {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        table, th, td {\r\n");
      out.write("            border: 1px solid #ddd;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th, td {\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th {\r\n");
      out.write("            background-color: #f2f2f2;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .remove-btn {\r\n");
      out.write("            color: white;\r\n");
      out.write("            background-color: red;\r\n");
      out.write("            border: none;\r\n");
      out.write("            padding: 5px 10px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .quantity-btn {\r\n");
      out.write("            border: none;\r\n");
      out.write("            padding: 5px 10px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .quantity-btn.minus {\r\n");
      out.write("            background-color: red;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .quantity-btn.plus {\r\n");
      out.write("            background-color: green;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-row {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-group {\r\n");
      out.write("            margin-bottom: 15px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-group label {\r\n");
      out.write("            margin-bottom: 5px;\r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-group input, .form-group select {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 8px;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-check-input {\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        .btn {\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            border: none;\r\n");
      out.write("            color: white;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("    ");
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- First Navbar -->\r\n");
      out.write("<div class=\"container-fluid p-3\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <!-- Left side with \"Dairy\" text -->\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <h3>Dairy</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Centered search form -->\r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0 d-flex justify-content-center\">\r\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("                <button class=\"btn btn-primary my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <!-- Right-side login/register/logout buttons -->\r\n");
      out.write("        <div class=\"col-md-3 d-flex justify-content-end\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Second Navbar -->\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\"><i class=\"fa-solid fa-house\"></i></a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item dropdown\">\r\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                    Products\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"dropdown-menu\">\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"all_milkproduct.jsp\">Milk</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"all_paneer.jsp\">Paneer</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"all_ghee.jsp\">Ghee</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"all_curd.jsp\">Curd</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"all_icecream.jsp\">Ice Cream</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"all_milkshakes.jsp\">Milk Shake</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"all_lassi.jsp\">Lassi</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"all_icebars.jsp\">Ice Bars</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"all_cheese.jsp\">Cheese</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"all_others.jsp\">Others</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("            <button class=\"btn btn-light my-2 my-sm-0\" type=\"submit\">Setting</button>\r\n");
      out.write("            <button class=\"btn btn-light my-2 my-sm-0 ml-2\" type=\"submit\">Contact Us</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function confirmLogout() {\r\n");
      out.write("        if (confirm(\"Are you sure you want to log out?\")) {\r\n");
      out.write("            document.getElementById(\"logoutForm\").submit();\r\n");
      out.write("        }\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <!-- Cart Section -->\r\n");
      out.write("        <div class=\"cart\">\r\n");
      out.write("            <h2>Your Items in Cart</h2>\r\n");
      out.write("            <div class=\"table-responsive\">\r\n");
      out.write("                <table>\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Product Name</th>\r\n");
      out.write("                            <th>Quantity</th>\r\n");
      out.write("                            <th>Price</th>\r\n");
      out.write("                            <th>Action</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <!-- Static Example Row -->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Sample Product</td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <button class=\"quantity-btn minus\">-</button>\r\n");
      out.write("                                1\r\n");
      out.write("                                <button class=\"quantity-btn plus\">+</button>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>$10.00</td>\r\n");
      out.write("                            <td><button class=\"remove-btn\">Remove</button></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- User Details Form Section -->\r\n");
      out.write("        <div class=\"details\">\r\n");
      out.write("            <h2>Your Details</h2>\r\n");
      out.write("            <form action=\"#\" method=\"post\">\r\n");
      out.write("                <div class=\"form-row\">\r\n");
      out.write("                    <div class=\"form-group col-md-6\">\r\n");
      out.write("                        <label for=\"name\">Name</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"Name\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group col-md-6\">\r\n");
      out.write("                        <label for=\"email\">Email</label>\r\n");
      out.write("                        <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Email\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-row\">\r\n");
      out.write("                    <div class=\"form-group col-md-6\">\r\n");
      out.write("                        <label for=\"mobile\">Mobile</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"mobile\" placeholder=\"Mobile\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group col-md-6\">\r\n");
      out.write("                        <label for=\"landmark\">Landmark</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"landmark\" placeholder=\"Landmark\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"address\">Address</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"1234 Main St\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-row\">\r\n");
      out.write("                    <div class=\"form-group col-md-4\">\r\n");
      out.write("                        <label for=\"state\">State</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"state\" placeholder=\"State\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group col-md-4\">\r\n");
      out.write("                        <label for=\"city\">City</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"city\" placeholder=\"City\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group col-md-4\">\r\n");
      out.write("                        <label for=\"zip\">Zip</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"zip\" placeholder=\"Zip\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"paymentType\">Payment Type</label>\r\n");
      out.write("                    <select id=\"paymentType\" class=\"form-control\">\r\n");
      out.write("                        <option selected>Choose...</option>\r\n");
      out.write("                        <option>Credit Card</option>\r\n");
      out.write("                        <option>Debit Card</option>\r\n");
      out.write("                        <option>PayPal</option>\r\n");
      out.write("                        <option>Cash on Delivery</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"text-center form-buttons\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-warning\">Order Now</button>\r\n");
      out.write("                    <a href=\"index.jsp\" class=\"btn btn-success\" >Continue Shopping</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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
      // /all_component/navbar.jsp(25,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty userobj}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <a href=\"login.jsp\" class=\"btn btn-success ml-2\">Login</a>\r\n");
          out.write("                <a href=\"register.jsp\" class=\"btn btn-primary ml-2\">Register</a>\r\n");
          out.write("            ");
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
      // /all_component/navbar.jsp(29,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty userobj}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            	<a href=\"cart.jsp\"class=\"btn btn-success ml-2\">Cart</a>\r\n");
          out.write("                <a href=\"login.jsp\" class=\"btn btn-success ml-2\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userobj.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                <a href=\"logout\" class=\"btn btn-success ml-2\">Logout</a>\r\n");
          out.write("            ");
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
}
