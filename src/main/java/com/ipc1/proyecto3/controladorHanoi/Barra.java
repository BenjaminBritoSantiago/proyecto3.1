/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.proyecto3.controladorHanoi;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author minch
 */
public class Barra extends JButton  implements ActionListener {
    
    private int idBarra;
    private int peso;
    private int idTorreActual;
    private int posicionYActual;
    private int pesoAnterior;
    private JButton boton=  new JButton();
    
    public static int idClico=-1;
    
    
    
    public Barra( int idBarra, int peso, int idTorreActual, int posicionYActual, int pesoAnterior, int anchoBoton, int altoBoton, String numBoton) {
        this.peso = peso;
        this.idTorreActual = idTorreActual;
        this.posicionYActual = posicionYActual;
        this.idBarra = idBarra;
        this.pesoAnterior = pesoAnterior;
        boton.setBounds(20, 20, anchoBoton, altoBoton);
        this.boton.setVisible(true);
        boton.setText(numBoton);
    }

    
     private void botonMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        idClico = idBarra;
        System.out.println("se clico la torre id: "+idBarra);
    }     

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }
    
    public int getPesoAnterior() {
        return pesoAnterior;
    }

    public void setPesoAnterior(int pesoAnterior) {
        this.pesoAnterior = pesoAnterior;
    }
    

    public int getIdBarra() {
        return idBarra;
    }

    public void setIdBarra(int idBarra) {
        this.idBarra = idBarra;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdTorreActual() {
        return idTorreActual;
    }

    public void setIdTorreActual(int idTorreActual) {
        this.idTorreActual = idTorreActual;
    }

    public int getPosicionYActual() {
        return posicionYActual;
    }

    public void setPosicionYActual(int posicionYActual) {
        this.posicionYActual = posicionYActual;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("se clico la torre id: "+idBarra);
    }
            
    
}
