/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author gonza
 */
public class CuentaBancaria {

    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; 
    private Titular titular;      

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, fechaModificacion);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getCuentaBancaria() != this){
            titular.setCuentaBancaria(this);
        }
    }
    
    public Titular getTitular(){
        return this.titular;
    }

    public String getCbu() {
        return cbu;
    }
    
    
    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", titular=" + titular.getNombre() + '}';
    }
    
    
}
