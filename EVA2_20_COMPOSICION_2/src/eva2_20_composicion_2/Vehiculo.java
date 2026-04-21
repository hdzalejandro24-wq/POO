/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_composicion_2;

/**
 *
 * @author carpi
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int annio;
    private String color;
    private Motor motor;

    public Vehiculo(String marca, String modelo, int annio, String color, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.annio = annio;
        this.color = color;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Vehiculo:\n" +
               "marca = " + marca + "\n" +
               "modelo = " + modelo + "\n" +
               "annio = " + annio + "\n" +
               "color = " + color + "\n" +
               "motor = " + motor;
    }
}