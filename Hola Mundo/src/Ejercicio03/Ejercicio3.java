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
public class Ejercicio3 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        String nombre, estudiante;
        double altura;
        boolean eres;
        
        System.out.println("Ingresa tu Edad");
        edad = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa tu Altura");
        altura = Double.parseDouble(input.nextLine());
        System.out.println("Ingresa tu Nombre");
        nombre = input.nextLine();
        System.out.println("Eres estudiante?");
        estudiante = input.nextLine().toLowerCase();
        
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu edad es " + edad);
        System.out.println("Tu altura es " + altura);
        if (estudiante.equals("si")) {
            eres = true;
        } else {
            eres = false;
        }
        if (eres) {
            System.out.println("Es estudiante");
        } else {
            System.out.println("No es estudiante");
        }
    }
}
