/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg4;

/**
 *
 * @author gonza
 */
public class Tp4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado1 = new Empleado("Nahuel", "Atención al cliente");
        Empleado empleado2 = new Empleado("Melany", "Analista de Marketing", 800000.00);
        Empleado empleado3 = new Empleado("Lautaro", "Gerente");

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());

        empleado1.actualizarSalario(20);
        empleado3.actualizarSalario(500000.50);

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }

}
