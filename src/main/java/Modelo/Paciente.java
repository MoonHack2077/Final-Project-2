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
    private boolean hasSisben;
    private boolean hasEps;
    private boolean hasCita;
    private ArrayList<String> historial;
    
    public Paciente(String nombre, int documento, int edad, 
            boolean hasSisben, boolean hasEps, boolean hasCita)
    {
        super(nombre, documento, edad);
        this.hasSisben = hasSisben;
        this.hasEps = hasEps;
        this.hasCita = hasCita;
        this.historial = new ArrayList<>();
    }

    /**
     * @return the hasSisben
     */
    public boolean isHasSisben() {
        return hasSisben;
    }

    /**
     * @param hasSisben the hasSisben to set
     */
    public void setHasSisben(boolean hasSisben) {
        this.hasSisben = hasSisben;
    }

    /**
     * @return the hasEps
     */
    public boolean isHasEps() {
        return hasEps;
    }

    /**
     * @param hasEps the hasEps to set
     */
    public void setHasEps(boolean hasEps) {
        this.hasEps = hasEps;
    }

    /**
     * @return the hasCita
     */
    public boolean isHasCita() {
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
    public ArrayList<String> getHistorial() {
        return historial;
    }

    @Override
    public String toString() {
        return getNombre() + " - " + getDocumento();
    }
    
    
}