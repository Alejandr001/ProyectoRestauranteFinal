
/*
 int idMesa;
    int capacidad;
    boolean diponibilidad;
    boolean atendida;
 */
package Vistas;

import AccesoData.MesaData;
import Entidades.Mesa;
import Entidades.Producto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Mesas extends javax.swing.JPanel {

    private DefaultTableModel modelo = new DefaultTableModel();
     private DefaultTableModel modelo2 = new DefaultTableModel();
    

    public boolean isCellEditable(int fila, int columna) {
        return false;
    }
    private List<Mesa> listaUno;
    private List<Mesa> listaDos;
    private ArrayList<Mesa> listaTres;
    private MesaData mesaDat;

    public Mesas() {
        initComponents();
        
        
        modelo.addColumn("Mesa n°");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Diponibilidad");
         modelo2.addColumn("Mesa n°");
        modelo2.addColumn("Capacidad");
        modelo2.addColumn("Diponibilidad");
        mesaDat = new MesaData();
        listaUno = mesaDat.obtenerTodasLasMesas();
        jTableMesasDisponible.setModel(modelo);
        jTableMesasReservadas.setModel(modelo2);
         cargarMesas();
        

    }


    
   private void cargarMesas() {
    // Limpia los modelos de la tabla
    modelo.setRowCount(0);
    modelo2.setRowCount(0);

    for (Mesa mesa : listaUno) {
        if (mesa.isDiponible()) {
            modelo.addRow(new Object[]{mesa.getIdMesa(), mesa.getCapacidad(), mesa.isDiponible()});
        } else {
            modelo2.addRow(new Object[]{mesa.getIdMesa(), mesa.getCapacidad(), mesa.isDiponible()});
        }
    }

}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLELIMINAR = new javax.swing.JLabel();
        jLBUSCAR1 = new javax.swing.JLabel();
        jLAGREGAR = new javax.swing.JLabel();
        jLMODIFICAR = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMesasDisponible = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMesasReservadas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPBACKfondo = new javax.swing.JPanel();
        jLabelfondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLELIMINAR.setBackground(new java.awt.Color(204, 204, 204));
        jLELIMINAR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLELIMINAR.setForeground(new java.awt.Color(51, 51, 51));
        jLELIMINAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLELIMINAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/trash_can_rubish_paper_bin_icon_231400.png"))); // NOI18N
        jLELIMINAR.setText("Eliminar");
        jLELIMINAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLELIMINAR.setOpaque(true);
        jLELIMINAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLELIMINARMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLELIMINARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLELIMINARMouseExited(evt);
            }
        });
        add(jLELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 130, 70));

        jLBUSCAR1.setBackground(new java.awt.Color(204, 204, 204));
        jLBUSCAR1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLBUSCAR1.setForeground(new java.awt.Color(51, 51, 51));
        jLBUSCAR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBUSCAR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/search_magnifying_glass_icon_192631 (1).png"))); // NOI18N
        jLBUSCAR1.setText("Buscar");
        jLBUSCAR1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLBUSCAR1.setOpaque(true);
        jLBUSCAR1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBUSCAR1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBUSCAR1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBUSCAR1MouseExited(evt);
            }
        });
        add(jLBUSCAR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 130, 70));

        jLAGREGAR.setBackground(new java.awt.Color(204, 204, 204));
        jLAGREGAR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLAGREGAR.setForeground(new java.awt.Color(51, 51, 51));
        jLAGREGAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAGREGAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/plus_add_new_icon_231379 (1).png"))); // NOI18N
        jLAGREGAR.setText("Agregar");
        jLAGREGAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLAGREGAR.setOpaque(true);
        jLAGREGAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAGREGARMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLAGREGARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLAGREGARMouseExited(evt);
            }
        });
        add(jLAGREGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 130, 70));

        jLMODIFICAR.setBackground(new java.awt.Color(204, 204, 204));
        jLMODIFICAR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLMODIFICAR.setForeground(new java.awt.Color(51, 51, 51));
        jLMODIFICAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMODIFICAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/pen_pencil_write_edit_icon_231369.png"))); // NOI18N
        jLMODIFICAR.setText("Modificar");
        jLMODIFICAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLMODIFICAR.setOpaque(true);
        jLMODIFICAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMODIFICARMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLMODIFICARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLMODIFICARMouseExited(evt);
            }
        });
        add(jLMODIFICAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 130, 70));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mesas Reservadas");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 230, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 240, 10));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mesas Disponibles");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 240, 20));

        jTableMesasDisponible.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTableMesasDisponible.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Mesas", "Capacidad", "Estado", "Reservada"
            }
        ));
        jScrollPane2.setViewportView(jTableMesasDisponible);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 330, 330));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 240, 10));

        jTableMesasReservadas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTableMesasReservadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Mesas", "Capacidad", "Estado", "Reservada"
            }
        ));
        jScrollPane1.setViewportView(jTableMesasReservadas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 350, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cuaderno-abierto-vacio_23-2147978156.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.white));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 740, 410));

        jPBACKfondo.setBackground(new java.awt.Color(204, 204, 204));
        jPBACKfondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPBACKfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comidarap.png"))); // NOI18N
        jLabelfondo.setText("jLabel1");
        jPBACKfondo.add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 1000, 430));

        add(jPBACKfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void jLELIMINARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLELIMINARMouseEntered
jLELIMINAR.setForeground(Color.yellow);    }//GEN-LAST:event_jLELIMINARMouseEntered

    private void jLELIMINARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLELIMINARMouseExited
