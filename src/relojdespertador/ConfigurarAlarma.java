
package relojdespertador;

/**
 *
 * @author Brais Núñez
 */
public class ConfigurarAlarma{
  
   //booleano modo que cuando está en true entra en el modo configurar alarma
   boolean botonmodo = false;
   
   public void pulsarBotonConfigurar(){
       System.out.println("Pasaría el botonmodo a true y entraría a configurar la alarma");
       botonmodo = true;
   }
   
   public void setAlarma(int hora, int minuto){//estamos dentro del modo configurar alarma
       
       
       System.out.println("Este método recibe la hora y el minuto que están puestos y fija la alarma en esa hora");
   }
   
   public void salirSetAlarma(){//con el salimos del modo configurar alarma
       botonmodo = false;
   }

}
   
   
   
   
    
   
    
    
    
    
    
    
    
    

