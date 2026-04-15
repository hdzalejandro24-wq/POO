/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_herencia;

/**
 *
 * @author carpi
 */
public class EVA2_6_HERENCIA {
  
    public static void main(String[] args) {
    // Empleado normal
    Empleado empleado = new Empleado("5", "Alejandro", "Cerna", 100000);
        System.out.println(empleado);
        EmpleadoBase empleadoBase = new EmpleadoBase(1980, "3", "Carlos", "Noche", 100000);
        System.out.println(empleadoBase);
        EmpleadoHonorario empleadoHonorario = new EmpleadoHonorario(50, "3", "Carlos", "Noche", 100000);
        System.out.println(empleadoHonorario);
        // TODO code application logic here
    }
}
    

