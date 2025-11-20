/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author PC
 */
public class EmpleadoTemporal extends Empleado{
    private double precioPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, String apellido, double precioPorHora, int horasTrabajadas) {
        super(nombre, apellido);
        this.precioPorHora = precioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return precioPorHora * horasTrabajadas;
    }
    
    
}
