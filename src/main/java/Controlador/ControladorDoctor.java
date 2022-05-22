/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.MayorDeEdadExcepcion;
import Excepciones.NoEncontradoExcepcion;
import Modelo.Cita;
import Modelo.Doctor;
import Singleton.Singleton;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER
 */
public class ControladorDoctor {
    private ArrayList<Doctor> doctores;
    private ControladorBusqueda controladorBusqueda;
    
    public ControladorDoctor(){
        doctores = Singleton.getINSTANCIA().getDoctores();
        controladorBusqueda = new ControladorBusqueda();
    }
    
    /**
     * 
     * @param doctor
     * @return
     * @throws MayorDeEdadExcepcion 
     */
    public boolean añadirDoctor(Doctor doctor)throws MayorDeEdadExcepcion{
        controladorBusqueda.buscarSecretaria(doctor.getDocumento(),doctor.getCorreo(), doctor.getContraseña(), doctor.getTelefono());
        controladorBusqueda.buscarDoctor(doctor.getDocumento(),doctor.getCorreo(), doctor.getContraseña(), doctor.getTelefono());
        controladorBusqueda.buscarPaciente(doctor.getDocumento(),doctor.getCorreo(), doctor.getContraseña(), doctor.getTelefono());
        controladorBusqueda.buscarAdmin(doctor.getDocumento(),doctor.getCorreo(), doctor.getContraseña(), doctor.getTelefono());
        
        //Excepciones    
        if( doctor.getEdad() < 18) throw new MayorDeEdadExcepcion();
        
        doctores.add(doctor);
        Singleton.getINSTANCIA().escribirDoctores();
        return true;       
    }
    
    /**
     * 
     * @param documento
     * @return
     * @throws NoEncontradoExcepcion 
     */
    public boolean eliminarDoctor(String documento) throws NoEncontradoExcepcion{
        Doctor aux = controladorBusqueda.buscarDoctor(documento);
        
        //Excepcion
        if( aux == null ) throw new NoEncontradoExcepcion();
        
        for (int i = 0; i < doctores.size(); i++) {
            if( doctores.get(i).getDocumento().equals(documento )){
                doctores.remove(i);
            }
        }
        
        Singleton.getINSTANCIA().escribirDoctores();
        return true;
    }
    
    /**
     * 
     * @param doctor
     * @return
     * @throws NoEncontradoExcepcion
     * @throws MayorDeEdadExcepcion 
     */
    public boolean editarDoctor(Doctor doctor) throws NoEncontradoExcepcion, MayorDeEdadExcepcion{
        Doctor aux = controladorBusqueda.buscarDoctor(doctor.getDocumento());
        
        //Excepciones
        if( aux == null ) throw new NoEncontradoExcepcion();
        if( doctor.getEdad() < 18) throw new MayorDeEdadExcepcion();
        
        for(int i=0 ; i < doctores.size(); i++){
            if( doctores.get(i).getDocumento().equals(doctor.getDocumento() )){
                //Inyectando los nuevos valores
                doctores.get(i).setNombre(doctor.getNombre());
                doctores.get(i).setEdad(doctor.getEdad());
                doctores.get(i).setContraseña(doctor.getContraseña());
                doctores.get(i).setCorreo(doctor.getCorreo());
                doctores.get(i).setEstadoCivil(doctor.getEstadoCivil());
                doctores.get(i).setTelefono(doctor.getTelefono());
            }
        }
        
        Singleton.getINSTANCIA().escribirDoctores();
        return true;
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
        Singleton.getINSTANCIA().escribirDoctores();
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

    /**
     * @return the doctores
     */
    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }
}
