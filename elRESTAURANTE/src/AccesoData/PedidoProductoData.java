
package AccesoData;

import Entidades.Pedido;
import Entidades.PedidoProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class PedidoProductoData {
    private Connection con = null;

    public PedidoProductoData() {
        con = Conexion.getConexion();
    }
    
public void guardarPep(PedidoProducto pep) {
     try (Connection con = Conexion.getConexion()) {
        

        try (PreparedStatement statement = con.prepareStatement("INSERT INTO PedidoProducto (idPedido, idProducto) VALUES (?, ?)")) {
            statement.setInt(1, pep.getIdPedido());
            statement.setInt(2, pep.getIdProducto());
            statement.executeUpdate();
        } catch (SQLException e) {
            
            e.printStackTrace();
        } finally {
            
//            System.out.println("Conexión cerrada");
        }
    } catch (SQLException e) {
        // Registra cualquier excepción que se produzca al abrir la conexión.
        e.printStackTrace();
    }
    // corregir desde aqui
//        String sql = "INSERT INTO PedidoProducto (idPedido, idProducto) VALUES (?, ?)";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(1, pep.getIdPedido());
//            ps.setInt(2, pep.getIdProducto());
//            
//            ps.executeUpdate();
//            ResultSet rs = ps.getGeneratedKeys();
//            if (rs.next()) {
//                pep.setIdProducto(rs.getInt(1));
//                JOptionPane.showMessageDialog(null, "Pep añadido con éxito.");
//            }
//           
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pep: " + ex.getMessage());
//        }
    }
    
}
