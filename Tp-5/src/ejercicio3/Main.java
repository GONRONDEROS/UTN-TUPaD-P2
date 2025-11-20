/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author gonza
 */
public class Main {

    public static void main(String[] args) {
        
        Autor autor = new Autor("J.K.Rowling", "Inglaterra");
        Editorial editorial = new Editorial("Planeta", "Argentina"); 
        Libro libro = new Libro("Harry Potter", "001-223-44", editorial, autor);
        
        System.out.println(libro);
    }

}
