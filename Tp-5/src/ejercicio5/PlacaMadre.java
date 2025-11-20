/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author gonza
 */
public class PlacaMadre {

    private String modelo;
    private String chipseat;

    public PlacaMadre(String modelo, String chipseat) {
        this.modelo = modelo;
        this.chipseat = chipseat;
    }

    @Override
    public String toString() {
        return "PlacaMadre{" + "modelo=" + modelo + ", chipseat=" + chipseat + '}';
    }

}
