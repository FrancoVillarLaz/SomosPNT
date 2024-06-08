package org.somosPNT.supermercado;

public class Alimento extends Producto {
    private String unidadVenta;

    public Alimento(String nombre, double precio, String unidadVenta) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }

    public String getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ nombre+" /// Precio: "+precio+" /// Unidad de venta: "+unidadVenta;
    }
    
}
