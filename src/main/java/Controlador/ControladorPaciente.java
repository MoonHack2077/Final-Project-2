/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Excepciones.AlmacenadoExcepcion;
import Excepciones.MayorDeEdadExcepcion;
import Excepciones.NoEncontradoExcepcion;
import Modelo.Paciente;
import Modelo.Persona;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorPaciente {
    private ArrayList<Persona> pacientes;
    private ControladorBusqueda controladorBusqueda;
    private ControladorCancelarCita controladorCita;
    private ControladorPagoMulta controladorMulta;
    
    public ControladorPaciente() {
        pacientes = Singleton.getINSTANCIA().getLista();
        controladorBusqueda = new ControladorBusqueda();
    }
    
    /**
     * Metodo para añadir un paciente
     * @param paciente
     * @return true si pudo añadirlo, de lo contrario false;
     */
    public boolean añadirPaciente(Paciente paciente) throws MayorDeEdadExcepcion, AlmacenadoExcepcion{
        controladorBusqueda.buscarCoincidencia(paciente.getDocumento(),paciente.getCorreo(), paciente.getContraseña(), paciente.getTelefono());
        
        getPacientes().add(paciente);
        Singleton.getINSTANCIA().escribirLista();
        return true;       
    }
    
    /**
     * Metodo para eliminar un paciente almacenado
     * @param documento
     * @return true si pudo eliminarlo, de lo contrario false
     */
    public boolean eliminarPaciente(String documento) throws NoEncontradoExcepcion{
        Paciente aux = (Paciente) controladorBusqueda.buscarPersona(documento);
        
        //Excepcion
        if( aux == null ) throw new NoEncontradoExcepcion();
        
        for (int i = 0; i < getPacientes().size(); i++) {
            if( getPacientes().get(i).getDocumento().equals(documento )){
                Paciente pacienteAux = (Paciente) getPacientes().get(i);
                
                //Si el paciente tania una cita asignada esta será eliminada 
                if( pacienteAux.hasCita() ) controladorCita.eliminarCita(documento);
                
                //Si el paciente tania una multa esta será eliminada 
                if( pacienteAux.hasMulta() ) controladorMulta.eliminarMulta(documento);
                     
                getPacientes().remove(i);
                Singleton.getINSTANCIA().escribirLista();
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
        Paciente aux = (Paciente) controladorBusqueda.buscarPersona(paciente.getDocumento());
        
        //Excepciones
        if( aux == null ) throw new NoEncontradoExcepcion();
        if( paciente.getEdad() < 18) throw new MayorDeEdadExcepcion();
        
        for(int i=0 ; i < getPacientes().size(); i++){
            if( getPacientes().get(i).getDocumento().equals(paciente.getDocumento() )){
                Paciente pacienteAux = (Paciente) getPacientes().get(i);
                //Inyectando los nuevos valores
                pacienteAux.setNombre(paciente.getNombre());
                pacienteAux.setEdad(paciente.getEdad());
                pacienteAux.setContraseña(paciente.getContraseña());
                pacienteAux.setCorreo(paciente.getCorreo());
                pacienteAux.setEstadoCivil(paciente.getEstadoCivil());
                pacienteAux.setTelefono(paciente.getTelefono());
                pacienteAux.setHasEps(paciente.hasEps());
                pacienteAux.setHasSisben(paciente.hasSisben());
                Singleton.getINSTANCIA().escribirLista();
            }
        }
         
        return true;
    }


    /**
     * @return the pacientes
     */
    public ArrayList<Persona> getPacientes() {
        return pacientes;
    }
}
