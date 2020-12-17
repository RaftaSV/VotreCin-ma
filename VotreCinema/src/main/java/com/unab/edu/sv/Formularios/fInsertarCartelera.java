/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Formularios;

import com.unab.edu.sv.DAO.ClsCarteleras;
import com.unab.edu.sv.DAO.ClsHorarios;
import com.unab.edu.sv.DAO.ClsPeliculas;
import com.unab.edu.sv.DAO.ClsProductos;
import com.unab.edu.sv.DAO.ClsSalas;
import com.unab.edu.sv.Entidades.Carteleras;
import com.unab.edu.sv.Entidades.Horarios;
import com.unab.edu.sv.Entidades.Salas;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class fInsertarCartelera extends javax.swing.JFrame {

    /**
     * Creates new form fInsertarCartelera
     */
    public fInsertarCartelera() {
        initComponents();
        Date fecha = new Date();
        jdcFecha.setDate(fecha);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        displaymember();

    }

    public int idpelicula;
    public int idhorario;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        cmbsala = new javax.swing.JComboBox<>();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        cmbsala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbsala.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbsalaItemStateChanged(evt);
            }
        });
        cmbsala.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                cmbsalaVetoableChange(evt);
            }
        });

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

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbsala, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
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
                            .addComponent(cmbsala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
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
                        .addGap(31, 31, 31)
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

    public int indicador = 0;
    int id = 0;
    frmLogin l = new frmLogin();
    frmBuscarPelicula buscar = new frmBuscarPelicula();
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (indicador == 0) {
            if (txtpelicula.getText() == "" || txtpelicula.getText() == null || txtpelicula.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe asignar una pelicula");
                txtpelicula.requestFocus();
            } else {
                if (Integer.valueOf(cmbsala.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "Debe de asignar una cartelera");
                    cmbsala.requestFocus();

                } else {
                    if (Integer.valueOf(cmbhorario.getSelectedIndex()) == 0) {
                        JOptionPane.showMessageDialog(null, "Debe de asignar una cartelera");
                        cmbhorario.requestFocus();

                    } else {
                        Carteleras cart = new Carteleras();
                        cart.setIdPelicula(idpelicula);
                        cart.setFecha(jdcFecha.getDate());
                        cart.setId_Sala(Integer.parseInt(valuemember[cmbsala.getSelectedIndex()]));
                        cart.setId_Horario(Integer.parseInt(valuemembe[cmbhorario.getSelectedIndex()]));
                        ClsCarteleras cls = new ClsCarteleras();
                        cls.InsertarCartelera(cart);
                        l.principal.cartelera.CargarTabla();
                       l.principal.cartelera.ajustartabla();
                        Limpiar();
                        this.dispose();

                    }
                }
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    public void Limpiar() {
    txtpelicula.setText(null);
    jdcFecha.setDate(null);
    cmbsala.setSelectedIndex(0);
    cmbhorario.setSelectedIndex(0);
    lblPelicula.setIcon(null);
    indicador = 0;
    id=0;
        
    }
    
    private void btnSeleccionarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarPActionPerformed
        // TODO add your handling code here:
        buscar.setVisible(true);
    }//GEN-LAST:event_btnSeleccionarPActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        displaymembe();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cmbhorarioVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_cmbhorarioVetoableChange
        // TODO add your handling code here:
        displaymembe();

    }//GEN-LAST:event_cmbhorarioVetoableChange

    private void cmbhorarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbhorarioItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbhorarioItemStateChanged

    private void jdcFechaVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jdcFechaVetoableChange


    }//GEN-LAST:event_jdcFechaVetoableChange

    private void jdcFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaPropertyChange
        // TODO add your handling code here:
        contado = 1;
        listahora.removeAllElements();

        displaymembe();


    }//GEN-LAST:event_jdcFechaPropertyChange

    private void cmbsalaVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_cmbsalaVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsalaVetoableChange

    private void cmbsalaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbsalaItemStateChanged

        if (evt.getStateChange() == evt.SELECTED) {
            contado = 1;
            listahora.removeAllElements();
            displaymembe();
        }
    }//GEN-LAST:event_cmbsalaItemStateChanged

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnEliminarActionPerformed
    String valuemember[];
    int contador = 1;

    void displaymember() {
        DefaultComboBoxModel Defaultcombobox = new DefaultComboBoxModel<>();
        ClsSalas cls = new ClsSalas();
        ArrayList<Salas> sala = cls.MostrarSalas();
        valuemember = new String[sala.size() + 1];
        String filas[] = new String[5];
        Defaultcombobox.addElement("");

        for (var i : sala) {
            filas[0] = String.valueOf(i.getIdSala());
            filas[1] = String.valueOf(i.getNumero_Sala());
            valuemember[contador] = filas[0];
            Defaultcombobox.addElement(filas[1]);
            contador++;
        }
        cmbsala.setModel(Defaultcombobox);
    }
    String valuemembe[];
    int contado = 1;
    DefaultComboBoxModel listahora = new DefaultComboBoxModel<>();

    void displaymembe() {
        if (indicador == 0) {
            try {
                Horarios horari = new Horarios();
                horari.setFecha(jdcFecha.getDate());
                horari.setIds(Integer.parseInt(valuemember[cmbsala.getSelectedIndex()]));

                String DisplayMenber[] = new String[5];
                ClsHorarios cls = new ClsHorarios();
                listahora.addElement("");
                ArrayList<Horarios> horario = cls.cargarHora(horari);
                valuemembe = new String[horario.size() + 1];
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
                    valuemembe[contado] = filas[0];
                    listahora.addElement(filas[1]);
                    contado++;

                }
                cmbhorario.setModel(listahora);
            } catch (Exception e) {
                listahora.addElement("");
                cmbhorario.setModel(listahora);
            }
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
            java.util.logging.Logger.getLogger(fInsertarCartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fInsertarCartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fInsertarCartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fInsertarCartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fInsertarCartelera().setVisible(true);
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
