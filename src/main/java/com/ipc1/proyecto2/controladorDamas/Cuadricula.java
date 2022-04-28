/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto2.controladorDamas;

import com.ipc1.proyecto2.graficos.TableroDamas;
import java.awt.Color;
import javax.swing.JButton;


/**
 *
 * @author minch
 */
public class Cuadricula{
    
    private boolean ocupado=false;
    JButton cuadro = new JButton();
    
    public Cuadricula() {
        cuadro.setSize(60, 60);
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
