package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class interfazLector_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/html/Lector.html");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<html class=\"wide wow-animation\" lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Alien</title>\n");
      out.write("        <link rel=\"icon\" href=\"images/arriba.png\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--Crea una espera antes de cargar la pagina principal-->\n");
      out.write("        <div class=\"preloader\">\n");
      out.write("            <div class=\"preloader-body\">\n");
      out.write("                <div class=\"cssload-container\">\n");
      out.write("                    <div class=\"cssload-speeding-wheel\"></div>\n");
      out.write("                </div>\n");
      out.write("                <p>Preparando viaje intergalactico...</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Creacion del menu de navegacion-->\n");
      out.write("        <div class=\"page\">\n");
      out.write("            <header class=\"section page-header\">\n");
      out.write("                <div class=\"rd-navbar-wrap\">\n");
      out.write("                    <!--\n");
      out.write("                    <nav class=\"rd-navbar rd-navbar-classic\" data-layout=\"rd-navbar-fixed\" data-sm-layout=\"rd-navbar-fixed\" data-md-layout=\"rd-navbar-fixed\" data-md-device-layout=\"rd-navbar-fixed\" data-lg-layout=\"rd-navbar-static\" data-lg-device-layout=\"rd-navbar-fixed\" data-xl-layout=\"rd-navbar-static\" data-xl-device-layout=\"rd-navbar-static\" data-xxl-layout=\"rd-navbar-static\" data-xxl-device-layout=\"rd-navbar-static\" data-lg-stick-up-offset=\"170px\" data-xl-stick-up-offset=\"170px\" data-xxl-stick-up-offset=\"170px\" data-lg-stick-up=\"true\" data-xl-stick-up=\"true\" data-xxl-stick-up=\"true\">\n");
      out.write("                    <!--titulo principal de la pagina-->\n");
      out.write("                    <div class=\"rd-navbar-aside-outer bg-dark\">\n");
      out.write("                        <div class=\"rd-navbar-aside\">\n");
      out.write("                            <div class=\"rd-navbar-panel\">\n");
      out.write("                                <h1 class=\"container display-1 text-success font-weight-bold font-italic \">ALIEN</h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <nav class=\"rd-navbar rd-navbar-classic\" data-layout=\"rd-navbar-fixed\" data-sm-layout=\"rd-navbar-fixed\" data-md-layout=\"rd-navbar-fixed\" data-md-device-layout=\"rd-navbar-fixed\" data-lg-layout=\"rd-navbar-static\" data-lg-device-layout=\"rd-navbar-fixed\" data-xl-layout=\"rd-navbar-static\" data-xl-device-layout=\"rd-navbar-static\" data-xxl-layout=\"rd-navbar-static\" data-xxl-device-layout=\"rd-navbar-static\" data-lg-stick-up-offset=\"170px\" data-xl-stick-up-offset=\"170px\" data-xxl-stick-up-offset=\"170px\" data-lg-stick-up=\"true\" data-xl-stick-up=\"true\" data-xxl-stick-up=\"true\">\n");
      out.write("                        <!--Menu de navegacion para las revistas-->\n");
      out.write("                        <div class=\"rd-navbar-main-outer\">\n");
      out.write("                            <div class=\"rd-navbar-main\">\n");
      out.write("                                <div class=\"rd-navbar-nav-wrap\">\n");
      out.write("                                    <ul class=\"rd-navbar-nav\">\n");
      out.write("                                        <li class=\"rd-nav-item active\"><a class=\"rd-nav-link\" href=\"index.html\">Revistas</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"rd-nav-item\"><a class=\"rd-nav-link\" href=\"about.html\">Categorias</a>\n");
      out.write("                                            <ul class=\"rd-menu rd-navbar-dropdown\">\n");
      out.write("                                                <li class=\"rd-dropdown-item\"><a class=\"rd-dropdown-link\" href=\"#\">Tecnologia</a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"rd-dropdown-item\"><a class=\"rd-dropdown-link\" href=\"#\">Mujeres</a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"rd-dropdown-item\"><a class=\"rd-dropdown-link\" href=\"#\">Mecanica</a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"rd-dropdown-item\"><a class=\"rd-dropdown-link\" href=\"#\">Cocina</a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"rd-dropdown-item\"><a class=\"rd-dropdown-link\" href=\"#\">Programacion</a>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"rd-nav-item\"><a class=\"rd-nav-link\" href=\"contacts.html\">Mi perfil</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"rd-nav-item\"><a class=\"rd-nav-link\" href=\"typography.html\">Ver editores</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"rd-nav-item\"><a class=\"rd-nav-link\" href=\"contacts.html\">Contactanos</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <!--Swiper-->\n");
      out.write("            <section class=\"section swiper-container swiper-slider swiper-slider-1\" data-loop=\"true\" data-autoplay=\"false\" data-simulate-touch=\"false\" data-slide-effect=\"fade\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--Swiper Pagination-->\n");
      out.write("        <div class=\"swiper-pagination\"></div>\n");
      out.write("    </section>\n");
      out.write("    <!--About-->\n");
      out.write("    <section class=\"section section-lg section-inset-1 position-relative index-1\">\n");
      out.write("        <br><br>\n");
      out.write("        <section class=\"section section-lg bg-gray-700\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row row-30\">\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <div class=\"row row-30\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-6 col-lg-12 wow fadeInRight\" data-wow-delay=\".05s\">\n");
      out.write("                                <article>\n");
      out.write("                                    <div class=\"unit unit-spacing-md align-items-center flex-column flex-md-row text-center text-md-left\">\n");
      out.write("                                        <div class=\"info-classic-icon fa-facebook\"></div>\n");
      out.write("                                        <div class=\"unit-body\"><a class=\"info-classic-link\" href=\"https://www.facebook.com\">Siguenos en Facebook</a></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </article>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <div class=\"row row-30\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-6 col-lg-12 wow fadeInRight\" data-wow-delay=\".1s\">\n");
      out.write("                                <article class=\"info-classic align-items-center\">\n");
      out.write("                                    <div class=\"unit unit-spacing-md align-items-center flex-column flex-md-row text-center text-md-left\">\n");
      out.write("                                        <div class=\"unit-left\">\n");
      out.write("                                            <div class=\"info-classic-icon fa-twitter\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"unit-body\"><a class=\"info-classic-link\" href=\"https://www.twitter.com\">Siguenos en Twitter</a></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </article>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <footer class=\"section footer-classic\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <p class=\"rights\"><span>&copy;&nbsp; </span><span class=\"copyright-year\"></span><span> Business Company</span>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"snackbars\" id=\"form-output-global\"></div>\n");
      out.write("    <script src=\"js/core.min.js\"></script>\n");
      out.write("    <script src=\"js/script.js\"></script>\n");
      out.write("</body>\n");
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
