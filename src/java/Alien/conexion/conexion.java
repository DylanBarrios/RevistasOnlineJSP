package Alien.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    public static Connection conexion() {
        String user = "root";
        String password = "password";
        String url = "jdbc:mysql://localhost:3306/Alien";

        try {
            Connection conecta = DriverManager.getConnection(url, user, password);
            return conecta;
        } catch (SQLException ex) {
            System.err.println("Erro en la conexion "+ex);
        }
        return null;
    }
}