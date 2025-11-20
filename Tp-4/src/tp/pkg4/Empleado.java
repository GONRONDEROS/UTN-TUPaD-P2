/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg4;

/**No
 *
 * @author gonza
 */
public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static double salarioBasico = 500000.00;

    public Empleado(String nombre, String puesto) {
        if (nombre != null && puesto != null) {
            this.totalEmpleados++;
            this.id = totalEmpleados;
            this.nombre = nombre;
            this.puesto = puesto;
            this.salario = this.salarioBasico;
        } else {
            System.out.println("Los valores ingresados son incorrectos.");
        }
    }

    public Empleado(String nombre, String puesto, double salario) {
        if (nombre != null && puesto != null && salario > this.salarioBasico) {
            this.totalEmpleados++;
            this.id = totalEmpleados;
            this.nombre = nombre;
            this.puesto = puesto;
            this.salario = salario;
        } else {
            System.out.println("Los valores ingresados son incorrectos.");
        }
    }

    public void setPuesto(String puesto) {
        if(puesto != null){
            this.puesto = puesto;
        }
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }
    
    public void actualizarSalario(int porcentaje){
        this.salario += this.salario * (porcentaje / 100.0);
    }
    
    public void actualizarSalario(double cantidadFija){
        this.salario += cantidadFija;
    }
    
    public static int mostrarTotalEmpleados(){
        return Empleado.totalEmpleados;
    }
    
    @Override
    public String toString() {
        return "id: " + id + " Nombre: " + nombre + " Puesto: " + puesto + " Salario: " + salario;
    }

}
