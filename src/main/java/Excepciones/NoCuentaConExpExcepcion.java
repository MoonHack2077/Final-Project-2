/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USER
 */
public class NoCuentaConExpExcepcion extends RuntimeException {
    public NoCuentaConExpExcepcion() {
        super("No cuenta con los años de experiencia suficientes");
    }
    
}
