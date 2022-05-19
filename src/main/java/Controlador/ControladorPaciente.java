/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cita;
import Modelo.Multa;
import Modelo.Paciente;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorPaciente {
    public ControladorPaciente() {}
       
    /**
     * Metodo para hacer descuento de la multa si el paciente tiene SISBEN
     * @param multa 
     */
    public void descuentoMulta(Multa multa){
        if( multa.getPaciente().hasSisben() ){
            double descuento = multa.getValorTotal()*0.25 ;
            multa.setValorTotal( multa.getValorTotal()-descuento );
        }
    }
}
