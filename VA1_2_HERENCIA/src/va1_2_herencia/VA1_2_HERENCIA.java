/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package va1_2_herencia;

/**
 *
 * @author carpi
 */
public class VA1_2_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado();
        empleado.setNombre("Juan");
        empleado.setApellido("Jolote");
        empleado.setEdad(50);
        empleado.setNo_empleado(100);
        empleado.setSalario(50000);
        Cliente cliente = new Cliente();
    }
    
}
class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    
    public persona() {
        this.nombre
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

class Empleado extends Persona{
        private int no_empleado;
        private double salario;
        

}
class Cliente extends Persona{
    
}