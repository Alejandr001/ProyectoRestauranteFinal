

package AccesoData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost/elrestaurante";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    private Conexion() {
    }

    public static Connection getConexion() {
        try {
            // Verificar si la conexión está cerrada o nula
            if (connection == null || connection.isClosed()) {
                // La conexión está cerrada o nula, intentar abrir una nueva conexión
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los driver");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
        }
        return connection;
    
}
//package AccesoData;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
//
//
//public class Conexion {
//    
//    private static final String URL = "jdbc:mariadb://localhost/";
//    private static final String DB = "elrestaurante";
//    private static String USUARIO = "root";
//    private static String PASSWORD = "";
//    private static Connection connection;
//
//    private Conexion() {
//    }
//
//    public static Connection getConexion() throws SQLException {
//        if (connection == null) {
//            try {
//                Class.forName("org.mariadb.jdbc.Driver");
//                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
//            } catch (ClassNotFoundException ex) {
//                JOptionPane.showMessageDialog(null, "Error al cargar los driver");
//            } catch (SQLException ex) {
//                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
//            }
//        }
//        return connection;
//    }
//
//    public static PreparedStatement prepareStatement(String sql) throws SQLException {
//        Connection conn = getConexion();
//        return conn.prepareStatement(sql);
//    }
//    private static final String URL="jdbc:mariadb://localhost/";
//    private static final String DB="elrestaurante";
//    private static String USUARIO="root";
//    private  static String PASSWORD="";
//    private static Connection connection;
//
//    static Connection getConnection() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    static PreparedStatement prepareStatement(String sql) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//    
//    private Conexion(){}
//    
//    public static Connection getConexion() throws SQLException{
//     
//        if(connection == null){
//        
//            try {   
//                Class.forName("org.mariadb.jdbc.Driver");
//             connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
//                
//            
//            } catch (ClassNotFoundException ex) {
//                JOptionPane.showMessageDialog(null,"Error al cargar los driver");
//           
//      
//                
//            } catch (SQLException ex) {
//              JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
//            }
//        }
//            return connection;
//    }
    
}
