/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Formularios;

import com.unab.edu.sv.DAO.ClsLogin;
import com.unab.edu.sv.DAO.ClsRoles;
import com.unab.edu.sv.Entidades.Roles;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarRegistro();

    }

    void cargarRegistro() {
        try {
            ClsRoles rol = new ClsRoles();
            ArrayList<Roles> roll = rol.MostrarRoles();
            if (roll.size() > 0) {
                lblRegistro.setVisible(false);
            } else {
                lblRegistro.setVisible(true);
            }

        } catch (Exception e) {
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

        panelFondo = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        lblRegistro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblVer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout());

        panelFondo.setBackground(new java.awt.Color(0, 153, 153));

        txtUsuario.setBackground(new java.awt.Color(0, 153, 153));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtUsuario.setBorder(null);

        txtPass.setBackground(new java.awt.Color(0, 153, 153));
        txtPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPass.setBorder(null);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblUsuario.setText("Usuario");

        lblpass.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblpass.setText("Pass");

        btnIngresar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        lblRegistro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRegistro.setText("Nuevo? aqui puedes registrarte");
        lblRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroMouseClicked(evt);
            }
        });

        lblVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ojo.png"))); // NOI18N
        lblVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(533, 533, 533)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(lblRegistro)
                        .addContainerGap())
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnIngresar)
                                .addGap(107, 107, 107))
                            .addComponent(txtPass)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVer)
                        .addGap(56, 56, 56))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addComponent(lblpass, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblpass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPass)
                    .addComponent(lblVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnIngresar)
                .addGap(18, 18, 18)
                .addComponent(lblRegistro)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        getContentPane().add(panelFondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    public static frmPrincipal principal = new frmPrincipal();
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        ClsLogin log = new ClsLogin();
        String usu = txtUsuario.getText();
        String pass = txtPass.getText();

        var resutadoCon = log.Rol(usu, pass);

        if (!usu.isEmpty() && !pass.isEmpty()) {
            if (resutadoCon == true) {
                JOptionPane.showMessageDialog(null, "Wellcome " + txtUsuario.getText());
                this.dispose();
                String usuario = "Usuario: "+txtUsuario.getText();
                usuario=usuario.toUpperCase();
                principal.lblUsuario.setText(usuario);
                principal.id=log.id;
                principal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Close");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked
        frmInsertUser user = new frmInsertUser();
        user.setVisible(true);
    }//GEN-LAST:event_lblRegistroMouseClicked

    int ver = 0;
    private void lblVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerMouseClicked
        // TODO add your handling code here:
        if (ver == 0) {
            txtPass.setEchoChar((char)0);
            lblVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ciego.png")));
            ver = 1;
        } else {
            ver=0;
            txtPass.setEchoChar('*');
            lblVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ojo.png")));
        }
    }//GEN-LAST:event_lblVerMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblVer;
    private javax.swing.JLabel lblpass;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
