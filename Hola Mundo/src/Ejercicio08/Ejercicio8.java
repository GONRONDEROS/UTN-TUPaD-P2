/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio08;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejercicio8
{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /// ejercicio con int
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        if (num2 != 0) {
            int resultado = num1 / num2;
            System.out.println("Resultado de la división entera: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
        /// ejercicio con double
        System.out.print("Ingrese el primer número entero: ");
        double num3 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        double num4 = scanner.nextInt();

        if (num4 != 0) {
            double resultado = num3 / num4;
            System.out.println("Resultado de la división entera: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
        
        /// La diferencia clave es que int trunca el resultado, mientras que double lo conserva completo.
        
    }
}
