/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USER
 */
public class DatoDigitadoExcepcion extends RuntimeException {
    public DatoDigitadoExcepcion(String dato){
        super("En ese campo solo se pueden digitar " + dato + "!!!");
    }
}
