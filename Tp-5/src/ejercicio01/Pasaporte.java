/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author gonza
 */
import java.time.LocalDate;

/**
 *
 * @author PC
 */
public class Pasaporte {

    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, LocalDate fechaEmision, String imagen, String formato, Titular titular) {
        if (numero != null && fechaEmision != null && imagen != null && formato != null) {
            this.numero = numero;
            this.fechaEmision = fechaEmision;
            this.foto = new Foto(imagen, formato);
            setTitular(titular);
        }
    }
    
     public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    
    public Titular getTitular(){
        return this.titular;
    }
    
    public String getNumero() {
        return this.numero;
    }

    @Override
    public String toString() {
    return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision +
           ", titularDNI=" + (titular != null ? titular.getDni() : "sin titular") + '}';
}

}