/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_17_polimorfismo;

/**
 *
 * @author carpi
 */
public class Cliente extends Persona {
   
    private String rfc;
    private  String Credito;

    public Cliente(String rfc, String Credito) {
        this.rfc = rfc;
        this.Credito = Credito;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCredito() {
        return Credito;
    }

    public void setCredito(String Credito) {
        this.Credito = Credito;
    }

    @Override
    public String generarDatos() {
        return super.generarDatos(); 
    }
}
    
