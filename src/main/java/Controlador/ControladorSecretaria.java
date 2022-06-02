/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.MayorDeEdadExcepcion;
import Excepciones.NoEncontradoExcepcion;
import Modelo.Persona;
import Modelo.Secretaria;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorSecretaria {
    
    private ArrayList<Persona> secretarias;
    private ControladorBusqueda controladorBusqueda;
    
    public ControladorSecretaria() {
        secretarias = Singleton.getINSTANCIA().getLista();
        controladorBusqueda = new ControladorBusqueda();
    }
    
    /**
     * Metodo para añadir una secretaria
     * @param secretaria
     * @return true si pudo añadirla
     * @throws MayorDeEdadExcepcion 
     */
    public boolean añadirSecretaria(Secretaria secretaria)throws MayorDeEdadExcepcion{
        controladorBusqueda.buscarCoincidencia(secretaria.getDocumento(),secretaria.getCorreo(), secretaria.getContraseña(), secretaria.getTelefono());
        
        //Excepciones    
        if( secretaria.getEdad() < 18) throw new MayorDeEdadExcepcion();
        
        getSecretarias().add(secretaria);
        Singleton.getINSTANCIA().escribirLista();
        return true;       
    }
    
    /**
     * Metodo para eliminar una secretaria
     * @param documento
     * @return true si pudo eliminarla
     * @throws NoEncontradoExcepcion 
     */
    public boolean eliminarSecretaria(String documento) throws NoEncontradoExcepcion{
        Secretaria aux = (Secretaria) controladorBusqueda.buscarPersona(documento);
        
        //Excepcion
        if( aux == null ) throw new NoEncontradoExcepcion();
        
        for (int i = 0; i < getSecretarias().size(); i++) {
            if( getSecretarias().get(i).getDocumento().equals(documento )){
                getSecretarias().remove(i);
                Singleton.getINSTANCIA().escribirLista();
            }
        }
        
        return true;
    }
    
    /**
     * Metodo para editar la informacion de una secretaria
     * @param secretaria
     * @return true si pudo editarla
     * @throws NoEncontradoExcepcion
     * @throws MayorDeEdadExcepcion 
     */
    public boolean editarSecretaria(Secretaria secretaria) throws NoEncontradoExcepcion, MayorDeEdadExcepcion{        
        Secretaria aux = (Secretaria) controladorBusqueda.buscarPersona(secretaria.getDocumento());
        
        //Excepciones
        if( aux == null ) throw new NoEncontradoExcepcion();
        if( secretaria.getEdad() < 18) throw new MayorDeEdadExcepcion();
        
        for(int i=0 ; i < getSecretarias().size(); i++){
            if( getSecretarias().get(i).getDocumento().equals(secretaria.getDocumento() )){
                //Inyectando los nuevos valores
                getSecretarias().get(i).setNombre(secretaria.getNombre());
                getSecretarias().get(i).setEdad(secretaria.getEdad());
                getSecretarias().get(i).setContraseña(secretaria.getContraseña());
                getSecretarias().get(i).setCorreo(secretaria.getCorreo());
                getSecretarias().get(i).setEstadoCivil(secretaria.getEstadoCivil());
                getSecretarias().get(i).setTelefono(secretaria.getTelefono());
                Singleton.getINSTANCIA().escribirLista();
            }
        }
        
        return true;
    }

    /**
     * @return the secretarias
     */
    public ArrayList<Persona> getSecretarias() {
        return secretarias;
    }
}
