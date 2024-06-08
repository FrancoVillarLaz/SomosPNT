package org.somosPNT.supermercado;

public class Higiene extends Producto{
    private String contenido;

    public Higiene(String nombre, double precio, String contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }
    
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return  "Nombre: "+ nombre+" /// contenido: "+contenido+" /// Precio: "+precio;
    }

   
    
}
