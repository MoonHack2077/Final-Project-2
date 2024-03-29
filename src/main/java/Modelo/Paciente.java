/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Paciente extends Persona {
    private String regimenDeSalud;
    private boolean hasCita;
    private boolean hasMulta;
    private ArrayList<Cita> historial;
    
    public Paciente(String nombre, String documento,String correo, String contraseña, int edad, 
           String estadoCivil, String telefono, String regimenDeSalud)
    {
        super(nombre, documento,  correo,  contraseña, telefono, edad, estadoCivil);
        this.regimenDeSalud = regimenDeSalud;
        this.historial = new ArrayList<>();
        this.hasCita = false;
    }


    /**
     * @return the hasCita
     */
    public boolean hasCita() {
        return hasCita;
    }

    /**
     * @param hasCita the hasCita to set
     */
    public void setHasCita(boolean hasCita) {
        this.hasCita = hasCita;
    }

    /**
     * @return the historial
     */
    public ArrayList<Cita> getHistorial() {
        return historial;
    }
    
    /**
     * @return the hasCita
     */
    public boolean hasMulta() {
        return hasMulta;
    }

    /**
     * @param hasCita the hasCita to set
     */
    public void setHasMulta(boolean hasMulta) {
        this.hasMulta = hasMulta;
    }      
    
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " - Documento:" + getDocumento();
    }

    /**
     * @return the regimenDeSalud
     */
    public String getRegimenDeSalud() {
        return regimenDeSalud;
    }

    /**
     * @param regimenDeSalud the regimenDeSalud to set
     */
    public void setRegimenDeSalud(String regimenDeSalud) {
        this.regimenDeSalud = regimenDeSalud;
    }
}