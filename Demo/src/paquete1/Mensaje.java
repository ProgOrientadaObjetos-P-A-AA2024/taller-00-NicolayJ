/*
 String cadena = Palabra.obtenerPalabra();
        int numero = Informacion.obtenerHabitantes();
        
        System.out.printf("%s, una ciudad llena de arte y naturaleza con %d\n", 
                cadena, numero);
 */
package paquete1;

import paquete4.Palabra;

/**
 *
 * @author reroes
 */
public class Mensaje {

    public static String obtenerMensaje() {
        return String.format("%s, una ciudad llena de arte y naturaleza", 
                Palabra.obtenerPalabra());
    }
}
