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
    private Cita cita;
    private boolean hasMulta;
    private Multa multa;
    private ArrayList<String> historial;
    
    public Paciente(String nombre, String documento, int edad, 
            boolean hasSisben, boolean hasEps, boolean hasCita)
    {
        super(nombre, documento, edad);
        this.hasSisben = hasSisben;
        this.hasEps = hasEps;
        this.hasCita = hasCita;
        this.historial = new ArrayList<>();
        this.hasCita = false;
    }

    /**
     * @return the hasSisben
     */
    public boolean hasSisben() {
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
    public boolean hasEps() {
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
    public ArrayList<String> getHistorial() {
        return historial;
    }

    /**
     * @return the cita
     */
    public Cita getCita() {
        return cita;
    }

    /**
     * @param cita the cita to set
     */
    public void setCita(Cita cita) {
        this.cita = cita;
    }

    /**
     * @return the multa
     */
    public Multa getMulta() {
        return multa;
    }

    /**
     * @param multa the multa to set
     */
    public void setMulta(Multa multa) {
        this.multa = multa;
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
        return getNombre() + " - " + getDocumento();
    }
}