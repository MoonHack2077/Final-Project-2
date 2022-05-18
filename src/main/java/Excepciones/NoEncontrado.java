/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USER
 */
public class NoEncontrado extends RuntimeException {
    public NoEncontrado(){
        super("El usuario NO se encentra almacenado");
    }
    
}
