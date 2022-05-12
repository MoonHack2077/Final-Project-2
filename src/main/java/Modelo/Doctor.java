/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER
 */
public class Doctor extends Persona {
    private String especialidad;
    private ArrayList<Date> agenda;
    
    public Doctor(String nombre, int documento, int edad, String especialidad){
        super(nombre, documento, edad);
        this.especialidad = especialidad;
        agenda = new ArrayList<>();
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the agenda
     */
    public ArrayList<Date> getAgenda() {
        return agenda;
    }
}