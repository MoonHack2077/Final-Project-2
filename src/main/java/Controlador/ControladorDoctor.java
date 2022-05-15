/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cita;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER
 */
public class ControladorDoctor {
    public ControladorDoctor(){}
    
    /**
     * Metodo para conocer la disponibiidad del doctor
     * @param cita
     * @return 
     */
    public boolean verificarDisponibilidad(Cita cita){
        ArrayList<Date> agenda = cita.getDoctor().getAgenda();
        String fecha = cita.getFecha().toString();
        
        for (Date date : agenda) {
            if( date.toString().equals(fecha) ) return true;
        }
        
        return false;
    }
    
    /**
     * Metodo para eliminar una cita de la agenda
     * @param cita
     * @return true si pudo eliminarla, de lo contrario false
     */
    public boolean eliminarCitaDeLaAgenda(Cita cita){
        ArrayList<Date> agenda = cita.getDoctor().getAgenda();
        
        for (int i = 0; i < agenda.size(); i++) {
            if(agenda.get(i).toString().equals(cita.getFecha().toString())){
                agenda.remove(i);
                return true;
            }      
        }
        
        return false;
    }
    
    
}
