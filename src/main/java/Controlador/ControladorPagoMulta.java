/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.ValorNoValidoExcepcion;
import Modelo.Multa;
import Singleton.Singleton;
import java.util.ArrayList;

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
     * @param documento
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
     * @param documento
     * @return true si pudo eliminarla, de lo contrario false
     */
    public boolean eliminarMulta(String documento){
        Multa aux = buscarMulta(documento);
        
        if( aux != null ){
            for (int i = 0; i < getMultas().size(); i++) {
                if(getMultas().get(i).getCita().getPaciente().getDocumento().equals(documento)){
                    multas.get(i).getCita().getPaciente().setHasMulta(false);
                    multas.remove(i);
                    Singleton.getINSTANCIA().escribirMultas();
                    Singleton.getINSTANCIA().escribirLista();
                    return true;                                     
                }
            }
        }
        return false;
    }
    
    /**
     * 
     * @param valor
     * @param multa
     * @throws ValorNoValidoExcepcion 
     */
    public void verificarValorPagado(double valor, Multa multa) throws ValorNoValidoExcepcion{
        if( valor != multa.getValorTotal() ) throw new ValorNoValidoExcepcion();
    }
    
    
    /**
     * @return the multas
     */
    public ArrayList<Multa> getMultas() {
        return multas;
    }
}
