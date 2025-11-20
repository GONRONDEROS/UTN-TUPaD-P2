/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author gonza
 */
public class Main {

    public static void main(String[] args) {
        Artista artista = new Artista("Soda Stereo", "Rock");
        Cancion cancion = new Cancion("De música ligera", artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }
}
