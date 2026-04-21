/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_18_composicion;

/**
 *
 * @author carpi
 */
// Persona es una direccion 

public class persona {

    private String nombre;
    private String apellido;
    private int edad;
    private direccion direccion;

    // CONSTRUCTOR
    public persona(String nombre, String apellido, int edad,
            String calle, int numero, String colonia, String ciudad, String cp) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = new direccion(calle, numero, colonia, ciudad, cp);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(direccion direccion) {
        this.direccion = direccion;
    }
}