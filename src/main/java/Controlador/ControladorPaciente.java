/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cita;
import Modelo.Paciente;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorPaciente {
    public ControladorPaciente() {}
    
    /**
     * Metodo para añadir un elementos al historial clinico del paciente
     * @param cita
     * @return true si pudo añadirlo, de lo contrario false;
     */
    public boolean añadirCita(Cita cita, String historial){
        //Aun es bastante mejorable, por ahora es muy simple
        cita.getPaciente().getHistorial().add(historial);
        return true;
    }
    
    /**
     * Metodo para recopilar la info del historial del paciente
     * @param paciente
     * @return Un String con los datos del historial, en el caso que el paciente no haya tenido cita, retorna su respectivo mensaje
     */
    public String obtenerDatosHistorial(Paciente paciente){
        ArrayList<String> historial = paciente.getHistorial();
        
        if( historial.isEmpty() ) return "El paciente hasta ahora no ha tenido citas";
        
        String historialCompleto = "";
        
        for (int i = 0; i < historial.size(); i++) {
            historialCompleto += "CITA " + (i+1) + "\n" + historial.get(i) + "\n\n\n";
        }
        
        return historialCompleto;
    }
}
