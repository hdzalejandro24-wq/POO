/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_custom_exception;

/**
 *
 * @author carpi
 */
public class EVA3_7_CUSTOM_EXCEPTION {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {

        throw new MiExcepcion("Excepcion Personalizada");

    }

    static class MiExcepcion extends RuntimeException {

        public MiExcepcion(String message) {
            super(message);
        }

    }

    static class MiExcepcionChecked extends Exception {

        public MiExcepcionChecked(String message) {
            super(message);
        }

    }

}

