<%-- 
    Document   : menu
    Created on : 26/09/2019, 10:46:51 PM
    Author     : dylan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include  file= "editor.html"%>
        <h6 class="text-success font-weight-bold font-italic">Alien <%out.print(session.getAttribute("usuarioSession")); %> </h6>
        <a href="controladorSalir">Cerrar Sesion</a>
    </body>
</html>
