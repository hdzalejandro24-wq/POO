/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carpi
 */
public class Cuenta {
   

    public static void main(String[] args) {

        CuentaAhorro cuenta1 = new CuentaAhorro(1000);

        cuenta1.mostrarSaldo();
        cuenta1.depositar(500);
        cuenta1.mostrarSaldo();
        cuenta1.retirar(2000);
        cuenta1.retirar(300);
        cuenta1.mostrarSaldo();
    }
}

