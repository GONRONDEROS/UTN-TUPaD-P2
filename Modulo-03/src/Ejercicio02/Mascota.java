/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

/**
 *
 * @author gonza
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public void setNombre(String nombre) {
        if (nombre != null){
            this.nombre = nombre;
        }
    }
    
    public void setEspecie(String especie) {
        if (especie != null){
            this.especie = especie;
        }
    }
    
    public void setEdad(int edad) {
        if (edad > 0){
            this.edad = edad;
        }
    }    
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido años. Nueva edad: " + edad);
    }
}
