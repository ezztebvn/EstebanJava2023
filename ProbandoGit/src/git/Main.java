/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package git;

/**
 *
 * @author Estebann
 */
public class Main {
    
    public static void main(String[] args) {
        
        Telefono telefono1 = new Telefono("Iphone", "X", "IOS", 600000);
        Telefono telefono2 = new Telefono("Samsung", "s22", "Android", 100000);

        
        Ordenador ordenador1 = new Ordenador("Torre", "Ryzen 5 5600x", "ASUS", 1000000);
        Ordenador ordenador2 = new Ordenador("Laptop", "i5  10400F", "ACER", 800000);
        
        ordenador1.obtenerPrecioIva();
        telefono1.obtenerPrecioIva();
        
        System.out.println(ordenador1.descripcionDetallada());
        System.out.println(telefono1.descripcionDetallada());
        System.out.println(ordenador2.descripcionDetallada());
        System.out.println(telefono2.descripcionDetallada())        ;
        System.out.println("-------------------------------------------------");
        

        
        Coleccion col = new Coleccion();
        
        col.agregarProductos(ordenador1);
        col.agregarProductos(telefono1);
        col.agregarProductos(ordenador2);
        col.agregarProductos(telefono2); 
        
        col.listarProductos();
        
        col.imprimirBoleta();

    }
    
}
