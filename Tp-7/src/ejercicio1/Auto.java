/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author PC
 */
public class Auto extends Vehiculo{
    
    private int cantidadPuertas;

    public Auto(String marca, String modelo,int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    
    
    
    
    @Override
    void mostrarInfo() {
        System.out.println("Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nCantidad de puertas: " + getCantidadPuertas());
    }
    
}
