/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_7_constructores;

/**
 *
 * @author carpi
 */
//ATRIBUTOS 
public class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    
    
    // CONSTRUCTORES
    // MODIFICAR DE ACESSO NOMBRE_CLASE(ARGUMENTOS){CUERPO DEL CONSTRUCTOR
 public Persona(){
//SE USAN PARA INICIALIZAR LOS OBJETOS 
System.out.println("EJECUCIÓN DEL CONSTRUCTOR");
nombre = "-----";
apellido = "-----";
edad = -1;
}
 
//FIRMA
public Persona(String nombre, String apellido, int edad){
//this --> apuntador a todo el contenido del objeto:
//metodos y atributos definidos  en la clase, SIN IMPORTAR
// LOS MODIFICADORES DE ACESSO 
this.nombre = nombre;
this.apellido = apellido;
this.edad = edad;
} 

    //COMPORTAMIENTOS
    public String getNombre(int X){
       return nombre; 
   }
    public void setNombre(String valor){   
       nombre = valor;
}    
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String valor){
        apellido = valor;
    }
    public int getEdad(){
        return edad;
}
     public void setEdad(int valor){
        edad = valor;   
     }
public void imprimirDatos(){
 System.out.println("--------DATOS DE LA PERSONA -------");
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Edad: " + edad);
}
}
    
           
    

