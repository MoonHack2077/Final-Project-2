/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER
 */
public class Secretaria extends Persona {
    public Secretaria(String nombre, String documento, String correo, 
            String contraseña, String telefono, int edad, String estadoCivil)
    {
        super(nombre, documento,  correo,  contraseña, telefono, edad, estadoCivil);
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " - Documento:" + getDocumento();
    }
    
    
}