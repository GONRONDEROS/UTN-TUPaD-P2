/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author gonza
 */
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("BBVA", "12-123456123-12");
        Cliente cliente = new Cliente("Nahuel", "12345689");
        System.out.println(cliente);
        
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234456445654562", "09/30", cliente, banco);
        
        System.out.println(cliente + "\n" + tarjeta);
    }
}
