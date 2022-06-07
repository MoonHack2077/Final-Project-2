/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.CoincideConFechaBloqueadaExcepcion;
import Excepciones.DiaNoDisponibleExcepcion;
import Excepciones.EspecialidadNoEncontradaExcepcion;
import Modelo.Cita;
import Modelo.Doctor;
import Modelo.Persona;
import Singleton.Singleton;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER
 */
public class ControladorSolicitarCita {
    private ArrayList<Persona> lista;
    private ArrayList<Cita> citas;
    private ControladorCrud controlador;

    public ControladorSolicitarCita() {
        lista = Singleton.getINSTANCIA().getLista();
        citas = Singleton.getINSTANCIA().getCitas();
        controlador = new ControladorCrud();
    }
    
    /**
     * Metodo para verificar la disponibiidad del doctor
     * @param cita, la cita con la que se desea verificar la disponibilidad
     * @throws DiaNoDisponibleExcepcion, si alguna fecha de alguna cita del coincide con la de la cita enviada por parametro
     */
    public void verificarDisponibilidad(Cita cita) throws DiaNoDisponibleExcepcion{
        String fecha = cita.getFecha().toString();
        
        for (Cita date : cita.getDoctor().getAgenda()) {
            if( date.getFecha().toString().equals(fecha)) throw new DiaNoDisponibleExcepcion(cita.getDoctor());
        }
        
    }
    
     /**
      * Metodo para validar que la fecha elegida para una cita no sea la misma que la que el doctor bloqueó
      * @param doctor, el doctor que se seleccionó
      * @param fecha, la fecha que fue elegida
      * @throws CoincideConFechaBloqueadaExcepcion , si la fecha que el doctor tiene como bloqueada es igual a la que se pasa por parametro
      */
    public void validarFechaBloqueada(Doctor doctor, Date fecha)throws CoincideConFechaBloqueadaExcepcion{       
        String fechaAux =  String.valueOf(fecha.getDate() + fecha.getMonth() + fecha.getYear());
        
        if( doctor.getFechaBloqueada() != null){  
            Date fechaBloqueada = doctor.getFechaBloqueada();
            String fechaDoc = String.valueOf(fechaBloqueada.getDate() + fechaBloqueada.getMonth() + fechaBloqueada.getYear());
            
            if( fechaDoc.equals(fechaAux) ) throw new CoincideConFechaBloqueadaExcepcion(doctor);            
        } 
    }
    
    /**
     * Metodo para añadir una cita al array general de las citas y a la agenda del respectivo doctor
     * @param cita, la cita que será añadida
     * @return true si pudo añadirla, de lo contrario false;
     */
    public boolean añadirCita(Cita cita){               
        getCitas().add(cita);
        cita.getDoctor().getAgenda().add(cita);
        cita.getPaciente().setHasCita(true);
                
        Singleton.getINSTANCIA().escribirCitas();
        Singleton.getINSTANCIA().escribirLista();
        return true;
    }
    
    /**
     * Metodo para verificar si hay doctores con una especialidad especifica
     * @param especialidad, la especialidad seleccionada para el filtro
     * @throws EspecialidadNoEncontradaExcepcion, En el caso de que no hayan doctores con la especialidad seleccionada 
     */
    public void filtrarEspecialidades(String especialidad) throws EspecialidadNoEncontradaExcepcion {
        //Creamos un arrayList para añadir los doctores que tengan la especialidad seleccionada
        ArrayList<Doctor> doctoresAux = new ArrayList<>();
        
        //Recorremos la lista de doctores para añadir las coincidencias
        for (Persona doctor : this.lista) {
            if( doctor instanceof Doctor){
                Doctor doc = (Doctor) doctor;
                if( doc.getEspecialidad().equals(especialidad) ) doctoresAux.add(doc);
            }
        }

        if( doctoresAux.isEmpty() ) throw new EspecialidadNoEncontradaExcepcion("No hay doctores con esa especialidad");
    }

    /**
     * @return the pacientes
     */
    public ArrayList<Persona> getLista() {
        return lista;
    }


    /**
     * @return the citas
     */
    public ArrayList<Cita> getCitas() {
        return citas;
    }

    /**
     * @return the controlador
     */
    public ControladorCrud getControlador() {
        return controlador;
    }
    
    
}
