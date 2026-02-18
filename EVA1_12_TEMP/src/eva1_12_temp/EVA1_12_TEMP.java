/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temp;

/**
 *
 * @author carpi
 */
public class EVA1_12_TEMP {
    public int x = 100;

    
    public static void main(String[] args) {
        //Temperatura temp = new Temperatura();
        System.out.println("50 C =" + Temperatura.celAFahr(50)  +  "°F");
        System.out.println("50°F =" + Temperatura.fahrACent(50) +  "°C");
      System.out.println("50°C =" + Temperatura.celAKel(50)  + "°K");
      System.out.println("50°C =" + Temperatura.kelACel(50)  +  "°C");
      System.out.println("50°F =" + Temperatura.fahrAkel(50) +  "°K");
      System.out.println("50°C =" + Temperatura.kelAFahr(50)  + "°F");
      EVA1_12_TEMP obj = new EVA1_12_TEMP();
      System.out.println("X = " + obj.x );
    }
    
}
class Temperatura{
    public static double celAFahr(double celcius){
        double resu;
        resu = celcius * (9.0 /5.0) + 32;
        return resu;
    }
    public  static double fahrACent(double fahrenheit){
       double resu;
        resu = fahrenheit * (5.0 /9.0) - 32;
        return resu;
    }
     public static double celAKel(double celsius){
        double resu;
        resu = celsius + 273.15;
        return resu;
}
public static double kelACel(double kelvin){
        double resu;
        resu  = kelvin - 273.15;
        return resu;
}
public static double kelAFahr(double kelvin){
        double resu;
        resu  =  (kelvin - 32) * 5/9 + 273.15;
        return resu;
}
public static double fahrAkel(double fahrenheit   ){
        double resu;
        resu  = (fahrenheit - 273.15) * 9/5 + 32;
        return resu;
}
}