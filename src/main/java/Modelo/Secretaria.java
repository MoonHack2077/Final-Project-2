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
    
    private int añosExp;
    
    public Secretaria(String nombre, String documento, String correo, 
            String contraseña, String telefono, int edad, int añosExp, String estadoCivil)
    {
        super(nombre, documento,  correo,  contraseña, telefono, edad, estadoCivil);
        this.añosExp = añosExp;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " - Documento:" + getDocumento();
    }

    /**
     * @return the añosExp
     */
    public int getAñosExp() {
        return añosExp;
    }

    /**
     * @param añosExp the añosExp to set
     */
    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }
    
    
}