/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USER
 */
public class NoEncontradoExcepcion extends RuntimeException {
    public NoEncontradoExcepcion(){
        super("El usuario NO se encentra almacenado");
    }
    
}
