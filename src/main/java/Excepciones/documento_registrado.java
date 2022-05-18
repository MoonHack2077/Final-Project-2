/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;


public class documento_registrado {
    
    
    public class Documento_registrado extends RuntimeException{
    public Documento_registrado(){
        super("El documento debe estar registrado previamente para poder buscar");
}
    
    }
}