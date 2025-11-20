/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author PC
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    
    public Universidad(String nombre){
        this.nombre = nombre;
    }
    
    public void agregarProfesor(Profesor p){
        this.profesores.add(p);
        System.out.println("Profesor " + p.getNombre() + " Agregado");
    }
    
    public void agregarCurso(Curso c){
        this.cursos.add(c);
        System.out.println("Curso " + c.getNombre() + " Agregado");
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        if(codigoCurso != null && idProfesor != null){
            Curso curso = buscarCursoPorCodigo(codigoCurso);
            Profesor profesor = buscarProfesorPorId(idProfesor);
            if(curso == null){
                System.out.println("El curso no existe.");
            }else if(profesor == null){
                System.out.println("El profesor no existe.");
            }else{
                curso.setProfesor(profesor);
                System.out.println("El profesor " + profesor.getNombre() + " se agregó al curso " + curso.getNombre());
            }
        }
    }
    
    public List<Profesor> getProfesores(){
        return Collections.unmodifiableList(profesores);
    }
    
    public void listarProfesores() {
        for (Profesor profesor : profesores) {
            System.out.println(profesor.toString());
        }
    }
    
    public void listarCursos(){
        for (Curso curso : cursos) {
            System.out.println(curso.toString());
        }
    }
    
    public Profesor buscarProfesorPorId(String id){
        Iterator<Profesor> p = profesores.iterator();
        Profesor profesorEncontrado = null;
        while(p.hasNext() && profesorEncontrado == null){
            Profesor pNext = p.next();
            if(pNext.getId().equalsIgnoreCase(id)){
                profesorEncontrado = pNext;
            }
        }
        return profesorEncontrado;
    }
    
    public Curso buscarCursoPorCodigo(String codigo){
        Iterator<Curso> c = cursos.iterator();
        Curso cursoEncontrado = null;
        while(c.hasNext() && cursoEncontrado == null){
            Curso cNext = c.next();
            if(cNext.getId().equalsIgnoreCase(codigo)){
                cursoEncontrado = cNext;
            }
        }
        return cursoEncontrado;
    }
    
    public void eliminarCurso(String codigo){
        Curso cursoDelete = this.buscarCursoPorCodigo(codigo);
        if(cursoDelete != null){
            cursoDelete.getProfesor().eliminarCurso(cursoDelete);
            this.cursos.remove(cursoDelete);
        }else{
            System.out.println("El curso no existe.");
        }
    }
    
    public void eliminarProfesor(String id){
        Profesor profeDelete = this.buscarProfesorPorId(id);
        if(profeDelete != null){
            profeDelete.eliminarCursos();
            this.profesores.remove(profeDelete);
        }
    }
}
