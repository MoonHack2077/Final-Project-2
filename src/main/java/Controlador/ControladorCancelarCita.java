/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cita;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorCancelarCita {
    
    private ArrayList<Cita> citas;

    public ControladorCancelarCita() {
        citas = Singleton.getINSTANCIA().getCitas();
    }
    
    /**
     * Metodo para buscar una cita registrada por medio del documento del paciente
     * @param documento
     * @return cita si la encuentra, de lo contrario null
     */
    public Cita buscarCita(String documento){
    
        for (Cita cita : getCitas()) {
            if(cita.getPaciente().getDocumento().equals(documento) ) return cita;
        }
        return null;
    }

        
    /**
     * Metodo para eliminar una cita de la agenda
     * @param cita
     * @return true si pudo eliminarla, de lo contrario false
     */
    public boolean eliminarCitaDeLaAgenda(Cita cita){
        ArrayList<Cita> agenda = cita.getDoctor().getAgenda();
        
        for (int i = 0; i < agenda.size(); i++) {
            if(agenda.get(i).getFecha().compareTo(cita.getFecha())==0){
                agenda.remove(i);
                Singleton.getINSTANCIA().escribirDoctores();
                return true;
            }      
        }
        
        return false;
    }
    
        /**
     * Metodo para eliminar una cita almacenada
     * @param documento
     * @return true si pudo eliminarla, de lo contrario false
     */
    public boolean eliminarCita(String documento){
        Cita aux = buscarCita(documento);
        
        if( aux != null ){
            for (int i = 0; i < getCitas().size(); i++) {
                if(getCitas().get(i).getPaciente().getDocumento().equals(documento)){
                    if(eliminarCitaDeLaAgenda(getCitas().get(i))){
                        getCitas().get(i).getPaciente().setHasCita(false);
                        getCitas().remove(i);
                        Singleton.getINSTANCIA().escribirCitas();
                        return true;                  
                    }
                }
                
            }
        }
        
        return false;
    }
    
    
    /**
     * @return the citas
     */
    public ArrayList<Cita> getCitas() {
        return citas;
    }
}
