/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_finally;

/**
 *
 * @author carpi
 */
public class EVA3_6_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cade = null;
        
        try{
            System.out.println(cade.length());
        }catch(NullPointerException e){
            e.printStackTrace();
        }finally{//SIEMPRE SE EJECUTA 
            //SRIVE PARA EJECUTAR COMO UNA EXCEPCION AQUI
            System.out.println("NO IMPORTA QUE PASE, SIEMPRE ME EJECUTO");
        }
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
