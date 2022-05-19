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
    private boolean hasMulta;
    private ArrayList<Cita> historial;
    
    public Paciente(String nombre, String documento,String correo, String contraseña, int edad, 
           String estadoCivil, String telefono, boolean hasSisben, boolean hasEps)
    {
        super(nombre, documento,  correo,  contraseña, telefono, edad, estadoCivil);
        this.hasSisben = hasSisben;
        this.hasEps = hasEps;
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
        return getNombre() + " - " + getDocumento();
    }
}