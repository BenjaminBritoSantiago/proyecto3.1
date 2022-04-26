/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ipc1.proyecto3.graficos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author minch
 */
public class Cronometro extends javax.swing.JPanel implements Runnable {

    private int hora = 01;
    private int minutos = 01;
    private int segundos = 01;
    private TorresdeHanoi ventana;

    public Cronometro(TorresdeHanoi ventana) {
        initComponents();
        this.ventana = ventana;
        inciciar();

        //this.setBounds(350, 3, 225, 50);
    }

    //public void contador()
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contador = new javax.swing.JLabel();
        tiempoText = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        contador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contador.setText("00:00:00");
        contador.setToolTipText("");
        contador.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(contador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 100, 30));

        tiempoText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tiempoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tiempoText.setText("TIEMPO:");
        add(tiempoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contador;
    private javax.swing.JLabel tiempoText;
    // End of variables declaration//GEN-END:variables

    public void setContador(String contador) {
        this.contador.setText(contador);
    }

    public void inciciar() {
        ventana.add(this);
        this.setVisible(true);
        this.setBounds(200, 40, 300, 100);

    }

    @Override
    public void run() {
        //String contador;
        do {
            contador.setText(cambiador(hora) + ":" + cambiador(minutos)+ ":" + cambiador(segundos));
        
            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    hora++;
                }
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (!ventana.isTerminar());
    }

    
    public String cambiador(int hms) {
        String valHMS = "";
        if (hms < 10) {
            valHMS = ("0");
        }
        return valHMS + (String.valueOf(hms));
        
    }

}
