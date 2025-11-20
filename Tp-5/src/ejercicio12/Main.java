/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author gonza
 */
public class Main {

    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Juan Pérez", "20-12345678-9");
        Impuesto impuesto = new Impuesto(15000.0, contribuyente);

        Calculadora calc = new Calculadora();
        calc.calcular(impuesto);
    }
}

