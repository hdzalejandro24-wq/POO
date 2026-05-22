/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_try_catch;

/**
 *
 * @author carpi
 */
public class EVA3_4_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10, y = 0, resu = 0;
        String cade = null;
        
        try{
            resu = x / y;//1.EXCEPCION
            System.out.println(cade.length());//2. IGNORA EL RESTO DEL TRY 
       
        
        }catch(ArithmeticException e){
             System.out.println("ERROR DE DIVISION ENTRE CERO");//3. EJECUTA EL CATCH
         }catch(NullPointerException e){
          System.out.println("ERROR DE CADENA VACIA");
    }
          System.out.println("FIN DEL PROGRAMA");//4. REANUDA DESPUES DEL TRY/CATCH
}
}