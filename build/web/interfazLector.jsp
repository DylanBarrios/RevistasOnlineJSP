<%-- 
    Document   : index
    Created on : 25/09/2019, 02:53:40 PM
    Author     : dylan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mundo Alien</title>
         
    </head>
    <body>
        <div class="bg-dark ">
            
            <h1 class="text-success font-weight-bold font-italic display-1"><img src="mostrarImagen?Usuario='nombre'" height="150px" width="150px"> ALIEN </h1>
            <h6 class="text-success font-weight-bold font-italic">Alien <%out.print(session.getAttribute("usuarioSession")); %> </h6>
             <a href="controladorSalir">Cerrar Sesion</a>
            <%@include file="lector.html" %>
       </div>
    </body>
</html>
