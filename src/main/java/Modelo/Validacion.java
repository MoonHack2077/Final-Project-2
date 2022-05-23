/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;



/**
 *
 * @author USER
 */
public class Validacion {
     public Validacion(){}
     
    /**
     * Metodo para que el usuario unicamente digite letras
     * @param evt 
     */
    public void soloLetras( java.awt.event.KeyEvent evt ){
        
        int caractera = evt.getKeyChar();
        char caracter = evt.getKeyChar();
        
        //El 127 corresponde a la tecla de eliminar, y esa si debe permitirse en los textFields
        //El 32 corresponde a la tecla espacio, y esa debe permitirse en el textField
        if( (caractera != 127) && (caractera != 32) && (caracter<'a' || caracter>'z') 
            && (caracter<'A' || caracter>'Z') ) 
        {
            evt.consume();
        }
    }
    
    /**
     * Metodo para que el usuario unicamente digite números
     * @param evt 
     */
    public void soloNumeros( java.awt.event.KeyEvent evt  ){
        int caractera = evt.getKeyChar();
        char caracter = evt.getKeyChar();
       
        //El 127 corresponde a la tecla de eliminar y esa si debe permitirse en los textFields
        if( (caractera != 127) && (caracter<'0' || caracter>'9') ) evt.consume();
    }

   
}
