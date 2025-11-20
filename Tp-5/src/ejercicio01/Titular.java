/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author gonza
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte = pasaporte;
        if(pasaporte != null && pasaporte.getTitular() != this){
         pasaporte.setTitular(this);
        }
    }
    
    public Pasaporte getPasaporte(){
        return this.pasaporte;
    }

    public String getDni() {
        return this.dni;
    }
    
    @Override
    public String toString() {
    return "Titular{" + "nombre=" + nombre + ", dni=" + dni +
           ", pasaporteNumero=" + (pasaporte != null ? pasaporte.getNumero() : "sin pasaporte") + '}';
}

}