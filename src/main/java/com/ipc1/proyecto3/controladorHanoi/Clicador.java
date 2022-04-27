package com.ipc1.proyecto3.controladorHanoi;


import com.ipc1.proyecto3.controladorHanoi.Barra;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minch
 */
public class Clicador implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("asdfasfas  fdasdfa");
         Barra barra = (Barra)e.getComponent();
           
   
        
       // barra.setLocation(300, 300);
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
