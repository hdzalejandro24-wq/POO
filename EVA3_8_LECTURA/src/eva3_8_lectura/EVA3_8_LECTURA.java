/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_lectura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author carpi
 */
public class EVA3_8_LECTURA {

    public static void main(String[] args) {
        String ruta = "C:\\Users\\carpi\\OneDrive\\Documents\\archivo\\prueba txt.txt";

        try {
            readUsignFiles(ruta);
            readUsignScanner(ruta);
            readUsingBufferedReader(ruta);

            writeUsingBufferedWriter(ruta, "Texto escrito con BufferedWriter");
            writeUsingFileWriter(ruta, "Texto escrito con FileWriter");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readUsignFiles(String ruta) throws IOException {
        System.out.println("LECTURA DE ARCHIVOS USANDO FILES");
        Path path = Paths.get(ruta);
        String cade = Files.readString(path);
        System.out.println(cade);
    }

    public static void readUsignScanner(String ruta) throws FileNotFoundException {
        System.out.println("LECTURA DE ARCHIVOS USANDO SCANNER");
        File source = new File(ruta);
        Scanner scanner = new Scanner(source);

        String cade;
        while (scanner.hasNextLine()) {
            cade = scanner.nextLine();
            System.out.println(cade);
        }

        scanner.close();
    }

    public static void readUsingBufferedReader(String ruta) throws IOException {
        System.out.println("LECTURA USANDO BUFFERED READER");

        File source = new File(ruta);
        FileInputStream fis = new FileInputStream(source);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String cade;
        while ((cade = br.readLine()) != null) {
            System.out.println(cade);
        }

        br.close();
    }

    public static void writeUsingBufferedWriter(String ruta, String texto) throws IOException {
        System.out.println("ESCRITURA USANDO BUFFERED WRITER");

        File source = new File(ruta);
        FileOutputStream fos = new FileOutputStream(source, true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write(texto);
        bw.newLine();
        bw.close();
    }

    public static void writeUsingFileWriter(String ruta, String texto) throws IOException {
        System.out.println("ESCRITURA USANDO FILEWRITER");

        File source = new File(ruta);
        FileWriter fileWriter = new FileWriter(source, true);

        fileWriter.write(texto + "\n");
        fileWriter.close();
    }
}