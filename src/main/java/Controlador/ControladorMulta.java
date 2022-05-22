/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Multa;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorMulta {
    
    private ArrayList<Multa> multas;
    
    public ControladorMulta() {
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
     * Metodo para añadir una multa al array general de las multas
     * @param multa
     * @return true si pudo añadirla, de lo contrario false;
     */
    public boolean añadirMulta(Multa multa){
        Multa aux = buscarMulta(multa.getCita().getPaciente().getDocumento());
        
        if(aux == null){
              multas.add(multa);
              multa.getCita().getPaciente().setHasMulta(true);
              return true;
        }
        
        return false;
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
                    return true;                                     
                }
            }
        }
        return false;
    }
    
    
    /**
     * @return the multas
     */
    public ArrayList<Multa> getMultas() {
        return multas;
    }
    
}
