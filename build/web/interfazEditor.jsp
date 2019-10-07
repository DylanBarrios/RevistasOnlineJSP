<%-- 
    Document   : menu
    Created on : 26/09/2019, 10:46:51 PM
    Author     : dylan
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Alien.usuarios.revista"%>
<%@page import="Alien.usuarios.obtenerPDF"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="bg-gray-700">
        
        <h1 class="text-success font-weight-bold font-italic display-1"><img src="mostrarImagen?Usuario='nombre'" height="150px" width="150px"> ALIEN </h1>
        <h6 class="text-success font-weight-bold font-italic">Alien <%out.print(session.getAttribute("usuarioSession")); %> </h6>
          
        <a href="controladorSalir">Cerrar Sesion</a>
        <br><br>
        <form action="nuevaRevista.jsp">
            <button class="btn btn-primary">subir Archivo</button>
                
        </form>  
        
        <div>
                <center >
                    <p>Revistas Pendientes de Aprobacion:</p>
                </center>
            </div>
        <div class="datagrid">
            <%  obtenerPDF pdf = new obtenerPDF();
                    revista rev = new revista();
                    ArrayList<revista> listar = pdf.PdfEditor();
                %> 
                <table>
                    <thead>
                        <tr>
                            <th>Codigo Revista</th>
                            <th>Nombre de la Revista</th>
                            <th>Autor</th>
                            <th>Fecha Creacion</th>
                            <th>PDF</th>
                            <th>Autorizacion</th>
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
                            
                            <td>
                                <%
                                    if (!rev.getAutorizacion()) {
                                %>
                                No autorizado
                                    <%
                                        } else {
                                %>
                                Autorizada    
                                <%
                                        }
                                    %>
                            </td>
                            
                        </tr>
                        <%}
                            }%>
                    </tbody>
                </table>
            </div>
        
        
        
    </body>
</html>
