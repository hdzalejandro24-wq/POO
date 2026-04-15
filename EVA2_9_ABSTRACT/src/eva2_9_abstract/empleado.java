/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_abstract;

/**
 *
 * @author carpi
 */
public class empleado {
    private String claveEmpleado();
    private String puesto;
    private double salario;

        public String getPuesto() {
            return puesto;
        }

        public void setPuesto(String puesto) {
            this.puesto = puesto;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public empleado(String puesto, double salario) {
            this.puesto = puesto;
            this.salario = salario;
        }

        
    
}
public void imprimirDatos(){
//ATRIBUTOS PROTECTED EN LA CLASE PERSONA
System.out.println("Nombre: "+ nombre);
System.out.println("Apellidos: "+ apellido);
System.out.println("Edad: "+ edad);
//ATRIBUTOS DE MI CLASE
System.out.println("CLAVE EMPLEADO: "+ clave empleado);
System.out.println("Salario: "+ salario);
System.out.println("Antiguedad: "+ calcularAntiguedad)));

}