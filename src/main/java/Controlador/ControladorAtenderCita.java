/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.CoincideConFechaBloqueadaExcepcion;
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
     * @param cita
     * @param conclusiones
     * @param tratamientos 
     */
    public void confirmarAtencion(Cita cita, String conclusiones, String tratamientos){
        cita.setConclusiones(conclusiones );
        cita.setTratamientos(tratamientos);
        
        //Se añade la cita al historal del paciente
        cita.getPaciente().getHistorial().add(cita);
        Singleton.getINSTANCIA().escribirLista();
        Singleton.getINSTANCIA().escribirCitas();
    }
    
    /**
     * Metodo para añadir una multa al array general de las multas
     * @param multa
     * @return true si pudo añadirla, de lo contrario false;
     */
    public boolean añadirMulta(Multa multa){
        multas.add(multa);
        multa.getCita().getPaciente().setHasMulta(true);
        Singleton.getINSTANCIA().escribirMultas();
        Singleton.getINSTANCIA().escribirLista();
        return true;
    }
    
           
    /**
     * Metodo para hacer descuento de la multa si el paciente tiene SISBEN
     * @param multa 
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
      * @param doctor
      * @param fecha
      * @throws CoincideConFechaBloqueadaExcepcion 
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

    /**
     * @return the controlador
     */
    public ControladorCancelarCita getControlador() {
        return controlador;
    }
    
    
}
