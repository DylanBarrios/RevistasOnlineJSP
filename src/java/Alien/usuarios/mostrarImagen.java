package Alien.usuarios;

import Alien.conexion.conexion;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
@WebServlet(name = "mostrarImagen", urlPatterns = {"/mostrarImagen"})
@MultipartConfig(maxFileSize = 16177215)
public class mostrarImagen extends HttpServlet {

    Connection cn = conexion.conexion();
    String nombre;

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
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        nombre = InicioSesion.usuario;
        ResultSet tmp = null;
        InputStream input = null;
        OutputStream out = null;
        BufferedInputStream bf = null;
        BufferedOutputStream of = null;
        response.setContentType("/Image*");

        try {
            PreparedStatement ps = cn.prepareStatement("SELECT Perfil FROM Usuarios WHERE Usuario='" + nombre + "'");
            tmp = ps.executeQuery();
            out = response.getOutputStream();
            if (tmp.next()) {
                input = tmp.getBinaryStream("Perfil");
            }
            bf = new BufferedInputStream(input);
            of = new BufferedOutputStream(out);
            int i = 0;
            while ((i = bf.read()) != -1) {
                of.write(i);
            }

        } catch (SQLException ex) {
            PrintWriter s = response.getWriter();
            s.print(ex.getMessage());

        } catch (Exception ex) {
            PrintWriter s = response.getWriter();
            s.print(ex.getMessage());
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
