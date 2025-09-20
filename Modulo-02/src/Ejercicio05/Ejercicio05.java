/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio05;
import java.util.Scanner;
/**
 *
 * @author gonza
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int suma = 0;
                
        do {
            System.out.print("Ingrese un numero (0 para terminar)");
            num = scanner.nextInt();
            
            if (num % 2 == 0 && num != 0) {
                suma += num;
            }
        } while (num != 0);
        
        System.out.print("La suma de los numeros pares ingresados es: " + suma);
    }
}
