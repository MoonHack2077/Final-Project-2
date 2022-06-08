/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USER
 */
public class PocasHorasAntesExcepcion extends RuntimeException {

    public PocasHorasAntesExcepcion() {
        super("La cita no se puede cancelar 24 horas antes de la misma");
    }
    
}
