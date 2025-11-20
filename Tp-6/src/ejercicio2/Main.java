/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca");

        Autor autor1 = new Autor("A01", "J.K. Rowling", "Reino Unido");
        Autor autor2 = new Autor("A02", "Stephen King", "Estados Unidos");
        Autor autor3 = new Autor("A03", "Haruki Murakami", "Japón");

        biblioteca.agregarLibro("ISBN001", "Harry Potter y la piedra filosofal", 1997, autor1);
        biblioteca.agregarLibro("ISBN002", "Harry Potter y la cámara secreta", 1998, autor1);
        biblioteca.agregarLibro("ISBN003", "It", 1986, autor2);
        biblioteca.agregarLibro("ISBN004", "El resplandor", 1977, autor2);
        biblioteca.agregarLibro("ISBN005", "Kafka en la orilla", 2002, autor3);

        System.out.println("\nLista de libros detallada: ");
        biblioteca.listarLibros();
        System.out.println("\n");

        System.out.println("Libro encontrado: ");
        System.out.println(biblioteca.buscarLibroPorIsbn("ISBN002").toString());
        System.out.println("\n");

        System.out.println("Libros publicados en 2002: " + biblioteca.filtrarLibrosPorAnio(2002) + "\n");
        
        biblioteca.eliminarLibro("ISBN004");
        System.out.println("\nLista de libros detallada: ");
        biblioteca.listarLibros();
        System.out.println("\n");
        
        System.out.println("Cantidad de libros: " + biblioteca.obtenerCantidadLibros() + "\n");
        
        System.out.println("Autores disponibles: " + biblioteca.mostrarAutoresDisponibles());

    }
}
