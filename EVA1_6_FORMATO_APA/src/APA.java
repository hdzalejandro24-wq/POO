/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carpi
 */
public class APA {
private String autor;
private String web;
private String libro;
private int paginas ;
private int año;
private String mes;
private  int dia;
private  int version;

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
    System.out.println("Web" + web);
    System.out.println("Autor" + autor);
    System.out.println("Libro" + libro);
    System.out.println("Paginas" + paginas);
    System.out.println("Año" + año);
    System.out.println("Mes"+ mes);
    System.out.println("Dia" + dia);
    System.out.println("Version" + version);
     }
     public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            APA libro1 = new APA();
            libro1.setNombredelsitioweb("Wikipedia");
            libro1.setAutor("Jacobo grinber");
            libro1.setlibro("Pachita");
            libro1.setpaginas(380);
            libro1.setAño(1980);
            libro1.setMes("agosto");
            libro1.setDia(20);
            libro1.setVersion(5);
            libro1.imprimirDatos();
            
           
            APA libro2 = new APA();
            libro2.setNombredelsitioweb("Libreriachihuahua");
            libro2.setAutor("Jk rowling");
            libro2.setlibro("Harry potter");
            libro2.setpaginas(200);
            libro2.setAño(1999);
            libro2.setMes("diciembre");
            libro2.setDia(21);
            libro2.setVersion(2);
            libro2.imprimirDatos();
            
            
            APA libro3 = new APA();
            libro3.setNombredelsitioweb("Sanders");
            libro3.setAutor("Anonima");
            libro3.setlibro("enoc");
            libro3.setpaginas(1200);
            libro3.setAño(1970);
            libro3.setMes("enero");
            libro3.setDia(01);
            libro3.setVersion(1);
            libro3.imprimirDatos();
        }
     }
}

     
  

