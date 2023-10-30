
package Entidades;

import java.sql.Time;
import java.time.LocalDate;


public class Reserva {
    
    int idReserva;
    int idMesa;
    String nombre;
    int dni;
    LocalDate fecha;
    Time hora;
    boolean estado;

    public Reserva() {
    }

    public Reserva(int idReserva, int idMesa, String nombre, int dni, LocalDate fecha, Time hora, boolean estado) {
        this.idReserva = idReserva;
        this.idMesa = idMesa;
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public Reserva(int idMesa, String nombre, int dni, LocalDate fecha, Time hora, boolean estado) {
        this.idMesa = idMesa;
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", idMesa=" + idMesa + ", nombre=" + nombre + ", dni=" + dni + ", fecha=" + fecha + ", hora=" + hora + ", estado=" + estado + '}';
    }
    
    


}
