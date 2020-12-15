/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Formularios;

import com.unab.edu.sv.DAO.ClsHorarios;
import com.unab.edu.sv.Entidades.Horarios;
import java.sql.Time;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class fHorarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form fHorarios
     */
    public fHorarios() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        cargarCombo();
        cargarTabla();
        ajustartabla();
        lectura();
        tbHorarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
    int id = 0;
    int contador = 1;
    public int edicion = 0;
    
    public void lectura() {
        if (edicion == 0) {
            panelCRUD.setVisible(false);
            btnLectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/editar.png")));
            edicion = 1;
        } else {
            panelCRUD.setVisible(true);
            btnLectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/lectura.png")));
            edicion = 0;
        }
        Limpiar();
    }
    
    public void cargarCombo() {
        DefaultComboBoxModel listahora = new DefaultComboBoxModel<>();
        
        String DisplayMenber[] = new String[1];
        listahora.addElement("00");
        for (int i = 9; i < 23; i++) {
            
            if (i < 12) {
                if (i == 9) {
                    DisplayMenber[0] = String.valueOf("0" + i + " am");
                } else {
                    DisplayMenber[0] = String.valueOf(i + " am");
                }
                
            } else if (i == 12) {
                DisplayMenber[0] = String.valueOf(i + " pm");
            } else {
                if (contador < 10) {
                    DisplayMenber[0] = String.valueOf("0" + contador + " pm");
                    contador++;
                } else {
                    DisplayMenber[0] = String.valueOf(contador + " pm");
                    contador++;
                }
            }
            listahora.addElement(DisplayMenber[0]);
        }
        cmbHoras.setModel(listahora);
        DefaultComboBoxModel listaminutos = new DefaultComboBoxModel<>();
        
        listaminutos.addElement("00");
        for (int i = 1; i <= 60; i++) {
            if (i < 10) {
                listaminutos.addElement("0" + i);
            } else {
                listaminutos.addElement(i);
            }
        }
        cmbMinutos.setModel(listaminutos);
    }
    
    public void ajustartabla() {
        // Ocultar la columna del ID de horarios tbHorarios.getColumnModel().getColumn(0).setMaxWidth(0);
        tbHorarios.getColumnModel().getColumn(0).setMinWidth(0);
        tbHorarios.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tbHorarios.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        //cocultando columna hora
        tbHorarios.getColumnModel().getColumn(2).setMaxWidth(0);
        tbHorarios.getColumnModel().getColumn(2).setMinWidth(0);
        tbHorarios.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(0);
        tbHorarios.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);

        //Centrar en texto del encabezado de la tabla
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) tbHorarios.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        //Centrar el contenido de la tabla
        DefaultTableCellRenderer al = new DefaultTableCellRenderer();
        al.setHorizontalAlignment(SwingConstants.CENTER);
        tbHorarios.getColumnModel().getColumn(1).setCellRenderer(al);
    }
    
    public void cargarTabla() {
        String hora;
        String horass;
        String Minuto = null;
        int h = 0;
        
        String[] Titulos = {"ID", "HORA DE INICIO", "hora"};
        DefaultTableModel modelo = new DefaultTableModel(null, Titulos);
        ClsHorarios cls = new ClsHorarios();
        ArrayList<Horarios> hor = cls.cargarHorarios();
        String[] horario = new String[3];
        
        for (var i : hor) {
            horario[0] = String.valueOf(i.getIdHorario());
            hora = String.valueOf(i.getHoraInicio());
            horass = hora.substring(0, 2);
            if (horass.equals("00")) {
                h = 0;
            } else {
                String horaR = horass.replaceAll("0", "");
                h = Integer.valueOf(horaR);
                
            }
            Minuto = hora.substring(3, 5);
            
            if (h == 12) {
                horario[1] = String.valueOf((h) + ":" + Minuto + " PM");
            } else if (h > 12) {
                horario[1] = String.valueOf((h - 12) + ":" + Minuto + " PM");
                
            } else {
                horario[1] = String.valueOf(h + ":" + Minuto + " AM");
            }
            horario[2] = String.valueOf(i.getHoraInicio());
            modelo.addRow(horario);
            
        }
        tbHorarios.setModel(modelo);
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
        tbHorarios = new javax.swing.JTable();
        panelCRUD = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cmbHoras = new javax.swing.JComboBox<>();
        cmbMinutos = new javax.swing.JComboBox<>();
        lblHora = new javax.swing.JLabel();
        lblMinuto = new javax.swing.JLabel();
        btnLectura = new javax.swing.JLabel();

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));
        panelFondo.setForeground(new java.awt.Color(255, 255, 255));

        lblEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        lblEncabezado.setFont(new java.awt.Font("Algerian_R", 1, 48)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEncabezado.setText("horarios");

        tbHorarios = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int collIndex){
                return false;
            }
        };
        tbHorarios.setBackground(java.awt.Color.black);
        tbHorarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbHorarios.setForeground(new java.awt.Color(255, 255, 255));
        tbHorarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tbHorarios.setCellSelectionEnabled(true);
        tbHorarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbHorarios.setGridColor(new java.awt.Color(255, 255, 255));
        tbHorarios.setShowGrid(true);
        tbHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHorariosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbHorariosMouseReleased(evt);
            }
        });
        TABLA.setViewportView(tbHorarios);

        panelCRUD.setBackground(new java.awt.Color(0, 0, 0));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 102));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setOpaque(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 102));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setOpaque(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 102));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setOpaque(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cmbHoras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbMinutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbMinutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("Hora");

        lblMinuto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMinuto.setForeground(new java.awt.Color(255, 255, 255));
        lblMinuto.setText("Minutos");

        javax.swing.GroupLayout panelCRUDLayout = new javax.swing.GroupLayout(panelCRUD);
        panelCRUD.setLayout(panelCRUDLayout);
        panelCRUDLayout.setHorizontalGroup(
            panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDLayout.createSequentialGroup()
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar))
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(cmbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(cmbMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelCRUDLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinuto)
                .addGap(61, 61, 61))
        );
        panelCRUDLayout.setVerticalGroup(
            panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCRUDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHora, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMinuto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        btnLectura.setForeground(new java.awt.Color(204, 255, 255));
        btnLectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/lectura.png"))); // NOI18N
        btnLectura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLectura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLecturaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(TABLA, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(lblEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLectura)
                        .addContainerGap())))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLectura)
                    .addComponent(lblEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TABLA, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(panelCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbHorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHorariosMouseClicked
        

    }//GEN-LAST:event_tbHorariosMouseClicked
    int indicador = 0;
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (indicador == 0) {
            if (cmbHoras.getSelectedIndex() != 0) {
                String horas = String.valueOf(cmbHoras.getSelectedIndex());
                String minutos = String.valueOf(cmbMinutos.getSelectedIndex());
                int ho = Integer.valueOf(horas) + 8;
                String hora = (ho + ":" + minutos);
                Horarios horario = new Horarios();
                horario.setHoraInicio(Time.valueOf(hora + ":00"));
                
                System.out.println(horario);
                ClsHorarios cls = new ClsHorarios();
                cls.InsertarHorario(horario);
                cargarTabla();
                ajustartabla();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una hora");
            }
        } else {
            if (cmbHoras.getSelectedIndex() != 0) {
                String horas = String.valueOf(cmbHoras.getSelectedIndex());
                String minutos = String.valueOf(cmbMinutos.getSelectedIndex());
                int ho = Integer.valueOf(horas) + 8;
                String hora = (ho + ":" + minutos);
                Horarios horar = new Horarios();
                horar.setIdHorario(id);
                horar.setHoraInicio(Time.valueOf(hora + ":00"));
                
                ClsHorarios cls = new ClsHorarios();
                cls.ActualizarHorario(horar);
                cargarTabla();
                ajustartabla();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una hora");
            }
            
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Horarios horario = new Horarios();
        horario.setIdHorario(id);
        ClsHorarios cls = new ClsHorarios();
        cls.EliminarHorario(horario);
        cargarTabla();
        ajustartabla();
        Limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLecturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLecturaMouseClicked
        // TODO add your handling code here:
        lectura();
    }//GEN-LAST:event_btnLecturaMouseClicked

    private void tbHorariosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHorariosMouseReleased
        // TODO add your handling code here:
        int fila = tbHorarios.getSelectedRow();
        String idd = String.valueOf(tbHorarios.getValueAt(fila, 0));
        id = Integer.valueOf(idd);
        String hora = String.valueOf(tbHorarios.getValueAt(fila, 2));
        String h = hora.substring(0, 2);
        String m = hora.substring(3, 5);
        int minu = Integer.valueOf(m);
        int horac = Integer.valueOf(h);
        cmbHoras.setSelectedIndex(horac - 8);
        cmbMinutos.setSelectedIndex(minu);
        indicador = 1;
    }//GEN-LAST:event_tbHorariosMouseReleased
    public void Limpiar() {
        
        cmbHoras.setSelectedIndex(0);
        cmbMinutos.setSelectedIndex(0);
        indicador = 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TABLA;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel btnLectura;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbHoras;
    private javax.swing.JComboBox<String> cmbMinutos;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMinuto;
    private javax.swing.JPanel panelCRUD;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tbHorarios;
    // End of variables declaration//GEN-END:variables
}
