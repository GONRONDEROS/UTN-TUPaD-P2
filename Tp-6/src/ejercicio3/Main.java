/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {

        Universidad utn = new Universidad("UTN");

        Profesor profesor1 = new Profesor("P001", "Laura Gómez", "Marketing");
        Profesor profesor2 = new Profesor("P002", "Carlos Ramírez", "Electrónica");
        Profesor profesor3 = new Profesor("P003", "Mariana Torres", "Programación");

        Curso curso1 = new Curso("C001", CursosDisponibles.PROGRAMACION);
        Curso curso2 = new Curso("C002", CursosDisponibles.MARKETING);
        Curso curso3 = new Curso("C003", CursosDisponibles.CIBERSEGURIDAD);
        Curso curso4 = new Curso("C004", CursosDisponibles.ELECTRONICA);
        Curso curso5 = new Curso("C005", CursosDisponibles.ADMINISTRACION);

        System.out.println("Agregando profesores: ");
        utn.agregarProfesor(profesor1);
        utn.agregarProfesor(profesor2);
        utn.agregarProfesor(profesor3);
        System.out.println("\n");

        System.out.println("Agregando cursos:");
        utn.agregarCurso(curso1);
        utn.agregarCurso(curso2);
        utn.agregarCurso(curso3);
        utn.agregarCurso(curso4);
        utn.agregarCurso(curso5);
        System.out.println("\n");

        System.out.println("Asignando profesores: ");
        utn.asignarProfesorACurso("C001", "P003");
        utn.asignarProfesorACurso("C002", "P001");
        utn.asignarProfesorACurso("C003", "P003");
        utn.asignarProfesorACurso("C004", "P002");
        utn.asignarProfesorACurso("C005", "P001");
        System.out.println("\n");

        System.out.println("Listado de cursos: ");
        utn.listarCursos();
        System.out.println("\n");

        System.out.println("Listado de profesores: ");
        utn.listarProfesores();
        System.out.println("\n");

        System.out.println("Cambiando profesor del curso C005 (Administración) a Carlos Ramírez...");
        utn.asignarProfesorACurso("C005", "P002");
        utn.listarCursos();
        utn.listarProfesores();
        System.out.println("\n");

        System.out.println("Eliminando curso C004 (Electrónica)...");
        utn.eliminarCurso("C004");
        utn.listarCursos();
        utn.listarProfesores();
        System.out.println("\n");

        System.out.println("Eliminando profesor P003 (Mariana Torres)...");
        utn.eliminarProfesor("P003");
        utn.listarCursos();
        utn.listarProfesores();
        System.out.println("\n");

        System.out.println("Reporte: cantidad de cursos por profesor");
        for (Profesor profesor : utn.getProfesores()) {
            System.out.println(profesor.getNombre() + " dicta " + profesor.getCursos().size() + " curso(s).");
        }

    }
}
