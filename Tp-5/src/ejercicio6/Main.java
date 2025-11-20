/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author gonza
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Nahuel", "1155368456");
        Mesa mesa = new Mesa("10", 4);
        
        Reserva nuevaReserva = new Reserva("16/09/2025", "20:00", cliente, mesa);
        
        System.out.println(nuevaReserva);
    }
}
