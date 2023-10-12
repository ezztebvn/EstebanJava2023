/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package git;

/**
 *
 * @author Estebann
 */
public class Telefono extends Producto{
    
    private String marca,modelo;

    public Telefono() {
    }

    public Telefono(String marca, String modelo, String nombre, int precioSinIva) {
        super(nombre, precioSinIva);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Telefono{" + "marca=" + marca + ", modelo=" + modelo + '}'+ super.toString();
    }
    
    
    
    

    @Override
    public String descripcionDetallada() {
        return "Telefono: "+super.getNombre()+" Precio FINAL CON IVA: $" + super.obtenerPrecioIva()+ " Marca: " + marca + " Modelo: " +modelo;
    }




    


    
}
