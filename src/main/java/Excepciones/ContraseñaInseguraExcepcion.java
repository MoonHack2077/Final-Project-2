/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USER
 */
public class ContraseñaInseguraExcepcion extends RuntimeException{
    public ContraseñaInseguraExcepcion(){
        super("La contraseña es muy corta, podria ser insegura \nPrueba con otra!!");
    }
}
