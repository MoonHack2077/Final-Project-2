/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.AlmacenadoExcepcion;
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
public class ControladorBusqueda {

    private ArrayList<Persona> lista;
    
    public ControladorBusqueda() {
        lista = Singleton.getINSTANCIA().getLista();
    }
    
    
    /**
     * Metodo para buscar coincidencias en los datos irrepetibles en los administradores
     * @param documento
     * @param correo
     * @param contraseña
     * @param telefono
     * @throws AlmacenadoExcepcion 
     */
    public void buscarCoincidencia(String documento,String correo, String contraseña, String telefono) throws AlmacenadoExcepcion{
        
        for (Persona persona : getLista()) {
            if( persona.getDocumento().equals(documento) ) throw new AlmacenadoExcepcion("El docmuento");
            if( persona.getCorreo().equals(correo) ) throw new AlmacenadoExcepcion("El correo");
            if( persona.getContraseña().equals(contraseña)) throw new AlmacenadoExcepcion("La contraseña"); 
            if( persona.getTelefono().equals(telefono) ) throw new AlmacenadoExcepcion("El telefono");
        }
        
    }
    
    /**
     * Metodo para buscar un doctor registrado por medio del documento, correo y contraseña
     * @param documento
     * @return doctor si lo encuentra, de lo contrario null
     */
    public Persona buscarPersona(String documento){   
        for (Persona persona : getLista()) {
            if(persona.getDocumento().equals(documento) ){
                if( persona instanceof Doctor){
                    Doctor doc = (Doctor) persona;
                    return doc;
                }
                if( persona instanceof Secretaria){
                    Secretaria sec = (Secretaria) persona;
                    return sec;
                }
                if( persona instanceof Paciente){
                    Paciente pac = (Paciente) persona;
                    return pac;
                }
                
            }
        }
        return null;
    }
    

    /**
     * @return the lista
     */
    public ArrayList<Persona> getLista() {
        return lista;
    }
  
}
