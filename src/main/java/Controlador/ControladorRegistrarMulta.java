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
public class ControladorRegistrarMulta {
        
    private ArrayList<Multa> multas;
    
    public ControladorRegistrarMulta() {
        multas = Singleton.getINSTANCIA().getMultas();
    }
    
    /**
     * Metodo para añadir una multa al array general de las multas
     * @param multa
     * @return true si pudo añadirla, de lo contrario false;
     */
    public boolean añadirMulta(Multa multa){
        multas.add(multa);
        multa.getCita().getPaciente().setHasMulta(true);
        return true;
    }
    
           
    /**
     * Metodo para hacer descuento de la multa si el paciente tiene SISBEN
     * @param multa 
     */
    public void descuentoMulta(Multa multa){
        if( multa.getCita().getPaciente().hasSisben() ){
            double descuento = multa.getValorTotal()*0.25 ;
            multa.setValorTotal( multa.getValorTotal() - descuento );
        }
    }
    
    /**
     * @return the multas
     */
    public ArrayList<Multa> getMultas() {
        return multas;
    }
}
