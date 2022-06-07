/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.FechaImposbleExcepcion;
import Excepciones.NoEncontradoExcepcion;
import Excepciones.ValorNoValidoExcepcion;
import Modelo.Multa;
import Singleton.Singleton;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER
 */
public class ControladorPagoMulta {
    private ArrayList<Multa> multas;
    
    public ControladorPagoMulta() {
        multas = Singleton.getINSTANCIA().getMultas();
    }

    /**
     * Metodo para buscar una multa registrada por medio del documento del paciente
     * @param documento, el documento del paciente que tiene asignada la multa
     * @return multa si la encuentra, de lo contrario null
     */
    public Multa buscarMulta(String documento){
    
        for (Multa multa : getMultas()) {
            if(multa.getCita().getPaciente().getDocumento().equals(documento)) return multa;
        }
        return null;
    }
    
  
    /**
     * Metodo para eliminar una multa almacenada
     * @param documento, el documento del paciente que tiene asignada la multa
     * @return true si pudo eliminarla, de lo contrario false
     * @throws NoEncontradoExcepcion, en caso de que el documento no coincida con alguno de los que estan almacenados  
     */
    public boolean eliminarMulta(String documento)throws NoEncontradoExcepcion  {
        Multa aux = buscarMulta(documento);
        
        if( aux == null ) throw new NoEncontradoExcepcion("La multa no se encuentra almacenada");
        
        for (int i = 0; i < getMultas().size(); i++) {
            if(getMultas().get(i).getCita().getPaciente().getDocumento().equals(documento)){
                multas.get(i).getCita().getPaciente().setHasMulta(false);
                multas.remove(i);
                Singleton.getINSTANCIA().escribirMultas();
                Singleton.getINSTANCIA().escribirLista();
                return true;                                     
            }
        }
        
        return false;
    }
    
    /**
     * Metodo para verificar que el valor pagado corresponda al de la multa
     * @param valor, el valor pagado
     * @param multa, la multa para saber cuanto es el total a cancelar
     * @throws ValorNoValidoExcepcion, Si el valor pagado no corresponde al de la multa 
     */
    public void verificarValorPagado(double valor, Multa multa) throws ValorNoValidoExcepcion{
        if( valor != multa.getValorTotal() ) throw new ValorNoValidoExcepcion();
    }
    
    /**
     * Metodo para verificar que la fecha pasada por parametro no sea antes de la fecha en la que se asignó la cita
     * @param multa, la multa que se esta pagando
     * @param fecha, la fecha seleccionada para el pago
     * @throws FechaImposbleExcepcion, en el caso de que la fecha pasada por parametro sea anterior a la fecha en la que se asignó la cita
     */
    public void verificarFechaPago(Multa multa, Date fecha) throws FechaImposbleExcepcion {
        if( multa.getCita().getFecha().after( fecha ) ) throw new FechaImposbleExcepcion();
    }
    
    /**
     * @return the multas
     */
    public ArrayList<Multa> getMultas() {
        return multas;
    }
}
