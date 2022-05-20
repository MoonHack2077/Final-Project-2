/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cita;
import Modelo.Doctor;
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
        Date fecha = cita.getFecha();
        
        for (Cita date : cita.getDoctor().getAgenda()) {
            if( date.getFecha().compareTo(fecha)==0 ) return true;
        }
        
        return false;
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
                return true;
            }      
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
     * Metodo para que el doctor pueda bloquear una fecha
     * @return true si la fecha dada coincide con alguna cita agendada, de lo contrario false
     */
    public boolean bloquearFecha(Doctor doctor,Date dia){
        //Convertimos a string el dia para que sea mas manejable la comparacion
        String diaAux =  String.valueOf(dia.getDate() + dia.getMonth() + dia.getYear());
        
        ArrayList<Cita> agenda = doctor.getAgenda();
        
        for (Cita cita : agenda) {
            //Ya que las fechas que hay en la agenda, cada una tiene una hora establecida
            //Por lo tanto aunque sea el mismo dia nunca será igual porque cuentan con una hora que se eligió manualmente
            String citaAux =  String.valueOf(cita.getFecha().getDate() + cita.getFecha().getMonth() + cita.getFecha().getYear());
            if( citaAux.equals(diaAux) ){
                return true;
            }
        }
        
        //Una vez verificado que el dia no coincida, seteamos la fecha
        doctor.setFechaBloqueada(dia);
        return false;
    }
    
    /**
     * Metodo para ordenar la agenda del doctor para que las citas "tengan sentido"
     */
    public void ordenarAgenda(Doctor doctor){
        ArrayList<Cita> agenda = doctor.getAgenda();
        
        //Se planea usar  los metodos after y before de las fechas
        //agenda.sort();
    }
}
