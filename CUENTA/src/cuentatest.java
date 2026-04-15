/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carpi
 */
public abstract class cuentatest {

    protected double saldo;

    public cuentatest(double saldo) {
        this.saldo = saldo;
    }

    public abstract void depositar(double monto);
    public abstract void retirar(double monto);
    public abstract void mostrarSaldo();
}
    

