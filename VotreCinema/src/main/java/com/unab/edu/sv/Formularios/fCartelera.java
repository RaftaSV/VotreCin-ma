/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Formularios;

import com.unab.edu.sv.DAO.ClsCarteleras;
import com.unab.edu.sv.DAO.ClsSalas;
import com.unab.edu.sv.Entidades.Carteleras;
import com.unab.edu.sv.Entidades.Render;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Rafael
 */
public class fCartelera extends javax.swing.JInternalFrame {

    /**
     * Creates new form fCartelera
     */
    public fCartelera() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        CargarTabla();
        ajustartabla();
    }
        public void ajustartabla() {
        // Ocultar la columna del ID de la pelicula
        tbCarteleras.getColumnModel().getColumn(0).setMaxWidth(0);
        tbCarteleras.getColumnModel().getColumn(0).setMinWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        //Centrar en texto del encabezado de la tabla
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) tbCarteleras.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        //Centrar el contenido de la tabla
        DefaultTableCellRenderer al = new DefaultTableCellRenderer();
        al.setHorizontalAlignment(SwingConstants.CENTER);
        tbCarteleras.getColumnModel().getColumn(0).setCellRenderer(al);
        tbCarteleras.getColumnModel().getColumn(2).setCellRenderer(al);
        tbCarteleras.getColumnModel().getColumn(3).setCellRenderer(al);
        tbCarteleras.getColumnModel().getColumn(4).setCellRenderer(al);
        tbCarteleras.getColumnModel().getColumn(5).setCellRenderer(al);
        tbCarteleras.getColumnModel().getColumn(6).setCellRenderer(al);
        tbCarteleras.getColumnModel().getColumn(7).setCellRenderer(al);
        tbCarteleras.getColumnModel().getColumn(9).setCellRenderer(al);
        //Ajustar el tamaño de la celdas para mostrar la portada de la pelicula
        TableColumn columna1;
        columna1 = tbCarteleras.getColumnModel().getColumn(1);
        columna1.setPreferredWidth(150);
        tbCarteleras.setRowHeight(320);
   
        // Alinear el texto de la sinopsis arriba al inicio de la celda
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        Alinear.setVerticalAlignment(SwingConstants.TOP);
        tbCarteleras.getColumnModel().getColumn(8).setCellRenderer(Alinear);

    }

    public void CargarTabla() {
        String TITULOS[] = {"ID", "PORTADA", "PELICULA", "FECHA", "HORA", "SALA", "DURACION", "PRECIO", "SINOPSIS", "TIPO"};
        DefaultTableModel model = new DefaultTableModel(null, TITULOS);
        tbCarteleras.setDefaultRenderer(Object.class, new Render());
        ClsCarteleras cls = new ClsCarteleras();
        ArrayList<Carteleras> lista = cls.CargarDatos();
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
            filas[2] = "<HTML>" + "<p align=\"justify\">" + i.getNombre()+ "</HTML>";
            filas[3] = "<HTML>" + "<p align=\"justify\">" + formato.format(i.getFecha())+ "</HTML>";
            filas[4] = "<HTML>" + "<p align=\"justify\">" + i.getHoraInicio()+ "</HTML>";
            filas[5] = "<HTML>" + "<p align=\"justify\">" + i.getNumero_sala()+ "</HTML>";
            filas[6] = "<HTML>" + "<p align=\"justify\">" + i.getDuracion()+ "</HTML>";
            filas[7] = "<HTML>" + "<p align=\"justify\">" +  "$" + i.getPrecio()+"0"+ "</HTML>";
            filas[8] = "<HTML>" + "<p align=\"justify\">" +  "$" + i.getSipnosis()+ "</HTML>";
            if (i.getTipo() == 0) {
                filas[9] = "<HTML>" + "<p align=\"justify\">" + "2D" + "</HTML>";
            } else if (i.getTipo() == 1) {
                filas[9] = "<HTML>" + "<p align=\"justify\">" + "3D" + "</HTML>";
            }
            model.addRow(filas);

        }
        tbCarteleras.setModel(model);
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
        lblEncabezado = new javax.swing.JLabel();
        TABLA = new javax.swing.JScrollPane();
        tbCarteleras = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        lblEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        lblEncabezado.setFont(new java.awt.Font("Algerian_R", 1, 58)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEncabezado.setText("Carteleras");

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
        TABLA.setViewportView(tbCarteleras);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo)
                .addContainerGap())
            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelFondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(TABLA, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEncabezado)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnNuevo)))
                .addContainerGap(390, Short.MAX_VALUE))
            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelFondoLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(TABLA, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(panelFondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int id;
    private void tbCartelerasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCartelerasMouseClicked
        // TODO add your handling code here:
        int fila = tbCarteleras.getSelectedRow();
        id = Integer.valueOf(String.valueOf(tbCarteleras.getValueAt(fila, 0)));

    }//GEN-LAST:event_tbCartelerasMouseClicked
public  fInsertarCartelera insertar = new fInsertarCartelera();
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        insertar.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TABLA;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tbCarteleras;
    // End of variables declaration//GEN-END:variables
}
