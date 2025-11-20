/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author PC
 */
public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        if (id != null && nombre != null && especialidad != null) {
            this.id = id;
            this.nombre = nombre;
            this.especialidad = especialidad;
        }
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        } else {
            System.out.println("El curso ya existe;");
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.remove(c) && c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }
    
    public void eliminarCursos(){
        for (Curso curso : this.cursos) {
            curso.setProfesor(null);
        }
        this.cursos.clear();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", cursos=" + cursos.stream().map(Curso::getNombre).toList() + '}';
    }
    
    
}
