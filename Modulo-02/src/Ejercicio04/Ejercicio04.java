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
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double descuento;
        
        System.out.print("Ingrese el precio del producto");
        int precio = scanner.nextInt();
        scanner.nextLine();
                
        System.out.print("Ingrese categoria del producto (A,B,C)");
        String categoria = scanner.nextLine();
        String minuscula = categoria.toLowerCase();
        
        switch (minuscula) {
            case "a" -> {
                descuento = precio * 0.9;
                System.out.println("Descuento aplicado: 10%");
                System.out.println("Precio final: " + descuento);
            }
            case "b" -> {
                descuento = precio * 0.85;
                System.out.println("Descuento aplicado: 15%");
                System.out.println("Precio final: " + descuento);
            }
            case "c" -> {
                descuento = precio * 0.8;
                System.out.println("Descuento aplicado: 20%");
                System.out.println("Precio final: " + descuento);
            }
        }
        
    }
}
