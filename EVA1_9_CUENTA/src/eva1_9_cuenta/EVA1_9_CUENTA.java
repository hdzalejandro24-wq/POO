/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_cuenta;

/**
 *
 * @author carpi
 */
public class EVA1_9_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Alejandro cerna", 5000);
        cuenta.imprimirSaldo();
        cuenta.retirar(1500);
        cuenta.imprimirSaldo();
        cuenta.ingresar(6000);
        cuenta.imprimirSaldo();
    }   
}
    
