/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validacion;

import Excepciones.ContraseñaInseguraExcepcion;
import Excepciones.CorreoInvalidoExcepcion;
import Excepciones.DatoDigitadoExcepcion;
import Excepciones.NoCuentaConExpExcepcion;
import Excepciones.SinLaTerminacionCorrectaExcepcion;
import Excepciones.TelefonoCortoExcepcion;



/**
 *
 * @author USER
 */
public class Validacion {
     public Validacion(){}
     
    /**
     * Metodo para que el usuario unicamente digite letras
     * @param evt, trae almacenado todo lo que ocurrió en ese evento
     * @throws DatoDigitadoExcepcion, en el caso de que el dato digitado no corresponda a una letra 
     */
    public void validarSoloLetras( java.awt.event.KeyEvent evt ) throws DatoDigitadoExcepcion{
        
        int caractera = evt.getKeyCode();            
        char caracter = evt.getKeyChar();
                     
        //El 127 corresponde a la tecla de eliminar, y esa si debe permitirse en los textFields
        //El 32 corresponde a la tecla espacio, y esa debe permitirse en el textField
        if( ( caractera != 127 && caractera != 32 ) 
              && ( (caracter<'a' || caracter>'z') && (caracter<'A' || caracter>'Z') ) )
        {
            evt.consume();
            throw new DatoDigitadoExcepcion("LETRAS");
        }
    }
    
    /**
     * Metodo para que el usuario unicamente digite números
     * @param evt, trae almacenado todo lo que ocurrió en ese evento
     * @throws DatoDigitadoExcepcion, en el caso de que el dato digitado no corresponda a un numero 
     */
    public void validarSoloNumeros( java.awt.event.KeyEvent evt  ) throws DatoDigitadoExcepcion{
        int caractera = evt.getKeyChar();                
        char caracter = evt.getKeyChar();
              
        //El 127 corresponde a la tecla de eliminar y esa si debe permitirse en los textFields
        if( ( caractera != 127 ) && (caracter<'0' || caracter>'9') ){
            evt.consume();
            throw new DatoDigitadoExcepcion("NUMEROS");
        }
    }

    /**
     * Metodo para verificar que el correo contenga el arroba '@'
     * @param correo, el correo que se intenta registrar
     * @throws CorreoInvalidoExcepcion, en el caso de que el correo pasado por parametro no contenga el '@' 
     */
    public void verificarArroba(String correo) throws CorreoInvalidoExcepcion {      
       if( !correo.contains("@") ) throw new CorreoInvalidoExcepcion();             
    }
    
    /**
     * Metodo para verificar si es valido el correo
     * @param correo, el correo que se intenta registrar
     * @throws SinLaTerminacionCorrectaExcepcion, en caso de que el correo que se intenta registrar no termine como lo estipulan nuestras reglas 
     */
    public void verificarLaTerminacionCorrecta(String correo) throws SinLaTerminacionCorrectaExcepcion {      
       if( !correo.endsWith("@mihospital.co") ) throw new SinLaTerminacionCorrectaExcepcion();              
    }
    
    /**
     * Metodo para verificar la longitud del telefono
     * @param telefono, el telefono que se desea registrar
     * @throws TelefonoCortoExcepcion, en caso de que la cantidad de digitos del telefono sea menor a 8 
     */
    public void validarTelefono(String telefono) throws TelefonoCortoExcepcion{   
        if( telefono.length() < 8 ) throw new TelefonoCortoExcepcion();            
    }
    
    /**
     * Metodo para validar la seguridad de la contraseña
     * @param contraseña, la contraseña que se desea registrar
     * @throws ContraseñaInseguraExcepcion, en el caso de que la contraseña sea bastante corta
     */
    public void validarContraseña(String contraseña) throws ContraseñaInseguraExcepcion{
        if( contraseña.length() < 5 ) throw new ContraseñaInseguraExcepcion();        
    }
    
    /**
     * Metodo para validar los años de experiencia de las secretarias
     * @param exp, los años de experiencia de la secretaria que se desea registrar
     * @throws NoCuentaConExpExcepcion, en el caso de que la experiencia pasada por parametro sea menor a 4 
     */
    public void validarAñosExp(int exp) throws NoCuentaConExpExcepcion{
        if( exp < 4) throw new NoCuentaConExpExcepcion();        
    }
    
}
