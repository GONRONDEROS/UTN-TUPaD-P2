/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author PC
 */
public class EmpleadoPlanta extends Empleado{
    
    private double sueldoBase;
    private double bonificaciones;

    public EmpleadoPlanta(String nombre, String apellido, double sueldoBase, double bonificaciones) {
        super(nombre, apellido);
        this.sueldoBase = sueldoBase;
        this.bonificaciones = bonificaciones;
    }
    
   
    @Override
    public double calcularSueldo() {
       return sueldoBase + bonificaciones;
    }
    
}
