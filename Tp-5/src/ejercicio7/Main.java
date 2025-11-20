/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author gonza
 */
public class Main {

    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "MS12345");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Ford Fiesta", motor);

        Conductor conductor = new Conductor("Nahuel", "L-998877");
        
        System.out.println(vehiculo + "\n" + conductor);
        vehiculo.setConductor(conductor);

        System.out.println(vehiculo + "\n" + conductor);
        
    }
}
