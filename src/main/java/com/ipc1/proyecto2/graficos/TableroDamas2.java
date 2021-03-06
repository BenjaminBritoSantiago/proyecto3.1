/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ipc1.proyecto2.graficos;

import com.ipc1.proyecto2.InfoJuego;
import com.ipc1.proyecto2.Usuarios;
import com.ipc1.proyecto2.controladorDamas.ControladorDamas;
import com.ipc1.proyecto2.controladorHanoi.ControladorHanoi;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author minch
 */
public class TableroDamas2 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private Usuarios usuario;
    private boolean terminar = false;
    private MenuJuegos menuJuegos;
    private int comioBlanco = 0;
    private int comioRojo = 0;
    private ControladorDamas controlador;
    private CronometroDamas crnmt;

    public TableroDamas2(MenuJuegos menuJuegos) {
        this.usuario = InfoJuego.getUsuario();
        this.menuJuegos = menuJuegos;

        if (usuario.getGuardoDamas()) {
            this.comioRojo = usuario.getComio1();
            this.comioBlanco = usuario.getComio2();
            crnmt = new CronometroDamas(this, usuario.getTiempoDamas()[0], usuario.getTiempoDamas()[1], usuario.getTiempoDamas()[2]);
        } else {
            crnmt = new CronometroDamas(this);
        }
        
        initComponents();
        contadorBlanco.setText(""+comioBlanco);
        contadorRojo.setText(""+comioRojo);
        this.setLocationRelativeTo(null);
        controlador = new ControladorDamas(this, crnmt, menuJuegos, usuario);

        Thread t = new Thread(crnmt);
        t.start();

    }

    public boolean getTerminar() {
        return terminar;
    }

    public void setTerminar(boolean terminar) {
        this.terminar = terminar;
    }

    public void SumarContadorRojo() {
        ++comioRojo;
        contadorRojo.setText("" + comioRojo);
    }

    public void SumarContadoBlanco() {
        ++comioBlanco;
        contadorBlanco.setText("" + comioBlanco);
    }

    public int getComioBlanco() {
        return comioBlanco;
    }

    public void setComioBlanco(int comioBlanco) {
        this.comioBlanco = comioBlanco;
    }

    public int getComioRojo() {
        return comioRojo;
    }

    public void setComioRojo(int comioRojo) {
        this.comioRojo = comioRojo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rendirse = new javax.swing.JButton();
        guardarPartida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        contadorBlanco = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contadorRojo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ValidarCierre(evt);
            }
        });

        rendirse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rendirse.setText("Rendirse");
        rendirse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rendirseMouseClicked(evt);
            }
        });
        rendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rendirseActionPerformed(evt);
            }
        });

        guardarPartida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        guardarPartida.setText("Guardar Partida");
        guardarPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarPartidaMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("comido por Blanco");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contadorBlanco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        contadorBlanco.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("comido por Rojo");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        contadorRojo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        contadorRojo.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(rendirse)
                .addGap(100, 100, 100)
                .addComponent(guardarPartida)
                .addContainerGap(355, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(contadorRojo)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(contadorBlanco)
                        .addGap(122, 122, 122))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contadorBlanco)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contadorRojo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rendirse)
                    .addComponent(guardarPartida))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rendirseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rendirseActionPerformed

    private void rendirseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rendirseMouseClicked
        // TODO add your handling code here:
        rendirse();
    }//GEN-LAST:event_rendirseMouseClicked

    private void guardarPartidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarPartidaMouseClicked
        // TODO add your handling code here:
        Object[] options = {"SI", "NO"};
        Object c;
        c = JOptionPane.showOptionDialog(null, "Quieres Guardar la partida ", "Guardar",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);

        if ((int) c == 0) {
            controlador.guardar();
            terminar = true;
            dispose();
            menuJuegos.setVisible(true);
        }
    }//GEN-LAST:event_guardarPartidaMouseClicked

    private void ValidarCierre(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ValidarCierre
        // TODO add your handling code here:
        rendirse();
    }//GEN-LAST:event_ValidarCierre

    public void rendirse() {
        Object[] options = {"SI", "NO"};
        Object c;
        c = JOptionPane.showOptionDialog(null, "Quieres Abandonar la Partida \n       (perderas el Juego)", "RENDIRSE",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);

        if ((int) c == 0) {
            usuario.setTotalMovsDamas( controlador.getSumaMovimietos());
            usuario.setGuardoDamas(false);
            usuario.setPartidasJugoDamas();
            usuario.setPartidasPerdioDamas();
            terminar = true;
            dispose();
            menuJuegos.setVisible(true);
        }

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contadorBlanco;
    private javax.swing.JLabel contadorRojo;
    private javax.swing.JButton guardarPartida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton rendirse;
    // End of variables declaration//GEN-END:variables
}
