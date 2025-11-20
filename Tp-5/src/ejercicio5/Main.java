/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author gonza
 */
public class Main {
    public static void main(String[] args) {
        Computadora compu = new Computadora("Lenovo", "0001112222333");
        Propietario propietario = new Propietario("Nahuel", "123456789");
        
        System.out.println(compu +"\n"+ propietario);
        
        compu.setPropietario(propietario);
        
         System.out.println(compu +"\n"+ propietario);
    }
}
