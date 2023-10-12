/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package git;

/**
 *
 * @author Estebann
 */
public class Ordenador extends Producto {

    private String tipoOrdenador, procesador;

    public Ordenador() {
    }

    public Ordenador(String tipoOrdenador, String procesador, String nombre, int precioSinIva) {
        super(nombre, precioSinIva);
        this.tipoOrdenador = tipoOrdenador;
        this.procesador = procesador;
    }

    public String getTipoOrdenador() {
        return tipoOrdenador;
    }

    public void setTipoOrdenador(String tipoOrdenador) {
        this.tipoOrdenador = tipoOrdenador;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "tipoOrdenador=" + tipoOrdenador + ", procesador=" + procesador + '}' + super.toString();
    }

    @Override
    public String descripcionDetallada() {
        return "Ordenador: " + super.getNombre() + " Precio FINAL CON IVA: $" + super.obtenerPrecioIva() + " Procesador: " + procesador + " Tipo Ordenador: " + tipoOrdenador;
    }

}
