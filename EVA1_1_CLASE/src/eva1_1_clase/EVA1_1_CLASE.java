/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_1_clase;

/**
 *
 * @author carpi
 */
public class EVA1_1_CLASE {
    public static void main(String[] args) {
     //UNA CLASE SIRVE PARA CREAR OBJETOS:
     //1. DECLARAR UN IDENTIFICADOR DEL TIPO DE LA CLASE 
     Persona persol;       
     //2. INSTACIAR AL OBJETO --> con la palabra new (crea el objeto en memora principal
     //identificador = new NOMBRE_DE_LA_CLASE(argumentos)
     persol = new Persona();
     System.out.println(persol); //REFERENCIAS 
     Persona perso2 = new Persona(); 
     System.out.println(perso2);
     persol.apellido = "CERNA";
     persol.nombre = "Alejandro";
     persol.edad = 20;
     
             
     perso2.apellido = "CERNA";
     persol.nombre = "Alejandro";
     persol.edad = 20;     
     
     
    }
    
}
//Clases inician en Mayúscula
//MiclasePersona
// TODAS LAS CLASES SON TIPOS DE DATOS ABSTRACTOS
class Persona{
    //Estado --> Datos (variables)--> ATRIBUTOS
    String nombre;
    String apellido;
     int edad;
     //Comportamiento --> Métodos
     void imprimir(){
         System.out.println("Nombre: " + nombre);
         System.out.println("Apellido: " + apellido);
         System.out.println("Edad: " + edad);
         
     }  
}
