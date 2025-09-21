/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author gonza
 */
public class Ejercicio13 {
    // Funcion recursiva para imprimir precios originales
    public static void imprimirPreciosOriginales(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            imprimirPreciosOriginales(precios, indice + 1);
        }
    }

    // Funcion recursiva para imprimir precios modificados
    public static void imprimirPreciosModificados(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            imprimirPreciosModificados(precios, indice + 1);
        }
    }

    public static void main(String[] args) {
        // a. Declarar e inicializar el array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar precios originales
        System.out.println("Precios originales:");
        imprimirPreciosOriginales(precios, 0);

        // c. Modificar el precio del tercer producto (índice 2)
        precios[2] = 129.99;

        // d. Mostrar precios modificados
        System.out.println("\nPrecios modificados:");
        imprimirPreciosModificados(precios, 0);
    }
}
