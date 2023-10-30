
package Entidades;

import java.sql.Date;


public class Pedido {
    
    private int idPedido;
    private int idMesa;
    private int idMesero;
    private Date fecha;
    private boolean estado;

    public Pedido(int idMesa, int idMesero, Date fecha, boolean estado) {
        this.idMesa = idMesa;
        this.idMesero = idMesero;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Pedido(int idPedido, int idMesa, int idMesero, Date fecha, boolean estado) {
        this.idPedido = idPedido;
        this.idMesa = idMesa;
        this.idMesero = idMesero;
        this.fecha = fecha;
        this.estado = estado;
    }

   

    public Pedido() {
    }

    public Pedido(int idMesa, int idMesero) {
        this.idMesa = idMesa;
        this.idMesero = idMesero;
    }

    public Pedido(int idPedido, int idProducto, int idMesa, int idMesero, java.util.Date fecha, boolean estado) {
        
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }



    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
           
    
    
    
    
    
}