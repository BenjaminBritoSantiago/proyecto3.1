/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto3.controladorDamas;

import com.ipc1.proyecto3.graficos.TableroDamas;
import java.awt.Color;
import javax.swing.JButton;


/**
 *
 * @author minch
 */
public class Cuadricula{
    
    private boolean ocupado=false;
    private int posX;
    private int posY;
    JButton cuadro = new JButton();
    
    public Cuadricula(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        cuadro.setBounds(this.posX,this.posY,60, 60);
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public JButton getCuadro() {
        return cuadro;
    }

    public void setCuadro(JButton cuadro) {
        this.cuadro = cuadro;
    }
    
    
    
    
}
