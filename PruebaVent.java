/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebavent;

import javax.swing.JFrame;

/**
 *
 * @author Lenovo11
 */
public class PruebaVent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PruebaVent ventana = new PruebaVent("Ventana Creada");
      
    }
    
    public PruebaVent (String titulo){      
        JFrame ventanaM = new JFrame(titulo);
        ventanaM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X
        ventanaM.setSize(290, 150);//configurando tamaño de la ventana
        ventanaM.setVisible(true);//configurando visualización de la ventana   
        System.out.println("Pablo");
    }    
}
