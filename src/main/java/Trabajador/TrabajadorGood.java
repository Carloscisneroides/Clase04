/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajador;

/**
 *
 * @author camper
 */

// prinsipioo de segregacion de interfases (isp)
public interface TrabajadorGood {
    void trabajar();
    
    
}
interface PersonaBasica{
    void comer();
    void dormir();
}

interface Programador{
    void programar();
   
}
interface Diseñador{
    void Diseña();
    
}
interface Tester{
    void testea();
    
}

class Programador implements TrabajadorGood, PersonaBasica, Desarrollador {
    public void tarabaja(){ System.out.println("trabaja");}
        public void comer(){System.out.println("comer");}
        public void dormir(){System.out.println("durme");}
        public void programar(){System.out.println("programa");}
}
      
class Diseñandor implements  TrabajadorGood, PersonaBasica, Diseñador{
        public void tarabaja(){ System.out.println("trabaja");}
        public void comer(){System.out.println("comer");}
        public void dormir(){System.out.println("durme");}
 
}