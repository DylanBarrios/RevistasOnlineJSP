package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class interfazEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"wide wow-animation\" lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <title>Home</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, height=device-height, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <link rel=\"icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"//fonts.googleapis.com/css?family=Roboto:400,500\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <style>.ie-panel{display: none;background: #212121;padding: 10px 0;box-shadow: 3px 3px 5px 0 rgba(0,0,0,.3);clear: both;text-align:center;position: relative;z-index: 1;} html.ie-10 .ie-panel, html.lt-ie-10 .ie-panel {display: block;}</style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"ie-panel\"><a href=\"http://windows.microsoft.com/en-US/internet-explorer/\"><img src=\"images/ie8-panel/warning_bar_0000_us.jpg\" height=\"42\" width=\"820\" alt=\"You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today.\"></a></div>\n");
      out.write("    <div class=\"preloader\">\n");
      out.write("      <div class=\"preloader-body\">\n");
      out.write("        <div class=\"cssload-container\">\n");
      out.write("          <div class=\"cssload-speeding-wheel\"></div>\n");
      out.write("        </div>\n");
      out.write("        <p>Loading...</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"page\"><a class=\"section section-banner d-none d-xl-block\" href=\"https://www.templatemonster.com/intense-multipurpose-html-template.html\" style=\"background-image: url(images/banner/background-04-1920x60.jpg); background-image: -webkit-image-set( url(images/banner/background-04-1920x60.jpg) 1x, url(images/banner/background-04-3840x120.jpg) 2x )\"><img src=\"images/banner/foreground-04-1600x60.png\" srcset=\"images/banner/foreground-04-1600x60.png 1x, images/banner/foreground-04-3200x120.png 2x\" alt=\"\" width=\"1600\" height=\"310\"></a>\n");
      out.write("      <header class=\"section page-header\">\n");
      out.write("        <!--RD Navbar-->\n");
      out.write("        <div class=\"rd-navbar-wrap\">\n");
      out.write("          <nav class=\"rd-navbar rd-navbar-classic\" data-layout=\"rd-navbar-fixed\" data-sm-layout=\"rd-navbar-fixed\" data-md-layout=\"rd-navbar-fixed\" data-md-device-layout=\"rd-navbar-fixed\" data-lg-layout=\"rd-navbar-static\" data-lg-device-layout=\"rd-navbar-fixed\" data-xl-layout=\"rd-navbar-static\" data-xl-device-layout=\"rd-navbar-static\" data-xxl-layout=\"rd-navbar-static\" data-xxl-device-layout=\"rd-navbar-static\" data-lg-stick-up-offset=\"170px\" data-xl-stick-up-offset=\"170px\" data-xxl-stick-up-offset=\"170px\" data-lg-stick-up=\"true\" data-xl-stick-up=\"true\" data-xxl-stick-up=\"true\">\n");
      out.write("            <div class=\"rd-navbar-collapse-toggle rd-navbar-fixed-element-1\" data-rd-navbar-toggle=\".rd-navbar-collapse\"><span></span></div>\n");
      out.write("            <div class=\"rd-navbar-aside-outer\">\n");
      out.write("              <div class=\"rd-navbar-aside\">\n");
      out.write("                <!--RD Navbar Panel-->\n");
      out.write("                <div class=\"rd-navbar-panel\">\n");
      out.write("                  <!--RD Navbar Toggle-->\n");
      out.write("                  <button class=\"rd-navbar-toggle\" data-rd-navbar-toggle=\".rd-navbar-nav-wrap\"><span></span></button>\n");
      out.write("                  <!--RD Navbar Brand-->\n");
      out.write("                  <div class=\"rd-navbar-brand\">\n");
      out.write("                    <!--Brand--><a class=\"brand\" href=\"index.html\"><img class=\"brand-logo-dark\" src=\"images/logo-default-672x102.png\" alt=\"\" width=\"336\" height=\"51\"/></a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"rd-navbar-info rd-navbar-collapse\">\n");
      out.write("                  <article class=\"info-modern\">\n");
      out.write("                    <div class=\"info-modern-icon fa-phone\"></div><a class=\"info-modern-link\" href=\"#\">800-2345-6789</a>\n");
      out.write("                  </article>\n");
      out.write("                  <p>Call us now to get a free business consultation from our experts!</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"rd-navbar-main-outer\">\n");
      out.write("              <div class=\"rd-navbar-main\">\n");
      out.write("                <div class=\"rd-navbar-nav-wrap\">\n");
      out.write("                  <ul class=\"rd-navbar-nav\">\n");
      out.write("                    <li class=\"rd-nav-item active\"><a class=\"rd-nav-link\" href=\"index.html\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"rd-nav-item\"><a class=\"rd-nav-link\" href=\"about.html\">About</a>\n");
      out.write("                      <ul class=\"rd-menu rd-navbar-dropdown\">\n");
      out.write("                        <li class=\"rd-dropdown-item\"><a class=\"rd-dropdown-link\" href=\"#\">Who We Are</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"rd-dropdown-item\"><a class=\"rd-dropdown-link\" href=\"#\">Our History</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"rd-dropdown-item\"><a class=\"rd-dropdown-link\" href=\"#\">Our Services</a>\n");
      out.write("                          <ul class=\"rd-menu rd-navbar-dropdown\">\n");
      out.write("                            <li class=\"rd-dropdown-item\"><a class=\"rd-dropdown-link\" href=\"#\">Business Consulting</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"rd-dropdown-item\"><a class=\"rd-dropdown-link\" href=\"#\">Cash Management</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"rd-dropdown-item\"><a class=\"rd-dropdown-link\" href=\"#\">Tax Advisory</a>\n");
      out.write("                            </li>\n");
      out.write("                          </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"rd-dropdown-item\"><a class=\"rd-dropdown-link\" href=\"#\">Testimonials</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"rd-dropdown-item\"><a class=\"rd-dropdown-link\" href=\"#\">Our Team</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"rd-dropdown-item\"><a class=\"rd-dropdown-link\" href=\"#\">News</a>\n");
      out.write("                        </li>\n");
      out.write("                      </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"rd-nav-item\"><a class=\"rd-nav-link\" href=\"typography.html\">Typography</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"rd-nav-item\"><a class=\"rd-nav-link\" href=\"contacts.html\">Contacts</a>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </nav>\n");
      out.write("        </div>\n");
      out.write("      </header>\n");
      out.write("      <!--Swiper-->\n");
      out.write("      <section class=\"section swiper-container swiper-slider swiper-slider-1\" data-loop=\"true\" data-autoplay=\"false\" data-simulate-touch=\"false\" data-slide-effect=\"fade\">\n");
      out.write("        <div class=\"swiper-wrapper text-center text-lg-left\">\n");
      out.write("          <div class=\"swiper-slide\" data-slide-bg=\"images/slide-1.jpg\">\n");
      out.write("            <div class=\"swiper-slide-caption\">\n");
      out.write("              <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-end\">\n");
      out.write("                  <div class=\"col-lg-7 col-xl-6\">\n");
      out.write("                    <h1 class=\"text-primary\" data-caption-animate=\"fadeIn\" data-caption-delay=\"100\">Helping with any of your business needs!</h1>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"swiper-slide\" data-slide-bg=\"images/slide-2.jpg\">\n");
      out.write("            <div class=\"swiper-slide-caption\">\n");
      out.write("              <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-end\">\n");
      out.write("                  <div class=\"col-lg-7 col-xl-6\">\n");
      out.write("                    <h1 class=\"text-primary\" data-caption-animate=\"fadeIn\" data-caption-delay=\"100\">The best strategies for your business</h1>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"swiper-slide\" data-slide-bg=\"images/slide-3.jpg\">\n");
      out.write("            <div class=\"swiper-slide-caption\">\n");
      out.write("              <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-end\">\n");
      out.write("                  <div class=\"col-lg-7 col-xl-6\">\n");
      out.write("                    <h1 class=\"text-primary\" data-caption-animate=\"fadeIn\" data-caption-delay=\"100\">A wide range of global business information</h1>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!--Swiper Pagination-->\n");
      out.write("        <div class=\"swiper-pagination\"></div>\n");
      out.write("        <!--Swiper Navigation-->\n");
      out.write("        <div class=\"swiper-button-prev\"></div>\n");
      out.write("        <div class=\"swiper-button-next\"></div>\n");
      out.write("      </section>\n");
      out.write("      <!--About-->\n");
      out.write("      <section class=\"section section-lg section-inset-1 position-relative index-1\">\n");
      out.write("        <div class=\"container offset-negative-1\">\n");
      out.write("          <div class=\"row no-gutters\">\n");
      out.write("            <div class=\"col-sm-6 col-lg-3 wow fadeInUp\">\n");
      out.write("              <article class=\"box-default box-default-3\">\n");
      out.write("                <div class=\"box-default-icon fa-globe\"></div>\n");
      out.write("                <h4 class=\"box-default-title\">Global <br>research</h4>\n");
      out.write("                <div class=\"box-default-text\">Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.</div><a class=\"box-default-link fa-chevron-right\" href=\"#\"></a>\n");
      out.write("              </article>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6 col-lg-3 wow fadeInUp\" data-wow-delay=\".05s\">\n");
      out.write("              <article class=\"box-default box-default-2\">\n");
      out.write("                <div class=\"box-default-icon fa-lightbulb-o\"></div>\n");
      out.write("                <h4 class=\"box-default-title\">Creative <br>ideas</h4>\n");
      out.write("                <div class=\"box-default-text\">Experimentum grauiter ducunt ad azureus terror. Hercle, omnia altus!, gratis olla! Hilotae nobilis habena est. Ubi est bassus urbs? Cum adgium prarere, omnes lapsuses.</div><a class=\"box-default-link fa-chevron-right\" href=\"#\"></a>\n");
      out.write("              </article>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6 col-lg-3 wow fadeInUp\" data-wow-delay=\".1s\">\n");
      out.write("              <article class=\"box-default box-default-1\">\n");
      out.write("                <div class=\"box-default-icon fa-cog\"></div>\n");
      out.write("                <h4 class=\"box-default-title\">Reliable <br>solutions</h4>\n");
      out.write("                <div class=\"box-default-text\">Nunquam convertam exemplar. Magnum exemplar diligenter attrahendams parma est. Apolloniates undas, tanquam pius mensa. Triticums.</div><a class=\"box-default-link fa-chevron-right\" href=\"#\"></a>\n");
      out.write("              </article>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6 col-lg-3 wow fadeInUp\" data-wow-delay=\".15s\">\n");
      out.write("              <article class=\"box-default\">\n");
      out.write("                <div class=\"box-default-icon fa-briefcase\"></div>\n");
      out.write("                <h4 class=\"box-default-title\">Professional <br>management</h4>\n");
      out.write("                <div class=\"box-default-text\">Ubi est lotus usus? Clemens, grandis castors sensim talem de pius, fortis lumen. Scutums sunt historias de pius gallus. Cum compater messis, omnes rumores vitare.</div><a class=\"box-default-link fa-chevron-right\" href=\"#\"></a>\n");
      out.write("              </article>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row row-30 bordered\">\n");
      out.write("            <div class=\"col-md-6 wow fadeInRight\">\n");
      out.write("              <article class=\"box-minimal\">\n");
      out.write("                <div class=\"unit unit-spacing-md flex-column flex-sm-row text-center text-sm-left\">\n");
      out.write("                  <div class=\"unit-left\">\n");
      out.write("                    <div class=\"box-minimal-icon fa-comments\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"unit-body\">\n");
      out.write("                    <h4 class=\"box-minimal-title\"><a href=\"#\">Free Consultations</a></h4>\n");
      out.write("                    <div class=\"box-minimal-text\">Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolor.</div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 wow fadeInRight\" data-wow-delay=\".05s\">\n");
      out.write("              <article class=\"box-minimal\">\n");
      out.write("                <div class=\"unit unit-spacing-md flex-column flex-sm-row text-center text-sm-left\">\n");
      out.write("                  <div class=\"unit-left\">\n");
      out.write("                    <div class=\"box-minimal-icon fa-group\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"unit-body\">\n");
      out.write("                    <h4 class=\"box-minimal-title\"><a href=\"#\">Qualified Team</a></h4>\n");
      out.write("                    <div class=\"box-minimal-text\">Barbatus, flavum genetrixs tandem amor de salvus, festus vortex. Audax, peritus spatiis saepe aperto de.</div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 wow fadeInRight\" data-wow-delay=\".1s\">\n");
      out.write("              <article class=\"box-minimal\">\n");
      out.write("                <div class=\"unit unit-spacing-md flex-column flex-sm-row text-center text-sm-left\">\n");
      out.write("                  <div class=\"unit-left\">\n");
      out.write("                    <div class=\"box-minimal-icon fa-calendar-o\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"unit-body\">\n");
      out.write("                    <h4 class=\"box-minimal-title\"><a href=\"#\">Extensive Services</a></h4>\n");
      out.write("                    <div class=\"box-minimal-text\">Fidess sunt ignigenas de secundus zirbus. A falsis, bubo fortis vita. Festus particula unus quaestios palus est.</div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 wow fadeInRight\" data-wow-delay=\".15s\">\n");
      out.write("              <article class=\"box-minimal\">\n");
      out.write("                <div class=\"unit unit-spacing-md flex-column flex-sm-row text-center text-sm-left\">\n");
      out.write("                  <div class=\"unit-left\">\n");
      out.write("                    <div class=\"box-minimal-icon fa-thumbs-up\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"unit-body\">\n");
      out.write("                    <h4 class=\"box-minimal-title\"><a href=\"#\">99% Satisfied Customers</a></h4>\n");
      out.write("                    <div class=\"box-minimal-text\">Amicitia moris, tanquam brevis mons. Sunt sensoremes experientia barbatus, castus cannabises. Varius palus.</div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row row-30\">\n");
      out.write("            <div class=\"col-md-6 col-lg-4 wow fadeInUp\">\n");
      out.write("              <h3>About</h3><img src=\"images/image-1-370x217.jpg\" alt=\"\" width=\"370\" height=\"108\"/>\n");
      out.write("              <p>Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatu.<br>Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt. Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.</p><a class=\"button button-primary\" href=\"#\">read more</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 col-lg-4 wow fadeInUp\" data-wow-delay=\".05s\">\n");
      out.write("              <h3>Services</h3>\n");
      out.write("              <p>Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</p>\n");
      out.write("              <ul class=\"list-marked-1\">\n");
      out.write("                <li><a href=\"#\">Cash Management</a></li>\n");
      out.write("                <li><a href=\"#\">Process Development</a></li>\n");
      out.write("                <li><a href=\"#\">HR Management</a></li>\n");
      out.write("                <li><a href=\"#\">Marketing Strategies</a></li>\n");
      out.write("                <li><a href=\"#\">Cash Flow Management</a></li>\n");
      out.write("                <li><a href=\"#\">Business Strategies</a></li>\n");
      out.write("                <li><a href=\"#\">CFO Services</a></li>\n");
      out.write("                <li><a href=\"#\">Business Plans</a></li>\n");
      out.write("                <li><a href=\"#\">Tax Planning Strategies</a></li>\n");
      out.write("              </ul><a class=\"button button-primary\" href=\"#\">read more</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4\">\n");
      out.write("              <div class=\"row row-30\">\n");
      out.write("                <div class=\"col-md-6 col-lg-12 wow fadeInUp\" data-wow-delay=\".1s\">\n");
      out.write("                  <div class=\"info\">\n");
      out.write("                    <div class=\"info-header\">\n");
      out.write("                      <div class=\"icon fa-comment\"></div>\n");
      out.write("                      <h3>Help center</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"info-item\">\n");
      out.write("                      <h4 class=\"info-title\">Ask professionals:</h4>\n");
      out.write("                      <ul class=\"info-list\">\n");
      out.write("                        <li>Monday - Friday: 8am-7pm</li>\n");
      out.write("                        <li>Saturday: 8am-5pm</li>\n");
      out.write("                        <li>Sunday: 1pm-5pm</li>\n");
      out.write("                      </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"info-item\">\n");
      out.write("                      <h4 class=\"info-title\">24/7 Online Support:</h4><a class=\"info-link\" href=\"tel:#\">800-2345-6789</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 col-lg-12 wow fadeInUp\" data-wow-delay=\".1s\">\n");
      out.write("                  <div class=\"owl-carousel owl-style-1\" data-items=\"1\" data-dots=\"true\" data-autoplay=\"true\">\n");
      out.write("                    <!-- Quote-->\n");
      out.write("                    <article class=\"quote\">\n");
      out.write("                      <div class=\"media\"><img class=\"quote-image\" src=\"images/user-1-80x80.jpg\" alt=\"\" width=\"80\" height=\"40\"/>\n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                          <div class=\"quote-text\">\n");
      out.write("                            <p class=\"q\">Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore.</p>\n");
      out.write("                          </div><a class=\"quote-author\" href=\"#\">Richard Curtis</a>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </article>\n");
      out.write("                    <!-- Quote-->\n");
      out.write("                    <article class=\"quote\">\n");
      out.write("                      <div class=\"media\"><img class=\"quote-image\" src=\"images/user-2-80x80.jpg\" alt=\"\" width=\"80\" height=\"40\"/>\n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                          <div class=\"quote-text\">\n");
      out.write("                            <p class=\"q\">Noster, regius omnias nunquam magicae de fidelis, azureus secula. Accelerare satis ducunt ad magnum abactus.</p>\n");
      out.write("                          </div><a class=\"quote-author\" href=\"#\">Anna Ramirez</a>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </article>\n");
      out.write("                    <!-- Quote-->\n");
      out.write("                    <article class=\"quote\">\n");
      out.write("                      <div class=\"media\"><img class=\"quote-image\" src=\"images/user-3-80x80.jpg\" alt=\"\" width=\"80\" height=\"40\"/>\n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                          <div class=\"quote-text\">\n");
      out.write("                            <p class=\"q\">Nunquam acquirere gabalium. Mori satis ducunt ad teres stella. Studere satis ducunt ad brevis gluten.</p>\n");
      out.write("                          </div><a class=\"quote-author\" href=\"#\">Eva Adams</a>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </article>\n");
      out.write("                    <!-- Quote-->\n");
      out.write("                    <article class=\"quote\">\n");
      out.write("                      <div class=\"media\"><img class=\"quote-image\" src=\"images/user-4-80x80.jpg\" alt=\"\" width=\"80\" height=\"40\"/>\n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                          <div class=\"quote-text\">\n");
      out.write("                            <p class=\"q\">A falsis, amor brevis victrix. Cum tabes credere, omnes particulaes talem barbatus, audax hydraes.</p>\n");
      out.write("                          </div><a class=\"quote-author\" href=\"#\">Walter Evans</a>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </article>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </section><a class=\"section section-banner\" href=\"https://www.templatemonster.com/intense-multipurpose-html-template.html\" style=\"background-image: url(images/banner/background-03-1920x310.jpg); background-image: -webkit-image-set( url(images/banner/background-03-1920x310.jpg) 1x, url(images/banner/background-03-3840x620.jpg) 2x )\"><img src=\"images/banner/foreground-03-1600x310.png\" srcset=\"images/banner/foreground-03-1600x310.png 1x, images/banner/foreground-03-3200x620.png 2x\" alt=\"\" width=\"1600\" height=\"310\"></a>\n");
      out.write("      <!--Contacts-->\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("    <div class=\"snackbars\" id=\"form-output-global\"></div>\n");
      out.write("    <script src=\"js/core.min.js\"></script>\n");
      out.write("    <script src=\"js/script.js\"></script>\n");
      out.write("  </body>\n");
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
