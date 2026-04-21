/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_composicion_2;

/**
 *
 * @author carpi
 */
public class Motor {
    private int cilindros;
    private char combustible;
    private double capacidad;

    public Motor(int cilindros, char combustible, double capacidad) {
        this.cilindros = cilindros;
        this.combustible = combustible;
        this.capacidad = capacidad;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public char getCombustible() {
        return combustible;
    }

    public void setCombustible(char combustible) {
        this.combustible = combustible;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Motor:\n" +
               "cilindros = " + cilindros + "\n" +
               "combustible = " + combustible + "\n" +
               "capacidad = " + capacidad + "\n";
    }
}