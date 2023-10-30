
package AccesoData;

import Entidades.Pedido;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PedidoData {
    private Connection con = null;
        public PedidoData() {
        con = Conexion.getConexion();
    }
        
       
       
    public int insertarPedido(Pedido pedido) {
        int generatedId = -1;  // Inicializamos a un valor que no tenga sentido en caso de error

        try (Connection con = Conexion.getConexion()) {
            try (PreparedStatement statement = con.prepareStatement("INSERT INTO pedido (idMesa, idMesero, fecha, estado) VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {
                statement.setInt(1, pedido.getIdMesa());
                statement.setInt(2, pedido.getIdMesero());
                statement.setDate(3, pedido.getFecha());
                statement.setBoolean(4, pedido.isEstado());

                statement.executeUpdate();

                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    generatedId = generatedKeys.getInt(1);  // Obtén el ID generado
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return generatedId;  // Devolvemos el ID generado o -1 en caso de error
    }
    
    public boolean pagarPedido(int idPedido) {
    try (Connection con = Conexion.getConexion()) {
        String sql = "UPDATE pedido SET estado = ? WHERE idPedido = ?";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setBoolean(1, true); // Cambia el estado a true
            statement.setInt(2, idPedido); // El idPedido es el identificador único del pedido a pagar
            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0; // Devuelve true si al menos una fila fue actualizada
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false; // En caso de error o si no se actualiza ninguna fila
}
    
    public List<Pedido> obtenerPedidosConEstado(int estado) {
        List<Pedido> pedidos = new ArrayList<>();

        try (Connection con = Conexion.getConexion();
                PreparedStatement statement = con.prepareStatement("SELECT * FROM pedido WHERE estado = ?")) {
            statement.setInt(1, estado);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int idPedido = resultSet.getInt("idPedido");
                    int idMesa = resultSet.getInt("idMesa");
                    int idMesero = resultSet.getInt("idMesero");
                    Date fecha = resultSet.getDate("fecha");
                    boolean pedidoEstado = resultSet.getBoolean("estado");

                    Pedido pedido = new Pedido(idPedido, idMesa, idMesero, fecha, pedidoEstado);
                    pedidos.add(pedido);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pedidos;
    }
}
