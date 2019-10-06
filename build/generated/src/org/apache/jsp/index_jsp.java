package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/login.html");
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Mundo Alien</title>\n");
      out.write("        ");

            session.setAttribute("usuario", request.getParameter("usuario"));
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body class=\"bg-warning\">\n");
      out.write("        <h1>Bienvenido al mundo Alien</h1>\n");
      out.write("        \n");
      out.write("        <form action=\"iniciar\" method=\"post\">\n");
      out.write("            <div class=\"container col-lg-6 \">\n");
      out.write("                <label>Usuario:</label>\n");
      out.write("                <input type=\"text\" id=\"usuario\" name=\"usuario\" placeholder=\"Ingresa tu usuario\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container col-lg-6\">\n");
      out.write("                <label>Clave:</label>\n");
      out.write("                <input type=\"password\" name=\"clave\" placeholder=\"Ingresa tu clave\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container col-lg-6\">\n");
      out.write("                <button class=\"btn btn-primary\">Sumergirse</button>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"usuarioNuevo.jsp\">Registrate como nuevo alien</a>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
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
