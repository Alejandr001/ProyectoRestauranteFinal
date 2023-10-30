
package AccesoData;


import Entidades.Cobro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;
import javax.swing.JOptionPane;

public class CobroData {
     private Connection con = null;

    public CobroData() {
       con = Conexion.getConexion(); 
    }
 
   public void insertarCobro(Cobro cobro) {
    String sql = "INSERT INTO cobro (idMesa, idMesero, idPedido, total, fecha) VALUES (?,?,?,?,?)";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, cobro.getIdMesa());
        ps.setInt(2, cobro.getIdMesero());
        ps.setInt(3, cobro.getIdPedido());
        ps.setDouble(4, cobro.getTotal());
        ps.setDate(5, cobro.getFecha());
        int filasInsertadas = ps.executeUpdate();

        if (filasInsertadas > 0) {
            JOptionPane.showMessageDialog(null, "El cobro se ha insertado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al insertar el cobro.");
        }

        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al insertar el cobro: " + e.getMessage());
    }
}

    public void modificarCobro(Cobro cobro) {
    String sql = "UPDATE cobro SET idPedido=?, idMesero=?, idMesa=?, fecha=? WHERE idCobro=?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, cobro.getIdPedido());
        ps.setInt(2, cobro.getIdMesero());
        ps.setInt(3, cobro.getIdMesa());
        ps.setDate(4, cobro.getFecha());
        ps.setInt(5, cobro.getIdCobro());
        int filasModificadas = ps.executeUpdate();

        if (filasModificadas > 0) {
            JOptionPane.showMessageDialog(null, "El cobro se modificó exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un cobro con el ID proporcionado o no se realizaron cambios.");
        }

        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al modificar el cobro: " + e.getMessage());
    }
}


   public void eliminarCobro(int idCobro) {
    String sql = "DELETE FROM cobro WHERE idCobro=?";
       try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCobro);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "El cobro seleccionado fue elimniando con exitos");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Su consulta no pudo ser efectuada, contactese con el servidor");
        
    }
}


   public List<Cobro> obtenerTodosLosCobros() {
    List<Cobro> listaCobros = new ArrayList<>();
    try {
        String sql = "SELECT * FROM Cobro";
        try (PreparedStatement statement = con.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int idCobro = resultSet.getInt("idCobro");
                int idPedido = resultSet.getInt("idPedido");
                int idMesero = resultSet.getInt("idMesero");
                int idMesa = resultSet.getInt("idMesa");
                Date fecha = resultSet.getDate("fecha");
                int total = resultSet.getInt("total");

                LocalDate fechaLocal = fecha.toLocalDate(); // Conversión de java.sql.Date a LocalDate

                Cobro cobro = new Cobro(idCobro, idPedido, idMesero, idMesa, fecha, total); // Usar fechaLocal en lugar de fecha
                listaCobros.add(cobro);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return listaCobros;
}
}