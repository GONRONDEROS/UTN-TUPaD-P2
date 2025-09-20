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
public class Ejercicio5 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y, sum, res, mul, div;
        div = 0;
                
        System.out.println("Ingresa numero A: ");
        x = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa numero B: ");
        y = Integer.parseInt(input.nextLine());
        
        sum = x + y;
        res = x - y;
        mul = x * y;
        
        System.out.println("A + B = " + sum);
        System.out.println("A - B = " + res);
        System.out.println("A * B = " + mul);
        if (y == 0){
            System.out.println("No se puede dividir por 0");
        } else {
            System.out.println("A / B = " + (div = x / y));
        }        
     }
}
