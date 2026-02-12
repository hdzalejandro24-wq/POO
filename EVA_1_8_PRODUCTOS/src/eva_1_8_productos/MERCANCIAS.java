/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_1_8_productos;

/**
 *
 * @author carpi
 */
public class MERCANCIAS {   
private String nombre;
private String marca;
private String unidad ;
private double precio;
private  double  cantidad;

public MERCANCIAS(){
System.out.println("INFORMACION DEL PRODUCTO");
nombre = "-----";
marca = "-----";
unidad = "-----";
precio = 0;
cantidad = 0;
}

public MERCANCIAS(String nombre, String marca, String unidad, double precio, double cantidad){

this.nombre = nombre;
this.marca = marca; 
this.unidad = unidad;
this.precio = precio;
this.cantidad = cantidad;
}

    public void setNombre(String valor){   
       nombre= valor;
    }
    public String getNombre(){
             return nombre; 
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    public String getUnidad(){
       return unidad;
}
     public void setUnidad(String valor){
        unidad = valor;  
    }
    public double getPrecio(){
        return precio;
    }
     public void setPrecio(double precio){
       this.precio = precio; 
    }    
     public double getCantidad(){
      return cantidad;
    }
     public void setCantidad(double cantidad){
        this.cantidad = cantidad ;  
    }    
      
     public void imprimirDatos(){
 System.out.println("--------PRODUCTO-------");
    System.out.println("Nombre " + nombre);
    System.out.println("Marca" + marca);
    System.out.println("Unidad" + unidad);
    System.out.println("precio" + precio);
    System.out.println("Cantidad"+ cantidad);
    System.out.println("Total" + total);
     }
     public static void main(String[] args) {
        MERCANCIAS producto1 = new MERCANCIAS("Gomitas", "Grenetina", "caja", 111, 8);
        producto1.imprimirDatos();
        System.out.println();
        
        MERCANCIAS producto2 = new MERCANCIAS();
        producto2.setNombre("Gummy lucky");
        producto2.setMarca("Palmers");
        producto2.setUnidad("Caja");
        producto2.setPrecio(115);
        producto2.setCantidad(8);
        producto2.imprimirDatos();          
}
}

