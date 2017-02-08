/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.19.v20160908
 * Generated at: 2017-02-08 16:44:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>My Profile</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<style>\n");
      out.write("body{padding-top:30px;}\n");
      out.write("\n");
      out.write(".glyphicon {  margin-bottom: 10px;margin-right: 10px;}\n");
      out.write("\n");
      out.write("small {\n");
      out.write("display: block;\n");
      out.write("line-height: 1.428571429;\n");
      out.write("color: #999;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t    <div class=\"row\">\n");
      out.write("\t        <div class=\"col-xs-12 col-sm-8 col-md-8\">\n");
      out.write("\t            <div class=\"well well-sm\">\n");
      out.write("\t                <div class=\"row\">\n");
      out.write("\t                    <div class=\"col-sm-6 col-md-4\">\n");
      out.write("\t                        <img src=\"");
      out.print( (request.getAttribute("urlPhoto") == "" ? "http://placehold.it/380x500" : request.getAttribute("urlPhoto")) );
      out.write("\" alt=\"\" class=\"img-rounded img-responsive\" />\n");
      out.write("\t                    </div>\n");
      out.write("\t                    <div class=\"col-sm-6 col-md-8\">\n");
      out.write("\t                        <h4>\n");
      out.write("\t                            My Profile\n");
      out.write("\t                         \t&nbsp;|&nbsp;<a href=\"/logout\">Logout</a>\n");
      out.write("\t                         </h4>\n");
      out.write("\t                        <p>\n");
      out.write("\t                            <label>User ID: &nbsp;</label>");
      out.print( request.getAttribute("userId") );
      out.write("\n");
      out.write("\t                            <br />\n");
      out.write("\t                            <label>Email: &nbsp;</label>");
      out.print( request.getAttribute("email") );
      out.write("\n");
      out.write("\t                            <br />\n");
      out.write("\t                            <label>Created Date: &nbsp;</label>");
      out.print( request.getAttribute("createdDate") );
      out.write("\n");
      out.write("\t                        \t<br />\n");
      out.write("\t                            <label>Photo URL: &nbsp;</label></i>");
      out.print( request.getAttribute("urlPhoto") );
      out.write("\n");
      out.write("\t                        </p>\n");
      out.write("\t                        <!-- Split button -->\n");
      out.write("\t                        <div class=\"btn-group\">\n");
      out.write("\t                            <form action=\"uploadServlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"file\" name=\"file\" size=\"50\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-primary\" value=\"Upload File\" />\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t                        </div>\n");
      out.write("\t                        \n");
      out.write("\t                    </div>\n");
      out.write("\t                </div>\n");
      out.write("\t            </div>\n");
      out.write("\t        </div>\n");
      out.write("\t    </div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<script src=\"http://code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
}
