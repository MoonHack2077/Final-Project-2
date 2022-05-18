/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author benav
 */
public class validar_campos_citas {
    public class Validar_campos_citas extends RuntimeException{
    public Validar_campos_citas(){
        super("Debe  validarse los datos ingresados para el registro de citas");
}
    }
}
