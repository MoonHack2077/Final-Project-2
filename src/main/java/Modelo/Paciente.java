/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER
 */
public class Paciente extends Persona {
    private boolean hasSisben;
    private boolean hasEps;
    
    public Paciente(String nombre, int documento, int edad, boolean hasSisben, boolean hasEps){
        super(nombre, documento, edad);
        this.hasSisben = hasSisben;
        this.hasEps = hasEps;
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
}