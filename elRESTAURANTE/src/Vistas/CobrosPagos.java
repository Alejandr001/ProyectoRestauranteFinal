
package Vistas;

import AccesoData.MesaData;
import AccesoData.MeseroData;
import AccesoData.PedidoData;
import AccesoData.PedidoProductoData;
import AccesoData.ProductoData;
import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedido;
import Entidades.PedidoProducto;
import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class CobrosPagos extends javax.swing.JPanel {
    private DefaultTableModel modelo = new DefaultTableModel();
    private DefaultTableModel modeloDos = new DefaultTableModel();
    public boolean isCellEditable(int fila, int columna) {
        return false;
    }
    private List<Pedido> listaUno= new ArrayList<>();
    private List<Pedido> listaDos= new ArrayList<>();
    private List<PedidoProducto> listaTres= new ArrayList<>();
    private List<Mesa> listaCuatro= new ArrayList<>();
    private List<Mesero> listaCinco= new ArrayList<>();
//    private List<Pedido> listaRespaldo= new ArrayList<>();
    private PedidoData pedData;
    private PedidoProductoData pepData;
    private ProductoData prodData;
    private MesaData mesData;
    private MeseroData meData;
    
    public CobrosPagos() {
        initComponents();
        modelo = new DefaultTableModel();
        modeloDos = new DefaultTableModel();
        armarCabezera();
        pedData = new PedidoData();
        pepData = new PedidoProductoData();
        prodData = new ProductoData();
        mesData = new MesaData();
        meData = new MeseroData();
        listaCinco = meData.obtenerTodosLosMeseros();
        listaCuatro = mesData.obtenerTodasLasMesas();
        cargarPedidos(1);
        cargarMesas();
        cargarMeseros();

        
    }
    
    private void armarCabezera() {
        modelo.addColumn("Id");
        modelo.addColumn("Mesa");
        modelo.addColumn("Mesero");
        modeloDos.addColumn("id");
        modeloDos.addColumn("Mesa");
        modeloDos.addColumn("Mesero");
        
        jTPedidos.setModel(modelo);
        jTResultados.setModel(modeloDos);
        

    }
    private void cargarPedidos(int id) {
        listaUno = pedData.obtenerPedidosConEstado(id);
        if(listaUno==null){
            System.out.println("lista vacia");
        }
        
        modelo.setRowCount(0);
        for (Pedido m : listaUno) {
            
            modelo.addRow(new Object[]{m.getIdPedido(),m.getIdMesa(), m.getIdMesero()});
        }
        setVisible(true);
    }
    private void cargarTablaDos(int t) {
        
        if(listaDos==null){
            System.out.println("lista vacia");
        }
        
        modeloDos.setRowCount(0);
        for (Pedido m : listaDos) {
            
            modeloDos.addRow(new Object[]{m.getIdPedido(),m.getIdMesa(), m.getIdMesero()});
        }
        setVisible(true);
        jTotal.setText(""+ t);
    }
    private int total(){
        int total=0;
        
        for (Pedido m : listaDos) {
            
            
            listaTres=pepData.listarPorIdPedido(m.getIdPedido());
            
            for (PedidoProducto p : listaTres) {
               
           
                total= total+ prodData.buscarProducto(p.getIdProducto()).getPrecio();
        }
//            listaTres.clear();
        }
        
        
        
        
        return total;
    }
    
    private void cargarMesas(){

            for (Mesa mesa : listaCuatro) {
            jCbMesas.addItem("Mesa N°: "+mesa.getIdMesa());
            }
       
    }
    private void cargarMeseros(){

            for (Mesero mesero : listaCinco) {
            jCMeseros.addItem(mesero.getNombre()+ " "+ mesero.getApellido());
            }
       
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTResultados = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPedidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jCbMesas = new javax.swing.JComboBox<>();
        jCMeseros = new javax.swing.JComboBox<>();
        jLabelfondo = new javax.swing.JLabel();
        jPBACKfondo = new javax.swing.JPanel();
        jLBUSCAR4 = new javax.swing.JLabel();
        jLBUSCAR3 = new javax.swing.JLabel();
        jLBUSCAR2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pedidos");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 120, 20));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Total :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 80, 40));

        jTotal.setBackground(new java.awt.Color(243, 241, 244));
        jTotal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotalActionPerformed(evt);
            }
        });
        add(jTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 140, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RESULTADOS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 120, 20));

        jTResultados.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTResultados.setModel(new javax.swing.table.DefaultTableModel(
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
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTResultados);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 260, 210));

        jTPedidos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTPedidos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 240, 290));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cuaderno-abierto-vacio_400.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.white));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDate.setBackground(new java.awt.Color(204, 204, 204));
        jDate.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Busqueda por Mesa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Busqueda por Mesero");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Busqueda por fecha");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(153, 153, 153));
        label1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label1.setText("Buscar");
        label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label1MouseExited(evt);
            }
        });
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 50, 20));

        jCbMesas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCbMesas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jCbMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbMesasActionPerformed(evt);
            }
        });
        jPanel1.add(jCbMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 110, 30));

        jCMeseros.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCMeseros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jCMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMeserosActionPerformed(evt);
            }
        });
        jPanel1.add(jCMeseros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 130, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 410));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comidarap.png"))); // NOI18N
        jLabelfondo.setText("jLabel1");
        add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 1000, 430));

        jPBACKfondo.setBackground(new java.awt.Color(204, 204, 204));
        jPBACKfondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPBACKfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPBACKfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 430));

        jLBUSCAR4.setBackground(new java.awt.Color(204, 204, 204));
        jLBUSCAR4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLBUSCAR4.setForeground(new java.awt.Color(51, 51, 51));
        jLBUSCAR4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBUSCAR4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/search_magnifying_glass_icon_192631 (1).png"))); // NOI18N
        jLBUSCAR4.setText("Mesero");
        jLBUSCAR4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLBUSCAR4.setOpaque(true);
        jLBUSCAR4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBUSCAR4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBUSCAR4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBUSCAR4MouseExited(evt);
            }
        });
        add(jLBUSCAR4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        jLBUSCAR3.setBackground(new java.awt.Color(204, 204, 204));
        jLBUSCAR3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLBUSCAR3.setForeground(new java.awt.Color(51, 51, 51));
        jLBUSCAR3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBUSCAR3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/search_magnifying_glass_icon_192631 (1).png"))); // NOI18N
        jLBUSCAR3.setText("Pedido");
        jLBUSCAR3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLBUSCAR3.setOpaque(true);
        jLBUSCAR3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBUSCAR3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBUSCAR3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBUSCAR3MouseExited(evt);
            }
        });
        add(jLBUSCAR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLBUSCAR2.setBackground(new java.awt.Color(204, 204, 204));
        jLBUSCAR2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLBUSCAR2.setForeground(new java.awt.Color(51, 51, 51));
        jLBUSCAR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBUSCAR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/search_magnifying_glass_icon_192631 (1).png"))); // NOI18N
        jLBUSCAR2.setText("Mesas");
        jLBUSCAR2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLBUSCAR2.setOpaque(true);
        jLBUSCAR2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBUSCAR2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBUSCAR2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBUSCAR2MouseExited(evt);
            }
        });
        add(jLBUSCAR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLBUSCAR2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBUSCAR2MouseClicked

    private void jLBUSCAR2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBUSCAR2MouseEntered

    private void jLBUSCAR2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBUSCAR2MouseExited

    private void jLBUSCAR3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBUSCAR3MouseClicked

    private void jLBUSCAR3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBUSCAR3MouseEntered

    private void jLBUSCAR3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBUSCAR3MouseExited

    private void jLBUSCAR4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBUSCAR4MouseClicked

    private void jLBUSCAR4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBUSCAR4MouseEntered

    private void jLBUSCAR4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBUSCAR4MouseExited

    private void jTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotalActionPerformed

    private void jCbMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbMesasActionPerformed
        //copia de respaldo
        List<Pedido> listaRespaldo = new ArrayList<>(listaDos); 
        // Rescatar el id de mesa
        String selectedItem = (String) jCbMesas.getSelectedItem();
        String[] parts = selectedItem.split(" ");

        int nunMesa = 1;
        if (parts.length >= 2) {
            String numeroMesa = parts[parts.length - 1];
            nunMesa = Integer.parseInt(numeroMesa);
        }

        int finalNunMesa = nunMesa; // Variable final
        System.out.println("Número de mesa: " + finalNunMesa);
        //quitar de la lista todos las mesas
        listaDos.removeIf(pedido -> pedido.getIdMesa() != finalNunMesa);
        //calcular el total e imprimir.
        int tot = total();
        cargarTablaDos(tot);

        // Restaura la lista original desde la copia de respaldo
        listaDos = new ArrayList<>(listaRespaldo);


    }//GEN-LAST:event_jCbMesasActionPerformed

    private void jCMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMeserosActionPerformed
        // mismo q arriba xD
         List<Pedido> listaRespaldo = new ArrayList<>(listaDos); // Copia de listaDos
        
        //buscar id mesero
        String selectedMesero = (String) jCMeseros.getSelectedItem();
        String[] meseroParts = selectedMesero.split(" ");

        String apellido = "";
        String nombre = "";

        if (meseroParts.length >= 2) {
            apellido = meseroParts[meseroParts.length - 1];
            nombre = meseroParts[0];
        }

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        int idMe = meData.obtenerIdMesero(nombre, apellido);
        // quitar de la lista 
        listaDos.removeIf(pedido -> pedido.getIdMesero() != idMe);
        //total e imprimir de nuevo
        int tot = total();
        cargarTablaDos(tot);
        
        
        listaDos = new ArrayList<>(listaRespaldo);
    }//GEN-LAST:event_jCMeserosActionPerformed

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked
        // Obtener la fecha del JDateChooser
        
        java.util.Date fechaSeleccionada = jDate.getDate();

        // Convertir la fecha a java.sql.Date
        java.sql.Date fechaSQL = new java.sql.Date(fechaSeleccionada.getTime());
       
        listaDos = pedData.obtenerPedidosConFechaYEstado(fechaSQL);
        if(listaDos==null){
            System.out.println("lista dos vacia");
        }
        
        int tot = total();
        
        cargarTablaDos(tot);

    }//GEN-LAST:event_label1MouseClicked

    private void label1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseEntered
        label1.setForeground(Color.yellow);
    }//GEN-LAST:event_label1MouseEntered

    private void label1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseExited
label1.setForeground(Color.DARK_GRAY);    }//GEN-LAST:event_label1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCMeseros;
    private javax.swing.JComboBox<String> jCbMesas;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLBUSCAR2;
    private javax.swing.JLabel jLBUSCAR3;
    private javax.swing.JLabel jLBUSCAR4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JPanel jPBACKfondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTPedidos;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTextField jTotal;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
