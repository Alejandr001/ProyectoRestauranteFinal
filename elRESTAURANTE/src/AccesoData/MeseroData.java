package AccesoData;

import Entidades.Mesero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MeseroData {
        private Connection con = null;
        public MeseroData() {
        con = Conexion.getConexion();
    }

    // Método para insertar un nuevo mesero en la base de datos
    public void insertarMesero(Mesero mesero) {
        try {
            String sql = "INSERT INTO mesero (nombre, apellido, usuario, contraseña, estado) VALUES (?, ?, ?, ?,?)";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setString(1, mesero.getNombre());
                statement.setString(2, mesero.getApellido());
                statement.setString(3, mesero.getUsuario());
                statement.setString(4, mesero.getContraseña());
                statement.setBoolean(5, mesero.isEstado());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para modificar un mesero existente en la base de datos
    public void modificarMesero(Mesero mesero) {
        try {
            String sql = "UPDATE mesero SET nombre=?, apellido=?, usuario=?, contraseña=?, estado=? WHERE idMesero=?";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setString(1, mesero.getNombre());
                statement.setString(2, mesero.getApellido());
                statement.setString(3, mesero.getUsuario());
                statement.setString(4, mesero.getContraseña());
                statement.setBoolean(5,mesero.isEstado());
                statement.setInt(6, mesero.getIdMesero());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un mesero por su ID
    public void eliminarMesero(int idMesero) {
        try {
            String sql = "UPDATE mesero SET estado=0 WHERE idMesero=?";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, idMesero);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener todos los meseros de la base de datos
    public List<Mesero> obtenerTodosLosMeseros() {
        List<Mesero> listaMeseros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mesero WHERE estado = 1";
            
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int idMesero = rs.getInt("idMesero");
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    String usuario = rs.getString("usuario");
                    String contraseña = rs.getString("contraseña");
                    boolean estado = rs.getBoolean("estado");
                    Mesero mesero = new Mesero(idMesero, nombre, apellido, usuario, contraseña, estado);
                    listaMeseros.add(mesero);
                }
            }
         catch (SQLException e) {
            System.out.println("error");
        }
        return listaMeseros;
    }
    
    
    public Mesero obtenerMeseroPorUsuario(String usuario) {
        Mesero mesero = null;
        try {
            String sql = "SELECT * FROM mesero WHERE usuario = ?";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setString(1, usuario);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        int idMesero = resultSet.getInt("idMesero");
                        String nombre = resultSet.getString("nombre");
                        String apellido = resultSet.getString("apellido");
                        String contraseña = resultSet.getString("contraseña");
                        Boolean estado= resultSet.getBoolean("estado");
                        mesero = new Mesero(idMesero, nombre, apellido, usuario, contraseña, estado);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mesero;
    }

    public int obtenerIdMesero(String nombre, String apellido) {
        Mesero mesero = null;
        int id=0;
        try {
            String sql = "SELECT * FROM mesero WHERE nombre = ? AND apellido=?";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setString(1, nombre);
                statement.setString(2, apellido);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                       id =   resultSet.getInt("idMesero");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }


    
    public Mesero obtenerMeseroPorId(int idMesero) {
        Mesero mesero = null;
        try {
            String sql = "SELECT * FROM mesero WHERE idMesero = ?";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, idMesero);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        String nombre = resultSet.getString("nombre");
                        String apellido = resultSet.getString("apellido");
                        String usuario = resultSet.getString("usuario");
                        String contraseña = resultSet.getString("contraseña");
                        Boolean estado= resultSet.getBoolean("estado");
                        mesero = new Mesero(idMesero, nombre, apellido, usuario, contraseña, estado);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mesero;
    }
    
    
}
