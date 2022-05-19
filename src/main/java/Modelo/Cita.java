/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Cita {
    private Paciente paciente;
    private Doctor doctor;
    private Date fecha;
    private boolean activa;
    private String conclusiones;

    public Cita(Paciente paciente, Doctor doctor, Date fecha){
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
        this.activa = true;
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
     * @return the activa
     */
    public boolean isActiva() {
        return activa;
    }

    /**
     * @param activa the activa to set
     */
    public void setActiva(boolean activa) {
        this.activa = activa;
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

    @Override
    public String toString() {
        return "Doctor: " + getDoctor().getNombre() + "\n" +
               "Paciente: " + getPaciente().getNombre();
    }
    
    
}
