/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author USER
 */
public class Cita implements Serializable{
    private Paciente paciente;
    private Doctor doctor;
    private Date fecha;
    private String conclusiones;
    private String tratamientos;

    public Cita(Paciente paciente, Doctor doctor, Date fecha){
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
    }
    
    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the doctor
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the conclusiones
     */
    public String getConclusiones() {
        return conclusiones;
    }

    /**
     * @param conclusiones the conclusiones to set
     */
    public void setConclusiones(String conclusiones) {
        this.conclusiones = conclusiones;
    }

    /**
     * @return the tratamientos
     */
    public String getTratamientos() {
        return tratamientos;
    }

    /**
     * @param tratamientos the tratamientos to set
     */
    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }
    
    @Override
    public String toString() {
        return "Doctor: " + getDoctor().getNombre() + " - " +
               "Paciente: " + getPaciente().getNombre();
    }
   
}
