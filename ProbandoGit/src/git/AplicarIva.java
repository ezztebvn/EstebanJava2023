/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package git;

/**
 *
 * @author Estebann
 */
public interface AplicarIva {
    
    double IVA = 0.19;
    
    default int calcularIva(int precioSinIva){
        return (int) (precioSinIva * AplicarIva.IVA);
    }    
    
}
