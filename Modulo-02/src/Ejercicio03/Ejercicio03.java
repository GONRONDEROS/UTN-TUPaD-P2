/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03;

import java.util.Scanner; 

/**
 *
 * @author gonza
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad");
        int edad = scanner.nextInt();
        
        if (edad < 12) {
            System.out.println("Niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Adoloscente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }
    }
    
}
