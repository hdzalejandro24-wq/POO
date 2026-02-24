/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_13.formulas;

/**
 *
 * @author carpi
 */
 
public class Geometria {

    public static double areasCuadrados(double lado){
        return lado * lado;
    }
    public static double areasRectangulos(double base, double altura){
        return base * altura;
    }
    public static double areasTriangulos(double base, double altura){
        return (base * altura) / 2;
    }
    public static double areaCirculo(double radio){
     return   Math.PI * (radio * radio);
    }
}