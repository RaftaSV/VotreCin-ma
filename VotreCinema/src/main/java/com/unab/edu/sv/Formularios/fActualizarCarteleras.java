/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Formularios;

import com.unab.edu.sv.DAO.*;
import com.unab.edu.sv.Entidades.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class fActualizarCarteleras extends javax.swing.JFrame {

    /**
     * Creates new form fActualizarCarteleras
     */
    public fActualizarCarteleras() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
    frmLogin l = new frmLogin();
    frmBuscarPelicula buscar = new frmBuscarPelicula();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        cmbhorario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPelicula = new javax.swing.JLabel();
        txtpelicula = new javax.swing.JTextField();
        btnSeleccionarP = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cmbsala = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        cmbhorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbhorario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbhorarioItemStateChanged(evt);
            }
        });
        cmbhorario.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                cmbhorarioVetoableChange(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha");

        jdcFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaPropertyChange(evt);
            }
        });
        jdcFecha.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jdcFechaVetoableChange(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("sala");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Horario");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pelicula");

        lblPelicula.setText("jLabel5");
        lblPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtpelicula.setEditable(false);
        txtpelicula.setBackground(new java.awt.Color(0, 0, 0));
        txtpelicula.setForeground(new java.awt.Color(255, 255, 255));
        txtpelicula.setBorder(null);
        txtpelicula.setCaretColor(new java.awt.Color(255, 255, 255));

        btnSeleccionarP.setBackground(new java.awt.Color(255, 255, 102));
        btnSeleccionarP.setText("seleccionar");
        btnSeleccionarP.setBorderPainted(false);
        btnSeleccionarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarPActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 102));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 102));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Algerian_R", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CARTELERA");

        cmbsala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(btnLimpiar))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbhorario, 0, 276, Short.MAX_VALUE)
                                    .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                    .addComponent(cmbsala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtpelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(jSeparator1))
                                .addGap(21, 21, 21)
                                .addComponent(btnSeleccionarP)))
                        .addGap(28, 28, 28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeleccionarP))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbsala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbhorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnLimpiar)
                            .addComponent(btnGuardar))
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbhorarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbhorarioItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbhorarioItemStateChanged

    private void cmbhorarioVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_cmbhorarioVetoableChange
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbhorarioVetoableChange

    private void jdcFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaPropertyChange

    }//GEN-LAST:event_jdcFechaPropertyChange

    private void jdcFechaVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jdcFechaVetoableChange

    }//GEN-LAST:event_jdcFechaVetoableChange

    private void btnSeleccionarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarPActionPerformed
        // TODO add your handling code here:
        buscar.indicador = 1;
        buscar.setVisible(true);
        displaymember();
    }//GEN-LAST:event_btnSeleccionarPActionPerformed
    String valuemembe[];
    public int contador = 1;
    public int idsala;
    public int idhorario;

    public void displaymember() {
        DefaultComboBoxModel Defaultcombobox = new DefaultComboBoxModel<>();
        ClsSalas cls = new ClsSalas();
        ArrayList<Salas> sala = cls.MostrarSalas();
        valuemembe = new String[sala.size() + 1];
        String filas[] = new String[5];
        Defaultcombobox.addElement("");

        for (var i : sala) {
            filas[0] = String.valueOf(i.getIdSala());
            filas[1] = String.valueOf(i.getNumero_Sala());
            valuemembe[contador] = filas[0];
            Defaultcombobox.addElement(filas[1]);
            contador++;
        }
        cmbsala.setModel(Defaultcombobox);

    }

    String valuemember[];
    int contado = 1;
    DefaultComboBoxModel listahora = new DefaultComboBoxModel<>();
    int idpelicula;

    public void horarios() {
        String DisplayMenber[] = new String[5];
        ClsHorarios cls = new ClsHorarios();
        listahora.addElement("");
        ArrayList<Horarios> horario = cls.cargarHorarios();
        valuemember = new String[horario.size() + 1];
        String filas[] = new String[5];
        for (var i : horario) {
            filas[0] = String.valueOf(i.getIdHorario());
            String hora = String.valueOf(i.getHoraInicio());
            String Minuto = hora.substring(3, 5);
            String horass = hora.substring(0, 2);

            int c = Integer.valueOf(horass);
            if (c < 12) {
                if (c == 9) {
                    filas[1] = String.valueOf(c + ":" + Minuto + " am");
                } else {
                    filas[1] = String.valueOf(c + ":" + Minuto + " am");
                }

            } else if (c == 12) {
                filas[1] = String.valueOf(c + ":" + Minuto + " pm");
            } else {
                int h = c - 12;
                filas[1] = String.valueOf(h + ":" + Minuto + " pm");
            }
            valuemember[contado] = filas[0];
            listahora.addElement(filas[1]);
            contado++;

        }
        cmbhorario.setModel(listahora);

    }
    int id;
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (Integer.valueOf(cmbsala.getSelectedIndex()) == 0) {
            JOptionPane.showMessageDialog(null, "Debe de asignar una cartelera");
            cmbsala.requestFocus();

        } else {
            if (Integer.valueOf(cmbhorario.getSelectedIndex()) == 0) {
                JOptionPane.showMessageDialog(null, "Debe de asignar una cartelera");
                cmbhorario.requestFocus();

            } else {
                Carteleras cart = new Carteleras();
                cart.setIdcartelera(id);
                cart.setIdPelicula(idpelicula);
                cart.setFecha(jdcFecha.getDate());
                cart.setId_Sala(Integer.parseInt(valuemembe[cmbsala.getSelectedIndex()]));
                cart.setId_Horario(Integer.parseInt(valuemember[cmbhorario.getSelectedIndex()]));
                ClsCarteleras cls = new ClsCarteleras();
                cls.ActualizarCartelera(cart);
                System.out.println(cart);
                l.principal.cartelera.CargarTabla();
                l.principal.cartelera.ajustartabla();
                this.dispose();

            }
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (id != 0) {
            Carteleras c = new Carteleras();
            c.setIdcartelera(id);
            ClsCarteleras cls = new ClsCarteleras();
            cls.EliminarCartelera(c);
            l.principal.cartelera.CargarTabla();
            this.dispose();

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(fActualizarCarteleras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fActualizarCarteleras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fActualizarCarteleras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fActualizarCarteleras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fActualizarCarteleras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSeleccionarP;
    public javax.swing.JComboBox<String> cmbhorario;
    public javax.swing.JComboBox<String> cmbsala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    public com.toedter.calendar.JDateChooser jdcFecha;
    public javax.swing.JLabel lblPelicula;
    private javax.swing.JPanel panelFondo;
    public static javax.swing.JTextField txtpelicula;
    // End of variables declaration//GEN-END:variables
}
