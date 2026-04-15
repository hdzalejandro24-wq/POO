/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_13_clases_anonimas;

/**
 *
 * @author carpi
 */
public class EVA_2_13_CLASES_ANONIMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Prueba prueba = new Prueba();
       //CLASE ANONIMA --> CLASE SIN NOMBRE 
       //POLIMORFISMO
       Prueba prueba = new Prueba() {
           @Override
           public void mostrarMensaje() {
               System.out.println("Hola mundo!!");
           }
    };
    prueba.mostrarMensaje();
}
}