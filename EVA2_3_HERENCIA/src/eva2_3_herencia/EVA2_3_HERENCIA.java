/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_herencia;

/**
 *
 * @author carpi
 */
public class EVA2_3_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.comer();
        Mamifero mamifero = new Mamifero();
    }
    
}
class Animal{
    public Animal(){
   System.out.println("Clase animal");   
}
    public void comer (){
     System.out.println("Animal: comer!!");
    }
class Mamifero{
    public Mamifero(){
   System.out.println("Clase mamifero");   
}
    
}
    
}

class Persona{
    
}