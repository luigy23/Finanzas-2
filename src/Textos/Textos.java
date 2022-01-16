/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Textos;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author DOCENTE
 */
public class Textos {
    
    public void Sletras(KeyEvent evt) {
   
    
    char c = evt.getKeyChar();
    if (Character.isDigit(c)){
        
    evt.consume();
    }}
    
    public void Snumeros(KeyEvent evt) {
    char c = evt.getKeyChar();
    if (!Character.isDigit(c)){
        
    evt.consume();
    }}

    
}
