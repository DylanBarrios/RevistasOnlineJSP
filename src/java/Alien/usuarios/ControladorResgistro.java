package Alien.usuarios;

import Alien.conexion.conexion;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jara
 */
@WebServlet("/ControladorRegistro")
@MultipartConfig(maxFileSize = 16177215)
public class ControladorResgistro extends HttpServlet {

    Connection cn = conexion.conexion();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        usuario usr = new usuario(request);
        consultasUsuarios registro = new consultasUsuarios();
        try {
            registro.registrar(usr);
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        } catch (UserCreationException ex) {
            request.setAttribute("error", true);
            RequestDispatcher dispatcher = request.getRequestDispatcher("usuarioNuevo.jsp");
            dispatcher.forward(request, response);
        }
        //response.sendRedirect("resultado.jsp");
    }

}
