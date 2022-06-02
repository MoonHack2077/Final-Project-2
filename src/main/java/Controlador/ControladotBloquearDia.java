/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.NoSePuedeBloquearFechaExcepcion;
import Modelo.Cita;
import Modelo.Doctor;
import Singleton.Singleton;
import java.util.Date;

/**
 *
 * @author USER
 */
public class ControladotBloquearDia {

    public ControladotBloquearDia() {}
    
    /**
     * Metodo para que el doctor pueda bloquear una fecha
     * @return true si la fecha dada coincide con alguna cita agendada, de lo contrario false
     */
    public void bloquearFecha(Doctor doctor,Date dia) throws NoSePuedeBloquearFechaExcepcion{
        //Convertimos a string el dia para que sea mas manejable la comparacion
        String diaAux =  String.valueOf(dia.getDate() + dia.getMonth() + dia.getYear());
               
        for (Cita cita : doctor.getAgenda()) {
            //Ya que las fechas que hay en la agenda, cada una tiene una hora establecida
            //Por lo tanto aunque sea el mismo dia nunca será igual porque cuentan con una hora que se eligió manualmente
            String citaAux =  String.valueOf(cita.getFecha().getDate() + cita.getFecha().getMonth() + cita.getFecha().getYear());
            if( citaAux.equals(diaAux) ){
                throw new NoSePuedeBloquearFechaExcepcion();
            }
        }
        
        //Una vez verificado que el dia no coincida, seteamos la fecha
        doctor.setFechaBloqueada(dia);
        Singleton.getINSTANCIA().escribirLista();
    }
}
