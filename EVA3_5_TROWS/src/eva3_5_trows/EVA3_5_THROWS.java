/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_trows;

/**
 *
 * @author carpi
 */
public class EVA3_5_THROWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            System.out.println("la division es " + division(10,0));
        } catch (Exception ex) {
            ex.printStackTrace();

    }
    }
    public static int division(int x , int y) throws Exception {
    int resu = 0;
    if(y == 0)//voy a generar una excepcion
        throw new Exception("El valor del divisor es cero!!");
            
        resu = x / y;
        return resu;
}
}
