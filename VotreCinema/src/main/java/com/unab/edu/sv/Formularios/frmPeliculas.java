/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Formularios;

import com.unab.edu.sv.DAO.ClsPeliculas;
import com.unab.edu.sv.Entidades.Peliculas;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.naming.ldap.Rdn;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author 14-ck0013lab
 */
public class frmPeliculas extends javax.swing.JFrame {

    /**
     * Creates new form frmPeliculas
     */
    public frmPeliculas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        txtSinopsis.setLineWrap(true);
        txtSinopsis.setWrapStyleWord(true);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(frmPeliculas.class.getName()).log(Level.SEVERE, null, ex);
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

        Tipo = new javax.swing.ButtonGroup();
        Clasificacion = new javax.swing.ButtonGroup();
        panelFondo = new javax.swing.JPanel();
        lblEncabezado = new javax.swing.JLabel();
        lblPelicula = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        lblDuracion = new javax.swing.JLabel();
        lblSinopsis = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        rb3D = new javax.swing.JRadioButton();
        rb2D = new javax.swing.JRadioButton();
        rbTodos = new javax.swing.JRadioButton();
        rbMayoresde15 = new javax.swing.JRadioButton();
        txtSeleccionar = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jdcAnio = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSinopsis = new javax.swing.JTextArea();
        lblPortada = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        rbMayoresde18 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        lblEncabezado.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEncabezado.setText("PELICULAS");
        panelFondo.add(lblEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 654, 70));

        lblPelicula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPelicula.setForeground(new java.awt.Color(255, 255, 255));
        lblPelicula.setText("Pelicula");
        panelFondo.add(lblPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 115, -1, -1));

        txtNombreP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePActionPerformed(evt);
            }
        });
        panelFondo.add(txtNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, 320, -1));

        lblYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblYear.setForeground(new java.awt.Color(255, 255, 255));
        lblYear.setText("Year");
        panelFondo.add(lblYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 216, -1, -1));

        lblDuracion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDuracion.setForeground(new java.awt.Color(255, 255, 255));
        lblDuracion.setText("Duracion");
        panelFondo.add(lblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 265, -1, -1));

        lblSinopsis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSinopsis.setForeground(new java.awt.Color(255, 255, 255));
        lblSinopsis.setText("Sinopsis");
        panelFondo.add(lblSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 317, -1, -1));

        txtDuracion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDuracionKeyReleased(evt);
            }
        });
        panelFondo.add(txtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 320, -1));

        rb3D.setBackground(new java.awt.Color(0, 0, 0));
        Tipo.add(rb3D);
        rb3D.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb3D.setForeground(new java.awt.Color(255, 255, 255));
        rb3D.setText("3D");
        panelFondo.add(rb3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 438, -1, -1));

        rb2D.setBackground(new java.awt.Color(0, 0, 0));
        Tipo.add(rb2D);
        rb2D.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb2D.setForeground(new java.awt.Color(255, 255, 255));
        rb2D.setText("2D");
        panelFondo.add(rb2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 438, -1, -1));

        rbTodos.setBackground(new java.awt.Color(0, 0, 0));
        Clasificacion.add(rbTodos);
        rbTodos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbTodos.setForeground(new java.awt.Color(255, 255, 255));
        rbTodos.setText("Toda la Familia");
        panelFondo.add(rbTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 477, -1, -1));

        rbMayoresde15.setBackground(new java.awt.Color(0, 0, 0));
        Clasificacion.add(rbMayoresde15);
        rbMayoresde15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbMayoresde15.setForeground(new java.awt.Color(255, 255, 255));
        rbMayoresde15.setText("Mayores de 15 años");
        panelFondo.add(rbMayoresde15, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 477, -1, -1));

        txtSeleccionar.setEditable(false);
        txtSeleccionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelFondo.add(txtSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 186, 201, -1));

        btnSeleccionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        panelFondo.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 185, -1, -1));

        btnInsertar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInsertar.setText("Guardar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        panelFondo.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panelFondo.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 520, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelFondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 520, -1, -1));

        jdcAnio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelFondo.add(jdcAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 239, 320, -1));

        txtSinopsis.setColumns(20);
        txtSinopsis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSinopsis.setRows(5);
        jScrollPane1.setViewportView(txtSinopsis);

        panelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 320, -1));

        lblPortada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPortada.setForeground(new java.awt.Color(255, 255, 255));
        lblPortada.setText("portada");
        panelFondo.add(lblPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 162, -1, -1));

        lblImagen.setBackground(new java.awt.Color(0, 0, 0));
        lblImagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        panelFondo.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 115, 260, 347));

        rbMayoresde18.setBackground(new java.awt.Color(0, 0, 0));
        Clasificacion.add(rbMayoresde18);
        rbMayoresde18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbMayoresde18.setForeground(new java.awt.Color(255, 255, 255));
        rbMayoresde18.setText("Mayores de 18 años");
        panelFondo.add(rbMayoresde18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 477, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public int identificador = 0;
    int pelicula = 0;
    int id;
    public byte[] pelic;

    public ArrayList<Peliculas> pel;
    byte[] imagen;

    public void cargartextbox() throws IOException {
        for (var i : pel) {
            txtDuracion.setText(String.valueOf(i.getDuracion()));
            txtNombreP.setText(i.getNombre());
            txtSinopsis.setText(i.getSipnosis());
            if (i.getTipo() == 0) {
                rb2D.setSelected(true);
            } else {
                rb3D.setSelected(true);
            }
            if (i.getClasificacion() == 0) {
                rbTodos.setSelected(true);
            } else if (i.getTipo() == 1) {
                rbMayoresde15.setSelected(true);
            } else {
                rbMayoresde18.setSelected(true);
            }
            jdcAnio.setDate(i.getYear());
            try {
                imagen = i.getPortada();
                BufferedImage image = null;
                InputStream input = new ByteArrayInputStream(imagen);
                image = ImageIO.read(input);
                ImageIcon imag = new ImageIcon(image.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), image.SCALE_DEFAULT));
                lblImagen.setIcon(imag);

            } catch (Exception e) {
            }
            id = i.getIdPelicula();
        }
    }
