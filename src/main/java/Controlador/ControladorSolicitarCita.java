/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cita;
import Modelo.Doctor;
import Modelo.Paciente;
import Singleton.Singleton;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER
 */
public class ControladorSolicitarCita {
    private ArrayList<Paciente> pacientes;
    private ArrayList<Doctor> doctores;
    private ArrayList<Cita> citas;

    public ControladorSolicitarCita() {
        pacientes = Singleton.getINSTANCIA().getPacientes();
        doctores = Singleton.getINSTANCIA().getDoctores();
        citas = Singleton.getINSTANCIA().getCitas();
    }
    
    /**
     * Metodo para conocer la disponibiidad del doctor
     * @param cita
     * @return 
     */
    public boolean verificarDisponibilidad(Cita cita){
        Date fecha = cita.getFecha();
        
        for (Cita date : cita.getDoctor().getAgenda()) {
            if( date.getFecha().compareTo(fecha)==0 ) return true;
        }
        
        return false;
    }
    
     /**
     * Metodo para validar que la fecha elegida para una cita no sea la misma que la que el doctor bloqueó
     * @param doctor
     * @param fecha
     * @return true si la fecha elegida es la misma, de lo contrario false
     */
    public boolean validarFechaBloqueada(Doctor doctor, Date fecha){       
        return doctor.getFechaBloqueada() != null && 
               (doctor.getFechaBloqueada().compareTo(fecha)==0); 
    }
    
    /**
     * Metodo para añadir una cita al array general de las citas y a la agenda del respectivo doctor
     * @param cita
     * @return true si pudo añadirla, de lo contrario false;
     */
    public boolean añadirCita(Cita cita){
        
        boolean verificada = verificarDisponibilidad(cita);
        if( !verificada ){
            getCitas().add(cita);
            cita.getDoctor().getAgenda().add(cita);
            cita.getPaciente().setHasCita(true);
            Singleton.getINSTANCIA().escribirCitas();
        }
                
        return true;
    }

    /**
     * @return the pacientes
     */
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    /**
     * @return the doctores
     */
    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    /**
     * @return the citas
     */
    public ArrayList<Cita> getCitas() {
        return citas;
    }
    
    
}
