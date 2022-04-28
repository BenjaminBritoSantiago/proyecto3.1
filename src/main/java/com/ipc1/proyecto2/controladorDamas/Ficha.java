/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto2.controladorDamas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;

/**
 *
 * @author minch
 */
public class Ficha{
    
    JButton ficha = new JButton();
    private boolean tipo1=true;
    private int numFicha;
    
    public Ficha(int numFicha) {
         ImageIcon imgs = new ImageIcon("C:\\Users\\minch\\Documents\\proyecto3.1\\src\\main\\java\\com\\ipc1\\proyecto2\\imagenes\\rojo.jpg");
        this.numFicha=numFicha;
        ficha.setSize(60, 60); 
        //ficha.setOpaque(true);
        //ficha.setContentAreaFilled(true);
        ficha.setIcon(new ImageIcon(imgs.getImage().getScaledInstance(ficha.getWidth() , ficha.getHeight(), Image.SCALE_SMOOTH)));
        ficha.setBorder(new Bordes (40) );
       
        
        
        
    }

    public JButton getFicha() {
        return ficha;
    }

    public void setFicha(JButton ficha) {
        this.ficha = ficha;
    }

    public boolean isTipo1() {
        return tipo1;
    }

    public void setTipo1(boolean tipo1) {
        this.tipo1 = tipo1;
    }
    
    
    
}
