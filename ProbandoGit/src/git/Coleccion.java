/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package git;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Estebann
 */
public class Coleccion {
    
    private ArrayList<Producto> listaProductos;

    public Coleccion() {
        listaProductos = new ArrayList<>();
    }
    
    public boolean agregarProductos(Producto prod)
    {
        return listaProductos.add(prod);
    }
    
    public void listarProductos(){
        for (Producto producto : listaProductos) {
            System.out.println(producto);
            
        }
    }
    public final void imprimirBoleta() {
        System.out.println("------------------- Boleta --------------------");
        System.out.println("Fecha de venta: " + LocalDate.now());
        int total = 0;

        for (Producto producto : listaProductos) {
            //System.out.println(producto.getNombre() + " - $" + producto.getPrecioSinIVA());
            System.out.println(producto.getNombre() + " - $" + producto.obtenerPrecioIva());
            total += producto.obtenerPrecioIva();
        }

        System.out.println("Total: $" + total);
        System.out.println("-------------------------------------------------");
    }    
}
