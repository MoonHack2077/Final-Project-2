/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USER
 */
public class AlmacenadoExcepcion extends RuntimeException {
    public AlmacenadoExcepcion(){
        super("El usuario ya se encentra almacenado");
    }  
}
