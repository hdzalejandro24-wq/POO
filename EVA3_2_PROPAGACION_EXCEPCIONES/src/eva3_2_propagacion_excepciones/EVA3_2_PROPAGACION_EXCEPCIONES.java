/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_propagacion_excepciones;

/**
 *
 * @author carpi
 */
public class EVA3_2_PROPAGACION_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A();
        //no se ejecuta este código
    }
    public static void A(){
        B();
        //no se ejecuta este código
    }
    public static void B(){
        C();
        //no se ejecuta este código
}
    public static void C(){
        int x = 5, y = 0, resu;
        resu = x/y ; //arithmetic exception
        //no se ejecuta este código
    }
}