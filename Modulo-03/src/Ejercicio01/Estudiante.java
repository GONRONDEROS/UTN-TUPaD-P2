/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

/**
 *
 * @author gonza
 */
public class Estudiante {
    private String nombre;
    private String apellido; 
    private String curso;
    private double calificacion;
    
    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " " + curso + " " + calificacion + ".");
    }
    
    public void setNombre(String nombre) {
        if (nombre != null){
            this.nombre = nombre;
        }
    }
    
    public void setApellido(String apellido) {
        if (apellido != null){
            this.apellido = apellido;
        }
    }
    
    public void setCurso(String curso) {
        if (curso != null){
            this.curso = curso;
        }
    }
    
    public void subirCalificacion(double calificacion){
        if (calificacion >= 0 || calificacion <= 10){
            this.calificacion += calificacion;
        }
    }
    
    public void bajarCalificacion(double calificacion){
        if (calificacion >= 0 || calificacion <= 10){
            this.calificacion -= calificacion;
        }
    }
}
