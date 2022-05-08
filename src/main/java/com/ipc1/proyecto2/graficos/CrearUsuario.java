/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ipc1.proyecto2.graficos;

import javax.swing.JOptionPane;

/**
 *
 * @author minch
 */
public class CrearUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CrearUsuario
     */
    private MenuUsuario menuUsuario;
    private boolean primerClic = true;
    private String mensajeFinal;

    public CrearUsuario(MenuUsuario menuUsuario) {

        this.menuUsuario = menuUsuario;
        initComponents();
        mensajeFinal = areaDeTexto.getText();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        areaDeTexto = new javax.swing.JTextArea();
        texto = new javax.swing.JLabel();
        botonCrear = new javax.swing.JButton();
        VolverAMenuUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ValidarCierre(evt);
            }
        });

        areaDeTexto.setColumns(20);
        areaDeTexto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        areaDeTexto.setRows(1);
        areaDeTexto.setText("Ingrese un nombre de usuario");
        areaDeTexto.setToolTipText("");
        areaDeTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        areaDeTexto.setMinimumSize(new java.awt.Dimension(252, 10));
        areaDeTexto.setName(""); // NOI18N
        areaDeTexto.setPreferredSize(new java.awt.Dimension(332, 30));
        areaDeTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaDeTextoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(areaDeTexto);

        texto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        texto.setText("Ingrese un nombre de usuario");

        botonCrear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonCrear.setText("CREAR");
        botonCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearMouseClicked(evt);
            }
        });

        VolverAMenuUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        VolverAMenuUsuario.setText("Regresar al menu");
        VolverAMenuUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverAMenuUsuarioMouseClicked(evt);
            }
        });
        VolverAMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverAMenuUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(texto))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VolverAMenuUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(botonCrear)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VolverAMenuUsuario)
                .addGap(94, 94, 94)
                .addComponent(texto)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(botonCrear)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaDeTextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaDeTextoMouseClicked
        // TODO add your handling code here:
        if (primerClic) {
            areaDeTexto.setText("");
            primerClic = false;
        }

    }//GEN-LAST:event_areaDeTextoMouseClicked

    private void botonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearMouseClicked
        // TODO add your handling code here:
        if (areaDeTexto.getText().equalsIgnoreCase(mensajeFinal) || areaDeTexto.getText().isEmpty() || areaDeTexto.getText().isBlank() || areaDeTexto.getText() == null) {
            ventanaVacio();

        } else {
            this.dispose();
            menuUsuario.setVisible(true);
        }


    }//GEN-LAST:event_botonCrearMouseClicked

    private void VolverAMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverAMenuUsuarioActionPerformed
        // TODO add your handling code here:
        if (areaDeTexto.getText().equalsIgnoreCase(mensajeFinal) || areaDeTexto.getText().isEmpty() || areaDeTexto.getText().isBlank() || areaDeTexto.getText() == null) {
            this.dispose();
            menuUsuario.setVisible(true);

        } else {
            this.dispose();
            menuUsuario.setVisible(true);
        }

    }//GEN-LAST:event_VolverAMenuUsuarioActionPerformed

    private void VolverAMenuUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverAMenuUsuarioMouseClicked
        // TODO add your handling code here:
       ValidarSalir();

    }//GEN-LAST:event_VolverAMenuUsuarioMouseClicked

    private void ValidarCierre(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ValidarCierre
        // TODO add your handling code here:
        ValidarSalir();
    }//GEN-LAST:event_ValidarCierre

    public void ventanaVacio() {
        JOptionPane.showMessageDialog(null, "Debe de ingesar un nombre", "Ingrese Nombre", 0);
    }

    public void ValidarSalir() {

        if (areaDeTexto.getText().equalsIgnoreCase(mensajeFinal) || areaDeTexto.getText().isEmpty() || areaDeTexto.getText().isBlank() || areaDeTexto.getText() == null) {
            this.dispose();
            menuUsuario.setVisible(true);

        } else {
            Object[] options = {"SI", "NO"};
            Object c;
            c = JOptionPane.showOptionDialog(null, "             Quieres salir \n(no se guardar el usuario nuevo)", "Cerrar",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, options, options[0]);

            if ((int) c == 0) {
                this.dispose();
                menuUsuario.setVisible(true);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VolverAMenuUsuario;
    private javax.swing.JTextArea areaDeTexto;
    private javax.swing.JButton botonCrear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}