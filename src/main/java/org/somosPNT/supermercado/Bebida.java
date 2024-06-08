package org.somosPNT.supermercado;

public class Bebida extends Producto{
   
    private double litros;

    public Bebida(String nombre, double precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
    
    @Override
    public String toString(){
        return "nombre: "+ nombre+" /// litros: "+litros+" /// precio: "+precio;
    }
}
