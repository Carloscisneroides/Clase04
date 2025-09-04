/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solid.srp;

/**
 *
 * @author camper
 */
public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  
    public void sedEmial(String email){
        
        this.email = email;
        
        }
    public void senEmail(String mensaje){
        System.out.println("Enviado" + mensaje);

   }
    public void save(){
        System.out.println("usuario guardado");
        
    }

}
