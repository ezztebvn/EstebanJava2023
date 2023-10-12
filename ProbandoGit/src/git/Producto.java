/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package git;

/**
 *
 * @author Estebann
 */
public abstract class Producto implements AplicarIva{
    
    private String nombre;
    private int precioSinIva;

    public Producto() {
    }

    public Producto(String nombre, int precioSinIva) {
        this.nombre = nombre;
        this.precioSinIva = precioSinIva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(int precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precioSinIva=" + precioSinIva + '}';
    }
    
    public abstract String descripcionDetallada();
    
    public int obtenerPrecioIva(){
        return precioSinIva + calcularIva(precioSinIva);
    }
  

}
