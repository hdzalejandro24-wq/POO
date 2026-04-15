/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_17_polimorfismo;

/**
 *
 * @author carpi
 */
public class Empleado extends Persona{
    private String puesto;
    private double salario;

        public Empleado() {
         super();
            this.puesto = "";
            this.salario = 0;
        }

      
        }
    
    
   
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String generarDatos() {
        return super.generarDatos ()+
                "Puesto:" + puesto + "\n" +
                "Salario:" + salario + "\n" +
    
     }
