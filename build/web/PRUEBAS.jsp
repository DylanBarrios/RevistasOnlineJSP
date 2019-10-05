<%-- 
    Document   : PRUEBAS
    Created on : 29/09/2019, 07:40:37 PM
    Author     : dylan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <div>
            <h1>Agregar</h1>
        </div>
        <hr><br>
        <form>
            <label>Nombre</label>
            <input type="text" name="nombre" id="nombre">
            <label>Perfil:</label>
            <input type="file" name="fileFoto">
            <input type="submit" name="accion" value="Guardar">
            <input type="submit" name="accion" value="Regresar">

        </form>
    </center>    
    </body>
</html>
