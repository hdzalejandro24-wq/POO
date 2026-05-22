/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_escritura;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author carpi
 */
public class EVA3_9_ESCRITURA {
 

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {

    try {

        String ruta = "C:\\Users\\carpi\\OneDrive\\Documents\\archivo\\prueba txt.txt";

        writeUsingFiles(ruta, "Hola mundo cruel!! \n prueba con la clase file");

    } catch (IOException ex) {

        System.getLogger(EVA3_9_ESCRITURA.class.getName())
                .log(System.Logger.Level.ERROR, (String) null, ex);
    }

}

public static void writeUsingFiles(String ruta, String texto) throws IOException {

        System.out.println("ESCRITURA DE ARCHIVOS USANDO FILES");

        Path path = Paths.get(ruta);

        Files.write(path, texto.getBytes());

    }

}
