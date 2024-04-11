/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Mensaje; // Importamos del paquete1 la clase llamada Mensaje 
import paquete3.Informacion;
import java.util.Scanner;

public class Demo002 {
    
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        String cadena1 = Mensaje.obtenerMensaje(); /* De la clase "Mensaje" 
        llamamos a "obtenerMensaje" y guardamos en una variable llamada mensaje 
        que es del tipo String */
        
        int habitantes = Informacion.obtenerHabitantes();
        
        
        String cadenaFinal = cadena1 + " con " + habitantes;
        
        System.out.print("Seleccione 1 al 5 para mostrar el mensaje original: ");
        int respuesta = tecla.nextInt();
        System.out.println("==================================================");
        
        if(respuesta >= 1 && respuesta <=5){
            System.out.printf(cadenaFinal);
        }else{
            System.out.printf(cadenaFinal.toUpperCase());
        }
    }
}