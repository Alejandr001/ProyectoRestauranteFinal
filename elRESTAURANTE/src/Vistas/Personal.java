package Vistas;

import AccesoData.MeseroData;
import Entidades.Mesero;
import java.awt.Color;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Personal extends javax.swing.JPanel {

    private DefaultTableModel modelo = new DefaultTableModel();
    private DefaultTableModel modelo2 = new DefaultTableModel();
    private DefaultTableModel modPed = new DefaultTableModel();
    private List<Mesero> listaUno;

    private List<Mesero> listaDos;
    private List<Pedidos> listaPedidos;
    private List<Mesero> listamesero;

    MeseroData msd = new MeseroData();

    
    
    
    public Personal() {
        initComponents();

        modelo.addColumn("ID n°");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
  modelo.addColumn("estado");
        
        modelo2.addColumn("ID n°");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Apellido");
modelo2.addColumn("estado");
        modPed.addColumn("Id Pedido");
        modPed.addColumn("Id Mesa");
        modPed.addColumn("Importe");

        jTablePersonal.setModel(modelo);
        jTablePersonal1.setModel(modPed);
        listaUno = msd.obtenerTodosLosMeseros();
        listamesero = msd.obtenerTodosLosMeseros();
        cargarMesero();
        cargarMeserosCB();

        ButtonGroup group = new ButtonGroup();
        group.add(jRadioBuACTIVA);
        group.add(jRadioBuCANCELADA);
    }

    public boolean isCellEditable(int fila, int columna) {
        return false;
    }

    
    
    
    
    private void cargarMeserosCB() {
        jComboBoxMESEROS.removeAllItems();
        for (Mesero mesero : listamesero) {
            if (mesero.isEstado()) {
                jComboBoxMESEROS.addItem(mesero.getNombre() + " " + mesero.getApellido());
            }
        }
    }

    private void cargarMesero() {
        modelo.setRowCount(0);
        modelo2.setRowCount(0);

        for (Mesero mesero : listaUno) {
            if (mesero.isEstado()) {
                modelo.addRow(new Object[]{mesero.getIdMesero(), mesero.getNombre(), mesero.getApellido()});

            } else {
                modelo2.addRow(new Object[]{mesero.getIdMesero(), mesero.getNombre(), mesero.getApellido()});
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
        jLabel6 = new javax.swing.JLabel();
        jLSuma1 = new javax.swing.JLabel();
        jLREsta1 = new javax.swing.JLabel();
        jLBorratabla = new javax.swing.JLabel();
        jTextTOTAL = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePersonal1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBoxMESEROS = new javax.swing.JComboBox<>();
        jRadioBuACTIVA = new javax.swing.JRadioButton();
        jRadioBuCANCELADA = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePersonal = new javax.swing.JTable();
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

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 50, 20));

        jLSuma1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLSuma1.setForeground(new java.awt.Color(51, 51, 51));
        jLSuma1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSuma1.setText("+");
        jLSuma1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLSuma1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSuma1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSuma1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSuma1MouseExited(evt);
            }
        });
        add(jLSuma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 20, 20));

        jLREsta1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLREsta1.setForeground(new java.awt.Color(51, 51, 51));
        jLREsta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLREsta1.setText("-");
        jLREsta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLREsta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLREsta1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLREsta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLREsta1MouseExited(evt);
            }
        });
        add(jLREsta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 20, 20));

        jLBorratabla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLBorratabla.setForeground(new java.awt.Color(51, 51, 51));
        jLBorratabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBorratabla.setText("x");
        jLBorratabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLBorratabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBorratablaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBorratablaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBorratablaMouseExited(evt);
            }
        });
        add(jLBorratabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 20, 20));

        jTextTOTAL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextTOTAL.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextTOTAL.setBorder(null);
        jTextTOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTOTALActionPerformed(evt);
            }
        });
        add(jTextTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 90, -1));

        jTablePersonal1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTablePersonal1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID pedidos", "ID Mesa", "Importe"
            }
        ));
        jScrollPane2.setViewportView(jTablePersonal1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 330, 230));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Fecha");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 40, 20));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, -1));

        jComboBoxMESEROS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBoxMESEROS.setForeground(new java.awt.Color(204, 255, 255));
        jComboBoxMESEROS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jComboBoxMESEROS, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 100, -1));

        jRadioBuACTIVA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioBuACTIVA.setForeground(new java.awt.Color(51, 51, 51));
        jRadioBuACTIVA.setSelected(true);
        jRadioBuACTIVA.setText("Activos");
        jRadioBuACTIVA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jRadioBuACTIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBuACTIVAActionPerformed(evt);
            }
        });
        add(jRadioBuACTIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 70, -1));

        jRadioBuCANCELADA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioBuCANCELADA.setForeground(new java.awt.Color(51, 51, 51));
        jRadioBuCANCELADA.setText("Inactivos");
        jRadioBuCANCELADA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jRadioBuCANCELADA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBuCANCELADAActionPerformed(evt);
            }
        });
        add(jRadioBuCANCELADA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 100, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Personal");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 230, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 240, 10));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Billetera Personal ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 240, 20));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 240, 10));

        jTablePersonal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTablePersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Personal", "Nombre", "Apellido", "Usuario", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(jTablePersonal);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 330, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cuaderno-abierto-vacio_23-2147978156.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.white));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 750, 410));

        jPBACKfondo.setBackground(new java.awt.Color(204, 204, 204));
        jPBACKfondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPBACKfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comidarap.png"))); // NOI18N
        jLabelfondo.setText("jLabel1");
        jLabelfondo.setOpaque(true);
        jPBACKfondo.add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 1000, 430));

        add(jPBACKfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void jLELIMINARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLELIMINARMouseEntered
        jLELIMINAR.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jLELIMINARMouseEntered

    private void jLELIMINARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLELIMINARMouseExited
jLELIMINAR.setForeground(Color.DARK_GRAY);    }//GEN-LAST:event_jLELIMINARMouseExited

    private void jLELIMINARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLELIMINARMouseClicked
  try {
        // Pide al usuario que ingrese el ID del mesero a eliminar
        String idInput = JOptionPane.showInputDialog(this, "Ingresa el ID del mesero a eliminar:");
        
        if (idInput != null) {
            int idMesero = Integer.parseInt(idInput);
            
            // Obtén el mesero antes de eliminarlo para mostrar su información
            Mesero meseroEliminado = msd.obtenerMeseroPorId(idMesero);

            // Elimina el mesero
            msd.eliminarMesero(idMesero);

            // Muestra la información del mesero eliminado en un JOptionPane
            if (meseroEliminado != null) {
                String mensaje = "Mesero Eliminado:\n";
                mensaje += "ID: " + meseroEliminado.getIdMesero() + "\n";
                mensaje += "Nombre: " + meseroEliminado.getNombre() + "\n";
                mensaje += "Apellido: " + meseroEliminado.getApellido() + "\n";
                mensaje += "Usuario: " + meseroEliminado.getUsuario();
                JOptionPane.showMessageDialog(this, mensaje, "Mesero Eliminado", JOptionPane.INFORMATION_MESSAGE);
            }

            // Actualiza la tabla
         cargarMesero();
        jTablePersonal.setModel(modelo2);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID no válido. La eliminación ha sido cancelada.");
    }

    }//GEN-LAST:event_jLELIMINARMouseClicked

    private void jLBUSCAR1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR1MouseClicked
        // Muestra un cuadro de diálogo para que el usuario seleccione si desea buscar por ID o por nombre.
        String[] opciones = {"Buscar por ID", "Buscar por nombre"};
        int seleccion = JOptionPane.showOptionDialog(this, "Seleccione cómo desea buscar al Mesero:", "Buscar Mesero", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (seleccion == 0) {
            // Buscar por ID
            String idString = JOptionPane.showInputDialog(this, "Ingrese el ID del Mesero:");
            try {
                int idMesero = Integer.parseInt(idString);
                Mesero mesero = msd.obtenerMeseroPorId(idMesero);
                if (mesero != null) {
                    // Si se encontró al Mesero, muestra sus datos en un JOptionPane.
                    JOptionPane.showMessageDialog(this, "ID: " + mesero.getIdMesero() + "\nNombre: " + mesero.getNombre() + "\nApellido: " + mesero.getApellido() + "\nUsuario: " + mesero.getUsuario());
                } else {
                    // Si no se encontró al Mesero, muestra un mensaje de error.
                    JOptionPane.showMessageDialog(this, "Mesero no encontrado por ID: " + idMesero, "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                // Manejo de error si el usuario ingresa un valor no válido para el ID.
                JOptionPane.showMessageDialog(this, "ID no válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (seleccion == 1) {
            // Buscar por nombre
            String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del Mesero:");
            Mesero mesero = msd.obtenerMeseroPorUsuario(nombre);
            if (mesero != null) {
                // Si se encontró al Mesero, muestra sus datos en un JOptionPane.
                String mensaje = "Mesero Agregado:\n";
            mensaje += "Nombre: " + mesero.getNombre() + "\n";
            mensaje += "Apellido: " + mesero.getApellido() + "\n";
            mensaje += "Usuario: " + mesero.getUsuario() + "\n";
            mensaje += "Estado: " + mesero.isEstado();
            JOptionPane.showMessageDialog(this, mensaje, "Mesero Encontrado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Si no se encontró al Mesero, muestra un mensaje de error.
                JOptionPane.showMessageDialog(this, "Mesero no encontrado por nombre: " + nombre, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_jLBUSCAR1MouseClicked

    private void jLBUSCAR1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR1MouseEntered
jLBUSCAR1.setForeground(Color.yellow);    }//GEN-LAST:event_jLBUSCAR1MouseEntered

    private void jLBUSCAR1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBUSCAR1MouseExited
jLBUSCAR1.setForeground(Color.DARK_GRAY);    }//GEN-LAST:event_jLBUSCAR1MouseExited

    private void jLAGREGARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAGREGARMouseClicked
 // Solicitar los datos del mesero utilizando JOptionPane
    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del mesero:");
    String apellido = JOptionPane.showInputDialog("Ingrese el apellido del mesero:");
    String usuario = JOptionPane.showInputDialog("Ingrese el usuario del mesero:");
    String contraseña = JOptionPane.showInputDialog("Ingrese la contraseña del mesero:");

    // Solicitar el estado del mesero utilizando JOptionPane
    String estadoInput = JOptionPane.showInputDialog("Ingrese el estado del mesero (true o false):");

    // Verificar que el nombre y el estado no sean nulos o vacíos
    if (nombre != null && !nombre.isEmpty() && estadoInput != null && !estadoInput.isEmpty()) {
        boolean estado = Boolean.parseBoolean(estadoInput);

        // Crear un objeto Mesero con los datos ingresados
        Mesero mesero = new Mesero(nombre, apellido, usuario, contraseña, estado);

        // Insertar el mesero en la base de datos
        msd.insertarMesero(mesero);

        // Agregar el mesero al modelo de la tabla
        modelo.addRow(new Object[]{mesero.getIdMesero(), mesero.getNombre(), mesero.getApellido()});

        // Establecer el modelo actualizado en la jTablePersonal
        jTablePersonal.setModel(modelo);

        // Mostrar el mesero agregado en un JOptionPane, incluyendo el ID
        String mensaje = "Mesero Agregado:\n";
        mensaje += "ID: " + mesero.getIdMesero() + "\n";
        mensaje += "Nombre: " + mesero.getNombre() + "\n";
        mensaje += "Apellido: " + mesero.getApellido() + "\n";
        mensaje += "Usuario: " + mesero.getUsuario() + "\n";
        mensaje += "Estado: " + mesero.isEstado();
        JOptionPane.showMessageDialog(this, mensaje, "Mesero Agregado", JOptionPane.INFORMATION_MESSAGE);
    } else {
        System.out.println("El campo 'nombre' o 'estado' no pueden ser nulos o vacíos.");
    }
    }//GEN-LAST:event_jLAGREGARMouseClicked

    private void jLAGREGARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAGREGARMouseEntered
        jLAGREGAR.setForeground(Color.yellow);                                          
    }//GEN-LAST:event_jLAGREGARMouseEntered

    private void jLAGREGARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAGREGARMouseExited
jLAGREGAR.setForeground(Color.DARK_GRAY);    }//GEN-LAST:event_jLAGREGARMouseExited

    private void jLMODIFICARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMODIFICARMouseClicked
         String idStr = JOptionPane.showInputDialog("Ingrese el ID del mesero a modificar:");

    if (idStr != null && !idStr.isEmpty()) {
        try {
            int idMesero = Integer.parseInt(idStr);
            Mesero mesero = msd.obtenerMeseroPorId(idMesero);

            if (mesero != null) {
                // Mostrar un cuadro de diálogo para ingresar nuevos valores
                String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre:", mesero.getNombre());
                String nuevoApellido = JOptionPane.showInputDialog("Nuevo apellido:", mesero.getApellido());
                String nuevoUsuario = JOptionPane.showInputDialog("Nuevo usuario:", mesero.getUsuario());
                String nuevaContraseña = JOptionPane.showInputDialog("Nueva contraseña:", mesero.getContraseña());

                // Agregar estado
                boolean nuevoEstado = mesero.isEstado(); // Estado actual

                String estadoInput = JOptionPane.showInputDialog("Nuevo estado (true o false):", String.valueOf(nuevoEstado));

                if (estadoInput != null) {
                    nuevoEstado = Boolean.parseBoolean(estadoInput);
                }

                // Actualizar los datos del mesero
                mesero.setNombre(nuevoNombre);
                mesero.setApellido(nuevoApellido);
                mesero.setUsuario(nuevoUsuario);
                mesero.setContraseña(nuevaContraseña);
                mesero.setEstado(nuevoEstado);

                // Llamar al método para modificar el mesero en la base de datos
                msd.modificarMesero(mesero);
                String mensaje = "Mesero Agregado:\n";
            mensaje += "Nombre: " + mesero.getNombre() + "\n";
            mensaje += "Apellido: " + mesero.getApellido() + "\n";
            mensaje += "Usuario: " + mesero.getUsuario() + "\n";
            mensaje += "Estado: " + mesero.isEstado();
            JOptionPane.showMessageDialog(this, mensaje, "Mesero Modificado", JOptionPane.INFORMATION_MESSAGE);
                cargarMesero();
                jTablePersonal.setModel(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "Mesero no encontrado por ID: " + idMesero);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID de mesero no válido. Ingrese un número válido.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "ID de mesero no ingresado. Debe ingresar un ID válido.");
    }

    }//GEN-LAST:event_jLMODIFICARMouseClicked

    private void jLMODIFICARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMODIFICARMouseEntered
jLMODIFICAR.setForeground(Color.yellow);    }//GEN-LAST:event_jLMODIFICARMouseEntered

    private void jLMODIFICARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMODIFICARMouseExited
jLMODIFICAR.setForeground(Color.DARK_GRAY);                                 
    }//GEN-LAST:event_jLMODIFICARMouseExited

    private void jRadioBuCANCELADAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBuCANCELADAActionPerformed
           cargarMesero();
        jTablePersonal.setModel(modelo2);
        cargarMesero();


    }//GEN-LAST:event_jRadioBuCANCELADAActionPerformed

    private void jTextTOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTOTALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTOTALActionPerformed

    private void jLSuma1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSuma1MouseClicked

    }//GEN-LAST:event_jLSuma1MouseClicked

    private void jLSuma1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSuma1MouseEntered
        jLSuma1.setForeground(Color.green);
    }//GEN-LAST:event_jLSuma1MouseEntered

    private void jLSuma1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSuma1MouseExited
        jLSuma1.setForeground(Color.black);
    }//GEN-LAST:event_jLSuma1MouseExited

    private void jLREsta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLREsta1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLREsta1MouseClicked

    private void jLREsta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLREsta1MouseEntered
        jLREsta1.setForeground(Color.green);
    }//GEN-LAST:event_jLREsta1MouseEntered

    private void jLREsta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLREsta1MouseExited
        jLREsta1.setForeground(Color.black);
    }//GEN-LAST:event_jLREsta1MouseExited

    private void jLBorratablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBorratablaMouseClicked

    }//GEN-LAST:event_jLBorratablaMouseClicked

    private void jLBorratablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBorratablaMouseEntered
        jLBorratabla.setForeground(Color.green);
    }//GEN-LAST:event_jLBorratablaMouseEntered

    private void jLBorratablaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBorratablaMouseExited
        jLBorratabla.setForeground(Color.black);
    }//GEN-LAST:event_jLBorratablaMouseExited

    private void jRadioBuACTIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBuACTIVAActionPerformed
         cargarMesero();
        jTablePersonal.setModel(modelo);

        cargarMesero();

    }//GEN-LAST:event_jRadioBuACTIVAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxMESEROS;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLAGREGAR;
    private javax.swing.JLabel jLBUSCAR1;
    private javax.swing.JLabel jLBorratabla;
    private javax.swing.JLabel jLELIMINAR;
    private javax.swing.JLabel jLMODIFICAR;
    private javax.swing.JLabel jLREsta1;
    private javax.swing.JLabel jLSuma1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JPanel jPBACKfondo;
    private javax.swing.JRadioButton jRadioBuACTIVA;
    private javax.swing.JRadioButton jRadioBuCANCELADA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTablePersonal;
    private javax.swing.JTable jTablePersonal1;
    private javax.swing.JTextField jTextTOTAL;
    // End of variables declaration//GEN-END:variables
}
