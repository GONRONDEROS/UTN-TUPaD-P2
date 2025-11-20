/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author gonza
 */
public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Nahuel", "40144898");
        Celular celu = new Celular("00111123321254", "Motorola", "E06");

        System.out.println(usuario + "\n" + celu);

        celu.setUsuario(usuario);

        System.out.println(usuario + "\n" + celu);
    }
}