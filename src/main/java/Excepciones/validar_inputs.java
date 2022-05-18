/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.util.InputMismatchException;


public class validar_inputs extends InputMismatchException{
public validar_inputs(){
    super("Debe introducir correctamente los datos");
}    

    public validar_inputs(String message) {
        throw new UnsupportedOperationException("Debe introducir correctamente los datos"); 
    }
}
