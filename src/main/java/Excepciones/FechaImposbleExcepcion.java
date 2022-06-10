/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USER
 */
public class FechaImposbleExcepcion extends RuntimeException {
    public FechaImposbleExcepcion(){
        super("La fecha de pago no puede ser anterior a la de la cita");
    }
}
