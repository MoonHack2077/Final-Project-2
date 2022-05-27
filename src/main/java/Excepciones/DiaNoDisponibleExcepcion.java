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
public class DiaNoDisponibleExcepcion extends RuntimeException{

    public DiaNoDisponibleExcepcion(Doctor doctor) {
        super("El doctor " + doctor.getNombre() + " ya tiene una cita asignada a esa hora");
    }
    
}
