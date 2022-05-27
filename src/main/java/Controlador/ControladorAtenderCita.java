/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cita;

/**
 *
 * @author USER
 */
public class ControladorAtenderCita {

    private ControladorCancelarCita controlador;
    
    public ControladorAtenderCita() {
        controlador = new ControladorCancelarCita();
    }
    
    /**
     * Metodo para añadir la cita al historial del usuario
     * @param cita
     * @param conclusiones
     * @param tratamientos 
     */
    public void confirmarAtencion(Cita cita, String conclusiones, String tratamientos){
        cita.setConclusiones(conclusiones );
        cita.setTratamientos(tratamientos);
        
        //Se añade la cita al historal del paciente
        cita.getPaciente().getHistorial().add(cita);
        Singleton.Singleton.getINSTANCIA().escribirPacientes();
        Singleton.Singleton.getINSTANCIA().escribirCitas();
    }

    /**
     * @return the controlador
     */
    public ControladorCancelarCita getControlador() {
        return controlador;
    }
    
    
}
