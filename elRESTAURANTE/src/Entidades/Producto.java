package Entidades;


public class Producto {
   
    int idProducto;
    String nombre;
    String categoria;
    int cantidad;
    int Precio;
    int disponible;

    public Producto(String nombre, String categoria, int cantidad, int Precio, int disponible) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.Precio = Precio;
        this.disponible = disponible;
    }

    

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", categoria=" + categoria + ", cantidad=" + cantidad + ", Precio=" + Precio + ", disponible=" + disponible + '}';
    }
    
    
    
    
    
}
