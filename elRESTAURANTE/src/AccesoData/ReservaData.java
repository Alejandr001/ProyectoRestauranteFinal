package AccesoData;

import java.sql.*;
import java.time.LocalDate;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Entidades.Reserva;
import static java.lang.String.format;

public class ReservaData {
    private Connection con = null;

    private void closeConnection(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void guardarReserva(Reserva reserva) {
        String sql = "INSERT INTO reserva (idMesa, nombre, dni, fecha, hora, estado) VALUES (?, ?, ?, ?, ?, ?)";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reserva.getIdMesa());
            ps.setString(2, reserva.getNombre());
            ps.setInt(3, reserva.getDni());
            ps.setDate(4, java.sql.Date.valueOf(reserva.getFecha()));
            Time hora = java.sql.Time.valueOf("12:00:00");
            ps.setTime(5, hora);
            ps.setBoolean(6, reserva.isEstado());
            ps.executeUpdate();

            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Reserva añadida con éxito.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Reserva: " + ex.getMessage());
        } finally {
           
        }
    }

    public Reserva buscarReserva(int id) throws SQLException {
        Reserva reserva = null;
        String sql = "SELECT idReserva, idMesa, nombre, dni, fecha, hora, estado FROM reserva WHERE idReserva = ?";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                int idReserva = rs.getInt("idReserva");
                int idMesa = rs.getInt("idMesa");
                String nombre = rs.getString("nombre");
                int dni = rs.getInt("dni");
                LocalDate fecha = rs.getDate("fecha").toLocalDate();
                Time hora = rs.getTime("hora");
                boolean estado = rs.getBoolean("estado");

                reserva = new Reserva(idReserva, idMesa, nombre, dni, fecha, hora, estado);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la reserva.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Reserva: " + ex.getMessage());
        } finally {
            
        }
        return reserva;
    }
    public boolean eliminarReserva(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Conexion.getConexion();
            String sql = "UPDATE reserva SET estado = false WHERE idReserva = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            if (filas == 1) {
                return true; // Reserva cancelada con éxito
            } else {

                return false; // No se encontró la reserva para cancelar
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cancelar la reserva: " + ex.getMessage());
            return false;
        } finally {
            closeConnection(con, ps, null);
        }
    }
    
    
//    public void eliminarReserva(int id) {
//        Connection con = null;
//        PreparedStatement ps = null;
//        try {
//            con = Conexion.getConexion();
//            String sql = "DELETE FROM reserva WHERE idReserva = ?";
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            int filas = ps.executeUpdate();
//            if (filas == 1) {
//                JOptionPane.showMessageDialog(null, "Se eliminó la reserva.");
//            } else {
//                JOptionPane.showMessageDialog(null, "No se encontró la reserva para eliminar.");
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al eliminar la reserva: " + ex.getMessage());
//        } finally {
//            
//        }
//    }

    public void modificarReserva(Reserva reserva) {
        String sql = "UPDATE reserva SET idMesa = ?, nombre = ?, dni = ?, fecha = ?, hora = ?, estado = ? WHERE idReserva = ?";
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, reserva.getIdMesa());
            ps.setString(2, reserva.getNombre());
            ps.setInt(3, reserva.getDni());
            ps.setDate(4, java.sql.Date.valueOf(reserva.getFecha()));
            
            ps.setTime(5, Time.valueOf(reserva.getHora().toString()));
            
            ps.setBoolean(6, reserva.isEstado());
            ps.setInt(7, reserva.getIdReserva());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Reserva modificada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la reserva para modificar.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar la reserva: " + ex.getMessage());
        } finally {
            
        }
    }



   public List<Reserva> listarReservas() {
    List<Reserva> reservas = new ArrayList<>();

    try (Connection con = Conexion.getConexion();
         PreparedStatement ps = con.prepareStatement("SELECT idReserva, idMesa, nombre, dni, fecha, hora, estado FROM reserva");
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            int idReserva = rs.getInt("idReserva");
            int idMesa = rs.getInt("idMesa");
            String nombre = rs.getString("nombre");
            int dni = rs.getInt("dni");
            LocalDate fecha = rs.getDate("fecha").toLocalDate();
            Time hora = rs.getTime("hora");
            boolean estado = rs.getBoolean("estado");

            Reserva reserva = new Reserva(idReserva, idMesa, nombre, dni, fecha, hora, estado);
            reservas.add(reserva);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Reserva: " + ex.getMessage());
    }

    return reservas;
}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
//     public Time obtenerHoraReserva(int idReserva) {
//        Connection con = null;
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//        Time hora = null;
//
//        try {
//            con = Conexion.getConexion();
//            String sql = "SELECT hora FROM reserva WHERE idReserva = ?";
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, idReserva);
//            rs = ps.executeQuery();
//
//            if (rs.next()) {
//                hora = rs.getTime("hora");
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } finally {
//            closeConnection(con, ps, rs);
//        }
//
//        JOptionPane.showMessageDialog(null, "Hora de reserva " + hora);
//        return hora;
//    }
}