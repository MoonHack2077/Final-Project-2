/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.ArrayList;
import Modelo.Doctor;
import Modelo.Secretaria;

/**
 *
 * @author USER
 */
public class ControladorAdmin {
    private ArrayList<Doctor> doctores;
    private ArrayList<Secretaria> secretarias;
    
    public ControladorAdmin(){
        doctores = new ArrayList<>();
        secretarias = new ArrayList<>();
    }
    
    /*** GESTION DOCTORES ***/
    
    
    /*** GESTION SECRETARIAS ***/

    /**
     * @return the doctores
     */
    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    /**
     * @return the secretarias
     */
    public ArrayList<Secretaria> getSecretarias() {
        return secretarias;
    }
}
