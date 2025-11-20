/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author gonza
 */
public class Main {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Nahuel", "OSDE");
        Profesional profesional = new Profesional("Dra. Gómez", "Cardiología");
        CitaMedica cita = new CitaMedica("16/09/2025", "08:00", paciente, profesional);
        
        System.out.println(cita);
    }
}
