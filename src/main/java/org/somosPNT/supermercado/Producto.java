package org.somosPNT.supermercado;

public abstract class Producto implements Comparable<Producto> {
    protected String nombre;
    protected double precio;

    

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public int compareTo(Producto otroProducto) {
        
        return Double.compare(this.precio, otroProducto.precio);
    }

    public abstract String toString();

}
