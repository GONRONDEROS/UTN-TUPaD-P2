package ejercicio2;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> listFiguras = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {    
            double radio = i + 1;
            listFiguras.add(new Circulo(radio));
        }
        
        for (int i = 0; i < 5; i++) {    
            double base = i + 1;
            double altura = i + 2;
            listFiguras.add(new Rectangulo(base, altura));
        }
        
        for (Figura listFigura : listFiguras) {
            System.out.println(listFigura.calcularArea());
        }
    }
}
