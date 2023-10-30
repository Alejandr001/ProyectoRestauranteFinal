
package Entidades;


public class PedidoProducto {
    private int pep;
    private int idPedido;
    private int idProducto;

    public PedidoProducto(int idPedido, int idProducto) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
    }

    public PedidoProducto() {
    }

    public PedidoProducto(int pep, int idPedido, int idProducto) {
        this.pep = pep;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
    }

    public int getPep() {
        return pep;
    }

    public void setPep(int pep) {
        this.pep = pep;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    
}
