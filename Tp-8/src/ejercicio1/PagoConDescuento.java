/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author PCs
 */
public interface PagoConDescuento {
    
     default double aplicarDescuento(double total, MedioDePago medioDePago){
        return switch(medioDePago) {
            case medioDePago.CREDITO  -> total * 0.90; 
            case medioDePago.DEBITO   -> total * 0.85; 
            case medioDePago.EFECTIVO -> total * 0.80; 
            default         -> total;        
        };
    }
}
