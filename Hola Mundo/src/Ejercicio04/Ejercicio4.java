/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio04;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejercicio4 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        String nombre;
        
        System.out.println("Ingresa tu Edad");
        edad = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa tu Nombre");
        nombre = input.nextLine();
                
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu edad es " + edad);
    }
}
