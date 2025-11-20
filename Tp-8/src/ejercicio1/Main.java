/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente cliente1 = new Cliente("Juan Perez", "juan.perez@email.com");

        Pedido pedido = new Pedido(0, MedioDePago.CREDITO, cliente1);
       
        Producto harina = new Producto("Harina", 1500.00);
        Producto leche = new Producto("Leche", 1300.50);
        Producto pan = new Producto("Pan", 1200.00);
        
        pedido.agregarProducto(harina);
        pedido.agregarProducto(leche);
        pedido.agregarProducto(pan);
        
        double totalCompra = pedido.calcularTotal();
        
        System.out.println("Total: " + totalCompra);
        System.out.println("Total con descuento: " + pedido.aplicarDescuento(totalCompra, MedioDePago.EFECTIVO));
        
        System.out.println("Se procesa el pedido: ");
        pedido.procesarPago();
    }
    }
    

