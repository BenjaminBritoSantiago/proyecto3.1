/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ipc1.proyecto2.graficos;

/**
 *
 * @author minch
 */
public class MenuUsuario extends javax.swing.JFrame {

    /**
     * Creates new form MenuDeJuegos
     */
    
    public static String ruta ="C:\\Users\\minch\\Documents" ;
    
    public MenuUsuario() {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        crearUsuario = new javax.swing.JButton();
        elegirUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ReporteDamas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        crearUsuario.setText("CREAR USUARIO");
        crearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearUsuarioMouseClicked(evt);
            }
        });
        crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(crearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        elegirUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        elegirUsuario.setText("ELEGIR USUARIO");
        elegirUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elegirUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(elegirUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("MENU INICIAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        ReporteDamas.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        ReporteDamas.setText("Reportes Damas");
        ReporteDamas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteDamasMouseClicked(evt);
            }
        });
        jPanel1.add(ReporteDamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearUsuarioActionPerformed

    private void crearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearUsuarioMouseClicked
        // TODO add your handling code here:
        CrearUsuario nuevoU = new CrearUsuario(this);
        nuevoU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearUsuarioMouseClicked

    private void elegirUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elegirUsuarioMouseClicked
        // TODO add your handling code here:
        ElegirUsuario usuarios = new ElegirUsuario(this);
        usuarios.setVisible(true);
        this.setVisible(false);
         /**
        MenuJuegos juegos = new MenuJuegos(this);
        juegos.setVisible(true);
        this.setVisible(false);
        juegos.setDefaultCloseOperation(juegos.EXIT_ON_CLOSE);
        * */
    }//GEN-LAST:event_elegirUsuarioMouseClicked

    private void ReporteDamasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteDamasMouseClicked
        // TODO add your handling code here:
        ReportesDamas reporte = new ReportesDamas(this);
        reporte.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ReporteDamasMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReporteDamas;
    private javax.swing.JButton crearUsuario;
    private javax.swing.JButton elegirUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
