
package relojdespertador;


/**
 *
 * @author Brais Núñez
 */
public class Hora{

    int hora = 0;
    boolean botonhora=false;
        
    public void incrementarHora(){//método que incrementa la hora cuando se pulsa el botón
        
        while(botonhora==true&&(hora>=0&&hora<24)){
            
            hora++;
        
            System.out.println("A través del Display se mostraría todo el tiempo la hora actualizada");
            
        boolean boton = false;
    }
    } 
    public void recargarHora(){
        System.out.println("Este método pone la hora a 0 cuando llega pasa de 23");
    }    
    
    public int horaActual(){
        System.out.println("Devuelve la hora actual");
        return hora;
    }

    
}
