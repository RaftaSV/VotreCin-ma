/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Formularios;

import com.unab.edu.sv.DAO.*;
import com.unab.edu.sv.Entidades.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
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
        modeloDetalles = new DefaultTableModel(null, TitulosDETALLES);
        tbDetalles.setModel(modeloDetalles);
        CargarDatos();
        btnQuitar.setEnabled(false);
        //Seleccion unica de filas 
        tbProducto.setColumnSelectionAllowed(isSelected);
        tbProducto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbDetalles.setColumnSelectionAllowed(isSelected);
        tbDetalles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbCarteleras.setColumnSelectionAllowed(isSelected);
        tbCarteleras.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //
        //Cargar clientes
        displaymemberClientes();
        cmbClientes.setSelectedIndex(1);
        //hacer mas grande la columna detalles
        tbDetalles.getColumnModel().getColumn(0).setPreferredWidth(400);
        // ocultar columanas tabla detalles
        tbDetalles.getColumnModel().getColumn(2).setMaxWidth(0);
        tbDetalles.getColumnModel().getColumn(2).setMinWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);
        tbDetalles.getColumnModel().getColumn(3).setMaxWidth(0);
        tbDetalles.getColumnModel().getColumn(3).setMinWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);
        tbDetalles.getColumnModel().getColumn(4).setMaxWidth(0);
        tbDetalles.getColumnModel().getColumn(4).setMinWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);
        tbDetalles.getColumnModel().getColumn(5).setMaxWidth(0);
        tbDetalles.getColumnModel().getColumn(5).setMinWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);
        tbDetalles.getColumnModel().getColumn(6).setMaxWidth(0);
        tbDetalles.getColumnModel().getColumn(6).setMinWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(6).setMinWidth(0);
        //Centrar en texto del encabezado de la tabla
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) tbDetalles.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer al = new DefaultTableCellRenderer();
        al.setHorizontalAlignment(SwingConstants.CENTER);
        tbDetalles.getColumnModel().getColumn(0).setCellRenderer(al);
        tbDetalles.getColumnModel().getColumn(1).setCellRenderer(al);
        Defaultcombobox.addElement("");
        cmbAsientos.setModel(Defaultcombobox);

    }

    String[] TitulosDETALLES = {"DETALLES", "PRECIO", "IDENTIFICADOR", "CARTELERA", "IDASIENTO", "IDPRECIO", "IDproducto"};
    Object[] filasDetalles = new Object[9];
    DefaultTableModel modeloDetalles;

    public void ajustartablaProducto() {
        // Ocultar la columna del ID producto
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
        tbCarteleras.getColumnModel().getColumn(6).setMaxWidth(0);
        tbCarteleras.getColumnModel().getColumn(6).setMinWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
        tbCarteleras.getTableHeader().getColumnModel().getColumn(6).setMinWidth(0);
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
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
        tbCarteleras.getColumnModel().getColumn(2).setCellRenderer(alinear);
        tbCarteleras.getColumnModel().getColumn(3).setCellRenderer(alinear);
        tbCarteleras.getColumnModel().getColumn(4).setCellRenderer(alinear);
        tbCarteleras.getColumnModel().getColumn(5).setCellRenderer(alinear);

    }
    int id;

    public void total() {
        double total = 0;
        for (int i = 0; i < tbDetalles.getRowCount(); i++) {
            String t = String.valueOf(tbDetalles.getValueAt(i, 1));
            String to = t.substring(1);
            total = total + Double.valueOf(to);
        }
        DecimalFormat formato1 = new DecimalFormat("#.00");
        String totalDecimales = formato1.format(total);
        lblSumatotal.setText("$" + totalDecimales);
    }
    String valuememberClientes[];
    int contadorCliente = 1;

    void displaymemberClientes() {
        DefaultComboBoxModel Defaultcombobox = new DefaultComboBoxModel<>();
        ClsRoles rol = new ClsRoles();
        ArrayList<Roles> Roles = rol.MostrarUsuarios();
        valuememberClientes = new String[Roles.size() + 1];
        String filas[] = new String[5];
        Defaultcombobox.addElement("");
        for (var i : Roles) {
            filas[0] = String.valueOf(i.getIdRol());
            filas[1] = i.getNombres();
            valuememberClientes[contadorCliente] = filas[0];
            Defaultcombobox.addElement(filas[1]);
            contadorCliente++;
        }
        cmbClientes.setModel(Defaultcombobox);

    }

    public void detallesFactura() {

        try {
            if (valuemember[cmbAsientos.getSelectedIndex()] != null) {
                int fila = tbCarteleras.getSelectedRow();
                SimpleDateFormat formato = new SimpleDateFormat("d MMM y");
                Date fecha = jDateFecha.getDate();
                String sala = String.valueOf(tbCarteleras.getValueAt(fila, 4));
                String saala = sala.replaceAll("<HTML>", "").replaceAll("<p align=\"justify\">", "").replaceAll("</HTML>", "");
                String hor = String.valueOf(tbCarteleras.getValueAt(fila, 3));
                String hora = hor.replaceAll("<HTML>", "").replaceAll("<p align=\"justify\">", "").replaceAll("</HTML>", "");
                String horaa = hora.substring(0, 5);

                String precio;
                // identificador  = 0 significa que es una taquilla
                // identificador = 1 significa que es producto
                // precio = 0 significa adulto
                // precio = 1 significa child
                // precio = 2 significa estudiante
                // precio = 3 significa adultomayor 
                if (tbDetalles.getRowCount() != 0) {
                    contador = 0;
                    for (int i = 0; i < tbDetalles.getRowCount(); i++) {
                        String cartelera = String.valueOf(tbCarteleras.getValueAt(fila, 0));
                        String carteleradetalles = String.valueOf(tbDetalles.getValueAt(i, 3));
                        int asiento = (Integer.parseInt(valuemember[cmbAsientos.getSelectedIndex()]));
                        String idasiento = String.valueOf(tbDetalles.getValueAt(i, 4));
                        int idasientoverificar = Integer.parseInt(idasiento);
                        if (cartelera.equals(carteleradetalles) && idasientoverificar == asiento) {
                            JOptionPane.showMessageDialog(null, "El asiento ya lo ha seleccionado ");
                            i = tbDetalles.getRowCount();

                        } else {
                            contador++;

                        }
                    }
                } else {
                    if (rbtnAdultos.isSelected()) {
                        precio = String.valueOf(rbtnAdultos.getText());
                        String preciotabla = precio.substring(0, 5);
                        filasDetalles[0] = formato.format(fecha) + " hora " + horaa + " sala " + saala + " asiento " + String.valueOf(cmbAsientos.getSelectedItem());
                        filasDetalles[1] = preciotabla;
                        filasDetalles[2] = 0;
                        filasDetalles[3] = tbCarteleras.getValueAt(fila, 0);
                        filasDetalles[4] = valuemember[cmbAsientos.getSelectedIndex()];
                        filasDetalles[5] = 0;
                        modeloDetalles.addRow(filasDetalles);
                        tbDetalles.setModel(modeloDetalles);
                    } else if (rbtnChild.isSelected()) {
                        precio = String.valueOf(rbtnChild.getText());
                        String preciotabla = precio.substring(0, 5);
                        filasDetalles[0] = formato.format(fecha) + " hora " + horaa + " sala " + saala + " asiento " + String.valueOf(cmbAsientos.getSelectedItem());
                        filasDetalles[1] = preciotabla;
                        filasDetalles[2] = 0;
                        filasDetalles[3] = tbCarteleras.getValueAt(fila, 0);
                        filasDetalles[4] = valuemember[cmbAsientos.getSelectedIndex()];
                        filasDetalles[5] = 1;
                        modeloDetalles.addRow(filasDetalles);
                        tbDetalles.setModel(modeloDetalles);
                    } else if (rbtnEstudiantes.isSelected()) {
                        precio = String.valueOf(rbtnEstudiantes.getText());
                        String preciotabla = precio.substring(0, 5);
                        filasDetalles[0] = formato.format(fecha) + " hora " + horaa + " sala " + saala + " asiento " + String.valueOf(cmbAsientos.getSelectedItem());
                        filasDetalles[1] = preciotabla;
                        filasDetalles[2] = 0;
                        filasDetalles[3] = tbCarteleras.getValueAt(fila, 0);
                        filasDetalles[4] = valuemember[cmbAsientos.getSelectedIndex()];
                        filasDetalles[5] = 2;
                        modeloDetalles.addRow(filasDetalles);
                        tbDetalles.setModel(modeloDetalles);
                    } else if (rbtnAdultosM.isSelected()) {
                        precio = String.valueOf(rbtnEstudiantes.getText());
                        filasDetalles[0] = formato.format(fecha) + " hora " + horaa + " sala " + saala + " asiento " + String.valueOf(cmbAsientos.getSelectedItem());
                        String preciotabla = precio.substring(0, 5);
                        filasDetalles[1] = preciotabla;
                        filasDetalles[2] = 0;
                        filasDetalles[3] = tbCarteleras.getValueAt(fila, 0);
                        filasDetalles[4] = valuemember[cmbAsientos.getSelectedIndex()];
                        filasDetalles[5] = 3;
                        modeloDetalles.addRow(filasDetalles);
                        tbDetalles.setModel(modeloDetalles);
                    }

                }
                if (contador == tbDetalles.getRowCount()) {

                    if (rbtnAdultos.isSelected()) {
                        precio = String.valueOf(rbtnAdultos.getText());
                        String preciotabla = precio.substring(0, 5);
                        filasDetalles[0] = formato.format(fecha) + " hora " + horaa + " sala " + saala + " asiento " + String.valueOf(cmbAsientos.getSelectedItem());
                        filasDetalles[1] = preciotabla;
                        filasDetalles[2] = 0;
                        filasDetalles[3] = tbCarteleras.getValueAt(fila, 0);
                        filasDetalles[4] = valuemember[cmbAsientos.getSelectedIndex()];
                        filasDetalles[5] = 0;
                        modeloDetalles.addRow(filasDetalles);
                        tbDetalles.setModel(modeloDetalles);

                    } else if (rbtnChild.isSelected()) {
                        precio = String.valueOf(rbtnChild.getText());
                        String preciotabla = precio.substring(0, 5);
                        filasDetalles[0] = formato.format(fecha) + " hora " + horaa + " sala " + saala + " asiento " + String.valueOf(cmbAsientos.getSelectedItem());
                        filasDetalles[1] = preciotabla;
                        filasDetalles[2] = 0;
                        filasDetalles[3] = tbCarteleras.getValueAt(fila, 0);
                        filasDetalles[4] = valuemember[cmbAsientos.getSelectedIndex()];
                        filasDetalles[5] = 1;
                        modeloDetalles.addRow(filasDetalles);
                        tbDetalles.setModel(modeloDetalles);
                    } else if (rbtnEstudiantes.isSelected()) {
                        precio = String.valueOf(rbtnEstudiantes.getText());
                        String preciotabla = precio.substring(0, 5);
                        filasDetalles[0] = formato.format(fecha) + " hora " + horaa + " sala " + saala + " asiento " + String.valueOf(cmbAsientos.getSelectedItem());
                        filasDetalles[1] = preciotabla;
                        filasDetalles[2] = 0;
                        filasDetalles[3] = tbCarteleras.getValueAt(fila, 0);
                        filasDetalles[4] = valuemember[cmbAsientos.getSelectedIndex()];
                        filasDetalles[5] = 2;
                        modeloDetalles.addRow(filasDetalles);
                        tbDetalles.setModel(modeloDetalles);
                    } else if (rbtnAdultosM.isSelected()) {
                        precio = String.valueOf(rbtnEstudiantes.getText());
                        String preciotabla = precio.substring(0, 5);
                        filasDetalles[0] = formato.format(fecha) + " hora " + horaa + " sala " + saala + " asiento " + String.valueOf(cmbAsientos.getSelectedItem());
                        filasDetalles[1] = preciotabla;
                        filasDetalles[2] = 0;
                        filasDetalles[3] = tbCarteleras.getValueAt(fila, 0);
                        filasDetalles[4] = valuemember[cmbAsientos.getSelectedIndex()];
                        filasDetalles[5] = 3;
                        modeloDetalles.addRow(filasDetalles);
                        tbDetalles.setModel(modeloDetalles);
                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe de seleccionar un asiento");

            }
        } catch (Exception e) {

        }

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
        lblIconoBUscarProducto = new javax.swing.JLabel();
        lblIconoBUscarCartelera = new javax.swing.JLabel();
        panelPrecios = new javax.swing.JPanel();
        lblPrecios = new javax.swing.JLabel();
        lblAsientos = new javax.swing.JLabel();
        cmbAsientos = new javax.swing.JComboBox<>();
        rbtnChild = new javax.swing.JRadioButton();
        rbtnEstudiantes = new javax.swing.JRadioButton();
        rbtnAdultos = new javax.swing.JRadioButton();
        rbtnAdultosM = new javax.swing.JRadioButton();
        lblCliente = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDetalles = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        lblSumatotal = new javax.swing.JLabel();
        lblt = new javax.swing.JLabel();
        lblEfectivo = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JTextField();
        btnCombrar = new javax.swing.JButton();
        lblCambio = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(893, 663));

        panelFondo.setBackground(java.awt.Color.black);

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
        tbProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbProductoMouseReleased(evt);
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
        tbCarteleras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbCartelerasMouseReleased(evt);
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

        lblIconoBUscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/buscarb.png"))); // NOI18N

        lblIconoBUscarCartelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/buscarb.png"))); // NOI18N

        panelPrecios.setBackground(java.awt.Color.black);

        lblPrecios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecios.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecios.setText("PRECIOS");

        lblAsientos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAsientos.setForeground(new java.awt.Color(255, 255, 255));
        lblAsientos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAsientos.setText("ASIENTOS");

        cmbAsientos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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

        javax.swing.GroupLayout panelPreciosLayout = new javax.swing.GroupLayout(panelPrecios);
        panelPrecios.setLayout(panelPreciosLayout);
        panelPreciosLayout.setHorizontalGroup(
            panelPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreciosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPreciosLayout.createSequentialGroup()
                        .addComponent(lblPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(lblAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPreciosLayout.createSequentialGroup()
                        .addComponent(rbtnChild, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPreciosLayout.createSequentialGroup()
                        .addGroup(panelPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnAdultosM)
                            .addComponent(rbtnEstudiantes)
                            .addComponent(rbtnAdultos))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPreciosLayout.setVerticalGroup(
            panelPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreciosLayout.createSequentialGroup()
                .addGroup(panelPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecios)
                    .addComponent(lblAsientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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

        lblCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setText("CLIENTE");

        cmbClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        panelTabla.setBackground(java.awt.Color.black);

        tbDetalles = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int collIndex){
                return false;
            }
        };
        tbDetalles.setBackground(java.awt.Color.black);
        tbDetalles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tbDetalles.setForeground(new java.awt.Color(255, 255, 255));
        tbDetalles.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDetallesMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbDetallesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbDetalles);

        btnAgregar.setBackground(new java.awt.Color(255, 255, 102));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorderPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnQuitar.setBackground(new java.awt.Color(255, 255, 102));
        btnQuitar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuitar.setText("QUITAR");
        btnQuitar.setBorderPainted(false);
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuitar)
                        .addGap(37, 37, 37))))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnQuitar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblSumatotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSumatotal.setForeground(new java.awt.Color(255, 255, 255));
        lblSumatotal.setText("$0");

        lblt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblt.setForeground(new java.awt.Color(255, 255, 255));
        lblt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblt.setText("TOTAL");

        lblEfectivo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        lblEfectivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEfectivo.setText("EFECTIVO");
        lblEfectivo.setToolTipText("");

        txtEfectivo.setBackground(new java.awt.Color(0, 0, 0));
        txtEfectivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        txtEfectivo.setBorder(null);
        txtEfectivo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEfectivoKeyReleased(evt);
            }
        });

        btnCombrar.setBackground(new java.awt.Color(255, 255, 102));
        btnCombrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCombrar.setText("FACTURAR");
        btnCombrar.setBorderPainted(false);
        btnCombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombrarActionPerformed(evt);
            }
        });

        lblCambio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCambio.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(txtBuscarCarteleras, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIconoBUscarCartelera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(lblCliente)
                                .addGap(123, 123, 123))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TABLA1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TABLA, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelFondoLayout.createSequentialGroup()
                                    .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblIconoBUscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(lblt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCambio, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(btnCombrar)
                            .addComponent(lblEfectivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(lblSumatotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBuscarCarteleras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblIconoBUscarCartelera)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(lblCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TABLA1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIconoBUscarProducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TABLA, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSumatotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEfectivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnCombrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    }//GEN-LAST:event_tbCartelerasMouseClicked

    private void jDateFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateFechaPropertyChange
        // TODO add your handling code here:
        CargarTablaCarteleras();
        ajustartablaProducto();
        Defaultcombobox.addElement("");
        cmbAsientos.setModel(Defaultcombobox);

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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        lblCambio.setText("");
        detallesFactura();

        total();
    }//GEN-LAST:event_btnAgregarActionPerformed
    void eliminarDetalles() {
        modeloDetalles = null;
        modeloDetalles = new DefaultTableModel(null, TitulosDETALLES);
        tbDetalles.setModel(modeloDetalles);
        tbDetalles.getColumnModel().getColumn(0).setPreferredWidth(400);
        // ocultar columanas tabla detalles
        tbDetalles.getColumnModel().getColumn(2).setMaxWidth(0);
        tbDetalles.getColumnModel().getColumn(2).setMinWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);
        tbDetalles.getColumnModel().getColumn(3).setMaxWidth(0);
        tbDetalles.getColumnModel().getColumn(3).setMinWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);
        tbDetalles.getColumnModel().getColumn(4).setMaxWidth(0);
        tbDetalles.getColumnModel().getColumn(4).setMinWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);
        tbDetalles.getColumnModel().getColumn(5).setMaxWidth(0);
        tbDetalles.getColumnModel().getColumn(5).setMinWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);
        tbDetalles.getColumnModel().getColumn(6).setMaxWidth(0);
        tbDetalles.getColumnModel().getColumn(6).setMinWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
        tbDetalles.getTableHeader().getColumnModel().getColumn(6).setMinWidth(0);
        //Centrar en texto del encabezado de la tabla
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) tbDetalles.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer al = new DefaultTableCellRenderer();
        al.setHorizontalAlignment(SwingConstants.CENTER);
        tbDetalles.getColumnModel().getColumn(0).setCellRenderer(al);
        tbDetalles.getColumnModel().getColumn(1).setCellRenderer(al);
    }
    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        int fila = tbDetalles.getSelectedRow();
        modeloDetalles.removeRow(fila);
        btnQuitar.setEnabled(false);
        total();
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void tbDetallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDetallesMouseClicked
        // TODO add your handling code here:
        btnQuitar.setEnabled(true);
    }//GEN-LAST:event_tbDetallesMouseClicked

    private void tbCartelerasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCartelerasMouseReleased
        GroupPrecios.clearSelection();
        rbtnAdultos.setSelected(true);
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
                rbtnAdultos.setText("$" + String.valueOf(i.getPrecios()) + " Adultos");

            } else if (i.getTipo() == 1) {
                rbtnChild.setText("$" + String.valueOf(i.getPrecios()) + " Niños");
                rbtnChild.setEnabled(true);

            } else if (i.getTipo() == 2) {
                rbtnEstudiantes.setText("$" + String.valueOf(i.getPrecios()) + " Estudiantes");
            } else if (i.getTipo() == 3) {
                rbtnAdultosM.setText("$" + String.valueOf(i.getPrecios()) + " Adultos mayores");
            }

            if (p.size() == 3) {
                rbtnChild.setText("No disponible");
                rbtnChild.setEnabled(false);
            }
        }

    }//GEN-LAST:event_tbCartelerasMouseReleased

    private void tbProductoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductoMouseReleased
        // TODO add your handling code here:
        //String[] TitulosDETALLES = {"DETALLES", "PRECIO", "IDENTIFICADOR", "CARTELERA", "IDASIENTO", "IDPRECIO", "IDproducto"};
        int fila = tbProducto.getSelectedRow();
        int res = JOptionPane.showConfirmDialog(null, "¿Desea Agregar este producto?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            filasDetalles[0] = tbProducto.getValueAt(fila, 1);
            filasDetalles[1] = "$" + tbProducto.getValueAt(fila, 2);
            filasDetalles[3] = 0;
            filasDetalles[4] = 0;
            filasDetalles[2] = 1;
            filasDetalles[6] = tbProducto.getValueAt(fila, 0);
            modeloDetalles.addRow(filasDetalles);

            tbProducto.clearSelection();
        }
        total();
    }//GEN-LAST:event_tbProductoMouseReleased

    private void tbDetallesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDetallesMouseReleased
        btnQuitar.setEnabled(true);
    }//GEN-LAST:event_tbDetallesMouseReleased

    private void btnCombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombrarActionPerformed
        // TODO add your handling code here:
        try {
            String to = lblSumatotal.getText();
            Double total = Double.valueOf(to.substring(1));

            Double efectivo = Double.valueOf(txtEfectivo.getText());

            if (efectivo >= total) {
                BigDecimal totall = BigDecimal.valueOf(efectivo - total);
                totall = totall.setScale(2, RoundingMode.HALF_UP);
                lblCambio.setText("Cambio " + "$" + String.valueOf(totall));
                Facturas factura = new Facturas();
                frmLogin login = new frmLogin();
                factura.setCajero(login.principal.id);
                factura.setCliente(Integer.valueOf(valuememberClientes[cmbClientes.getSelectedIndex()]));
                String subtotal = String.valueOf(total);
                factura.setTotal(Double.valueOf(subtotal));
                ClsFacturas clsf = new ClsFacturas();
                clsf.AgregarFactura(factura);
                for (int i = 0; i < tbDetalles.getRowCount(); i++) {
                    String identificador = String.valueOf(tbDetalles.getValueAt(i, 2));
                    int tipo = Integer.valueOf(identificador);
                    if (tipo == 0) {
                        Taquillas taquilla = new Taquillas();
                        taquilla.setDiferenciador(tipo);
                        String idcartelera = String.valueOf(tbDetalles.getValueAt(i, 3));
                        taquilla.setId_cartelera(Integer.parseInt(idcartelera));
                        String idasiento = String.valueOf(tbDetalles.getValueAt(i, 4));
                        taquilla.setId_Asiento(Integer.valueOf(idasiento));
                        String idprecio = String.valueOf(tbDetalles.getValueAt(i, 5));
                        taquilla.setDiferenciador(Integer.valueOf(idprecio));
                        ClsTaquilla clsTaquilla = new ClsTaquilla();
                        clsTaquilla.InsertarTaquilla(taquilla);

                    } else if (tipo == 1) {
                        DetallesFacturas det = new DetallesFacturas();
                        String costo = String.valueOf(tbDetalles.getValueAt(i, 1));
                        costo = costo.substring(1);
                        det.setCosto(Double.valueOf(costo));
                        det.setDiferenciador(tipo);
                        String idproducto = String.valueOf(tbDetalles.getValueAt(i, 6));
                        det.setId_Producto(Integer.valueOf(idproducto));
                        ClsDetallesFactura detalle = new ClsDetallesFactura();
                        detalle.insertarDetalle(det);

                    }

                }

                tbCarteleras.clearSelection();
                tbProducto.clearSelection();
                GroupPrecios.clearSelection();
                rbtnAdultos.setText("");
                rbtnAdultosM.setText("");
                rbtnChild.setText("");
                rbtnEstudiantes.setText("");
                cmbClientes.setSelectedIndex(1);
                id = 0;
                txtEfectivo.setText("");
                eliminarDetalles();
                lblSumatotal.setText("");
                displaymember();
            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_btnCombrarActionPerformed

    private void txtEfectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoKeyReleased
        // TODO add your handling code here:
        try {
            double precio = Double.valueOf(txtEfectivo.getText());
        } catch (Exception e) {
            txtEfectivo.setText("");
        }
    }//GEN-LAST:event_txtEfectivoKeyReleased

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
    DefaultComboBoxModel Defaultcombobox = new DefaultComboBoxModel<>();

    void displaymember() {
        Defaultcombobox.removeAllElements();
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCombrar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JComboBox<String> cmbAsientos;
    private javax.swing.JComboBox<String> cmbClientes;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAsientos;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEfectivo;
    private javax.swing.JLabel lblIconoBUscarCartelera;
    private javax.swing.JLabel lblIconoBUscarProducto;
    private javax.swing.JLabel lblPrecios;
    private javax.swing.JLabel lblSumatotal;
    private javax.swing.JLabel lblt;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelPrecios;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JRadioButton rbtnAdultos;
    private javax.swing.JRadioButton rbtnAdultosM;
    private javax.swing.JRadioButton rbtnChild;
    private javax.swing.JRadioButton rbtnEstudiantes;
    private javax.swing.JTable tbCarteleras;
    private javax.swing.JTable tbDetalles;
    private javax.swing.JTable tbProducto;
    private javax.swing.JTextField txtBuscarCarteleras;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtEfectivo;
    // End of variables declaration//GEN-END:variables
}
