/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Mensaje; // Importamos del paquete1 la clase llamada Mensaje 
import paquete3.Informacion;
public class Demo {

    
    public static void main(String[] args) {
        String cadena1 = Mensaje.obtenerMensaje(); /* De la clase "Mensaje" 
        llamamos a "obtenerMensaje" y guardamos en una variable llamada mensaje 
        que es del tipo String */
        int habitantes = Informacion.obtenerHabitantes();
        
        System.out.printf("%s con %d \n",cadena1, habitantes);
    }
}