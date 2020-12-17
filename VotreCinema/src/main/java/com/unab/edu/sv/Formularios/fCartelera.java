/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Formularios;

import com.unab.edu.sv.DAO.*;

import com.unab.edu.sv.Entidades.Carteleras;
import com.unab.edu.sv.Entidades.Horarios;
import com.unab.edu.sv.Entidades.Render;
import com.unab.edu.sv.Entidades.Salas;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
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

        tbCarteleras.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    frmLogin l = new frmLogin();

    public void ajustartabla() {
        // Ocultar la columna del ID de la pelicula
        tbCarteleras.getColumnModel().getColumn(0).setMaxWidth(0);
        tbCarteleras.getColumnModel().getColumn(0).setMinWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        tbCarteleras.getColumnModel().getColumn(10).setMaxWidth(0);
        tbCarteleras.getColumnModel().getColumn(10).setMinWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(10).setMaxWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(10).setMinWidth(0);
        tbCarteleras.getColumnModel().getColumn(11).setMaxWidth(0);
        tbCarteleras.getColumnModel().getColumn(11).setMinWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(11).setMaxWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(11).setMinWidth(0);
        tbCarteleras.getColumnModel().getColumn(12).setMaxWidth(0);
        tbCarteleras.getColumnModel().getColumn(12).setMinWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(12).setMaxWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(12).setMinWidth(0);
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
        columna1.setPreferredWidth(170);
        tbCarteleras.setRowHeight(320);
        tbCarteleras.setRowHeight(320);
        tbCarteleras.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbCarteleras.getColumnModel().getColumn(4).setPreferredWidth(55);
        tbCarteleras.getColumnModel().getColumn(4).setMaxWidth(55);
        tbCarteleras.getColumnModel().getColumn(5).setPreferredWidth(50);
        tbCarteleras.getColumnModel().getColumn(5).setMaxWidth(50);
        tbCarteleras.getColumnModel().getColumn(7).setPreferredWidth(60);
        tbCarteleras.getColumnModel().getColumn(7).setMaxWidth(60);
        TableColumn columna9;
        columna9 = tbCarteleras.getColumnModel().getColumn(9);
        columna9.setPreferredWidth(40);
        columna9.setMaxWidth(40);
        TableColumn columna8;
        columna8 = tbCarteleras.getColumnModel().getColumn(8);
        columna8.setPreferredWidth(200);

        // Alinear el texto de la sinopsis arriba al inicio de la celda
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        Alinear.setVerticalAlignment(SwingConstants.TOP);
        tbCarteleras.getColumnModel().getColumn(8).setCellRenderer(Alinear);

    }

    public void CargarTabla() {
        String TITULOS[] = {"ID", "PORTADA", "PELICULA", "FECHA", "HORA", "SALA", "DURACION", "PRECIO", "SINOPSIS", "TIPO", "IDPELICULA", "IDHORARIO", "IDSALA"};
        DefaultTableModel model = new DefaultTableModel(null, TITULOS);
        tbCarteleras.setDefaultRenderer(Object.class, new Render());
        ClsCarteleras cls = new ClsCarteleras();
        ArrayList<Carteleras> lista = cls.CargarDatos();
        Object filas[] = new Object[13];
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
            filas[3] = "<HTML>" + "<p align=\"justify\">" + formato.format(i.getFecha()) + "</HTML>";
            filas[4] = "<HTML>" + "<p align=\"justify\">" + i.getHoraInicio() + "</HTML>";
            filas[5] = "<HTML>" + "<p align=\"justify\">" + i.getNumero_sala() + "</HTML>";
            filas[6] = "<HTML>" + "<p align=\"justify\">" + i.getDuracion() + "</HTML>";
            filas[7] = "<HTML>" + "<p align=\"justify\">" + "$" + i.getPrecio() + "0" + "</HTML>";
            filas[8] = "<HTML>" + "<p align=\"justify\">" +  i.getSipnosis() + "</HTML>";
            if (i.getTipo() == 0) {
                filas[9] = "<HTML>" + "<p align=\"justify\">" + "2D" + "</HTML>";
            } else if (i.getTipo() == 1) {
                filas[9] = "<HTML>" + "<p align=\"justify\">" + "3D" + "</HTML>";
            }
            filas[10] = i.getIdPelicula();
            filas[11] = i.getId_Horario();
            filas[12] = i.getId_Sala();
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
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCarteleras = new javax.swing.JTable();

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        lblEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        lblEncabezado.setFont(new java.awt.Font("Algerian_R", 1, 58)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEncabezado.setText("Carteleras");

        btnNuevo.setBackground(new java.awt.Color(255, 255, 102));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorderPainted(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 102));
        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorderPainted(false);
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 102));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tbCarteleras = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int collIndex){
                return false;
            }
        };
        tbCarteleras.setBackground(java.awt.Color.black);
        tbCarteleras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbCarteleras.setForeground(new java.awt.Color(255, 255, 255));
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
        ));
        tbCarteleras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCartelerasMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbCartelerasMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbCarteleras);

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(lblEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addGap(25, 25, 25))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEncabezado)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnEditar)
                            .addComponent(btnEliminar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );

        getContentPane().add(panelFondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public fActualizarCarteleras insertar = new fActualizarCarteleras();

    public fInsertarCartelera insertarpelicula = new fInsertarCartelera();
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        insertarpelicula.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed


    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        l.principal.cerrar = 8;
        l.principal.Mostrar();
        insertar.btnEliminar.setEnabled(false);
        insertar.btnGuardar.setEnabled(true);
        insertar.setVisible(true);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        btnEliminar.setEnabled(false);
        l.principal.cerrar = 8;
        l.principal.Mostrar();
        insertar.btnEliminar.setEnabled(true);
        insertar.btnGuardar.setEnabled(false);
        insertar.setVisible(true);
        btnEditar.setEnabled(false);

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbCartelerasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCartelerasMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tbCartelerasMouseClicked

    private void tbCartelerasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCartelerasMouseReleased

        int id;
        Date fechaa = null;
        int fila = tbCarteleras.getSelectedRow();
        String idc = String.valueOf(tbCarteleras.getValueAt(fila, 0));
        JLabel j = (JLabel) tbCarteleras.getModel().getValueAt(fila, 1);
        Icon imgi = j.getIcon();
        id = Integer.valueOf(idc);
        String pelicula = String.valueOf(tbCarteleras.getValueAt(fila, 2));
        pelicula = pelicula.replaceAll("<HTML>", "").replaceAll("<p align=\"justify\">", "").replaceAll("</HTML>", "");
        String fecha = String.valueOf(tbCarteleras.getValueAt(fila, 3));
        fecha = fecha.replaceAll("<HTML>", "").replaceAll("<p align=\"justify\">", "").replaceAll("</HTML>", "");
        SimpleDateFormat formato = new SimpleDateFormat("d MMM y");
        try {
            fechaa = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(fCartelera.class.getName()).log(Level.SEVERE, null, ex);
        }
        String peliculaid = String.valueOf(tbCarteleras.getValueAt(fila, 10));
        String idhora = String.valueOf(tbCarteleras.getValueAt(fila, 11));
        String idsala = String.valueOf(tbCarteleras.getValueAt(fila, 12));

        insertar.id = id;
        insertar.lblPelicula.setIcon(imgi);
        insertar.txtpelicula.setText(pelicula);
        insertar.jdcFecha.setDate(fechaa);

        {
            // Cargar y asignar el id de la sal
            String valuemember[];
            int contador = 1;
            ClsSalas cls = new ClsSalas();
            ArrayList<Salas> sala = cls.MostrarSalas();
            valuemember = new String[sala.size() + 1];
            String filas[] = new String[5];

            for (var i : sala) {
                filas[0] = String.valueOf(i.getIdSala());
                valuemember[contador] = filas[0];
                contador++;
            }
            int selectvista = 0;
            for (var iterar : valuemember) {
                if (idsala.equals(iterar)) {
                    insertar.displaymember();
                    insertar.cmbsala.setSelectedIndex(selectvista);

                }
                selectvista += 1;
            }
        }
        int select = 0;
        {
            //cargar y asignar el id del h

            String valuemembe[];
            int contado = 1;
            String DisplayMenber[] = new String[5];
            ClsHorarios clshorario = new ClsHorarios();

            ArrayList<Horarios> horario = clshorario.cargarHorarios();
            valuemembe = new String[horario.size() + 1];
            String filass[] = new String[5];
            for (var i : horario) {
                filass[0] = String.valueOf(i.getIdHorario());
                valuemembe[contado] = filass[0];
                contado++;
            }

            for (var iterar : valuemembe) {
                if (idhora.equals(iterar)) {
                    insertar.horarios();
                    insertar.cmbhorario.setSelectedIndex(select);
                }
                select += 1;
            }

        }
        insertar.idpelicula = Integer.parseInt(peliculaid);

        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);

    }//GEN-LAST:event_tbCartelerasMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tbCarteleras;
    // End of variables declaration//GEN-END:variables
}
