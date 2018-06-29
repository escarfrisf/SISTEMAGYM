package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/mydb2";
    private static final String USER = "root";
   private static final String PASS = "root";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static Connection conexion;

    public static Connection getConexion() {
        try {
            Class.forName(DRIVER);
            if (conexion == null) {
                conexion = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);
        }
        return conexion;
    }

    public void cerrar() {
        if (conexion != null) {
            conexion = null;
        }
    }
    
    
    
}