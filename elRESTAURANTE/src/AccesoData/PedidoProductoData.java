
package AccesoData;

import Entidades.Pedido;
import Entidades.PedidoProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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

    }

    public List<PedidoProducto> listarPorIdPedido(int idPedido) {
    List<PedidoProducto> listaPep = new ArrayList<>();

    try (Connection con = Conexion.getConexion()) {
        String sql = "SELECT idPedidoProducto, idPedido, idProducto FROM PedidoProducto WHERE idPedido = ?";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, idPedido);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int idPedidoProducto = resultSet.getInt("idPedidoProducto");
                    int idProducto = resultSet.getInt("idProducto");
                    // Crea un objeto PedidoProducto con los datos obtenidos
                    PedidoProducto pedidoProducto = new PedidoProducto(idPedidoProducto, idPedido, idProducto);
                    listaPep.add(pedidoProducto);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return listaPep;
}
    
    public void eliminarPedidoProducto(int idPedidoProducto) {
    try (Connection con = Conexion.getConexion()) {
        String sql = "DELETE FROM PedidoProducto WHERE idPedidoProducto = ?";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, idPedidoProducto);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    public PedidoProducto buscarPedidoProductoPorId(int idPedidoProducto) {
        PedidoProducto pedidoProducto = null;

        try (Connection con = Conexion.getConexion()) {
            String sql = "SELECT * FROM PedidoProducto WHERE idPedidoProducto = ?";
            try (PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, idPedidoProducto);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        int idPedido = resultSet.getInt("idPedido");
                        int idProducto = resultSet.getInt("idProducto");

                        pedidoProducto = new PedidoProducto(idPedidoProducto, idPedido, idProducto);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pedidoProducto;
    }
}
