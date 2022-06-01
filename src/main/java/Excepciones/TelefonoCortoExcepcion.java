/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USER
 */
public class TelefonoCortoExcepcion extends RuntimeException{
    public TelefonoCortoExcepcion(){
        super("El telefono debe contener al menos 8 numeros");
    }
}
