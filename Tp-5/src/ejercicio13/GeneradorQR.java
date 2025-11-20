/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author gonza
 */
public class GeneradorQR {
    public CodigoQR generar(String valor, Usuario usuario) {
        return new CodigoQR(valor, usuario);
    }
}
