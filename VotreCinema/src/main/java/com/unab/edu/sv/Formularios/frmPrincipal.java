/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Formularios;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
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
        panelBarra = new javax.swing.JPanel();
        btnCerrarMenu = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        btnProveedores = new javax.swing.JButton();
        btnPeliculas = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnRoles = new javax.swing.JButton();
        btnPersonas = new javax.swing.JButton();
        panelcontenedor = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));
        panelFondo.setMaximumSize(new java.awt.Dimension(0, 0));
        panelFondo.setMinimumSize(new java.awt.Dimension(0, 0));

        panelBarra.setBackground(new java.awt.Color(255, 204, 51));

        btnCerrarMenu.setBackground(new java.awt.Color(204, 0, 0));
        btnCerrarMenu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCerrarMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrarMenu.setText("X");
        btnCerrarMenu.setOpaque(true);
        btnCerrarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addComponent(btnCerrarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        panelMenu.setBackground(new java.awt.Color(153, 204, 0));

        btnProveedores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnProveedores.setText("PROVEEDORES");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        btnPeliculas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPeliculas.setText("PELICULAS");
        btnPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeliculasActionPerformed(evt);
            }
        });

        btnProductos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnProductos.setText("PRODUCTOS");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnRoles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRoles.setText("ROLES");
        btnRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRolesActionPerformed(evt);
            }
        });

        btnPersonas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPersonas.setText("PERSONAS");
        btnPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPeliculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRoles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
            .addComponent(btnPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(btnPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelcontenedor.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout panelcontenedorLayout = new javax.swing.GroupLayout(panelcontenedor);
        panelcontenedor.setLayout(panelcontenedorLayout);
        panelcontenedorLayout.setHorizontalGroup(
            panelcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );
        panelcontenedorLayout.setVerticalGroup(
            panelcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelcontenedor))
            .addComponent(panelBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelcontenedor)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int ocultarMenu = 0;
    private void btnCerrarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMenuMouseClicked
        // TODO add your handling code here:
        if (ocultarMenu == 0) {
            panelMenu.setVisible(false);
            ocultarMenu = 1;
        } else {
            panelMenu.setVisible(true);
            ocultarMenu = 0;
        }
    }//GEN-LAST:event_btnCerrarMenuMouseClicked
    public int cerrar = 0;

    public void cerrar() {
        if (cerrar == 1) {
            try {
                proveedor.dispose();
            } catch (Exception e) {
            }
            try {
                producto.dispose();
            } catch (Exception e) {
            }
            try {
                rol.dispose();
            } catch (Exception e) {
            }
            try {
                persona.dispose();
            } catch (Exception e) {
            }
            if (pelicula == null || pelicula.isClosed()) {
                pelicula = new fPeliculas();
                panelcontenedor.add(pelicula);
                pelicula.setVisible(true);
                try {
                    pelicula.setMaximum(true);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            if (cerrar == 2) {
                try {
                    pelicula.dispose();

                } catch (Exception e) {
                }
                try {
                    proveedor.dispose();
                } catch (Exception e) {
                }
                try {

                } catch (Exception e) {
                }
                try {
                    rol.dispose();
                } catch (Exception e) {
                }
                try {
                    persona.dispose();
                } catch (Exception e) {
                }
                if (producto == null || producto.isClosed()) {
                    producto = new fProductos();
                    panelcontenedor.add(producto);
                    producto.setVisible(true);
                    try {
                        producto.setMaximum(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                if (cerrar == 3) {
                    try {
                        producto.dispose();

                    } catch (Exception e) {
                    }
                    try {
                        pelicula.dispose();
                    } catch (Exception e) {
                    }
                    try {
                        rol.dispose();
                    } catch (Exception e) {
                    }
                    try {
                        persona.dispose();
                    } catch (Exception e) {
                    }
                    if (proveedor == null || proveedor.isClosed()) {
                        proveedor = new fProveedores();
                        panelcontenedor.add(proveedor);
                        proveedor.setVisible(true);
                        try {
                            proveedor.setMaximum(true);
                        } catch (PropertyVetoException ex) {
                            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

                } else {
                    if (cerrar == 4) {
                        try {
                            producto.dispose();

                        } catch (Exception e) {
                        }
                        try {
                            pelicula.dispose();
                        } catch (Exception e) {
                        }
                        try {
                            proveedor.dispose();
                        } catch (Exception e) {
                        }
                        try {
                            persona.dispose();
                        } catch (Exception e) {
                        }
                        if (rol == null || rol.isClosed()) {
                            rol = new fRoles();
                            try {
                                rol.setMaximum(true);
                            } catch (Exception e) {
                            }
                            panelcontenedor.add(rol);
                            rol.setVisible(true);
                        }

                    } else {
                        if (cerrar == 5) {
                            try {
                                producto.dispose();

                            } catch (Exception e) {
                            }
                            try {
                                pelicula.dispose();
                            } catch (Exception e) {
                            }
                            try {
                                proveedor.dispose();
                            } catch (Exception e) {
                            }
                            try {
                                rol.dispose();
                            } catch (Exception e) {
                            }
                            if (persona == null || persona.isClosed()) {
                                persona = new fPersonas();
                                try {
                                    persona.setMaximum(true);
                                } catch (Exception e) {
                                }
                                panelcontenedor.add(persona);
                                persona.setVisible(true);
                            }
                        }
                    }

                }
            }
        }
    }
    public  fPeliculas pelicula;
    private void btnPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeliculasActionPerformed
        cerrar = 1;
        cerrar();


    }//GEN-LAST:event_btnPeliculasActionPerformed
    public fProveedores proveedor;
    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        cerrar = 3;
        cerrar();


    }//GEN-LAST:event_btnProveedoresActionPerformed
    public fProductos producto;
    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        cerrar = 2;
        cerrar();

    }//GEN-LAST:event_btnProductosActionPerformed
    public fRoles rol;
    private void btnRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRolesActionPerformed
        // TODO add your handling code here:
        cerrar = 4;
        cerrar();
    }//GEN-LAST:event_btnRolesActionPerformed
    public fPersonas persona;
    private void btnPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonasActionPerformed
        // TODO add your handling code here:
        cerrar = 5;
        cerrar();
    }//GEN-LAST:event_btnPersonasActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrarMenu;
    private javax.swing.JButton btnPeliculas;
    private javax.swing.JButton btnPersonas;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRoles;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JDesktopPane panelcontenedor;
    // End of variables declaration//GEN-END:variables
}
