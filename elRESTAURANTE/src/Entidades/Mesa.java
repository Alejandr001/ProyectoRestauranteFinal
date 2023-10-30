
package Entidades;

public class Mesa {
    
    int idMesa;
    int capacidad;
    boolean diponible;
    boolean atendida;

    public Mesa(int idMesa, int capacidad, boolean diponible, boolean atendida) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
        this.diponible = diponible;
        this.atendida = atendida;
    }

    
    public Mesa(int capacidad, boolean diponible, boolean atendida) {
        this.capacidad = capacidad;
        this.diponible = diponible;
        this.atendida = atendida;
    }

    public Mesa() {
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isDiponible() {
        return diponible;
    }

    public void setDiponible(boolean diponible) {
        this.diponible = diponible;
    }

    public boolean isAtendida() {
        return atendida;
    }

    public void setAtendida(boolean atendida) {
        this.atendida = atendida;
    }


public String toString() {
        return "Mesa" + "N°" + idMesa + ", disponible";
    }
   
    
}
