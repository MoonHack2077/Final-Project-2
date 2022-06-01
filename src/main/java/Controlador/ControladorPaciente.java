/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Excepciones.AlmacenadoExcepcion;
import Excepciones.MayorDeEdadExcepcion;
import Excepciones.NoEncontradoExcepcion;
import Modelo.Paciente;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorPaciente {
    private ArrayList<Paciente> pacientes;
    private ControladorBusqueda controladorBusqueda;
    
    public ControladorPaciente() {
        pacientes = Singleton.getINSTANCIA().getPacientes();
        controladorBusqueda = new ControladorBusqueda();
    }
    
    /**
     * Metodo para añadir un paciente
     * @param paciente
     * @return true si pudo añadirlo, de lo contrario false;
     */
    public boolean añadirPaciente(Paciente paciente) throws MayorDeEdadExcepcion, AlmacenadoExcepcion{
        controladorBusqueda.buscarSecretaria(paciente.getDocumento(),paciente.getCorreo(), paciente.getContraseña(), paciente.getTelefono());
        controladorBusqueda.buscarDoctor(paciente.getDocumento(),paciente.getCorreo(), paciente.getContraseña(), paciente.getTelefono());
        controladorBusqueda.buscarPaciente(paciente.getDocumento(),paciente.getCorreo(), paciente.getContraseña(), paciente.getTelefono());
        controladorBusqueda.buscarAdmin(paciente.getDocumento(),paciente.getCorreo(), paciente.getContraseña(), paciente.getTelefono());
        
        getPacientes().add(paciente);
        Singleton.getINSTANCIA().escribirPacientes();
        return true;       
    }
    
    /**
     * Metodo para eliminar un paciente almacenado
     * @param documento
     * @return true si pudo eliminarlo, de lo contrario false
     */
    public boolean eliminarPaciente(String documento) throws NoEncontradoExcepcion{
        Paciente aux = controladorBusqueda.buscarPaciente(documento);
        
        //Excepcion
        if( aux == null ) throw new NoEncontradoExcepcion();
        
        for (int i = 0; i < getPacientes().size(); i++) {
            if( getPacientes().get(i).getDocumento().equals(documento )){
                getPacientes().remove(i);
                Singleton.getINSTANCIA().escribirPacientes();
            }
        }
        
        return true;
    }
    
    /**
     * Metodo para editar la informacion de un paciente
     * @param paciente
     * @return true si pudo editarla, de lo contrario false
     */
    public boolean editarPaciente(Paciente paciente) throws NoEncontradoExcepcion, MayorDeEdadExcepcion{
        Paciente aux = controladorBusqueda.buscarPaciente(paciente.getDocumento());
        
        //Excepciones
        if( aux == null ) throw new NoEncontradoExcepcion();
        if( paciente.getEdad() < 18) throw new MayorDeEdadExcepcion();
        
        for(int i=0 ; i < getPacientes().size(); i++){
            if( getPacientes().get(i).getDocumento().equals(paciente.getDocumento() )){
                //Inyectando los nuevos valores
                getPacientes().get(i).setNombre(paciente.getNombre());
                getPacientes().get(i).setEdad(paciente.getEdad());
                getPacientes().get(i).setContraseña(paciente.getContraseña());
                getPacientes().get(i).setCorreo(paciente.getCorreo());
                getPacientes().get(i).setEstadoCivil(paciente.getEstadoCivil());
                getPacientes().get(i).setTelefono(paciente.getTelefono());
                getPacientes().get(i).setHasEps(paciente.hasEps());
                getPacientes().get(i).setHasSisben(paciente.hasSisben());
                Singleton.getINSTANCIA().escribirPacientes();
            }
        }
         
        return true;
    }


    /**
     * @return the pacientes
     */
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
}
