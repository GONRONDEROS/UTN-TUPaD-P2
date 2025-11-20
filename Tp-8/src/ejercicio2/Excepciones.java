/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Excepciones {
    Scanner sc = new Scanner(System.in);
    public  void divisionSegura() {

        try {
            System.out.print("Introduce el dividendo: ");
            int dividendo = sc.nextInt();

            System.out.print("Introduce el divisor: ");
            int divisor = sc.nextInt();

            // Punto de posible excepción
            int resultado = dividendo / divisor;
            System.out.println("El resultado de la división es: " + resultado);
            sc.nextLine();
        } catch (ArithmeticException e) {
            System.out.println("No es posible dividir por 0");
            sc.nextLine();
        }
    }

    public  void conversionAnumero() {
        String text = "";
        try {
            System.out.println("Introduzca el número como texto: ");
            text = sc.nextLine();

            int numeroConvertido = Integer.parseInt(text);
            System.out.println("Número convertido: " + numeroConvertido);
        } catch (NumberFormatException e) {
            System.out.println("Error: El texto '" + text + "' no se puede convertir a un número entero.");
        }
    }

    public void LectorArchivo() {
        String nombreArchivo = "datos.txt";
        File archivo = new File(nombreArchivo);

        try (Scanner lectorArchivo = new Scanner(archivo);) {
            System.out.println("--- Contenido del archivo " + nombreArchivo + " ---");
            while (lectorArchivo.hasNextLine()) {
                String linea = lectorArchivo.nextLine();
                System.out.println(linea);
            }
            System.out.println("--- Fin del archivo ---");
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo '" + nombreArchivo + "' no se ha encontrado.");
        }
    }

    public void verificarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            // Lanzamos manualmente la excepción si la edad es inválida
            throw new EdadInvalidaException("Edad inválida: " + edad + ". Debe estar entre 0 y 120.");
        }
        System.out.println("Edad válida: " + edad);
    }
}
