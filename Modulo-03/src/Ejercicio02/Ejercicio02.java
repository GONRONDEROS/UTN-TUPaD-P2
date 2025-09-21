/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

/**
 *
 * @author gonza
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Mascota miMascota = new Mascota();
        miMascota.setNombre("Coquito");
        miMascota.setEspecie("Perro");
        miMascota.setEdad(15);
        miMascota.mostrarInfo();
        miMascota.cumplirAnios();
        miMascota.mostrarInfo();
    }
}
