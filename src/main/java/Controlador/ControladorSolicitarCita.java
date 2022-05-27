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
    public void verificarDisponibilidad(Cita cita) throws DiaNoDisponibleExcepcion{
        Date fecha = cita.getFecha();
        
        for (Cita date : cita.getDoctor().getAgenda()) {
            if( date.getFecha().compareTo(fecha)==0 ) throw new DiaNoDisponibleExcepcion(cita.getDoctor());
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
        Singleton.getINSTANCIA().escribirPacientes();
        Singleton.getINSTANCIA().escribirDoctores();
        return true;
    }
    
    /**
     * Metodo para verificar si hay doctores con una especialidad especifica
     * @param especialidad
     * @throws EspecialidadNoEncontradaExcepcion 
     */
    public void especialidades(String especialidad) throws EspecialidadNoEncontradaExcepcion {
        //Creamos un arrayList para añadir los doctores que tengan la especialidad seleccionada
        ArrayList<Doctor> doctores = new ArrayList<>();
        
        //Recorremos la lista de doctores para añadir las coincidencias
        for (Doctor doctor : this.doctores) {
            if( doctor.getEspecialidad().equals(especialidad) ) doctores.add(doctor);
        }
        
        //Si la lista creada esta vacia significa que no hay ningún doctor con esa especialidadd
        if( doctores.isEmpty() ) throw new EspecialidadNoEncontradaExcepcion("No hay doctores con esa especialidad");
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
