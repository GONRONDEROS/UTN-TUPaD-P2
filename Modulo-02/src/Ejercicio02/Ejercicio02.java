/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayor; 
        int menor; 
        
        System.out.print("Ingrese el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("El primer numero ingresado es: " + num1);
        
        System.out.print("Ingrese el segundo numero");
        int num2 = scanner.nextInt();
        System.out.println("El segundo numero ingresado es: " + num2);
        
        System.out.print("Ingrese el tercer numero");
        int num3 = scanner.nextInt();
        System.out.println("El tercer numero ingresado es: " + num3);
        
        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }
        
        if (num3 > mayor) {
            mayor = num3;
        } else {
            mayor = mayor;
        }
        
        System.out.println("El numero " + mayor + " es el mayor de los 3 numeros ingresados");
        
        scanner.close();
    }
}
