/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ipc1.proyecto2.graficos;

import com.ipc1.proyecto2.InfoJuego;
import com.ipc1.proyecto2.Usuarios;
import com.ipc1.proyecto2.controladorHanoi.Barra;
import com.ipc1.proyecto2.controladorHanoi.BotonesTorres;
import com.ipc1.proyecto2.controladorHanoi.Torre;
import static java.lang.Math.round;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author minch
 */
public class TorresdeHanoi extends javax.swing.JFrame {

    private Usuarios usuario;
    Barra[] barras = new Barra[8];
    Torre[] torres = new Torre[3];
    private int idClico = -1;
    private int cantidaBarras;
    private boolean terminar = false;
    private int movActual = 0;

    private MenuJuegos menuJuegos;
    private CronometroTorres crnmt;
    private BotonesTorres graficos;

    /**
     * Creates new form TorresdeHanoi
     */
    public TorresdeHanoi(int cantidaBarras, MenuJuegos menuJuegos) {
        this.usuario = InfoJuego.getUsuario();
        this.menuJuegos = menuJuegos;
        this.cantidaBarras = cantidaBarras;
        
        crnmt = new CronometroTorres(this);
        this.graficos = new BotonesTorres(this, cantidaBarras, menuJuegos, crnmt, usuario);

        this.setBounds(0, 0, 1000, 700);
        this.setLocationRelativeTo(null);
        initComponents();
        movMin.setText(String.valueOf(round(Math.pow(2, cantidaBarras) - 1)));

        Thread t = new Thread(crnmt);
        t.start();
    }

    public TorresdeHanoi(MenuJuegos menuJuegos) {
        this.usuario = InfoJuego.getUsuario();
        this.menuJuegos = menuJuegos;
        this.cantidaBarras = usuario.getcBarras();

        crnmt = new CronometroTorres(this, usuario.getTiempoHanoi()[0], usuario.getTiempoHanoi()[1], usuario.getTiempoHanoi()[2]);
        
        this.graficos = new BotonesTorres(this, cantidaBarras, menuJuegos, crnmt, usuario);
        
       
        this.setBounds(0, 0, 1000, 700);
        this.setLocationRelativeTo(null);
        initComponents();
        this.movActual = usuario.getMovActual();
        movMin.setText(String.valueOf(round(Math.pow(2, cantidaBarras) - 1)));

        Thread tc = new Thread(crnmt);
        tc.start();
    }

    public void setTerminar(boolean terminar) {
        this.terminar = terminar;
    }

    public boolean isTerminar() {
        return terminar;
    }

    public void setMovActuales() {
        ++movActual;
        this.movActuales.setText(String.valueOf(movActual));
    }

    public JLabel getMovActuales() {
        return movActuales;
    }

    public JLabel getMovMin() {
        return movMin;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AbandonarPartida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        movMin = new javax.swing.JLabel();
        movActuales = new javax.swing.JLabel();
        GuardarPartida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                validarCierre(evt);
            }
        });

        AbandonarPartida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AbandonarPartida.setText("Rendirse");
        AbandonarPartida.setVerifyInputWhenFocusTarget(false);
        AbandonarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbandonarPartidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Movimientos Minimos:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("movimientos actuales:");

        movMin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        movMin.setText("00");

        movActuales.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        movActuales.setText("00");

        GuardarPartida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GuardarPartida.setText("Guardar Partida");
        GuardarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarPartidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(movActuales))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(movMin))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(AbandonarPartida)
                        .addGap(195, 195, 195)
                        .addComponent(GuardarPartida)))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(movMin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(movActuales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 445, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AbandonarPartida)
                    .addComponent(GuardarPartida))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbandonarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbandonarPartidaActionPerformed
        // TODO add your handling code here:

        rendirse();

    }//GEN-LAST:event_AbandonarPartidaActionPerformed

    private void GuardarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarPartidaActionPerformed
        // TODO add your handling code here:

        Object[] options = {"SI", "NO"};
        Object c;
        c = JOptionPane.showOptionDialog(null, "Quieres Guardar la partida ", "Guardar",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);

        if ((int) c == 0) {
            terminar = true;
            System.out.println("segundos utilizados: " + crnmt.getSegundos());
            graficos.guardar(movActual);
            dispose();
            menuJuegos.setVisible(true);
        }

    }//GEN-LAST:event_GuardarPartidaActionPerformed

    private void validarCierre(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_validarCierre
        // TODO add your handling code here:
        rendirse();
    }//GEN-LAST:event_validarCierre

    public void rendirse() {
        Object[] options = {"SI", "NO"};
        Object c;
        c = JOptionPane.showOptionDialog(null, "Quieres Abandonar la Partida \n       (perderas el Juego)", "RENDIRSE",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);

        if ((int) c == 0) {
            usuario.setGuardoHanoi(false);
            terminar = true;
            dispose();
            menuJuegos.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbandonarPartida;
    private javax.swing.JButton GuardarPartida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel movActuales;
    private javax.swing.JLabel movMin;
    // End of variables declaration//GEN-END:variables

}
