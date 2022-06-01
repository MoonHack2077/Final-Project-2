/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import Modelo.Doctor;

/**
 *
 * @author USER
 */
public class CoincideConFechaBloqueadaExcepcion extends RuntimeException{

    public CoincideConFechaBloqueadaExcepcion(Doctor doctor) {
        super("El doctor " + doctor.getNombre() + " ha bloqueado ese dia para tener citas\n Por favor seleccione otro");
    }
    
}
