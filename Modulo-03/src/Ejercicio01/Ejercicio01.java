/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio01;

/**
 *
 * @author gonza
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante a = new Estudiante();
        a.setNombre("Gonzalo");
        a.setApellido("Ronderos");
        a.setCurso("A");
        a.subirCalificacion(9.5);
        a.bajarCalificacion(1.5);
        a.mostrarInfo();
    }
    
}
