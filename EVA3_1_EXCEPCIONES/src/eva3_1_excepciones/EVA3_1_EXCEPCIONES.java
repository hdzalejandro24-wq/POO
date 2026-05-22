/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_excepciones;

/**
 *
 * @author carpi
 */
public class EVA3_1_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //cheked exceptions lo vemos en manejo de archivos
        //uncheked exceptions --> runtimeexcepticion, error
        //ARITMETIC EXCEPTION:  DIVISION ENTRE CERO
        
       int x = 10, y = 0, resu;
               resu = x/y;
       System.out.println("DIVISION x/y = " + resu); 
       //ARRAYINDESOUTOFBOUNDS
       
       int[] arreglo = new int [5];
       System.out.println(arreglo[6]); //posicionj inexistente
       //NULLPONITEXCEPTION
       String cade = null;
       System.out.println(cade.length());
               
       
       
    }
    
}
