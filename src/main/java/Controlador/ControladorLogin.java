/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Persona;
import Modelo.Doctor;
import Modelo.Paciente;
import Modelo.Secretaria;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorLogin {

    private ArrayList<Persona> lista;
    //private ArrayList<Doctor> doctores;
    //private ArrayList<Secretaria> secretarias;
    //private ArrayList<Paciente> pacientes;
    
    public ControladorLogin() {
        lista = Singleton.getINSTANCIA().getLista();
    }
    
    /**
     * Metodo para añadir los admins
     * @return
     * @throws NoEncontradoExcepcion 
     */
    public void añadirAdmin(){
        Persona juan = new Persona("Juan Manuel Arenas Rincon", "1234567890", "juan@mihospital.co", "soyadmin1", "3000000000", 20, "Soltero");
        Persona bryan = new Persona("Bryan Alejandro Benavides", "9876543210", "bryan@mihospital.co", "soyadmin2", "4000000000", 20, "Casado");
        
        lista.add(juan);
        lista.add(bryan);
    }
    
    /**
     * 
     * @param correo
     * @param contraseña
     * @return 
     */
    public Persona buscarUsuario(String correo, String contraseña){
        
        for (Persona persona : lista) {
            if( persona.getCorreo().equals(correo) && persona.getContraseña().equals(contraseña) ) return persona;
        }
        
        return null;
    }
    
}
