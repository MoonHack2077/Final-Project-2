/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.NoHayCitasExcepcion;
import Modelo.Cita;
import Modelo.Doctor;
import Modelo.Multa;
import Singleton.Singleton;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER
 */
public class ControladorAtenderCita {

    private ControladorCancelarCita controlador;
    private ArrayList<Multa> multas;
    
    public ControladorAtenderCita() {
        controlador = new ControladorCancelarCita();
        multas = Singleton.getINSTANCIA().getMultas();
    }
    
    /**
     * Metodo para añadir la cita al historial del usuario
     * @param cita, la cita atendida, la cual se setearan sus conclusiones y tratamientos
     * @param conclusiones, las conclusiones de la cita atendida
     * @param tratamientos, los tratamientos de la cita atendida 
     */
    public boolean confirmarAtencion(Cita cita, String conclusiones, String tratamientos){
        cita.setConclusiones(conclusiones );
        cita.setTratamientos(tratamientos);
        
        //Se añade la cita al historal del paciente
        cita.getPaciente().getHistorial().add(cita);
                
        boolean eliminada = controlador.eliminarCita(cita.getPaciente().getDocumento());
        boolean eliminadaDeLaAgenda = controlador.eliminarCitaDeLaAgenda(cita);
        
        if( eliminada && eliminadaDeLaAgenda ){
            Singleton.getINSTANCIA().escribirLista();
            Singleton.getINSTANCIA().escribirCitas();
            return true;
        }
        
        return false;
    }
    
    /**
     * Metodo para añadir una multa al array general de las multas
     * @param multa la multa que será añadida
     * @return true si pudo añadirla, de lo contrario false;
     */
    public boolean añadirMulta(Multa multa){
        multas.add(multa);
        multa.getCita().getPaciente().setHasMulta(true);
        boolean cancelada = controlador.eliminarCita(multa.getCita().getPaciente().getDocumento());
        boolean eliminada = controlador.eliminarCitaDeLaAgenda(multa.getCita());
        
        if( cancelada && eliminada ){
            Singleton.getINSTANCIA().escribirMultas();
            Singleton.getINSTANCIA().escribirLista();
        }else{
            return false;
        }
        return true;
    }
    
           
    /**
     * Metodo para hacer descuento de la multa si el paciente tiene SISBEN
     * @param multa, la multa a evaluar
     */
    public void descuentoMulta(Multa multa){
        if( multa.getCita().getPaciente().getRegimenDeSalud().equals("SISBEN") ){
            double descuento = multa.getValorTotal()*0.25 ;
            multa.setValorTotal( multa.getValorTotal() - descuento );
            Singleton.getINSTANCIA().escribirMultas();
        }
    }
    
     /**
      * Metodo para validar que la fecha elegida para una cita no sea la misma que la que el doctor bloqueó
      * @param doctor, el doctor que va a atender las citas
      * @param fecha, la fecha de las citas que serán filtradas
      * @throws NoHayCitasExcepcion, si no hay citas para la fecha seleccionada  
      */
    public ArrayList<Cita> filtrarCitasPorDia(Doctor doctor, Date fecha)throws NoHayCitasExcepcion{       
        ArrayList<Cita> citas = new ArrayList<>();
        String fechaAux =  String.valueOf(fecha.getDate() + fecha.getMonth() + fecha.getYear());
        for (Cita cita : doctor.getAgenda()) {
            String fechaDoc = String.valueOf(cita.getFecha().getDate() + cita.getFecha().getMonth() + cita.getFecha().getYear());
            if( fechaDoc.equals(fechaAux) ){
                citas.add(cita);
            }
        }
           
        if( citas.isEmpty() ) throw new NoHayCitasExcepcion();
        
        return citas;
    }
    
    /**
     * @return the multas
     */
    public ArrayList<Multa> getMultas() {
        return multas;
    }
        
}
