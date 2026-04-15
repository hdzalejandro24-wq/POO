/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carpi
 */
public class CuentaAhorro extends cuentatest {

    public CuentaAhorro(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("No puedes retirar más de lo que tienes");
        }
    }

    @Override
    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
}
    

