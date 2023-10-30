
package AccesoData;


import Entidades.Mesa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MesaData {
    private Connection con = null;
    
    public MesaData() {
        con = Conexion.getConexion();
    }
    
    public void insertarMesa(Mesa mesa) {
        try {
            String sql = "INSERT INTO mesa (capacidad, disponible, atendida) VALUES (?, ?, ?)";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, mesa.getCapacidad());
                statement.setBoolean(2, mesa.isDiponible());
                statement.setBoolean(3, mesa.isAtendida());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("error");
        }
    }

    public void modificarMesa(Mesa mesa) {
        try {
            String sql = "UPDATE mesa SET capacidad=?, disponible=?, atendida=? WHERE idMesa=?";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, mesa.getCapacidad());
                statement.setBoolean(2, mesa.isDiponible());
                statement.setBoolean(3, mesa.isAtendida());
                statement.setInt(4, mesa.getIdMesa());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("error");
        }
    }
    
    public boolean eliminarMesa(int idMesa) {
        try {
            String sql = "DELETE FROM mesa WHERE idmesa=?";
            try (Connection con = Conexion.getConexion(); PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, idMesa);
                statement.executeUpdate();
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

//    public void eliminarMesa(int idMesa) {
//        try {
//            String sql = "DELETE FROM mesa WHERE idMesa=?";
//            try (Connection con = Conexion.getConexion();
//                 PreparedStatement statement = con.prepareStatement(sql)) {
//                statement.setInt(1, idMesa);
//                statement.executeUpdate();
//            }
//        } catch (SQLException e) {
//           System.out.println("error");
//        }
//    }

    public List<Mesa> obtenerTodasLasMesas() {
        List<Mesa> listaMesas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mesa";
            
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int idMesa = rs.getInt("idMesa");
                    int capacidad = rs.getInt("capacidad");
                    boolean disponible = rs.getBoolean("disponible");
                    boolean atendida = rs.getBoolean("atendida");
                    Mesa mesa = new Mesa(idMesa, capacidad, disponible, atendida);
                    listaMesas.add(mesa);
                }
            }
         catch (SQLException e) {
            System.out.println("error");
        }
        return listaMesas;
    }
    
    public Mesa buscarPorId(int idMesa) {
    try (Connection con = Conexion.getConexion()) {
        String sql = "SELECT * FROM mesa WHERE idMesa = ?";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, idMesa);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("idMesa");
                    int capacidad = rs.getInt("capacidad");
                    boolean disponibilidad = rs.getBoolean("disponible");
                    boolean atendida = rs.getBoolean("atendida");

                    return new Mesa(id, capacidad, disponibilidad, atendida);
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return null; // Devuelve null si no se encuentra ninguna mesa con ese ID o si ocurre un error.
}
    public List<Mesa> obtenerMesasNoDisponibles() {
        List<Mesa> listaMesas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mesa WHERE disponible = 0";
            
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int idMesa = rs.getInt("idMesa");
                    int capacidad = rs.getInt("capacidad");
                    boolean disponible = rs.getBoolean("disponible");
                    boolean atendida = rs.getBoolean("atendida");
                    Mesa mesa = new Mesa(idMesa, capacidad, disponible, atendida);
                    listaMesas.add(mesa);
                }
            }
         catch (SQLException e) {
            System.out.println("error");
        }
        return listaMesas;
    }
    public List<Mesa> obtenerMesasDisponibles() {
        List<Mesa> listaMesas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mesa WHERE disponible = 1 AND atendida = 1";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idMesa = rs.getInt("idMesa");
                int capacidad = rs.getInt("capacidad");
                boolean disponible = rs.getBoolean("disponible");
                boolean atendida = rs.getBoolean("atendida");
                Mesa mesa = new Mesa(idMesa, capacidad, disponible, atendida);
                listaMesas.add(mesa);
            }
        } catch (SQLException e) {
            System.out.println("error");
        }
        return listaMesas;
    }

    public ArrayList<Mesa> llenarcombo() {

        Connection con = Conexion.getConexion();
        Statement st;
        ResultSet rs;
        ArrayList<Mesa> listaMesas = new ArrayList<>();

        try {
            st = con.createStatement();
            rs = st.executeQuery("Select * from Mesa");

            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setDiponible(rs.getBoolean("disponible"));
                mesa.setAtendida(rs.getBoolean("atendida"));
                listaMesas.add(mesa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);

        }
        return listaMesas;
    }
}