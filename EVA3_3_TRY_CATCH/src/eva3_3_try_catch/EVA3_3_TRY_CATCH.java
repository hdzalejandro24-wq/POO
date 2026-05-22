/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_try_catch;

/**
 *
 * @author carpi
 */
public class EVA3_3_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int x = 10, y = 0, resu = 0;
        try{
        
        resu = x / y;
        System.out.println("ESTO NUNCA SE VA A IMPRIMIR");
    }catch(ArithmeticException e){
       //Codigo que menaja la excepcion
        //NO HAY CODIGO QUE CORRIJA EL ERROR
        //CORRIGAN SI SABEN CORREGIR, SI NO, MEJOR DETENGAN EL PROGRAMA
        e.printStackTrace();//imprime el error generado
    }
     System.out.println("Resu = " + resu);

}
}
