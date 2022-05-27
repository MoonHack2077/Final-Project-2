/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.MayorDeEdadExcepcion;
import Excepciones.NoEncontradoExcepcion;
import Modelo.Secretaria;
import Singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorSecretaria {
    
    private ArrayList<Secretaria> secretarias;
    private ControladorBusqueda controladorBusqueda;
    
    public ControladorSecretaria() {
        secretarias = Singleton.getINSTANCIA().getSecretarias();
        controladorBusqueda = new ControladorBusqueda();
    }
    
    /**
     * Metodo para añadir una secretaria
     * @param secretaria
     * @return true si pudo añadirla
     * @throws MayorDeEdadExcepcion 
     */
    public boolean añadirSecretaria(Secretaria secretaria)throws MayorDeEdadExcepcion{
        controladorBusqueda.buscarSecretaria(secretaria.getDocumento(),secretaria.getCorreo(), secretaria.getContraseña(), secretaria.getTelefono());
        controladorBusqueda.buscarDoctor(secretaria.getDocumento(),secretaria.getCorreo(), secretaria.getContraseña(), secretaria.getTelefono());
        controladorBusqueda.buscarPaciente(secretaria.getDocumento(),secretaria.getCorreo(), secretaria.getContraseña(), secretaria.getTelefono());
        controladorBusqueda.buscarAdmin(secretaria.getDocumento(),secretaria.getCorreo(), secretaria.getContraseña(), secretaria.getTelefono());
        
        //Excepciones    
        if( secretaria.getEdad() < 18) throw new MayorDeEdadExcepcion();
        
        getSecretarias().add(secretaria);
        Singleton.getINSTANCIA().escribirSecretarias();
        return true;       
    }
    
    /**
     * Metodo para eliminar una secretaria
     * @param documento
     * @return true si pudo eliminarla
     * @throws NoEncontradoExcepcion 
     */
    public boolean eliminarSecretaria(String documento) throws NoEncontradoExcepcion{
        Secretaria aux = controladorBusqueda.buscarSecretaria(documento);
        
        //Excepcion
        if( aux == null ) throw new NoEncontradoExcepcion();
        
        for (int i = 0; i < getSecretarias().size(); i++) {
            if( getSecretarias().get(i).getDocumento().equals(documento )){
                getSecretarias().remove(i);
                Singleton.getINSTANCIA().escribirSecretarias();
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
        Secretaria aux = controladorBusqueda.buscarSecretaria(secretaria.getDocumento());
        
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
                Singleton.getINSTANCIA().escribirSecretarias();
            }
        }
        
        return true;
    }

    /**
     * @return the secretarias
     */
    public ArrayList<Secretaria> getSecretarias() {
        return secretarias;
    }
}
