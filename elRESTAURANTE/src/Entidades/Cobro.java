
package Entidades;


import java.sql.Date;



public class Cobro {
    private int idCobro;
    private int idPedido;
    private int idMesero;
    private int idMesa;
    private Date fecha;
    private double total;

    public Cobro(int idCobro, int idPedido, int idMesero, int idMesa, Date fecha, double total) {
        this.idCobro = idCobro;
        this.idPedido = idPedido;
        this.idMesero = idMesero;
        this.idMesa = idMesa;
        this.fecha = fecha;
        this.total = total;
    }
       
    public Cobro() {
    }
    public Cobro(int idPedido, int idMesero, double total) {
        this.idPedido = idPedido;
        this.idMesero = idMesero;
        this.total = 0;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

    public int getIdCobro() {
        return idCobro;
    }

    public void setIdCobro(int idCobro) {
        this.idCobro = idCobro;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
            
    }
