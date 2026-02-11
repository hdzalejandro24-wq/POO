/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_constructores;

/**
 *
 * @author carpi
 */
public class EVA1_7_CONSTRUCTORES {

    
    public static void main(String[] args) {
        //CONSTRUCTO DEFAULT (SIN ARGUMENTOS EN LOS PARÉNTESIS)
      Persona  perso = new Persona();
      perso.imprimirDatos();
      
      Persona perso1 = new Persona("Alejandro",  "Cerna", 36);
              perso1.imprimirDatos();
    }
    
}
