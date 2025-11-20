/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Pedido implements Pagable, PagoConDescuento, Pago{
    private List<Producto> listaProductos = new ArrayList<>();
    private double cobro;
    private MedioDePago medioDePago;
    private String estado;
    private Notificable clienteANotificar;

    public Pedido(double cobro, MedioDePago medioDePago, Notificable clienteANotificar) {
        this.cobro = cobro;
        this.medioDePago = medioDePago;
        this.clienteANotificar = clienteANotificar;
        
        this.setEstado("Pedido Iniciado");
    }
    
    public void agregarProducto(Producto producto){
        this.listaProductos.add(producto);
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        
        // Notificamos al cliente sobre el cambio
        if (this.clienteANotificar != null) {
            this.clienteANotificar.notificar("El estado de su pedido cambió a: " + this.estado);
        }
    }

    public String getEstado() {
        return estado;
    }
    
    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : listaProductos) {
            total += producto.getPrecio();
        }
        return total;
    }

    @Override
    public void procesarPago() {
        double total = calcularTotal();
        double totalConDescuento = this.aplicarDescuento(total, medioDePago);
            
        System.out.print("Total: " + total + 
                "\nTotal con Descuento: " + totalConDescuento + 
                (this.cobro != 0 ? "\nCobro: " + this.cobro : "") + 
                "\nMedio de pago: " + medioDePago + 
                (this.medioDePago == MedioDePago.EFECTIVO 
                ? "\nVuelto: $" + (this.cobro - totalConDescuento) : "")
                        );
        
        this.setEstado("Pago Aprobado");
    }
    
    
    
}
