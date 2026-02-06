/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_vehiculo;

/**
 *
 * @author carpi
 */
public class EVA1_5_VEHICULO {


    public static class Vehiculo {

        String marca;
        String modelo;
        int year;
        String color;
        double precio;
        int kilometraje;

        public String getmarca() {
            return marca;
        }

        public void setmarca(String valor) {
            marca = valor;
        }

        public String getmodelo() {
            return modelo;
        }

        public void setmodelo(String valor) {
            modelo = valor;
        }

        public int getyear() {
            return year;
        }

        public void setyear(int valor) {
            year = valor;
        }

        public String getcolor() {
            return color;
        }

        public void setcolor(String valor) {
            color = valor;
        }

        public double getprecio() {
            return precio;
        }

        public void setprecio(double valor) {
            precio = valor;
        }

        public void setkilometraje(int valor) {
            kilometraje = valor;
        }

        public void imprimirDatos() {
            System.out.println("--------DATOS DEL VEHICULO--------");
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Año: " + year);
            System.out.println("Color: " + color);
            System.out.println("Precio: " + precio);
        }
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Vehiculo vehiculo = new Vehiculo();
            vehiculo.setmarca("Ford");
            vehiculo.setmodelo("Mustang");
            vehiculo.setyear(1970);
            vehiculo.setcolor("Azul");
            vehiculo.setprecio(250000);
            vehiculo.imprimirDatos();
        }
    }
}

