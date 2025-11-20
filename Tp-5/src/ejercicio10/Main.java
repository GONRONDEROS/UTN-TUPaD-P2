/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author gonza
 */
public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("000111222333", 10000.0, "1234", "2025-09-15");
        Titular titular = new Titular("Nahuel Ayala", "48981234");

        cuenta.setTitular(titular); 
        
        System.out.println(cuenta);

    }
}
