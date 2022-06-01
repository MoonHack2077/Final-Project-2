/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USER
 */
public class NoSePuedeBloquearFechaExcepcion extends RuntimeException{

    public NoSePuedeBloquearFechaExcepcion() {
        super("Ya tienes citas para este dia, no puedes bloquearlo\n Prueba con otro!!");
    }
    
}