jLELIMINAR.setForeground(Color.black);  
    }//GEN-LAST:event_jLELIMINARMouseExited

    
    
    
    
    
    
    
    
    
    
    private void jLELIMINARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLELIMINARMouseClicked
       
      int filaSeleccionada = jTableMesasDisponible.getSelectedRow();
    if (filaSeleccionada >= 0) {
        // Obtiene el identificador único de la fila seleccionada, por ejemplo, el ID de la mesa
        int idMesa = (int) jTableMesasDisponible.getValueAt(filaSeleccionada, 0);

        // Pregunta al usuario si desea eliminar la mesa
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Desea eliminar esta mesa?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Llama a un método para eliminar la fila en la base de datos (asegúrate de que este método sea válido)
            if (mesaDat.eliminarMesa(idMesa)) {
                JOptionPane.showMessageDialog(this, "Mesa eliminada exitosamente");
                DefaultTableModel model = (DefaultTableModel) jTableMesasDisponible.getModel();
                model.removeRow(filaSeleccionada);
                         cargarMesas();

            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar la mesa", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione una mesa para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jLELIMINARMouseClicked

    private void jLBUSCAR1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR1MouseClicked
        
        
        
       

try {
    String input = JOptionPane.showInputDialog("Ingrese el ID de la mesa:");

    // Verifica si el usuario presionó "Aceptar" o "Cancelar" en el cuadro de diálogo.
   if (input != null) {
            int idMesa = Integer.parseInt(input);

            Mesa mesaEncontrada = mesaDat.buscarPorId(idMesa);

            if (mesaEncontrada != null) {
                // Si se encuentra la mesa, muestra sus detalles en un JOptionPane
                String mensaje = "ID de Mesa: " + mesaEncontrada.getIdMesa() + "\n" +
                                "Capacidad: " + mesaEncontrada.getCapacidad() + "\n" +
                                "Disponibilidad: " + mesaEncontrada.isDiponible() + "\n" +
                                "Atendida: " + mesaEncontrada.isAtendida();
                JOptionPane.showMessageDialog(null, mensaje, "Detalles de la Mesa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró una mesa con el ID proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // El usuario canceló la entrada.
            System.out.println("Operación cancelada.");
        }
    } catch (NumberFormatException e) {
        // Manejo de error si el usuario ingresa un valor que no es un número válido.
        JOptionPane.showMessageDialog(null, "El ID ingresado no es válido. Ingrese un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jLBUSCAR1MouseClicked

    private void jLBUSCAR1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR1MouseEntered
        jLBUSCAR1.setForeground(Color.yellow);
    }//GEN-LAST:event_jLBUSCAR1MouseEntered

    private void jLBUSCAR1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR1MouseExited
        jLBUSCAR1.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_jLBUSCAR1MouseExited

    private void jLAGREGARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAGREGARMouseClicked
         try {
        // Solicitar los datos de la mesa al usuario utilizando JOptionPane
        String capacidadStr = JOptionPane.showInputDialog("Ingrese la capacidad de la mesa:");
        
        // Verificar si el usuario presionó "Cancelar" en alguno de los diálogos
        if (capacidadStr != null ) {
            // Convertir las cadenas de entrada en tipos adecuados
            int capacidad = Integer.parseInt(capacidadStr);
         

            // Crear una nueva instancia de Mesa con los datos ingresados
            Mesa nuevaMesa = new Mesa(capacidad,  true, false);

            // Llamar al método insertarMesa
            mesaDat.insertarMesa(nuevaMesa);
         cargarMesas();

               

        }
                 cargarMesas();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Los datos ingresados no son válidos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jLAGREGARMouseClicked

    private void jLAGREGARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAGREGARMouseEntered
        jLAGREGAR.setForeground(Color.yellow);
    }//GEN-LAST:event_jLAGREGARMouseEntered

    private void jLAGREGARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAGREGARMouseExited
jLAGREGAR.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_jLAGREGARMouseExited

    private void jLMODIFICARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMODIFICARMouseClicked
  try {
        // Solicitar al usuario el ID de la mesa que desea modificar
        String idMesaStr = JOptionPane.showInputDialog("Ingrese el ID de la mesa que desea modificar:");

        if (idMesaStr != null) {
            int idMesa = Integer.parseInt(idMesaStr);
            
           
            Mesa mesa = mesaDat.buscarPorId(idMesa);
            
            if (mesa != null) {
               
                String capacidadStr = JOptionPane.showInputDialog("Nueva capacidad de la mesa:");
                boolean disponibilidad = Boolean.parseBoolean(JOptionPane.showInputDialog("Disponibilidad (true/false):"));
                boolean atendida = Boolean.parseBoolean(JOptionPane.showInputDialog("Atendida (true/false):"));
                
                int nuevaCapacidad = Integer.parseInt(capacidadStr);
                
                
                mesa.setCapacidad(nuevaCapacidad);
                mesa.setDiponible(disponibilidad);
                mesa.setAtendida(atendida);
                
               
                mesaDat.modificarMesa(mesa);
                         cargarMesas();

           
            
                
                JOptionPane.showMessageDialog(this, "Mesa modificada exitosamente");
                                   
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró una mesa con el ID proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Los datos ingresados no son válidos.", "Error", JOptionPane.ERROR_MESSAGE);
    }    }//GEN-LAST:event_jLMODIFICARMouseClicked

    private void jLMODIFICARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMODIFICARMouseEntered
        // TODO add your handling code here:
        jLMODIFICAR.setForeground(Color.yellow);
    }//GEN-LAST:event_jLMODIFICARMouseEntered

    private void jLMODIFICARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMODIFICARMouseExited
        // TODO add your handling code here:
        jLMODIFICAR.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_jLMODIFICARMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLAGREGAR;
    private javax.swing.JLabel jLBUSCAR1;
    private javax.swing.JLabel jLELIMINAR;
    private javax.swing.JLabel jLMODIFICAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JPanel jPBACKfondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableMesasDisponible;
    private javax.swing.JTable jTableMesasReservadas;
    // End of variables declaration//GEN-END:variables
}
