package Alien.usuarios;

import Alien.conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class consultasUsuarios extends conexion{
    Connection conec = conexion.conexion();
    
    public boolean autenticacion(String usuario, String clave){
        try {
            String consulta = "SELECT * FROM Usuarios WHERE Usuario = ? AND Clave = ?";
            PreparedStatement pst = conec.prepareStatement(consulta);
            
            
            //Revisa el usuario y clave
            pst.setString(1, usuario);
            pst.setString(2, clave);
            ResultSet rs = pst.executeQuery();
            
            //Revisa si tiene resgitrado el usuario
            if(rs.absolute(1)){
                return true;
            }
                
        } catch (SQLException e) {
            System.err.println("Error al buscar usuario " + e);
        }
        return false;
    }
    
    public boolean registrar(usuario user) throws UserCreationException{
        
        try {
            String consulta =  "INSERT INTO Usuarios VALUES(?,?,?,?,?,?)";
            PreparedStatement pst = conec.prepareStatement(consulta);
            pst.setInt(1, 0);
            pst.setString(2, user.getUsuario());
            pst.setString(3, user.getClave());
            pst.setString(4, user.getDescripcion());
            pst.setString(5, user.getRol()); 
            pst.setBlob(6, user.getPerfil());
            
            //Se revisa si afecta una fila en mysql
            if(pst.executeUpdate() == 1){
                return true;
            }
          
        } catch (SQLException e ) {
            throw new UserCreationException("error creadno el usuario");
        }
        
        return false;
    }
    
    
    
    
    
    public String getRol(String usuario){
        String rol = null;    
        try {
            String consulta = "SELECT rol FROM Usuarios WHERE Usuario = '"+usuario+"'";
            PreparedStatement pst = conec.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();
            
            //Se obtiene el rol del usuario registrado
            if(rs.next()){
                rol = rs.getString("Rol"); 
                return rol; 
            }
            
        }catch(SQLException e){
            System.out.println("Error al obtener rol "+e);
        }        
   
        return null;
    }    
    
}
