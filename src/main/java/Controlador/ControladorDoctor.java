/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.MayorDeEdadExcepcion;
import Excepciones.NoEncontradoExcepcion;
import Modelo.Doctor;
import Modelo.Persona;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorDoctor {
    private ArrayList<Persona> doctores;
    private ControladorBusqueda controladorBusqueda;
    
    public ControladorDoctor(){
        doctores = Singleton.getINSTANCIA().getLista();
        controladorBusqueda = new ControladorBusqueda();
    }
    
    /**
     * Metodo para añadir un doctor
     * @param doctor
     * @return true si lo pudo añadir
     * @throws MayorDeEdadExcepcion 
     */
    public boolean añadirDoctor(Doctor doctor)throws MayorDeEdadExcepcion{
        controladorBusqueda.buscarCoincidencia(doctor.getDocumento(),doctor.getCorreo(), doctor.getContraseña(), doctor.getTelefono());
        
        //Excepciones    
        if( doctor.getEdad() < 18) throw new MayorDeEdadExcepcion();
        
        doctores.add(doctor);
        Singleton.getINSTANCIA().escribirLista();
        return true;       
    }
    
    /**
     * Metodo para eliminar un doctor
     * @param documento
     * @return true si lo elimina
     * @throws NoEncontradoExcepcion 
     */
    public boolean eliminarDoctor(String documento) throws NoEncontradoExcepcion{
        Doctor aux = (Doctor) controladorBusqueda.buscarPersona(documento);
        
        //Excepcion
        if( aux == null ) throw new NoEncontradoExcepcion();
        
        for (int i = 0; i < doctores.size(); i++) {
            if( doctores.get(i).getDocumento().equals(documento )){
                doctores.remove(i);
                Singleton.getINSTANCIA().escribirLista();
            }
        }
        
        return true;
    }
    
    /**
     * Metodo para editar la informacion de un doctor
     * @param doctor
     * @return true si la pudo editar
     * @throws NoEncontradoExcepcion
     * @throws MayorDeEdadExcepcion 
     */
    public boolean editarDoctor(Doctor doctor) throws NoEncontradoExcepcion, MayorDeEdadExcepcion{       
        Doctor aux = (Doctor) controladorBusqueda.buscarPersona(doctor.getDocumento());
        
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
                Singleton.getINSTANCIA().escribirLista();
            }
        }
        
        return true;
    }
    

    /**
     * @return the doctores
     */
    public ArrayList<Persona> getDoctores() {
        return doctores;
    }
}
