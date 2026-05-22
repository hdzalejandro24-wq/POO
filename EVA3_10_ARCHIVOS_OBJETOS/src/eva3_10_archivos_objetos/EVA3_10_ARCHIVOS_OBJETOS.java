/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_archivos_objetos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author carpi
 */
public class EVA3_10_ARCHIVOS_OBJETOS {

    public static void main(String[] args) {

        String ruta = "C:\\Users\\carpi\\OneDrive\\Documents\\archivo\\persona.dat";

        Persona perso = new Persona("Juan", "Perez", 80);

        try {
            escribirObj(ruta, perso);
            leerObj(ruta);

        } catch (IOException ex) {
            ex.printStackTrace();

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void escribirObj(String ruta, Persona objeto) throws FileNotFoundException, IOException {

        System.out.println("ESCRITURA DE OBJETOS USANDO OBJECTOUTPUTSTREAM");

        File source = new File(ruta);
        FileOutputStream fos = new FileOutputStream(source);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(objeto);

        oos.close();
    }

    public static void leerObj(String ruta) throws FileNotFoundException, IOException, ClassNotFoundException {

        System.out.println("LECTURA DE OBJETOS USANDO OBJECTINPUTSTREAM");

        File source = new File(ruta);
        FileInputStream fis = new FileInputStream(source);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Persona obj = (Persona) ois.readObject();

        ois.close();

        System.out.println("Nombre: " + obj.getNombre());
        System.out.println("Apellido: " + obj.getApellido());
        System.out.println("Edad: " + obj.getEdad());
    }

    static class Persona implements Serializable {

        private String nombre;
        private String apellido;
        private int edad;

        public Persona() {

        }

        public Persona(String nombre, String apellido, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
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
}