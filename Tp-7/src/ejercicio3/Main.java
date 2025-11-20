/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Main {
     public static void main(String[] args) {
         
         ArrayList<Empleado> listaEmpleados = new ArrayList<>();
         
        listaEmpleados.add(new EmpleadoPlanta("Ana", "Pérez", 3000.0, 500.0));
        listaEmpleados.add(new EmpleadoTemporal("Juan", "López", 20.0, 80)); 
        listaEmpleados.add(new EmpleadoTemporal("Luis", "Torres", 22.0, 100)); 
        listaEmpleados.add(new EmpleadoPlanta("María", "García", 3200.0, 400.0));
        
        int cantidadEmpPlanta = 0;
        int cantidadEmpTemporal = 0;
        
         for (Empleado emp : listaEmpleados) {
             if(emp instanceof EmpleadoPlanta){
                cantidadEmpPlanta++;
                System.out.println(emp.getNombre() + " " + emp.getApellido() + "\nSueldo: " + emp.calcularSueldo() + "\n");
            }else if(emp instanceof EmpleadoTemporal){
                cantidadEmpTemporal++;
                System.out.println(emp.getNombre() + " " + emp.getApellido() + "\nSueldo: " + emp.calcularSueldo() + "\n");         
            }
         }
         
         System.out.println("Cantidad de empleados de planta: " + cantidadEmpPlanta + " \nCantidad de empleados temporales: " + cantidadEmpTemporal );
     }
}
