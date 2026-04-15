/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_polimorfismo;

/**
 *
 * @author carpi
 */
public class EVA2_16_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Circulo circulo = new Circulo (50);
     imprimir(circulo);
      
      System.out.println("RECTANGULO:");
      Rectangulo rectangulo = new Rectangulo(20, 30);
      imprimir(rectangulo);
      //ARREGLO DE FIGURAS
      
      
    }
    
public static void imprimir (Figuras  figura){
    System.out.println("Area= " + figura .calcularArea());
    System.out.println("Perimetro = " + figura .calcularPerimetro());
     
}
  
}
