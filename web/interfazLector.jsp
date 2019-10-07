<%-- 
    Document   : index
    Created on : 25/09/2019, 02:53:40 PM
    Author     : dylan
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Alien.usuarios.revista"%>
<%@page import="Alien.usuarios.obtenerPDF"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>

<!DOCTYPE html>
<html class="wide wow-animation" lang="en">
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="icon" href="images/arriba.png" type="image/x-icon">
        <link rel="stylesheet" href="css/style.css">
        <title>Mundo Alien</title>

    </head>
    <body>
        <div class="bg-dark ">

            <h1 class="text-success font-weight-bold font-italic display-1"><img src="mostrarImagen?Usuario='nombre'" height="150px" width="150px"> ALIEN </h1>
            <h6 class="text-success font-weight-bold font-italic">Alien <%out.print(session.getAttribute("usuarioSession"));%> 
                <a class="text-primary" href="controladorSalir">Cerrar Sesion</a></h6>

                    <!--Crea una espera antes de cargar la pagina principal-->
                    <section>
                    <div class="preloader">
                        <div class="preloader-body">
                            <div class="cssload-container">
                                <div class="cssload-speeding-wheel"></div>
                            </div>
                            <p>Preparando viaje intergalactico...</p>
                        </div>
                    </div>

                    <!--Creacion del menu de navegacion-->
                    <div class="page">
                        <header class="section page-header">
                            <div class="rd-navbar-wrap">
                                <!--
                                <nav class="rd-navbar rd-navbar-classic" data-layout="rd-navbar-fixed" data-sm-layout="rd-navbar-fixed" data-md-layout="rd-navbar-fixed" data-md-device-layout="rd-navbar-fixed" data-lg-layout="rd-navbar-static" data-lg-device-layout="rd-navbar-fixed" data-xl-layout="rd-navbar-static" data-xl-device-layout="rd-navbar-static" data-xxl-layout="rd-navbar-static" data-xxl-device-layout="rd-navbar-static" data-lg-stick-up-offset="170px" data-xl-stick-up-offset="170px" data-xxl-stick-up-offset="170px" data-lg-stick-up="true" data-xl-stick-up="true" data-xxl-stick-up="true">
                                <!--titulo principal de la pagina-->
                                <nav class="rd-navbar rd-navbar-classic" data-layout="rd-navbar-fixed" data-sm-layout="rd-navbar-fixed" data-md-layout="rd-navbar-fixed" data-md-device-layout="rd-navbar-fixed" data-lg-layout="rd-navbar-static" data-lg-device-layout="rd-navbar-fixed" data-xl-layout="rd-navbar-static" data-xl-device-layout="rd-navbar-static" data-xxl-layout="rd-navbar-static" data-xxl-device-layout="rd-navbar-static" data-lg-stick-up-offset="170px" data-xl-stick-up-offset="170px" data-xxl-stick-up-offset="170px" data-lg-stick-up="true" data-xl-stick-up="true" data-xxl-stick-up="true">
                                    <!--Menu de navegacion para las revistas-->
                                    <div class="rd-navbar-main-outer">
                                        <div class="rd-navbar-main">
                                            <div class="rd-navbar-nav-wrap">
                                                <ul class="rd-navbar-nav">
                                                    <li class="rd-nav-item"><a class="rd-nav-link" href="typography.html"> Mi perfil</a>
                                                    </li>
                                                    <li class="rd-nav-item"><a class="rd-nav-link" href="typography.html">Ganancias</a>
                                                    </li>
                                                    <li class="rd-nav-item"><a class="rd-nav-link" href="typography.html">5 revistas mas populares</a>
                                                    </li><li class="rd-nav-item"><a class="rd-nav-link" href="typography.html">5 revistas mas comentadas</a>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </nav>
                            </div>
                        </header>
        <div class="datagrid">
            <%  obtenerPDF pdf = new obtenerPDF();
                    revista rev = new revista();
                    ArrayList<revista> listar = pdf.PdfLector();
                %> 
                <table>
                    <thead>
                        <tr>
                            <th>Codigo Revista</th>
                            <th>Nombre de la Revista</th>
                            <th>Autor</th>
                            <th>Fecha Creacion</th>
                            <th>PDF</th>
                            <th>Ver Reacciones</th>  
                        </tr>
                    </thead>
                    
                    <tbody>
                        <%if (listar.size() > 0) {
                                for (revista listar2 : listar) {
                                    rev = listar2;
                        %>
                        <tr>
                            <td><%=rev.getIdRevista()%></td>
                            <td><%=rev.getNombreRevista()%></td>
                            <td><%=rev.getAutor()%></td>
                            <td><%=rev.getFechaCreacion()%></td>
                            <td>
                                <%
                                    if (rev.getPdf() != null) {
                                %>
                                <a href="mostrarPDF?Autor='<%=rev.getAutor()%>'" target="_blank" >PDF</a>
                                    <%
                                        } else {
                                            out.print("Vacio");
                                        }
                                    %>
                            </td>
                                                       
                        </tr>
                        <%}
                            }%>
                    </tbody>
                </table>
            </div> 
                        <!--Swiper-->
                        <section class="section swiper-container swiper-slider swiper-slider-1" data-loop="true" data-autoplay="false" data-simulate-touch="false" data-slide-effect="fade">

                    </div>
                    <!--Swiper Pagination-->
                    <div class="swiper-pagination"></div>
                    </section>
                    <!--About-->
                    <section class="section section-lg section-inset-1 position-relative index-1">
                        <br><br>
                        <section class="section section-lg bg-gray-700">
                            <div class="container">
                                <div class="row row-30">
                                    <div class="col-lg-4">
                                        <div class="row row-30">

                                            <div class="col-sm-6 col-lg-12 wow fadeInRight" data-wow-delay=".05s">
                                                <article>
                                                    <div class="unit unit-spacing-md align-items-center flex-column flex-md-row text-center text-md-left">
                                                        <div class="info-classic-icon fa-facebook"></div>
                                                        <div class="unit-body"><a class="info-classic-link" href="https://www.facebook.com">Siguenos en Facebook</a></div>
                                                    </div>
                                                </article>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-4">
                                        <div class="row row-30">

                                            <div class="col-sm-6 col-lg-12 wow fadeInRight" data-wow-delay=".1s">
                                                <article class="info-classic align-items-center">
                                                    <div class="unit unit-spacing-md align-items-center flex-column flex-md-row text-center text-md-left">
                                                        <div class="unit-left">
                                                            <div class="info-classic-icon fa-twitter"></div>
                                                        </div>
                                                        <div class="unit-body"><a class="info-classic-link" href="https://www.twitter.com">Siguenos en Twitter</a></div>
                                                    </div>
                                                </article>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>
                        <footer class="section footer-classic">
                            <div class="container">
                                <p class="rights"><span>&copy;&nbsp; </span><span class="copyright-year"></span><span> Business Company</span>
                            </div>
                        </footer>
        </div>
        <div class="snackbars" id="form-output-global"></div>
        <script src="js/core.min.js"></script>
        <script src="js/script.js"></script>
</body>
</html>
