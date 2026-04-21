/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_composicion;

/**
 *
 * @author carpi
 */
public class EVA2_18_COMPOSICION {

    
   public static void main(String[] args) {

    persona persona = new persona(
            "Juan", "Perez", 50,
            "Universidad", 100, "Centro", "Chihuahua", "31000"
    );

    System.out.println("Nombre: " + persona.getNombre());
    System.out.println("Apellido: " + persona.getApellido());
    System.out.println("Edad: " + persona.getEdad());

    System.out.println("Calle: " + persona.getDireccion().getCalle());
    System.out.println("Numero: " + persona.getDireccion().getNumero());
    System.out.println("Colonia: " + persona.getDireccion().getColonia());
    System.out.println("Ciudad: " + persona.getDireccion().getCiudad());
    System.out.println("CP: " + persona.getDireccion().getCp());
}
}

