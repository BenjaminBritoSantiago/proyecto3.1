/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto3.controladorHanoi;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;

/**
 *
 * @author minch
 */
public class Torre extends JLabel {

    //private int idBarra;
    private int peso;
    private int posOcupadas;
    private int idTorre;
    JLabel torreG = new JLabel();

    public static int idClico=-1;

    public Torre(int idTorre, int peso, int posOcupadas) {
        //this.idBarra=idBarra;
        this.peso = peso;
        this.posOcupadas = posOcupadas;
        this.idTorre = idTorre;
        torreG.setBounds(0, 0, 40, 350);
        torreG.setOpaque(true);
        torreG.setBackground(Color.red);
        
    }

    private void torreMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        idClico = idTorre;
        System.out.println("se clico la torre id: "+idTorre);
    }

    public JLabel getTorreG() {
        return torreG;
    }

    public void setTorreG(JLabel torreG) {
        this.torreG = torreG;
    }

    
    public void quitarBarra() {

        posOcupadas = posOcupadas - 1;
    }

    public void agregarBarra() {
        posOcupadas = posOcupadas + 1;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPosOcupadas() {
        return posOcupadas;
    }

    public void setPosOcupadas(int posOcupadas) {
        this.posOcupadas = posOcupadas;
    }

}
