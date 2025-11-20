/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author PC
 */
public class Biblioteca {

    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
        System.out.println("Libro " + titulo + "  Agregado");
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        Iterator<Libro> l = libros.iterator();
        Libro libroEncontrado = null;
        while (l.hasNext() && libroEncontrado == null) {
            Libro libroNext = l.next();
            if (libroNext.getIsbn().equalsIgnoreCase(isbn)) {
                libroEncontrado = libroNext;
            }
        }
        if (libroEncontrado == null) {
            System.out.println("Libro no encontrado.");
        }
        return libroEncontrado;
    }

    public void eliminarLibro(String isbn) {
        boolean libroEliminado = this.libros.removeIf(l -> l.getIsbn().equalsIgnoreCase(isbn));

        if (libroEliminado) {
            System.out.println("Libro eliminado");
        } else {
            System.out.println("Libro no encontrado");
        }
    }

    public int obtenerCantidadLibros() {
        return this.libros.size();
    }
    
    public ArrayList filtrarLibrosPorAnio(int anio){
        ArrayList<Libro> librosFiltrados = new ArrayList<>();
        
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                librosFiltrados.add(libro);
            }
        }
        return librosFiltrados;
    }
    
    public Set<Autor> mostrarAutoresDisponibles(){
        Set<Autor> autoresDisponibles = new HashSet<>();
        for (Libro libro : libros) {
            autoresDisponibles.add(libro.getAutor());
        }
        return autoresDisponibles;
    }
}
