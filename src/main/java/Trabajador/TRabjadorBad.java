/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajador;

/**
 *
 * @author camper
 */

// esta manera no es la correcta por que no todos los objetos tienen la misma funcion 
public interface TRabjadorBad {
    public void trabaja();
    public void comer();
    public void dormir();
    public void progama();
    public  void diseña();
    public void testear();
    
    class programador implements TRabjadorBad{
        public void tarabaja(){ System.out.println("trabaja");}

        public void comer(){System.out.println("comer");}
        
        public void dormir(){System.out.println("durme");}
        public void programar(){System.out.println("programa");}
    }
    
}
