package Vistas;

import AccesoData.MesaData;
import AccesoData.PedidoData;
import AccesoData.PedidoProductoData;
import AccesoData.ProductoData;
import Entidades.Mesa;
import Entidades.Pedido;
import Entidades.PedidoProducto;
import Entidades.Producto;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
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
    private List<Producto> listaUno= new ArrayList<>();
    private List<PedidoProducto> listaDos= new ArrayList<>();
    private List<Producto> listaTres = new ArrayList<>();
    private List<Mesa> listaCuatro;
    private List<Producto> listaCinco;
    private ProductoData prodData;
    private PedidoProductoData pepData;
    private MesaData meData;
    private int numAu;

    PedidoData pedData = new PedidoData();

    public Pedidos() {
        
        initComponents();
        modelo = new DefaultTableModel();
        modeloDos = new DefaultTableModel();
        modeloTres = new DefaultTableModel();
        prodData = new ProductoData(); 
        pepData = new PedidoProductoData();
        meData = new MesaData();
        listaCinco = prodData.listarProductos();
        listaCuatro = meData.obtenerTodasLasMesas();
        numAu=0;
        armarCabezera();
        cargarPedidos(0);
        cargarProductos();
        cargarMesas();
    }

    private void armarCabezera() {
        modelo.addColumn("Id");
        modelo.addColumn("Mesa");
        modelo.addColumn("Mesero");
        modeloDos.addColumn("id");
        modeloDos.addColumn("Nombre");
        modeloDos.addColumn("Precio");
        modeloTres.addColumn("Nombre");
        modeloTres.addColumn("Precio");
        jTable1.setModel(modelo);
        jTablePreOrder1.setModel(modeloDos);
        jTpagar.setModel(modeloDos);

    }

    private void cargarPedidos(int n) {
        
        modelo.setRowCount(0);
        List<Pedido> listaUno = pedData.obtenerPedidosConEstado(n);
        for (Pedido m : listaUno) {
            modelo.addRow(new Object[]{m.getIdPedido(),m.getIdMesa(), m.getIdMesero()});
        }
        setVisible(true);
    }
    public void cargarPep() {
        int total = 0;
        modeloDos.setRowCount(0);
        

        if (!listaDos.isEmpty()) {
            for (PedidoProducto m : listaDos) {
                
                int id = m.getIdProducto();
                Producto producto = null;
                producto = prodData.buscarProducto(id);

                if (producto != null) {
                    String nombre = producto.getNombre();
                    int precio = producto.getPrecio();
                    total = total + precio;
                    modeloDos.addRow(new Object[]{m.getPep(), nombre, precio});
                }
            }
        } else {
            System.out.println("listaDos está vacía.");
        }
        
        jTotal.setText(""+total);
        System.out.println("salio del ciclo");
        setVisible(true);
    }
    private void cargarMesas(){

            for (Mesa mesa : listaCuatro) {
            jComboBMESAS.addItem("Mesa N°: "+mesa.getIdMesa());
            }
       
    }
    private void cargarProductos(){

            for (Producto p : listaCinco) {
            jCProductos.addItem(p.getNombre()+"-"+ p.getPrecio());
            }
       
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBACKfondo = new javax.swing.JPanel();
        jLBorrar = new javax.swing.JLabel();
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
        jCProductos = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePreOrder1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTotal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTpagar = new javax.swing.JTable();
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
        jPBACKfondo.add(jLAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 130, 70));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabelContendor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 270, 300));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelContendor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 50, 20));

        jComboBMESAS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBMESAS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBMESAS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabelContendor.add(jComboBMESAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 120, -1));

        jRadioBuPediente.setBackground(new java.awt.Color(243, 241, 244));
        jRadioBuPediente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioBuPediente.setForeground(new java.awt.Color(51, 51, 51));
        jRadioBuPediente.setSelected(true);
        jRadioBuPediente.setText("Pendiente");
        jRadioBuPediente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jRadioBuPediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioBuPedienteMouseClicked(evt);
            }
        });
        jLabelContendor.add(jRadioBuPediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, -1));

        jRadioBuEntregado.setBackground(new java.awt.Color(243, 241, 244));
        jRadioBuEntregado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioBuEntregado.setForeground(new java.awt.Color(51, 51, 51));
        jRadioBuEntregado.setText("Entregado");
        jRadioBuEntregado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jRadioBuEntregado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioBuEntregadoMouseClicked(evt);
            }
        });
        jRadioBuEntregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBuEntregadoActionPerformed(evt);
            }
        });
        jLabelContendor.add(jRadioBuEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 100, -1));

        jCProductos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCProductosActionPerformed(evt);
            }
        });
        jLabelContendor.add(jCProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 200, -1));

        jTablePreOrder1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTablePreOrder1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTablePreOrder1);

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
        jPBACKfondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 50, 20));

        jTotal.setBackground(new java.awt.Color(243, 241, 244));
        jTotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotalActionPerformed(evt);
            }
        });
        jPBACKfondo.add(jTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 340, 90, -1));

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

        jPBACKfondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 200, 230));

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
        jPBACKfondo.add(jLCargaCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 110, 20));

        jLabelTIcket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/receipt-template-with-barcode.jpg"))); // NOI18N
        jPBACKfondo.add(jLabelTIcket, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 220, 420));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comidarap.png"))); // NOI18N
        jLabelfondo.setText("jLabel1");
        jPBACKfondo.add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 1000, 430));

        add(jPBACKfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void jTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotalActionPerformed

    private void jLCargaCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCargaCajaMouseClicked
       //cobro 
       //pasar el pedido a 1
//       pedData.pagarPedido(idPedid)
       
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
        int filaSeleccionada = jTablePreOrder1.getSelectedRow();

        if (filaSeleccionada >= 0) {

            Object valorPrimeraColumna = jTablePreOrder1.getValueAt(filaSeleccionada, 0);
            int idPep = Integer.parseInt(valorPrimeraColumna.toString());
            System.out.println("-" + idPep+"-");
            
            listaDos.remove(pepData.buscarPedidoProductoPorId(idPep));       
            pepData.eliminarPedidoProducto(idPep);
            listaDos = pepData.listarPorIdPedido(numAu);
            cargarPep();

        }

    }//GEN-LAST:event_jLBorrarMouseClicked

    private void jLAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseExited
        jLAgregar.setForeground(Color.black);
    }//GEN-LAST:event_jLAgregarMouseExited

    private void jLAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseEntered
        jLAgregar.setForeground(Color.yellow);
    }//GEN-LAST:event_jLAgregarMouseEntered

    private void jLAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseClicked
        //primero rescartar el producto
        Object selectedItem = jCProductos.getSelectedItem();

        if (selectedItem != null) {
            String selectedValue = selectedItem.toString();
            String[] parts = selectedValue.split("-");

            if (parts.length >= 1) {

                String nombre = parts[0].trim();
                System.out.println("nombre" +nombre);

                Producto prod = prodData.buscarProductoNombre(nombre);
                System.out.println("control");
                int idProducto = prod.getIdProducto();
                System.out.println("control 2");
                System.out.println("id "+ idProducto);
                int filaSeleccionada = jTable1.getSelectedRow();

                if (filaSeleccionada >= 0) {

                    Object valorPrimeraColumna = jTable1.getValueAt(filaSeleccionada, 0);
                    int idPedido = Integer.parseInt(valorPrimeraColumna.toString());
                    numAu = idPedido;
                    System.out.println(idPedido + "," + idProducto);
                    PedidoProducto pep = new PedidoProducto(idPedido, idProducto);
                    pepData.guardarPep(pep);
                    listaDos = pepData.listarPorIdPedido(idPedido);
                    cargarPep();
                    
                }

            } else {

                System.out.println("Formato no válido.");
            }
        } else {

            System.out.println("Ningún elemento seleccionado.");
        }
      
        
        
        
        
    }//GEN-LAST:event_jLAgregarMouseClicked

    private void jRadioBuEntregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBuEntregadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBuEntregadoActionPerformed

    private void jCProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCProductosActionPerformed

    private void jLBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBuscarMouseExited

    private void jLBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBuscarMouseEntered

    private void jLBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBuscarMouseClicked

    private void jRadioBuEntregadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioBuEntregadoMouseClicked
        jRadioBuPediente.setSelected(false);
        cargarPedidos(1);
    }//GEN-LAST:event_jRadioBuEntregadoMouseClicked

    private void jRadioBuPedienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioBuPedienteMouseClicked
        jRadioBuEntregado.setSelected(false);
        cargarPedidos(0);
    }//GEN-LAST:event_jRadioBuPedienteMouseClicked

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        int filaSeleccionada = jTable1.getSelectedRow();
    
    if (filaSeleccionada >= 0) {
       
        Object valorPrimeraColumna = jTable1.getValueAt(filaSeleccionada, 0);
        int idPedido = Integer.parseInt(valorPrimeraColumna.toString());
        
        listaDos = pepData.listarPorIdPedido(idPedido);
        
        cargarPep();
    }
        
    }//GEN-LAST:event_jTable1MousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCProductos;
    private javax.swing.JComboBox<String> jComboBMESAS;
    private javax.swing.JLabel jLAgregar;
    private javax.swing.JLabel jLBorrar;
    private javax.swing.JLabel jLBuscar;
    private javax.swing.JLabel jLCargaCaja;
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
    private javax.swing.JTable jTablePreOrder1;
    private javax.swing.JTextField jTotal;
    private javax.swing.JTable jTpagar;
    // End of variables declaration//GEN-END:variables
}