public void Limpiar(){
txtDuracion.setText(null);
txtNombreP.setText(null);
txtSeleccionar.setText(null);
txtSinopsis.setText(null);
jdcAnio.setDate(null);
identificador=0;
pelicula=0;
imagen=null;
pelic=null;
rb2D.setSelected(false);
rb3D.setSelected(false);
rbMayoresde15.setSelected(false);
rbMayoresde18.setSelected(false);
rbTodos.setSelected(false);
id=0;
lblImagen.setIcon(null);
}

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        radiobutton();

        byte[] icono = null;

        if (identificador == 0) {
            try {
                File ruta = new File(txtSeleccionar.getText());
                icono = new byte[(int) ruta.length()];
                InputStream input = new FileInputStream(ruta);
                input.read(icono);

            } catch (Exception ex) {

                System.out.println(ex);
            }
            if (txtNombreP.getText() == null || txtNombreP.getText() == "" || txtNombreP.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe de asignar un nombre");
                txtNombreP.requestFocus();
            } else {
                if (jdcAnio.getDate() == null || String.valueOf(jdcAnio.getDate()) == "" || String.valueOf(jdcAnio.getDate()).isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe asignar un año");
                    jdcAnio.requestFocus();
                } else {
                    if (txtDuracion.getText() == null || txtDuracion.getText() == "" || txtDuracion.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Debe de asignar una Duracion de la pelicula");
                        txtDuracion.requestFocus();
                    } else {
                        if (txtSinopsis.getText() == null || txtSinopsis.getText() == "" || txtSinopsis.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Debe de agregar una sinopsisi a la pelicula");
                            txtSinopsis.requestFocus();
                        } else {
                            if (tipo == 2) {
                                JOptionPane.showMessageDialog(null, "Debe de asignar el tipo de pelicula");
                                rb3D.requestFocus();
                            } else {
                                if (clasificacion == 3) {
                                    JOptionPane.showMessageDialog(null, "Debe de asignar una clasificacion a la pelicula");
                                    rbTodos.requestFocus();
                                } else {
                                    if (icono.length == 0) {
                                        JOptionPane.showMessageDialog(null, "Debe asignar una imagen");
                                    } else {
                                        Peliculas peli = new Peliculas();
                                        peli.setNombre(txtNombreP.getText());
                                        peli.setPortada(icono);
                                        peli.setDuracion(Double.valueOf(txtDuracion.getText()));
                                        peli.setTipo(tipo);
                                        peli.setClasificacion(clasificacion);
                                        peli.setSipnosis(txtSinopsis.getText());
                                        peli.setYear(jdcAnio.getDate());
                                        ClsPeliculas cls = new ClsPeliculas();
                                        cls.InsertarPelicula(peli);
                                        Inicio.f.cargartabla();
                                        Inicio.f.ajustartabla();
                                        Inicio.f.show();
                                        Limpiar();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (txtNombreP.getText() == null || txtNombreP.getText() == "" || txtNombreP.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe de asignar un nombre");
                txtNombreP.requestFocus();
            } else {
                if (jdcAnio.getDate() == null || String.valueOf(jdcAnio.getDate()) == "" || String.valueOf(jdcAnio.getDate()).isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe asignar un año");
                    jdcAnio.requestFocus();
                } else {
                    if (txtDuracion.getText() == null || txtDuracion.getText() == "" || txtDuracion.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Debe de asignar una Duracion de la pelicula");
                        txtDuracion.requestFocus();
                    } else {
                        if (txtSinopsis.getText() == null || txtSinopsis.getText() == "" || txtSinopsis.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Debe de agregar una sinopsisi a la pelicula");
                            txtSinopsis.requestFocus();
                        } else {
                            if (tipo == 2) {
                                JOptionPane.showMessageDialog(null, "Debe de asignar el tipo de pelicula");
                                rb3D.requestFocus();
                            } else {
                                if (clasificacion == 3) {
                                    JOptionPane.showMessageDialog(null, "Debe de asignar una clasificacion a la pelicula");
                                    rbTodos.requestFocus();
                                } else {
                                    if (pelicula == 0) {

                                        Peliculas pelic = new Peliculas();
                                        pelic.setIdPelicula(id);
                                        pelic.setNombre(txtNombreP.getText());
                                        for (var i : pel) {
                                            pelic.setPortada(i.getPortada());
                                        }
                                        pelic.setDuracion(Double.valueOf(txtDuracion.getText()));
                                        pelic.setTipo(tipo);
                                        pelic.setClasificacion(clasificacion);
                                        pelic.setSipnosis(txtSinopsis.getText());
                                        pelic.setYear(jdcAnio.getDate());
                                        ClsPeliculas cls = new ClsPeliculas();
                                        cls.ActualizarPelicula(pelic);
                                        Inicio.f.cargartabla();
                                        Inicio.f.ajustartabla();
                                        Inicio.f.show();
                                        Limpiar();
                                    } else {
                                        try {
                                            File ruta = new File(txtSeleccionar.getText());
                                            icono = new byte[(int) ruta.length()];
                                            InputStream input = new FileInputStream(ruta);
                                            input.read(icono);

                                        } catch (Exception ex) {

                                            System.out.println(ex);
                                        }
                                        Peliculas pelic = new Peliculas();
                                        pelic.setIdPelicula(id);
                                        pelic.setNombre(txtNombreP.getText());
                                        pelic.setPortada(icono);
                                        pelic.setDuracion(Double.valueOf(txtDuracion.getText()));
                                        pelic.setTipo(tipo);
                                        pelic.setClasificacion(clasificacion);
                                        pelic.setSipnosis(txtSinopsis.getText());
                                        pelic.setYear(jdcAnio.getDate());
                                        ClsPeliculas cls = new ClsPeliculas();
                                        cls.ActualizarPelicula(pelic);
                                        Inicio.f.cargartabla();
                                        Inicio.f.ajustartabla();
                                        Inicio.f.show();
                                        Limpiar();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_btnInsertarActionPerformed
    public void nuevoActualizarOeliminar(int i) {
        if (i == 0) {
            btnEliminar.hide();
            btnInsertar.show();
        } else {
            btnEliminar.show();
            btnInsertar.hide();
        }

    }


    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        JFileChooser j = new JFileChooser();
        j.setDialogTitle("Buscar Imagen");
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG & PNG", "jpg", "png");
        j.setFileFilter(fil);
        int s = j.showOpenDialog(null);
        if (s == JFileChooser.APPROVE_OPTION) {
            String ruta = j.getSelectedFile().getAbsolutePath();
            txtSeleccionar.setText(ruta);
            ImageIcon im = new ImageIcon(ruta);
            Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
            lblImagen.setIcon(icono);
        }
        pelicula = 1;
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void txtDuracionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionKeyReleased
        // TODO add your handling code here:
        try {
            double duracion = Double.valueOf(txtDuracion.getText());
        } catch (Exception e) {
            txtDuracion.setText("");
        }
    }//GEN-LAST:event_txtDuracionKeyReleased

    private void txtNombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Peliculas peli = new Peliculas();
        peli.setIdPelicula(id);
        ClsPeliculas cls = new ClsPeliculas();
        cls.eliminar(peli);
        Inicio.f.cargartabla();
        Inicio.f.ajustartabla();
        Inicio.f.setVisible(true);
        Limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed
    int clasificacion;
    int tipo;

    void radiobutton() {
        if (rb2D.isSelected()) {
            tipo = 0;
        } else if (rb3D.isSelected()) {
            tipo = 1;
        } else {
            tipo = 2;
        }
        if (rbTodos.isSelected()) {
            clasificacion = 0;
        } else if (rbMayoresde15.isSelected()) {
            clasificacion = 1;
        } else if (rbMayoresde18.isSelected()) {
            clasificacion = 2;
        } else {
            clasificacion = 3;
        }
    }

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
            java.util.logging.Logger.getLogger(frmPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPeliculas().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Clasificacion;
    private javax.swing.ButtonGroup Tipo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcAnio;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblEncabezado;
    public javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPelicula;
    private javax.swing.JLabel lblPortada;
    private javax.swing.JLabel lblSinopsis;
    private javax.swing.JLabel lblYear;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JRadioButton rb2D;
    private javax.swing.JRadioButton rb3D;
    private javax.swing.JRadioButton rbMayoresde15;
    private javax.swing.JRadioButton rbMayoresde18;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtSeleccionar;
    private javax.swing.JTextArea txtSinopsis;
    // End of variables declaration//GEN-END:variables
}
