/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alien.usuarios;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dylan
 */
public class InicioSesion extends HttpServlet {

    public static String usuario;
    String clave;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Se obtienen los datos del usuario que intenta registrarse
        usuario = request.getParameter("usuario");
        clave = request.getParameter("clave");
        
        HttpSession nuevaSesion = request.getSession();
        nuevaSesion.setAttribute("usuarioSession", usuario);
   
        //Se compara si existe el usuario y que rol desempeña
        consultasUsuarios co = new consultasUsuarios();
        
        if(co.autenticacion(usuario, clave) && "Lector".equals(co.getRol(usuario)))
            response.sendRedirect("interfazLector.jsp");
        else if(co.autenticacion(usuario, clave) && "Administrador".equals(co.getRol(usuario)))
             response.sendRedirect("interfazAdministrador.jsp");
        else if(co.autenticacion(usuario, clave) && "Editor".equals(co.getRol(usuario)))
             response.sendRedirect("interfazEditor.jsp");
        
            
    }

}
