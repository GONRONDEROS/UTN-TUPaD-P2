/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author gonza
 */
public class Mesa {
    private String mesa;
    private int capacidad;

    public Mesa(String mesa, int capacidad) {
        this.mesa = mesa;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa{" + "mesa=" + mesa + ", capacidad=" + capacidad + '}';
    }
    
    
}
