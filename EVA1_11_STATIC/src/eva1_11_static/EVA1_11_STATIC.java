/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_static;

/**
 *
 * @author carpi
 */
public class EVA1_11_STATIC {

    public static void main(String[] args) {
        System.out.println("PI = " + Math.PI);
        System.out.println("Valor aleatorio = " + Math.random());
        System.out.println("Potencia (5 )= " + Math.pow(5,2));
        
        
        //CLASE MATEMATICAS
        System.out.println("CLASE MATEMATICAS******");
        Matematicas mate = new Matematicas();//INSTANCIACIÓN
        System.out.println("PI = " + Matematicas);  
        System.out.println("PI = " + Matematicas.PI); 
    }
}
    class Matematicas{
        public static final double PI = 3.14159;
    }