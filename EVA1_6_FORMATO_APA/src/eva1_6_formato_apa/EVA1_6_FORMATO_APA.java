/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_formato_apa;

/**
 *
 * @author carpi
 */
public class EVA1_6_FORMATO_APA {

    
    public static class Apa{
    public String autor;
public String web;
public String libro;
public  int paginas ;
public int año;
public String mes;
public int dia;
public int version;

    public void setAutor(String valor){   
       autor= valor;
    }
    public String  getAutor(){
       return autor; 
    }
    public void setNombredelsitioweb(String valor){   
       web = valor;
    }
    public String getNombredelsitioweb(){
             return web; 
    }
    public String getLibro(){
        return libro;
    }
    public void setlibro(String valor){
        libro = valor;
    }
    public int getpaginas(){
        return paginas;
}
     public void setpaginas(int valor){
        paginas = valor;  
    }
    public int getAño(){
        return año;
    }
     public void setAño(int valor){
       año = valor; 
    }    
        public String getMes(){
        return mes;
    }
     public void setMes(String valor){
        mes = valor;  
    }    
        public int getDia(){
        return dia;
    }
     public void setDia(int valor){
        dia = valor;  
     }
     public void setVersion(int valor){   
       version = valor;
    }    
    public int getVersion(){ 
    return version;
    }
     public void imprimirDatos(){
 System.out.println("--------DATOS DEL  LIBRO-------");
    System.out.println("Web:  " + web);
    System.out.println("Autor:  " + autor);
    System.out.println("Libro:  " + libro);
    System.out.println("Paginas:  " + paginas);
    System.out.println("Año:  " + año);
    System.out.println("Mes:  "+ mes);
    System.out.println("Dia:  " + dia);
    System.out.println("Version:  " + version);
     }
    }
     public static void main(String[] args) {
        for (int i = 1; i <= 1; i++) {
            Apa libro1 = new Apa ();
            libro1.setNombredelsitioweb("Wikipedia");
            libro1.setAutor("Jacobo grinber");
            libro1.setlibro("Pachita");
            libro1.setpaginas(380);
            libro1.setAño(1980);
            libro1.setMes("agosto");
            libro1.setDia(20);
            libro1.setVersion(5);
            libro1.imprimirDatos();
         
     }
            Apa libro2 = new Apa ();
            libro2.setNombredelsitioweb("Wikipedia");
            libro2.setAutor("Jacobo grinber");
            libro2.setlibro("Pachita");
            libro2.setpaginas(380);
            libro2.setAño(1980);
            libro2.setMes("agosto");
            libro2.setDia(20);
            libro2.setVersion(5);
            libro2.imprimirDatos();

       
            Apa libro3 = new Apa ();
            libro3.setNombredelsitioweb("Wikipedia");
            libro3.setAutor("Jacobo grinber");
            libro3.setlibro("Pachita");
            libro3.setpaginas(380);
            libro3.setAño(1980);
            libro3.setMes("agosto");
            libro3.setDia(20);
            libro3.setVersion(5);
            libro3.imprimirDatos();
     }
}