/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> misAnimales = new ArrayList<>();

        misAnimales.add(new Perro("Bobby"));
        misAnimales.add(new Gato("Pelusa"));
        misAnimales.add(new Vaca("Lola"));
        misAnimales.add(new Gato("Mishi"));
        misAnimales.add(new Perro("Firulais"));
        
        for (Animal animal : misAnimales) {
            animal.describirAnimal();
            System.out.println("y hace: ");
            animal.hacerSonido();
        }
    }
}
