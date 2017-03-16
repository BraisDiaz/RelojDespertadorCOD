
package relojdespertador;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class ActivarAlarma {
 
    boolean botonalarma = false;  //sería un botón que al pulsarlo cambiaría a true y se activaría la alarma
    
    public void pulsarBotonAlarma(){
   
    boolean botonalarma = true;
    
    }
    public void alarmaONOFF(){//activa la alarma estando en true
        
        if(botonalarma==true){
            
            System.out.println("La alarma está fijada para la hora escogida");
        }else
            botonalarma = false;
    }
}
