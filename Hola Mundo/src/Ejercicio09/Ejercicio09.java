/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio09;
import java.util.Scanner;
/**
 *
 * @author gonza
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // El error aqui era que intentaba leer una variable tipo int en vez de un string
        
        System.out.println("Hola, " + nombre);
    }

}
