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
public class ControladorCita {
    private ArrayList<Cita> citas;
    private ControladorDoctor controladorDoctor;
    
    public ControladorCita(){
        citas = Singleton.getINSTANCIA().getCitas();
        controladorDoctor = new ControladorDoctor();
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
     * Metodo para añadir una cita al array general de las citas y a la agenda del respectivo doctor
     * @param cita
     * @return true si pudo añadirla, de lo contrario false;
     */
    public boolean añadirCita(Cita cita){
        Cita aux = buscarCita(cita.getPaciente().getDocumento());
        
        if(aux == null){
            boolean verificada = controladorDoctor.verificarDisponibilidad(cita);
            if( !verificada ){
                getCitas().add(cita);
                cita.getDoctor().getAgenda().add(cita);
                cita.getPaciente().setHasCita(true);
            }
        }
        
        Singleton.getINSTANCIA().escribirCita();
        return true;
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
                    if(controladorDoctor.eliminarCitaDeLaAgenda(getCitas().get(i))){
                        getCitas().get(i).getPaciente().setHasCita(false);
                        getCitas().remove(i);
                        Singleton.getINSTANCIA().escribirCita();
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
