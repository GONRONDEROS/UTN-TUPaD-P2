/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author PC
 */
public class Curso {
    private String id;
    private CursosDisponibles nombre;
    private Profesor profesor;
    
    
    public Curso(String id, CursosDisponibles nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    public String getId() {
        return id;
    }

    public CursosDisponibles getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    
    public void setProfesor(Profesor p){
        if(this.profesor != p){
            this.profesor = p;
            if(p != null && !p.getCursos().contains(this)){
                p.agregarCurso(this);
            }
        }
    }

    @Override
    public String toString() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin profesor";
        return "Curso{" + "id=" + id + ", nombre=" + nombre + ", profesor=" + nombreProfesor + '}';
    }
    
    
}
