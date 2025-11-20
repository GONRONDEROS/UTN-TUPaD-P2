/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author gonza
 */
public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Nahuel Ayala", "nahuel@mail.com");

        GeneradorQR generador = new GeneradorQR();
        CodigoQR qr = generador.generar("ABC123XYZ", usuario);

        System.out.println(qr);
    }
}
