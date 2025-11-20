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
public class Main {

    public static void main(String[] args) {
        Excepciones ex = new Excepciones();

        ex.divisionSegura();
        ex.conversionAnumero();
        ex.LectorArchivo();

        try (Scanner scanner = new Scanner(System.in);) {
            // Intentamos llamar al método que puede fallar
            System.out.print("Introduce tu edad: ");
            int edadUsuario = scanner.nextInt();
            ex.verificarEdad(edadUsuario);

        } catch (EdadInvalidaException e) {
            // Capturamos NUESTRA excepción si fue lanzada
            System.out.println("Error capturado: " + e.getMessage());

        }
    }
}
