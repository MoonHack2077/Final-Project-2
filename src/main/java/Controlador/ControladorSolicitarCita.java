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
     * Metodo para conocer la disponibiidad del doctor
     * @param cita
     * @return 
     */
    public void verificarDisponibilidad(Cita cita) throws DiaNoDisponibleExcepcion{
        String fecha = cita.getFecha().toString();
        
        for (Cita date : cita.getDoctor().getAgenda()) {
            if( date.getFecha().toString().equals(fecha)) throw new DiaNoDisponibleExcepcion(cita.getDoctor());
        }
        
    }
    
     /**
      * Metodo para validar que la fecha elegida para una cita no sea la misma que la que el doctor bloqueó
      * @param doctor
      * @param fecha
      * @throws CoincideConFechaBloqueadaExcepcion 
      */
    public void validarFechaBloqueada(Doctor doctor, Date fecha)throws CoincideConFechaBloqueadaExcepcion{       
        String fechaAux =  String.valueOf(fecha.getDate() + fecha.getMonth() + fecha.getYear());
        if( doctor.getFechaBloqueada() != null)
        {   
            String fechaDoc = String.valueOf(doctor.getFechaBloqueada().getDate() + doctor.getFechaBloqueada().getMonth() + doctor.getFechaBloqueada().getYear());
            if( fechaDoc.equals(fechaAux) ){
                throw new CoincideConFechaBloqueadaExcepcion(doctor);
            }
        } 
    }
    
    /**
     * Metodo para añadir una cita al array general de las citas y a la agenda del respectivo doctor
     * @param cita
     * @return true si pudo añadirla, de lo contrario false;
     */
    public boolean añadirCita(Cita cita){
               
        getCitas().add(cita);
        cita.getDoctor().getAgenda().add(cita);
        cita.getPaciente().setHasCita(true);
        
        //Escribimos para almacenar los datos
        Singleton.getINSTANCIA().escribirCitas();
        Singleton.getINSTANCIA().escribirLista();
        return true;
    }
    
    /**
     * Metodo para verificar si hay doctores con una especialidad especifica
     * @param especialidad
     * @throws EspecialidadNoEncontradaExcepcion 
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
        
        //Si la lista creada esta vacia significa que no hay ningún doctor con esa especialidadd
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
