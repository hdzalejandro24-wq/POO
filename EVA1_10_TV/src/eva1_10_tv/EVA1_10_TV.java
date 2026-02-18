/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_tv;

/**
 *
 * @author carpi
 */
public class EVA1_10_TV {

    public static void main(String[] args) {

        TV tele = new TV();
        tele.imprimirDatos();
        tele.subirCanal();
        tele.subirVolumen();
        tele.prenderApagar();
        tele.subirCanal();
        tele.subirCanal();
        tele.subirVolumen();
        tele.bajarCanal();
        tele.bajarVolumen();
        tele.imprimirDatos();
        for(int i = 0; i < 100; i++){
        tele.subirCanal();
        }
        tele.imprimirDatos();
        tele.prenderApagar();
        tele.bajarCanal();
        tele.imprimirDatos();
    }
}

