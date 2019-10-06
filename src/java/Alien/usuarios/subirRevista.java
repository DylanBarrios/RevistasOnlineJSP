/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alien.usuarios;

import Alien.conexion.conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
@WebServlet(name = "subirRevista", urlPatterns = {"/subirRevista"})

@MultipartConfig(maxFileSize = 16177215)
public class subirRevista extends HttpServlet {

    Connection conecta = conexion.conexion();

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
        processRequest(request, response);

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
                 response.setContentType("application/pdf");
        revista rev = new revista(request);
        String consulta = "INSERT INTO Revista VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        
        
        try {
            PreparedStatement pst = conecta.prepareStatement(consulta);
            pst.setInt(1, 0);
            pst.setString(2, rev.getAutor());
            pst.setString(3, rev.getNombreRevista());
            pst.setString(4, rev.getDescripcion());
            pst.setString(5, rev.getCategoria());
            pst.setString(6, rev.getEtiqueta());
            pst.setFloat(7, rev.getCuotaSuscripcion());
            pst.setFloat(8, 10);
            pst.setString(9, rev.getFechaCreacion());
            pst.setBlob(10, rev.getPdf());
            pst.setBoolean(11, false);
            pst.executeUpdate();
            RequestDispatcher dispatcher = request.getRequestDispatcher("interfazEditor.jsp");
            dispatcher.forward(request, response);
        } catch (IOException | SQLException | ServletException e) {
            System.out.println("error" + e);
            RequestDispatcher dispatcher = request.getRequestDispatcher("interfazEditor.jsp");
        }
        


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
