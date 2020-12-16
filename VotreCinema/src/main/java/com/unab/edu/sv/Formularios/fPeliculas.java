/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Formularios;

import com.unab.edu.sv.Entidades.Render;
import com.unab.edu.sv.DAO.ClsPeliculas;
import com.unab.edu.sv.Entidades.Peliculas;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Rafael
 */
public class fPeliculas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Peliculas
     */
    public fPeliculas() {
        initComponents();
        cargartabla();
        ajustartabla();

        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        tbPeliculas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        btnNuevo.setBackground(new java.awt.Color(255, 255, 102));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelfondo = new javax.swing.JPanel();
        lblEncabezado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPeliculas = new javax.swing.JTable();

        panelfondo.setBackground(new java.awt.Color(0, 0, 0));

        lblEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        lblEncabezado.setFont(new java.awt.Font("Algerian_R", 1, 60)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEncabezado.setText("PELICULAS");

        jPanel1.setBackground(java.awt.Color.black);

        btnEditar.setBackground(new java.awt.Color(255, 255, 102));
        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 102));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(255, 255, 102));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setText("NUEVA");
        btnNuevo.setBorderPainted(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnEliminar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevo)))
        );

        tbPeliculas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int collIndex){
                return false;
            }
        };
        tbPeliculas.setBackground(new java.awt.Color(0, 0, 0));
        tbPeliculas.setForeground(new java.awt.Color(255, 255, 255));
        tbPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPeliculas.setGridColor(new java.awt.Color(255, 255, 255));
        tbPeliculas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbPeliculas.setShowGrid(true);
        tbPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPeliculasMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbPeliculasMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbPeliculas);

        javax.swing.GroupLayout panelfondoLayout = new javax.swing.GroupLayout(panelfondo);
        panelfondo.setLayout(panelfondoLayout);
        panelfondoLayout.setHorizontalGroup(
            panelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelfondoLayout.createSequentialGroup()
                        .addGap(0, 510, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelfondoLayout.setVerticalGroup(
            panelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      SimpleDateFormat formato = new SimpleDateFormat("d MMM y");
    SimpleDateFormat formatohora = new SimpleDateFormat("hh:mm");

    public void ajustartabla() {
        // Ocultar la columna del ID de la pelicula
        tbPeliculas.getColumnModel().getColumn(0).setMaxWidth(0);
        tbPeliculas.getColumnModel().getColumn(0).setMinWidth(0);
        tbPeliculas.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tbPeliculas.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        //Centrar en texto del encabezado de la tabla
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) tbPeliculas.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        //Centrar el contenido de la tabla
        DefaultTableCellRenderer al = new DefaultTableCellRenderer();
        al.setHorizontalAlignment(SwingConstants.CENTER);
        tbPeliculas.getColumnModel().getColumn(0).setCellRenderer(al);
        tbPeliculas.getColumnModel().getColumn(2).setCellRenderer(al);
        tbPeliculas.getColumnModel().getColumn(3).setCellRenderer(al);
        tbPeliculas.getColumnModel().getColumn(4).setCellRenderer(al);
        tbPeliculas.getColumnModel().getColumn(5).setCellRenderer(al);
        tbPeliculas.getColumnModel().getColumn(6).setCellRenderer(al);
        //Ajustar el tamaño de la celdas
        TableColumn columna1;
        columna1 = tbPeliculas.getColumnModel().getColumn(1);
        columna1.setPreferredWidth(150);
        tbPeliculas.setRowHeight(320);
        tbPeliculas.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbPeliculas.getColumnModel().getColumn(4).setPreferredWidth(80);
        tbPeliculas.getColumnModel().getColumn(4).setMaxWidth(90);
        TableColumn columna6;
        columna6 = tbPeliculas.getColumnModel().getColumn(6);
        columna6.setPreferredWidth(40);
        columna6.setMaxWidth(60);
        TableColumn columna7;
        columna7 = tbPeliculas.getColumnModel().getColumn(7);
        columna7.setPreferredWidth(200);
        // Alinear el texto de la sinopsis arriba al inicio de la celda
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        Alinear.setVerticalAlignment(SwingConstants.TOP);
        tbPeliculas.getColumnModel().getColumn(7).setCellRenderer(Alinear);

    }

    public void cargartabla() {
        String[] Titulos = {"ID", "PORTADA", "NOMBRE", "FECHA DE ESTRENO", "DURACION", "CLASIFICACION", "TIPO", "SINOPSIS"};
        DefaultTableModel modelo = new DefaultTableModel(null, Titulos);
        tbPeliculas.setDefaultRenderer(Object.class, new Render());
        ClsPeliculas cls = new ClsPeliculas();
        ArrayList<Peliculas> lista = cls.ListaPeliculas();
        Object fila[] = new Object[8];
        for (var i : lista) {
            fila[0] = "<HTML>" + "<p align=\"justify\">" + i.getIdPelicula() + "</HTML>";
            try {
                // Cargar la imagen en formato byte
                byte[] bi = i.getPortada();
                BufferedImage image = null;
                InputStream in = new ByteArrayInputStream(bi);
                image = ImageIO.read(in);
                //La imagen redimencionarla al tamaño que se mostrara en la jTable
                ImageIcon imgi = new ImageIcon(image.getScaledInstance(180, 300, Image.SCALE_SMOOTH));
                fila[1] = new JLabel(imgi);

            } catch (Exception e) {
                fila[1] = new JLabel("No hay imagen");
            }
            // En las jTables se puede utilizar codigo html, en este caso estamos alineando el texto 
            // a justicifado
            fila[2] = "<HTML>" + "<p align=\"justify\">" + i.getNombre() + "</HTML>";
            fila[3] = "<HTML>" + "<p align=\"justify\">" + String.valueOf(formato.format(i.getYear())) + "</HTML>";
            fila[4] = "<HTML>" + "<p align=\"justify\">" + i.getDuracion() + "</HTML>";
            if (i.getClasificacion() == 0) {
                fila[5] = "<HTML>" + "<p align=\"justify\">" + "Para toda la familia" + "</HTML>";
            } else if (i.getClasificacion() == 1) {
                fila[5] = "<HTML>" + "<p align=\"justify\">" + "Para mayores de 15 años" + "</HTML>";
            } else if (i.getClasificacion() == 2) {
                fila[5] = "<HTML>" + "<p align=\"justify\">" + "Para mayores de 18 años" + "</HTML>";
            }
            if (i.getTipo() == 0) {
                fila[6] = "<HTML>" + "<p align=\"justify\">" + "2D" + "</HTML>";
            } else if (i.getTipo() == 1) {
                fila[6] = "<HTML>" + "<p align=\"justify\">" + "3D" + "</HTML>";
            }

            fila[7] = "<HTML>" + "<p align=\"justify\">" + i.getSipnosis() + "</HTML>";
            modelo.addRow(fila);
        }
        tbPeliculas.setModel(modelo);

    }
    public frmPeliculas f = new frmPeliculas();
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        f.nuevoActualizarOeliminar(0);
        f.show();
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        f.nuevoActualizarOeliminar(1);
        f.show();
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPeliculasMouseClicked

    }//GEN-LAST:event_tbPeliculasMouseClicked

    private void tbPeliculasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPeliculasMouseReleased
        // TODO add your handling code here:
        int fila = tbPeliculas.getSelectedRow();
        String idd = String.valueOf(tbPeliculas.getValueAt(fila, 0));
        // Reemplazamos el codigo html por caracteres en blanco, para poder acceder al ID de la pelicula.
        String idreemplazo = idd.replaceAll("<HTML>", "").replaceAll("<p align=\"justify\">", "").replaceAll("</HTML>", "");
        int id = Integer.valueOf(idreemplazo);
        // Creamos un procedimieno para buscar la pelicula por ID y luego en el formulario
        // peliculas  poder hacer la edicion o eliminacion de la pelicula.
        ClsPeliculas cls = new ClsPeliculas();
        Peliculas p = new Peliculas();
        p.setIdPelicula(id);
        ArrayList<Peliculas> pelicula = cls.ListaPeliculasedi(p);
        f.pel = pelicula;
        try {
            f.cargartextbox();
        } catch (IOException ex) {

        }
        f.identificador = 1;
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_tbPeliculasMouseReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        f.nuevoActualizarOeliminar(0);
        f.Limpiar();

        f.show();
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JPanel panelfondo;
    private javax.swing.JTable tbPeliculas;
    // End of variables declaration//GEN-END:variables
}
