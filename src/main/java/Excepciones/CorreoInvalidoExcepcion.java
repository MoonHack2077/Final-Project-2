/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USER
 */
public class CorreoInvalidoExcepcion extends RuntimeException{
    public CorreoInvalidoExcepcion(){
        super("El correo debe contener '@' !!!");
    }
}
