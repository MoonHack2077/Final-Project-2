/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.PocasHorasAntesExcepcion;
import Modelo.Cita;
import Singleton.Singleton;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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
     * @param documento, el documento del paciente, un dato unico
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
     * @param cita, la cita que será eñiminada
     * @return true si pudo eliminarla, de lo contrario false
     */
    public boolean eliminarCitaDeLaAgenda(Cita cita){
        ArrayList<Cita> agenda = cita.getDoctor().getAgenda();
        
        for (int i = 0; i < agenda.size(); i++) {
            if(agenda.get(i).getPaciente().getDocumento().equals(cita.getPaciente().getDocumento())){
                agenda.remove(i);
                Singleton.getINSTANCIA().escribirLista();
                return true;
            }      
        }
        
        return false;
    }
    
    /**
     * Metodo para eliminar una cita almacenada
     * @param documento, el documento del paciente, un dato unico
     * @return true si pudo eliminarla, de lo contrario false
     */
    public boolean eliminarCita(String documento){
        Cita aux = buscarCita(documento);
        
        if( aux != null ){
            for (int i = 0; i < getCitas().size(); i++) {
                if(getCitas().get(i).getPaciente().getDocumento().equals(documento)){
                    getCitas().get(i).getPaciente().setHasCita(false);
                    getCitas().remove(i);
                    Singleton.getINSTANCIA().escribirCitas();
                    Singleton.getINSTANCIA().escribirLista();
                    return true;
                }
                
            }
        }
        
        return false;
    }
    
    /**
     * Metodo para saber si la cita es cancelada 24 horas antes de la misma
     * @param fecha, la fecha actual
     * @param cita, la cita que contiene su fecha 
     * @throws PocasHorasAntesExcepcion, en el caso de que la cita esté siendo cancelada 24 horas antes de ella
     * se lanza esta excepcion porque está prohibido
     */
    public void verificarHoras(Date fecha, Cita cita) throws PocasHorasAntesExcepcion {
       if( fecha.before( cita.getFecha() ) ){       
           long diferenciaHoras = Math.abs( fecha.getTime() - cita.getFecha().getTime() );
           long horasTotales = TimeUnit.MILLISECONDS.toHours(diferenciaHoras);
           
           if( horasTotales <= 24 ) throw new PocasHorasAntesExcepcion();
       } 
    }
    
    /**
     * @return the citas
     */
    public ArrayList<Cita> getCitas() {
        return citas;
    }
}
