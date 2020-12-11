/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Formularios;

import com.unab.edu.sv.DAO.ClsAsientos;
import com.unab.edu.sv.DAO.ClsCarteleras;
import com.unab.edu.sv.DAO.ClsPrecios;
import com.unab.edu.sv.DAO.ClsProductos;
import com.unab.edu.sv.DAO.ClsProveedores;
import com.unab.edu.sv.Entidades.Asientos;
import com.unab.edu.sv.Entidades.Carteleras;
import com.unab.edu.sv.Entidades.Precios;
import com.unab.edu.sv.Entidades.Productos;
import com.unab.edu.sv.Entidades.Proveedores;
import com.unab.edu.sv.Entidades.Render;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class fFacturas extends javax.swing.JInternalFrame {

    /**
     * Creates new form fFacturas
     */
    public fFacturas() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        Date fecha = new Date();
        jDateFecha.setDate(fecha);
        Calendar fechamaxima = Calendar.getInstance();
        fechamaxima.setTime(fecha);
        fechamaxima.add(Calendar.DAY_OF_MONTH, 8);
        this.jDateFecha.getDateEditor().setEnabled(false);
        this.jDateFecha.setSelectableDateRange(fecha, fechamaxima.getTime());
        CargarDatos();
        CargarTablaCarteleras();
        ajustartablaProducto();
        DefaultComboBoxModel Defaultcombobox = new DefaultComboBoxModel<>();
        Defaultcombobox.addElement("");
        cmbAsientos.setModel(Defaultcombobox);
    }

    public void ajustartablaProducto() {
        // Ocultar la columna del ID de la pelicula
        tbProducto.getColumnModel().getColumn(0).setMaxWidth(0);
        tbProducto.getColumnModel().getColumn(0).setMinWidth(0);
        tbProducto.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tbProducto.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        tbCarteleras.getColumnModel().getColumn(0).setMaxWidth(0);
        tbCarteleras.getColumnModel().getColumn(0).setMinWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        tbCarteleras.getColumnModel().getColumn(1).setMaxWidth(0);
        tbCarteleras.getColumnModel().getColumn(1).setMinWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(1).setMinWidth(0);
        //Centrar en texto del encabezado de la tabla
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) tbProducto.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer al = new DefaultTableCellRenderer();
        al.setHorizontalAlignment(SwingConstants.CENTER);
        tbProducto.getColumnModel().getColumn(1).setCellRenderer(al);
        tbProducto.getColumnModel().getColumn(2).setCellRenderer(al);
        tbProducto.getColumnModel().getColumn(3).setCellRenderer(al);

        DefaultTableCellRenderer rend = (DefaultTableCellRenderer) tbCarteleras.getTableHeader().getDefaultRenderer();
        rend.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer alinear = new DefaultTableCellRenderer();
        al.setHorizontalAlignment(SwingConstants.CENTER);
        tbCarteleras.getColumnModel().getColumn(2).setCellRenderer(alinear);
        tbCarteleras.getColumnModel().getColumn(3).setCellRenderer(alinear);
        tbCarteleras.getColumnModel().getColumn(4).setCellRenderer(alinear);
        tbCarteleras.getColumnModel().getColumn(5).setCellRenderer(alinear);
    }

    void CargarDatos() {
        String[] Titulos = {"ID", "PRODUCTO", "PRECIO", "CANTIDAD"};
        ClsProductos cls = new ClsProductos();
        DefaultTableModel model = new DefaultTableModel(null, Titulos);
        Productos p = new Productos();
        p.setNombre(txtBuscarProducto.getText());
        ArrayList<Productos> lista = cls.BuscarProductos(p);
        String fila[] = new String[6];
        for (var i : lista) {
            fila[0] = String.valueOf(i.getIdProductos());
            fila[1] = i.getNombreprod();
            fila[2] = String.valueOf(i.getPrecio());
            fila[3] = String.valueOf(i.getCantidad());
            fila[4] = String.valueOf(i.getIdProveedor());
            fila[5] = i.getNombre();
            model.addRow(fila);

        }

        tbProducto.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupPrecios = new javax.swing.ButtonGroup();
        panelFondo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txtBuscarProducto = new javax.swing.JTextField();
        TABLA = new javax.swing.JScrollPane();
        tbProducto = new javax.swing.JTable();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        TABLA1 = new javax.swing.JScrollPane();
        tbCarteleras = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        txtBuscarCarteleras = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblPrecios = new javax.swing.JLabel();
        lblAsientos = new javax.swing.JLabel();
        cmbAsientos = new javax.swing.JComboBox<>();
        rbtnChild = new javax.swing.JRadioButton();
        rbtnEstudiantes = new javax.swing.JRadioButton();
        rbtnAdultos = new javax.swing.JRadioButton();
        rbtnAdultosM = new javax.swing.JRadioButton();

        setPreferredSize(new java.awt.Dimension(893, 663));

        panelFondo.setBackground(new java.awt.Color(0, 255, 51));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 102));

        txtBuscarProducto.setBackground(new java.awt.Color(0, 0, 0));
        txtBuscarProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarProducto.setBorder(null);
        txtBuscarProducto.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyReleased(evt);
            }
        });

        tbProducto = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int collIndex){
                return false;
            }
        };
        tbProducto.setBackground(new java.awt.Color(0, 0, 0));
        tbProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbProducto.setForeground(new java.awt.Color(255, 255, 255));
        tbProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        tbProducto.setCellSelectionEnabled(true);
        tbProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbProducto.setGridColor(new java.awt.Color(255, 255, 255));
        tbProducto.setShowGrid(true);
        tbProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductoMouseClicked(evt);
            }
        });
        TABLA.setViewportView(tbProducto);

        jDateFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateFechaPropertyChange(evt);
            }
        });

        tbCarteleras = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int collIndex){
                return false;
            }
        };
        tbCarteleras.setBackground(new java.awt.Color(0, 0, 0));
        tbCarteleras.setForeground(java.awt.Color.white);
        tbCarteleras.setModel(new javax.swing.table.DefaultTableModel(
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
        tbCarteleras.setCellSelectionEnabled(true);
        tbCarteleras.setGridColor(new java.awt.Color(255, 255, 255));
        tbCarteleras.setShowGrid(true);
        tbCarteleras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCartelerasMouseClicked(evt);
            }
        });
        TABLA1.setViewportView(tbCarteleras);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 102));

        txtBuscarCarteleras.setBackground(new java.awt.Color(0, 0, 0));
        txtBuscarCarteleras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscarCarteleras.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarCarteleras.setBorder(null);
        txtBuscarCarteleras.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBuscarCarteleras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCartelerasActionPerformed(evt);
            }
        });
        txtBuscarCarteleras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarCartelerasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCartelerasKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/buscarb.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/buscarb.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 102, 204));

        lblPrecios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecios.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecios.setText("PRECIOS");

        lblAsientos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAsientos.setForeground(new java.awt.Color(255, 255, 255));
        lblAsientos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAsientos.setText("ASIENTOS");

        cmbAsientos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        rbtnChild.setBackground(new java.awt.Color(0, 0, 0));
        GroupPrecios.add(rbtnChild);
        rbtnChild.setForeground(new java.awt.Color(255, 255, 255));
        rbtnChild.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbtnChild.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        rbtnEstudiantes.setBackground(new java.awt.Color(0, 0, 0));
        GroupPrecios.add(rbtnEstudiantes);
        rbtnEstudiantes.setForeground(new java.awt.Color(255, 255, 255));
        rbtnEstudiantes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbtnEstudiantes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        rbtnAdultos.setBackground(new java.awt.Color(0, 0, 0));
        GroupPrecios.add(rbtnAdultos);
        rbtnAdultos.setForeground(new java.awt.Color(255, 255, 255));
        rbtnAdultos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbtnAdultos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        rbtnAdultosM.setBackground(new java.awt.Color(0, 0, 0));
        GroupPrecios.add(rbtnAdultosM);
        rbtnAdultosM.setForeground(new java.awt.Color(255, 255, 255));
        rbtnAdultosM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbtnAdultosM.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(lblAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnChild, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnAdultosM)
                            .addComponent(rbtnEstudiantes)
                            .addComponent(rbtnAdultos))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecios)
                    .addComponent(lblAsientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnChild))
                .addGap(10, 10, 10)
                .addComponent(rbtnEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(rbtnAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(rbtnAdultosM, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(txtBuscarCarteleras, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(TABLA1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(TABLA, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarCarteleras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(TABLA, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TABLA1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(347, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarCartelerasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCartelerasKeyReleased
        // TODO add your handling code here:
        CargarTablaCarteleras();
        ajustartablaProducto();
        contador = 1;
        id = 0;
        displaymember();
    }//GEN-LAST:event_txtBuscarCartelerasKeyReleased

    private void txtBuscarCartelerasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCartelerasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCartelerasKeyPressed

    private void txtBuscarCartelerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCartelerasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCartelerasActionPerformed

    private void tbCartelerasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCartelerasMouseClicked
        // TODO add your handling code here:
        GroupPrecios.clearSelection();
        int fila = tbCarteleras.getSelectedRow();
        id = Integer.valueOf(String.valueOf(tbCarteleras.getValueAt(fila, 0)));
        int idPelicula = Integer.valueOf(String.valueOf(tbCarteleras.getValueAt(fila, 6)));
        contador = 1;
        displaymember();
        ClsPrecios precios = new ClsPrecios();
        Precios pre = new Precios();
        pre.setIdPelicula(idPelicula);
        ArrayList<Precios> p = precios.CargarLista(pre);
        for (var i : p) {

            if (i.getTipo() == 0) {
                rbtnAdultos.setText("$"+String.valueOf(i.getPrecios())+" Adultos");

            } else if (i.getTipo() == 1) {
                rbtnChild.setText("$"+String.valueOf(i.getPrecios()) +" Niños");
                rbtnChild.setEnabled(true);

            } else if (i.getTipo() == 2) {
                rbtnEstudiantes.setText("$"+String.valueOf(i.getPrecios())+" Estudiantes");
            } else if (i.getTipo() == 3) {
                rbtnAdultosM.setText("$"+String.valueOf(i.getPrecios())+" Adultos mayores");
            }

            if (p.size() == 3) {
                rbtnChild.setText("No disponible");
                rbtnChild.setEnabled(false);
            }
        }
    }//GEN-LAST:event_tbCartelerasMouseClicked

    private void jDateFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateFechaPropertyChange
        // TODO add your handling code here:
        CargarTablaCarteleras();
        ajustartablaProducto();
    }//GEN-LAST:event_jDateFechaPropertyChange

    private void tbProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductoMouseClicked

    }//GEN-LAST:event_tbProductoMouseClicked

    private void txtBuscarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyReleased
        // TODO add your handling code here:
        CargarDatos();
        ajustartablaProducto();
    }//GEN-LAST:event_txtBuscarProductoKeyReleased

    private void txtBuscarProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarProductoKeyPressed
    int id;

    public void CargarTablaCarteleras() {
        String TITULOS[] = {"ID", "PORTADA", "PELICULA", "HORA", "SALA", "TIPO", "Id pelicula"};
        DefaultTableModel model = new DefaultTableModel(null, TITULOS);
        tbCarteleras.setDefaultRenderer(Object.class, new Render());
        ClsCarteleras cls = new ClsCarteleras();
        Carteleras Cartelera = new Carteleras();
        Cartelera.setNombre(txtBuscarCarteleras.getText());
        Cartelera.setFecha(jDateFecha.getDate());
        ArrayList<Carteleras> lista = cls.BuscarDatos(Cartelera);
        Object filas[] = new Object[10];
        SimpleDateFormat formato = new SimpleDateFormat("d MMM y");
        for (var i : lista) {
            filas[0] = i.getIdcartelera();
            try {
                // Cargar la imagen en formato byte
                byte[] bi = i.getPortada();
                BufferedImage image = null;
                InputStream in = new ByteArrayInputStream(bi);
                image = ImageIO.read(in);
                //La imagen redimencionarla al tamaño que se mostrara en la jTable
                ImageIcon imgi = new ImageIcon(image.getScaledInstance(180, 300, Image.SCALE_SMOOTH));
                filas[1] = new JLabel(imgi);

            } catch (Exception e) {
                filas[1] = new JLabel("No hay imagen");
            }
            filas[2] = "<HTML>" + "<p align=\"justify\">" + i.getNombre() + "</HTML>";
            filas[3] = "<HTML>" + "<p align=\"justify\">" + i.getHoraInicio() + "</HTML>";
            filas[4] = "<HTML>" + "<p align=\"justify\">" + i.getNumero_sala() + "</HTML>";

            if (i.getTipo() == 0) {
                filas[5] = "<HTML>" + "<p align=\"justify\">" + "2D" + "</HTML>";
            } else if (i.getTipo() == 1) {
                filas[5] = "<HTML>" + "<p align=\"justify\">" + "3D" + "</HTML>";
            }
            filas[6] = i.getIdPelicula();
            model.addRow(filas);

        }
        tbCarteleras.setModel(model);
    }
    String valuemember[];
    int contador = 1;

    void displaymember() {
        DefaultComboBoxModel Defaultcombobox = new DefaultComboBoxModel<>();
        ClsAsientos cls = new ClsAsientos();
        Asientos as = new Asientos();
        as.setIdcartelera(id);
        ArrayList<Asientos> asientos = cls.CargarAsientos(as);
        valuemember = new String[asientos.size() + 1];
        String filas[] = new String[5];
        Defaultcombobox.addElement("");

        for (var i : asientos) {
            filas[0] = String.valueOf(i.getId_Asiento());
            filas[1] = String.valueOf(i.getNumero());
            valuemember[contador] = filas[0];
            Defaultcombobox.addElement(filas[1]);
            contador++;
        }
        cmbAsientos.setModel(Defaultcombobox);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupPrecios;
    private javax.swing.JScrollPane TABLA;
    private javax.swing.JScrollPane TABLA1;
    private javax.swing.JComboBox<String> cmbAsientos;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAsientos;
    private javax.swing.JLabel lblPrecios;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JRadioButton rbtnAdultos;
    private javax.swing.JRadioButton rbtnAdultosM;
    private javax.swing.JRadioButton rbtnChild;
    private javax.swing.JRadioButton rbtnEstudiantes;
    private javax.swing.JTable tbCarteleras;
    private javax.swing.JTable tbProducto;
    private javax.swing.JTextField txtBuscarCarteleras;
    private javax.swing.JTextField txtBuscarProducto;
    // End of variables declaration//GEN-END:variables
}
