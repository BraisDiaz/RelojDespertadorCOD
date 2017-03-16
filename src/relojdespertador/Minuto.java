/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojdespertador;

/**
 *
 * @author Brais Núñez
 */
public class Minuto{
    
    int minuto = 0;
    boolean botonmin=false;

    public void incrementarMinuto(){ //método que incrementa los minutos cuando se pulsa el botón
        
        while(botonmin==true&&(minuto>=0&&minuto<60)){
            
            minuto++;
            
            System.out.println("A través del Display se mostrarían todo el tiempo los minutos actualizados");
        }
        boolean boton = false;    
}
    public void recargarMin(){
        System.out.println("Este método pone los minutos a 0 cuando pasan de 59");
    }
    public int minActual(){
        System.out.println("Devuelve el minuto actual");
        return minuto;
  
}
}
