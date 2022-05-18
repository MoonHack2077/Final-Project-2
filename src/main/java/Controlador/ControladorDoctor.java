/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.validar_inputs;
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
    public boolean verificarDisponibilidad(Cita cita)throws validar_inputs{
        ArrayList<Cita> agenda = cita.getDoctor().getAgenda();
        String fecha = cita.getFecha().toString();
        try{
        for (Cita date : agenda) {
            if( date.getFecha().toString().equals(fecha) ) return true;
        }
        }catch(Error e)
                {
                  throw new validar_inputs();
                }
        
        return false;
        
        
    }
    
    /**
     * Metodo para eliminar una cita de la agenda
     * @param cita
     * @return true si pudo eliminarla, de lo contrario false
     */
    public boolean eliminarCitaDeLaAgenda(Cita cita)throws validar_inputs{
        ArrayList<Cita> agenda = cita.getDoctor().getAgenda();
        try{
            for (int i = 0; i < agenda.size(); i++) {
            if(agenda.get(i).getFecha().toString().equals(cita.getFecha().toString())){
                agenda.remove(i);
                return true;
            }      
        }
        }catch(Error e){
            throw new validar_inputs();
        }
        
        
        return false;
    }
    
    /**
     * Metodo para validar que la fecha elegida para una cita no sea la misma que la que el doctor bloqueó
     * @param doctor
     * @param fecha
     * @return true si la fecha elegida es la misma, de lo contrario false
     */
    public boolean validarFechaBloqueada(Doctor doctor, Date fecha)throws validar_inputs{       
        try{
        return doctor.getFechaBloqueada() != null && 
               (doctor.getFechaBloqueada().toString().equals(fecha.toString()));
        }catch(Error e){
            throw new validar_inputs();
        }
      
    }
    
    /**
     * Metodo para que el doctor pueda bloquear una fecha
     * @return true si la fecha dada coincide con alguna cita agendada, de lo contrario false
     */
    public boolean bloquearFecha(Doctor doctor,Date dia)throws validar_inputs{
        //Convertimos a string el dia para que sea mas manejable la comparacion
        String diaAux =  String.valueOf(dia.getDate() + dia.getMonth() + dia.getYear());
        
        ArrayList<Cita> agenda = doctor.getAgenda();
       try{
          for (Cita cita : agenda) {
            //Ya que las fechas que hay en la agenda, cada una tiene una hora establecida
            //Por lo tanto aunque sea el mismo dia nunca será igual porque cuentan con una hora que se eligió manualmente
            String citaAux =  String.valueOf(cita.getFecha().getDate() + cita.getFecha().getMonth() + cita.getFecha().getYear());
            if( citaAux.equals(diaAux) ){
                return true;
            }
        } 
       }catch(Error e){
            throw new validar_inputs();
        }
        
        
        //Una vez verificado que el dia no coincida, seteamos la fecha
        doctor.setFechaBloqueada(dia);
        return false;
    }
    
    /**
     * Metodo para ordenar la agenda del doctor para que las citas "tengan sentido"
     */
    public void ordenarAgenda(){
        //Aun esta pendiente pero la idea es buena...
    }
}
