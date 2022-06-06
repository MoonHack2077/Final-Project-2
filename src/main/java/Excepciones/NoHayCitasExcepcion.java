/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USER
 */
public class NoHayCitasExcepcion extends RuntimeException {

    public NoHayCitasExcepcion() {
        super( "No hay citas para el dia seleccionado" );
    }
    
}
