/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ipc1.proyecto2.graficos;

import com.ipc1.proyecto2.Proyecto2;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author minch
 */
public class ElegirUsuario extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form NewJFrame
     */
    private MenuUsuario menuUsuario = new MenuUsuario();
    private JButton[] users = new JButton[Proyecto2.getUsuarios().length];
    private boolean eligio = false;

    public ElegirUsuario(MenuUsuario menuUsuario) {
        initComponents();
        mostrarUsuarios();
        this.menuUsuario = menuUsuario;
        this.setLocationRelativeTo(null);
    }

    public void mostrarUsuarios() {
        for (int i = 0; i < Proyecto2.getUsuarios().length; i++) {
            if ( /*Proyecto2.getUsuarios()[i] != null*/true) {

                users[i] = new JButton("Holas" /*Proyecto2.getUsuarios()[i].getNombre()*/);
                this.add(users[i]);
                users[i].setOpaque(true);
                users[i].setBackground(Color.WHITE);
                //users[i].setContentAreaFilled(false);
                users[i].setBounds(200, 100 + (i * 32), 300, 30);
                users[i].addActionListener(this);
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ElegirSalir = new javax.swing.JButton();
        VolverMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("ELIGE UN USUARIO");

        ElegirSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ElegirSalir.setText("ELEGIR");
        ElegirSalir.setPreferredSize(new java.awt.Dimension(120, 31));
        ElegirSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElegirSalirMouseClicked(evt);
            }
        });

        VolverMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        VolverMenu.setText("Volver al menu");
        VolverMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(246, 246, 246))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(ElegirSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VolverMenu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(VolverMenu)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 428, Short.MAX_VALUE)
                .addComponent(ElegirSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ElegirSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElegirSalirMouseClicked
        // TODO add your handling code here:
        if (eligio) {
            
            MenuJuegos juegos = new MenuJuegos( menuUsuario);
            juegos.setVisible(true);
            juegos.setDefaultCloseOperation(juegos.EXIT_ON_CLOSE);
            dispose();

        } else {
            ventanaNoEligio();
        }
    }//GEN-LAST:event_ElegirSalirMouseClicked

    private void VolverMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMenuMouseClicked
        // TODO add your handling code here:
        dispose();
        menuUsuario.setVisible(true);


    }//GEN-LAST:event_VolverMenuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ElegirSalir;
    private javax.swing.JButton VolverMenu;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object queUsuario = e.getSource();

        for (int i = 0; i < Proyecto2.getUsuarios().length; i++) {
            if (queUsuario == users[i]) {
                if (users[i].getText() != null) {
                    Proyecto2.setUsuario(Proyecto2.getUsuarios()[i]);
                    System.out.println("Ususario Eligio pulso>:" + users[i].getText());
                    PintarElegido(i);
                    eligio = true;
                    break;
                }
            }
        }
    }

    public void PintarElegido(int i) {

        for (int x = 0; x < Proyecto2.getUsuarios().length; x++) {
            users[x].setBackground(Color.WHITE);
        }
        users[i].setBackground(Color.LIGHT_GRAY);

    }

    public void ventanaNoEligio() {
        JOptionPane.showMessageDialog(null, "Debe de elegir un usuario", "Elige Usuario", 0);
    }

}
