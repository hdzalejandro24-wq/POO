/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_encapsulamiento;

/**
 *
 * @author carpi
 */
public class EVA1_4_ENCAPSULAMIENTO {
  
    public static void main(String[] args) {
        // TODO code application logic here
      Persona perso = new Persona();
      perso.setNombre("Alejandro");
      perso.setApellido("Cerna");
      perso.setEdad("36");
      perso.setGenero("H");
      System.out.println("Nombre:" + perso.getNombre);
      System.out.println("Apellido" + perso.getApellido);
      System.out.println("Edad" + perso.getEdad);
      System.out.println("Género" + perso.getGenero());
      perso.imprimirdatos();
  
      
    }
    
}
