/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_10_tv;
/**
 *
 * @author carpi
 
 */
public class EVA1_10_TV { 
    private boolean estadoTV; 
    private int volumen;
    private int canal;
    private final int MAX_CANALES = 99;
    
    Public TV(){
        estadoTV = false; // apagada
        volumen = 10;
        canal = 0;
    }
    public void prenderApagar(){
        estadoTV = !estadoTV;
    }
    public void consultarEstado(){
        if(estadoTV)
            System.out.println("Encendida");
        else
            System.out.println("Apagada");
    }

    public void subirVolumen(){
        if(!estadoTV){
            System.out.println("La TV está apagada. No se puede cambiar volumen.");
            return;
        }
        volumen++;
    }

    public void bajarVolumen(){
        if(!estadoTV){
            System.out.println("La TV está apagada. No se puede cambiar volumen.");
            return;
        }
        if(volumen > 0)
            volumen--;
    }
    public void subirCanal(){
        if(!estadoTV){
            System.out.println("La TV está apagada. No se puede cambiar canal.");
            return;
        }
        if(canal == MAX_CANALES)
            canal = 0;  // vuelve al inicio
        else
            canal++;
    }
    public void bajarCanal(){
        if(!estadoTV){
            System.out.println("La TV está apagada. No se puede cambiar canal.");
            return;
        }
        if(canal == 0)
            canal = MAX_CANALES; // se va al último
        else
            canal--;
    }
    public void imprimirDatos(){
        System.out.println("Estado: " + (estadoTV ? "Encendida" : "Apagada"));
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
    }
     }