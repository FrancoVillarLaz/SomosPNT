package org.somosPNT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.somosPNT.supermercado.Alimento;
import org.somosPNT.supermercado.Bebida;
import org.somosPNT.supermercado.Higiene;
import org.somosPNT.supermercado.Producto;


public class App {
    public static void main( String[] args ){
        
            List<Producto> listaDeProductos= cargaProductos();
            for (Producto producto : listaDeProductos) {
                System.out.println(producto.toString());
            }
            System.out.println("===============================");
            
            Producto productoCaro = Collections.max(listaDeProductos);
            Producto productoBarato = Collections.min(listaDeProductos);

            System.out.println("Producto más caro: "+ productoCaro.getNombre());
            System.out.println("Producto más barato: "+ productoBarato.getNombre());
    }

    public static List<Producto> cargaProductos(){
        return Arrays.asList(
            new Bebida("Coca-Cola Zero", 1.5, 20),
            new Bebida("Coca-Cola", 1.5, 18),
            new Higiene("Shampoo Sedal", 19,"500ml"),
            new Alimento("Frutillas", 64,"kilo")
            );
    }
}