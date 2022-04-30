/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto2.controladorDamas;


import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 *
 * @author minch
 */
public class Ficha{
    
    JButton ficha = new JButton();
    private boolean tipo1=true;
    private int numFicha;
    private boolean corono = false;
    private int idCuadroActual;
    
    public Ficha(int numFicha, int grupo12 ) {
         ImageIcon imgs = new ImageIcon("C:\\Users\\minch\\Documents\\proyecto3.1\\src\\main\\java\\com\\ipc1\\proyecto2\\imagenes\\damas"+grupo12+".png");
        this.numFicha=numFicha;
        ficha.setSize(60, 60); 
        ficha.setOpaque(true);
        ficha.setContentAreaFilled(false);
        ficha.setBorder(new Bordes (50));
        ficha.setIcon(new ImageIcon(imgs.getImage().getScaledInstance(ficha.getWidth() , ficha.getHeight(), Image.SCALE_SMOOTH)));
         
    }

    
    public int getIdCuadroActual() {
        return idCuadroActual;
    }


    public void setIdCuadroActual(int idCuadroActual) {
        this.idCuadroActual = idCuadroActual;
    }

    public boolean getCorono() {
        return corono;
    }

    public void setCorono(boolean corono) {
        this.corono = corono;
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
