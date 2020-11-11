/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Formularios;

import com.unab.edu.sv.DAO.ClsPersona;
import com.unab.edu.sv.Entidades.Personas;
import com.unab.edu.sv.mysql.conexionBD;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 14-ck0013lab
 */
public class fPersonas extends javax.swing.JInternalFrame {

    /**
     * Creates new form fPersonas
     */
    public fPersonas() {
        initComponents();
        CargarTabla();
        ajustartabla();
        limpiar();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }
    
      public void ajustartabla() {
        // Ocultar la columna del ID de la pelicula
        tbPersonas.getColumnModel().getColumn(0).setMaxWidth(0);
        tbPersonas.getColumnModel().getColumn(0).setMinWidth(0);
        tbPersonas.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tbPersonas.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
      
           //Centrar en texto del encabezado de la tabla
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) tbPersonas.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
          DefaultTableCellRenderer al = new DefaultTableCellRenderer();
        al.setHorizontalAlignment(SwingConstants.CENTER);
        tbPersonas.getColumnModel().getColumn(1).setCellRenderer(al);
        tbPersonas.getColumnModel().getColumn(2).setCellRenderer(al);
        tbPersonas.getColumnModel().getColumn(3).setCellRenderer(al);
        
        
}

    void CargarTabla() {
        String TITULOS[] = {"ID", "Nombres", "Apellidos", "DUI"};
        ClsPersona per = new ClsPersona();
        DefaultTableModel model = new DefaultTableModel(null, TITULOS);
        ArrayList<Personas> person = per.ListaPersonas();
        String filas[] = new String[4];
        for (var i : person) {
            filas[0] = String.valueOf(i.idPersona);
            filas[1] = i.getNombres();
            filas[2] = i.getApellidos();
            filas[3] = i.getDUI();
            model.addRow(filas);
        }
        tbPersonas.setModel(model);

    }
    
     void limpiar() {
        txtApellido.setText("");
        txtDui.setText("");
        txtNombres.setText("");
        estado = 0;
        id = 0;

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
        jPanel2 = new javax.swing.JPanel();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblDUI = new javax.swing.JLabel();
        txtDui = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        TABLA = new javax.swing.JScrollPane();
        tbPersonas = new javax.swing.JTable();
        lblEncabezado = new javax.swing.JLabel();

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setOpaque(false);

        lblNombres.setBackground(new java.awt.Color(51, 51, 51));
        lblNombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres.setText("Nombres");

        txtNombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setText("Apellidos");

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblDUI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDUI.setForeground(java.awt.Color.white);
        lblDUI.setText("DUI");

        txtDui.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombres)
                            .addComponent(txtApellido)
                            .addComponent(txtDui)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 8, Short.MAX_VALUE)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(lblDUI))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(lblApellidos))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(lblNombres)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblApellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblDUI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        tbPersonas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int collIndex){
                return false;
            }
        };
        tbPersonas.setBackground(new java.awt.Color(0, 0, 0));
        tbPersonas.setForeground(java.awt.Color.white);
        tbPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPersonas.setCellSelectionEnabled(true);
        tbPersonas.setGridColor(new java.awt.Color(0, 0, 0));
        tbPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPersonasMouseClicked(evt);
            }
        });
        TABLA.setViewportView(tbPersonas);

        lblEncabezado.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEncabezado.setText("PERSONAS");

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(TABLA, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblEncabezado)
                .addGap(42, 42, 42)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(139, Short.MAX_VALUE))
                    .addComponent(TABLA, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(2, 2, 2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int estado = 0;
    int id = 0;
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (estado == 0) {

            Personas per = new Personas();
            per.setNombres(txtNombres.getText());
            per.setApellidos(txtApellido.getText());
            per.setDUI(txtDui.getText());
            ClsPersona cls = new ClsPersona();
            if (txtDui.getText() == "" || txtDui.getText().isEmpty() || txtDui.getText() == null || txtApellido.getText() == ""
                || txtApellido.getText().isEmpty() || txtApellido.getText() == null || txtNombres.getText() == "" || txtNombres.getText().isEmpty() || txtNombres.getText() == null) {
                JOptionPane.showMessageDialog(null, "todos los campos son obligatorios");
            } else {
                cls.AgregarPersona(per);
                limpiar();
                CargarTabla();
                ajustartabla();
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Personas p = new Personas();
        ClsPersona cls = new ClsPersona();
        p.setIdPersona(id);
        cls.EliminarPersonas(p);
        CargarTabla();
        ajustartabla() ;
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tbPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPersonasMouseClicked
        // TODO add your handling code here:
        int fila = tbPersonas.getSelectedRow();
        id = Integer.valueOf(String.valueOf(tbPersonas.getValueAt(fila, 0)));
        String nombre = String.valueOf(tbPersonas.getValueAt(fila, 1));
        String apellido = String.valueOf(tbPersonas.getValueAt(fila, 2));
        String Dui = String.valueOf(tbPersonas.getValueAt(fila, 3));
        estado = 1;
        txtApellido.setText(apellido);
        txtDui.setText(Dui);
        txtNombres.setText(nombre);
    }//GEN-LAST:event_tbPersonasMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TABLA;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblDUI;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tbPersonas;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
