/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto2.controladorDamas;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

/**
 *
 * @author minch
 */
public class Bordes implements Border {
    private int radios;

    public Bordes(int radios) {
        this.radios = radios;
    }
    

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radios, radios);
    }

    @Override
    public Insets getBorderInsets(Component c) {
         return new Insets(this.radios+1, this.radios+1, this.radios+2, this.radios);
    }

    @Override
    public boolean isBorderOpaque() {
       return true;
    }
    
}
