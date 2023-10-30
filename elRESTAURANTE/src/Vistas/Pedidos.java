package Vistas;

import AccesoData.PedidoData;
import AccesoData.ProductoData;
import Entidades.Pedido;
import Entidades.Producto;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Pedidos extends javax.swing.JPanel {

    private DefaultTableModel modelo = new DefaultTableModel();
    private DefaultTableModel modeloDos = new DefaultTableModel();
    private DefaultTableModel modeloTres = new DefaultTableModel();

    public boolean isCellEditable(int fila, int columna) {
        return false;
    }
    private List<Producto> listaUno;
    private List<Producto> listaDos;
    private List<Producto> listaTres = new ArrayList<>();
    private ProductoData prodData;

    PedidoData pedData = new PedidoData();

    public Pedidos() {
        initComponents();
        modelo = new DefaultTableModel();
        modeloDos = new DefaultTableModel();
        modeloTres = new DefaultTableModel();
        armarCabezera();
        cargarPedidos();

    }

    private void armarCabezera() {

        modelo.addColumn("Mesa");
        modelo.addColumn("Mesero");
        modeloDos.addColumn("Nombre");
        modeloDos.addColumn("Precio");
        modeloTres.addColumn("Nombre");
        modeloTres.addColumn("Precio");
        jTable1.setModel(modelo);
        jTablePREorder1.setModel(modeloDos);
        jTpagar.setModel(modeloTres);

    }

    private void cargarPedidos() {

        modelo.setRowCount(0);
        List<Pedido> listaUno = pedData.obtenerPedidosConEstado(1);
        for (Pedido m : listaUno) {
            modelo.addRow(new Object[]{m.getIdMesa(), m.getIdMesero()});
        }
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBACKfondo = new javax.swing.JPanel();
        jLBorrar = new javax.swing.JLabel();
        jLModificar = new javax.swing.JLabel();
        jLAgregar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLBuscar = new javax.swing.JLabel();
        jLabelContendor = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jComboBMESAS = new javax.swing.JComboBox<>();
        jRadioBuPediente = new javax.swing.JRadioButton();
        jRadioBuEntregado = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePREorder1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextTOTAL = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTpagar = new javax.swing.JTable();
        jTextFieldMesero = new javax.swing.JTextField();
        jTextFieldMESA = new javax.swing.JTextField();
        jLCargaCaja = new javax.swing.JLabel();
        jLabelTIcket = new javax.swing.JLabel();
        jLabelfondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPBACKfondo.setBackground(new java.awt.Color(204, 204, 204));
        jPBACKfondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPBACKfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLBorrar.setBackground(new java.awt.Color(204, 204, 204));
        jLBorrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLBorrar.setForeground(new java.awt.Color(51, 51, 51));
        jLBorrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/trash_can_rubish_paper_bin_icon_231400.png"))); // NOI18N
        jLBorrar.setText("Borrar");
        jLBorrar.setToolTipText("");
        jLBorrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLBorrar.setOpaque(true);
        jLBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBorrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBorrarMouseExited(evt);
            }
        });
        jPBACKfondo.add(jLBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 130, 70));

        jLModificar.setBackground(new java.awt.Color(204, 204, 204));
        jLModificar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLModificar.setForeground(new java.awt.Color(51, 51, 51));
        jLModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/pen_pencil_write_edit_icon_231369.png"))); // NOI18N
        jLModificar.setText("Modificar");
        jLModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLModificar.setOpaque(true);
        jLModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLModificarMouseExited(evt);
            }
        });
        jPBACKfondo.add(jLModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 130, 70));

        jLAgregar.setBackground(new java.awt.Color(204, 204, 204));
        jLAgregar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLAgregar.setForeground(new java.awt.Color(51, 51, 51));
        jLAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/plus_add_new_icon_231379 (1).png"))); // NOI18N
        jLAgregar.setText("Agregar");
        jLAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLAgregar.setOpaque(true);
        jLAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLAgregarMouseExited(evt);
            }
        });
        jPBACKfondo.add(jLAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 130, 70));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pago");
        jPBACKfondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 130, 20));

        jLBuscar.setBackground(new java.awt.Color(204, 204, 204));
        jLBuscar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLBuscar.setForeground(new java.awt.Color(51, 51, 51));
        jLBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/search_magnifying_glass_icon_192631 (1).png"))); // NOI18N
        jLBuscar.setText("Buscar");
        jLBuscar.setToolTipText("");
        jLBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLBuscar.setOpaque(true);
        jLBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBuscarMouseExited(evt);
            }
        });
        jPBACKfondo.add(jLBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 130, 70));

        jLabelContendor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pedidos");
        jLabelContendor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 240, 20));
        jLabelContendor.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 240, 10));
        jLabelContendor.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 240, 10));

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Pedido");
        jLabelContendor.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 230, 20));

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);

        jLabelContendor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 270, 300));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelContendor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 50, 20));

        jComboBMESAS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBMESAS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa n°1", "Mesa n°2", "Mesa n°3", "Mesa n°4", "Mesa n°5", "Mesa n°6", "Mesa n°7", "Mesa n°8", "Mesa n°9", "Mesa n°10", "Mesa n°11", "Mesa n°12", "Mesa n°13", "Mesa n°14", "Mesa n°15", "Mesa n°16", "Mesa n°17", "Mesa n°18", "Mesa n°19", "Mesa n°20", " " }));
        jComboBMESAS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabelContendor.add(jComboBMESAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 90, -1));

        jRadioBuPediente.setBackground(new java.awt.Color(243, 241, 244));
        jRadioBuPediente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioBuPediente.setForeground(new java.awt.Color(51, 51, 51));
        jRadioBuPediente.setSelected(true);
        jRadioBuPediente.setText("Pendiente");
        jRadioBuPediente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelContendor.add(jRadioBuPediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, -1));

        jRadioBuEntregado.setBackground(new java.awt.Color(243, 241, 244));
        jRadioBuEntregado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioBuEntregado.setForeground(new java.awt.Color(51, 51, 51));
        jRadioBuEntregado.setText("Entregado");
        jRadioBuEntregado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jRadioBuEntregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBuEntregadoActionPerformed(evt);
            }
        });
        jLabelContendor.add(jRadioBuEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 100, -1));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pizza Margarita - $5000", "Pizza Pepperoni - $4500", "Pizza Vegetariana - $3500", "Pizza Hawaiana - $4700", "Pizza BBQ - $5000", "Pizza Mexicana - $4500", "Pizza Caprese - $4700", "Pizza Pollo BBQ - $5000", "Lomo Completo - $2500", "Lomo Especial - $2400", "Lomo a la Mostaza - $2300", "Lomo Cheddar - $2400", "Lomo Clásico - $2300", "Lomo Vegetariano - $2300", "Lomo BBQ - $2600", "Lomo con Huevo - $2300", "Lomo con Jamón - $2500", "Hamburguesa Clásica - $2000", "Hamburguesa con Queso - $2200", "Hamburguesa BBQ - $2300", "Hamburguesa Vegetariana - $2000", "Hamburguesa Doble - $3000", "Hamburguesa Especial - $2800", "Hamburguesa Hawaiana - $2600", "Hamburguesa Picante - $2400", "Hamburguesa con Champiñones - $2500", "Hamburguesa de Pollo - $2300", "Taco de Carne Asada - $1000", "Taco de Pollo - $800", "Taco Vegetariano - $700", "Taco de Barbacoa - $900", "Taco Mixto - $850", "Taco de Hongos - $900", "Agua Mineral - $1000", "Refresco de Cola - $1500", "Jugo de Naranja - $1200", "Té Helado - $1400", "Limonada - $1200", "Agua con Gas - $1000", "Jugo de Manzana - $1200", "Té Caliente - $1400", "Café - $1300", "Batido de Frutas - $1800", "Cerveza Lager - $1500", "Vino Tinto - $2000", "Whisky Escocés - $2500", "Fernet con pomelo - $2500", "Gin Tónico - $2200", "Tequila Reposado - $2200", "Cerveza Premium - $2000" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jLabelContendor.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 200, -1));

        jTablePREorder1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTablePREorder1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Cantidad", "Precio"
            }
        ));
        jScrollPane3.setViewportView(jTablePREorder1);

        jLabelContendor.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 260, 260));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cuaderno-abierto-vacio_400.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.white));
        jLabelContendor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPBACKfondo.add(jLabelContendor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 410));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total");
        jPBACKfondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 50, 20));

        jTextTOTAL.setBackground(new java.awt.Color(243, 241, 244));
        jTextTOTAL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextTOTAL.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextTOTAL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextTOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTOTALActionPerformed(evt);
            }
        });
        jPBACKfondo.add(jTextTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, 90, -1));

        jTpagar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTpagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Cantidad", "Precio"
            }
        ));
        jScrollPane2.setViewportView(jTpagar);

        jPBACKfondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 200, 190));

        jTextFieldMesero.setBackground(new java.awt.Color(243, 241, 244));
        jTextFieldMesero.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextFieldMesero.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMeseroActionPerformed(evt);
            }
        });
        jPBACKfondo.add(jTextFieldMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 90, -1));

        jTextFieldMESA.setBackground(new java.awt.Color(243, 241, 244));
        jTextFieldMESA.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextFieldMESA.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldMESA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMESAActionPerformed(evt);
            }
        });
        jPBACKfondo.add(jTextFieldMESA, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 90, -1));

        jLCargaCaja.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLCargaCaja.setForeground(new java.awt.Color(51, 51, 51));
        jLCargaCaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCargaCaja.setText("Cargar Caja");
        jLCargaCaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLCargaCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCargaCajaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCargaCajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCargaCajaMouseExited(evt);
            }
        });
        jPBACKfondo.add(jLCargaCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, 110, 20));

        jLabelTIcket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/receipt-template-with-barcode.jpg"))); // NOI18N
        jPBACKfondo.add(jLabelTIcket, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 220, 420));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comidarap.png"))); // NOI18N
        jLabelfondo.setText("jLabel1");
        jPBACKfondo.add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 1000, 430));

        add(jPBACKfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextTOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTOTALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTOTALActionPerformed

    private void jLCargaCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCargaCajaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCargaCajaMouseClicked

    private void jLCargaCajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCargaCajaMouseEntered
        jLCargaCaja.setForeground(Color.green);
    }//GEN-LAST:event_jLCargaCajaMouseEntered

    private void jLCargaCajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCargaCajaMouseExited
        jLCargaCaja.setForeground(Color.black);
    }//GEN-LAST:event_jLCargaCajaMouseExited

    private void jLBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBorrarMouseExited
        jLBorrar.setForeground(Color.black);
    }//GEN-LAST:event_jLBorrarMouseExited

    private void jLBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBorrarMouseEntered
        jLBorrar.setForeground(Color.yellow);
    }//GEN-LAST:event_jLBorrarMouseEntered

    private void jLBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBorrarMouseClicked

        PizzaYtacos p1 = new PizzaYtacos();
        p1.setSize(607, 407);
        p1.setLocation(0, 0);

        jLabelContendor.removeAll();
        jLabelContendor.add(p1, BorderLayout.CENTER);
        jLabelContendor.revalidate();
        jLabelContendor.repaint();
    }//GEN-LAST:event_jLBorrarMouseClicked

    private void jLAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseExited
        jLAgregar.setForeground(Color.black);
    }//GEN-LAST:event_jLAgregarMouseExited

    private void jLAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseEntered
        jLAgregar.setForeground(Color.yellow);
    }//GEN-LAST:event_jLAgregarMouseEntered

    private void jLAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseClicked

        LomosYHamb p1 = new LomosYHamb();
        p1.setSize(607, 407);
        p1.setLocation(0, 0);

        jLabelContendor.removeAll();
        jLabelContendor.add(p1, BorderLayout.CENTER);
        jLabelContendor.revalidate();
        jLabelContendor.repaint();
    }//GEN-LAST:event_jLAgregarMouseClicked

    private void jRadioBuEntregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBuEntregadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBuEntregadoActionPerformed

    private void jTextFieldMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMeseroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMeseroActionPerformed

    private void jTextFieldMESAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMESAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMESAActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarMouseExited
        jLModificar.setForeground(Color.black);
    }//GEN-LAST:event_jLModificarMouseExited

    private void jLModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarMouseEntered
        jLModificar.setForeground(Color.yellow);
    }//GEN-LAST:event_jLModificarMouseEntered

    private void jLModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarMouseClicked
        Bebidas p1 = new Bebidas();
        p1.setSize(607, 407);
        p1.setLocation(0, 0);

        jLabelContendor.removeAll();
        jLabelContendor.add(p1, BorderLayout.CENTER);
        jLabelContendor.revalidate();
        jLabelContendor.repaint();
    }//GEN-LAST:event_jLModificarMouseClicked

    private void jLBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBuscarMouseExited

    private void jLBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBuscarMouseEntered

    private void jLBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBMESAS;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLAgregar;
    private javax.swing.JLabel jLBorrar;
    private javax.swing.JLabel jLBuscar;
    private javax.swing.JLabel jLCargaCaja;
    private javax.swing.JLabel jLModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jLabelContendor;
    private javax.swing.JLabel jLabelTIcket;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JPanel jPBACKfondo;
    private javax.swing.JRadioButton jRadioBuEntregado;
    private javax.swing.JRadioButton jRadioBuPediente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTablePREorder1;
    private javax.swing.JTextField jTextFieldMESA;
    private javax.swing.JTextField jTextFieldMesero;
    private javax.swing.JTextField jTextTOTAL;
    private javax.swing.JTable jTpagar;
    // End of variables declaration//GEN-END:variables
}
