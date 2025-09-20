/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Ejercicio01;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int ano = scanner.nextInt();
        
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("El año " + ano + " es bisiesto");
        } else {
            System.out.println("El año " + ano + " no es bisiesto");
        }
        scanner.close();
    }
    
}
