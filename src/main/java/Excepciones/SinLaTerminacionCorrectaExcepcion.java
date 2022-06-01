/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USER
 */
public class SinLaTerminacionCorrectaExcepcion extends RuntimeException {
    public SinLaTerminacionCorrectaExcepcion(){
        super("El correo debe terminar en '@mihospital.co'");
    }
}
