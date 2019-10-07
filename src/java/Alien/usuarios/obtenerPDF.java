/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alien.usuarios;

import Alien.conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jara
 */
public class obtenerPDF {

    Connection conecta = conexion.conexion();
    public static int idU;
    
    /*Metodo listar*/
    public ArrayList<revista> PdfEditor() {
        String autor = InicioSesion.usuario;
        
        ArrayList<revista> list = new ArrayList<revista>();
        String sql = "SELECT * FROM Revista WHERE Autor='" + autor + "'";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conecta.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                revista r = new revista();
                r.setIdRevista(rs.getInt("idRevista"));
                r.setAutor(rs.getString("Autor"));
                r.setNombreRevista(rs.getString("NombreRevista"));
                r.setFechaCreacion(rs.getString("FechaCreacion"));
                r.setPdf(rs.getBinaryStream("PDF"));
                r.setAutorizacion(rs.getBoolean("Autorizacion"));
                list.add(r);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conecta.close();
            } catch (Exception ex) {
            }
        }
        return list;
    }
    
     public ArrayList<revista> PdfLector() {
        String autor = InicioSesion.usuario;
        
        ArrayList<revista> list = new ArrayList<revista>();
        String sql = "SELECT * FROM Revista WHERE Autorizacion = 1";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conecta.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                revista r = new revista();
                r.setIdRevista(rs.getInt("idRevista"));
                r.setAutor(rs.getString("Autor"));
                r.setNombreRevista(rs.getString("NombreRevista"));
                r.setFechaCreacion(rs.getString("FechaCreacion"));
                r.setPdf(rs.getBinaryStream("PDF"));
                r.setAutorizacion(rs.getBoolean("Autorizacion"));
                list.add(r);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conecta.close();
            } catch (Exception ex) {
            }
        }
        return list;
    }

    public ArrayList<revista> PdfAdministrador() {
        String autor = InicioSesion.usuario;
        
        ArrayList<revista> list = new ArrayList<revista>();
        String sql = "SELECT * FROM Revista WHERE Autorizacion = 0";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conecta.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                revista r = new revista();
                r.setIdRevista(rs.getInt("idRevista"));
                r.setAutor(rs.getString("Autor"));
                r.setNombreRevista(rs.getString("NombreRevista"));
                r.setFechaCreacion(rs.getString("FechaCreacion"));
                r.setPdf(rs.getBinaryStream("PDF"));
                r.setAutorizacion(rs.getBoolean("Autorizacion"));
                list.add(r);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conecta.close();
            } catch (Exception ex) {
            }
        }
        return list;
    }
}