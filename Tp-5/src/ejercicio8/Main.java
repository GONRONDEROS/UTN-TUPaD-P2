/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author gonza
 */
public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Nahuel", "nahuel@email.com");

        Documento documento = new Documento("Contrato", "Este es el contenido del contrato...", "HASH123456", "15/09/2025", usuario);

        System.out.println(documento);
    }
}
