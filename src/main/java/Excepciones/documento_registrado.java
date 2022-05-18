/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;


public class documento_registrado {
    
    
    public class Registrado_ciudadania extends RuntimeException{
    public Registrado_ciudadania(){
        super("Debe estar registrado en la Registraduría Nacional del Estado Civil");
}
    
    }
}