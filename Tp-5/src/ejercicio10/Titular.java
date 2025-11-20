/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author gonza
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // Asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setCuentaBancaria(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        if(cuenta != null && cuenta.getTitular() != this){
            cuenta.setTitular(this);
        }
    }
    
    public CuentaBancaria getCuentaBancaria(){
        return this.cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", cuenta=" + cuenta.getCbu() + '}';
    }
    
    
}
