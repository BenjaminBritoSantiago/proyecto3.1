/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ipc1.proyecto2.graficos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author minch
 */
public class CronometroTorres extends JPanel implements Runnable {

    private int hora = 00;
    private int minutos = 00;
    private int segundos = -01;
    private TorresdeHanoi ventana;
  

    public CronometroTorres(TorresdeHanoi ventana) {
        initComponents();
        this.ventana = ventana;
        this.tiempoText.setVisible(true);
        this.setBounds(400, 20, 250, 70);
        this.ventana.add(this);    
    }
    
    public CronometroTorres(TorresdeHanoi ventana,int hora,int minutos,int segundos ) {
        
        this.hora=hora;
        this.minutos = minutos;
        this.segundos= segundos;
        
        initComponents();
        this.ventana = ventana;
        this.tiempoText.setVisible(true);
        this.setBounds(400, 20, 250, 70);
        this.ventana.add(this);    
    }
    
    

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
    

    //public void contador()
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contador = new javax.swing.JLabel();
        tiempoText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 204)));
        setPreferredSize(new java.awt.Dimension(300, 60));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        contador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contador.setText("00:00:00");
        contador.setToolTipText("");
        contador.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(contador, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, 30));

        tiempoText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tiempoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tiempoText.setText("TIEMPO:");
        add(tiempoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("hh:mm:ss");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel tiempoText;
    // End of variables declaration//GEN-END:variables

    public void setContador(String contador) {
        this.contador.setText(contador);
    }
    
    public String tiempo(){
        return ""+hora + ":" + minutos+ ":" + segundos;
    }
    


    @Override
    public void run() {
        do {
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    hora++;
                }
            }
            contador.setText(cambiador(hora) + ":" + cambiador(minutos)+ ":" + cambiador(segundos));
            

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CronometroTorres.class.getName()).log(Level.SEVERE, null, ex);
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
