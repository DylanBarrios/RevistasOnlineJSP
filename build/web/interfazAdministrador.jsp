<%-- 
    Document   : interfazAdministrador
    Created on : 27/09/2019, 01:32:06 AM
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
         <h6 class="text-success font-weight-bold font-italic">Alien <%out.print(session.getAttribute("usuarioSession")); %> </h6>
         <a href="controladorSalir">Cerrar Sesion</a>
    </body>
</html>
