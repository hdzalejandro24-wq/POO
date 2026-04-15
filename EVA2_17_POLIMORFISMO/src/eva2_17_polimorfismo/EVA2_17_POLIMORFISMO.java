/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_polimorfismo;

/**
 *
 * @author carpi
 */
public class EVA2_17_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cliente cliente = new Cliente ("SDGASGHSF", 2000, "Restaurante la comida rica",50,n/a);
              System.out.printnl(cliente.generarDatos());
              Empleado empleado = new Empleado("Gerente", 10000, "Juan","Perez", 50
        System.out.printnl(empleado.generarDatos());}}
cliente cliente original;

       
    
}
    public static void imprimirDatos(Persona perso){
        System.out.println("perso.generarDatos());
if(perso instanceof Cliente)
    System.out.println("Cliente");
else if(perso instanceof Empleado)
    System.out.println("Empleado");
    }
//NO SE PUEDE PORQUE PERSONA NO HEREDA DE CLIENTE

