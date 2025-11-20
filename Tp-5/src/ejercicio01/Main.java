/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author gonza
 */
import java.time.LocalDate;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
        Titular titular = new Titular("Nahuel", "12.345.678");

        LocalDate fechaEmision = LocalDate.parse("2025-09-12");
        Pasaporte pasaporte = new Pasaporte("123456", fechaEmision, "imagen.jpg", "JPG", titular);
        
        
        System.out.println(titular + "\n" + pasaporte);
    }
}