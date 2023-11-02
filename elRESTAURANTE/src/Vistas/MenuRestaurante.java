
package Vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MenuRestaurante extends javax.swing.JFrame {

  int xmouse, ymouse;
    
    
    
    public MenuRestaurante() {
        initComponents();
        this.setLocationRelativeTo(null);
    
          Inicio p1= new Inicio();
        p1.setSize(1000, 440);
        p1.setLocation(0,0);
        
        jPCONTENEDOR.removeAll();
        jPCONTENEDOR.add(p1, BorderLayout.CENTER);
        jPCONTENEDOR.revalidate();
        jPCONTENEDOR.repaint();
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Backg = new javax.swing.JPanel();
        jLexit = new javax.swing.JLabel();
        jPTOP = new javax.swing.JPanel();
        jLCobrosPagos = new javax.swing.JLabel();
        jPCONTENEDOR = new javax.swing.JPanel();
        jLabelfondo = new javax.swing.JLabel();
        jLinicio1 = new javax.swing.JLabel();
        jLREservas = new javax.swing.JLabel();
        jLPedidos = new javax.swing.JLabel();
        jLMenu = new javax.swing.JLabel();
        jLMesas = new javax.swing.JLabel();
        jLPersonal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Backg.setBackground(new java.awt.Color(0, 51, 51));
        Backg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLexit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLexit.setText("X");
        jLexit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLexitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLexitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLexitMouseExited(evt);
            }
        });
        Backg.add(jLexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 20, 20));

        jPTOP.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPTOP.setOpaque(false);
        jPTOP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPTOPMouseDragged(evt);
            }
        });
        jPTOP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPTOPMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPTOPLayout = new javax.swing.GroupLayout(jPTOP);
        jPTOP.setLayout(jPTOPLayout);
        jPTOPLayout.setHorizontalGroup(
            jPTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPTOPLayout.setVerticalGroup(
            jPTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Backg.add(jPTOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 20));

        jLCobrosPagos.setBackground(new java.awt.Color(51, 51, 51));
        jLCobrosPagos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLCobrosPagos.setForeground(new java.awt.Color(204, 204, 204));
        jLCobrosPagos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCobrosPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/dollar_coin_money_icon_231321.png"))); // NOI18N
        jLCobrosPagos.setText("Caja");
        jLCobrosPagos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jLCobrosPagos.setFocusCycleRoot(true);
        jLCobrosPagos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLCobrosPagos.setOpaque(true);
        jLCobrosPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCobrosPagosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCobrosPagosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCobrosPagosMouseExited(evt);
            }
        });
        Backg.add(jLCobrosPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 110, 40));

        jPCONTENEDOR.setBackground(new java.awt.Color(255, 204, 204));
        jPCONTENEDOR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPCONTENEDOR.setForeground(new java.awt.Color(255, 255, 255));
        jPCONTENEDOR.setFocusCycleRoot(true);

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comidarap.png"))); // NOI18N
        jLabelfondo.setText("jLabel1");
        jLabelfondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        javax.swing.GroupLayout jPCONTENEDORLayout = new javax.swing.GroupLayout(jPCONTENEDOR);
        jPCONTENEDOR.setLayout(jPCONTENEDORLayout);
        jPCONTENEDORLayout.setHorizontalGroup(
            jPCONTENEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jPCONTENEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPCONTENEDORLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPCONTENEDORLayout.setVerticalGroup(
            jPCONTENEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(jPCONTENEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPCONTENEDORLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Backg.add(jPCONTENEDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 430));

        jLinicio1.setBackground(new java.awt.Color(51, 51, 51));
        jLinicio1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLinicio1.setForeground(new java.awt.Color(204, 204, 204));
        jLinicio1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLinicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/Home_26982.png"))); // NOI18N
        jLinicio1.setText("Inicio");
        jLinicio1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jLinicio1.setFocusCycleRoot(true);
        jLinicio1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLinicio1.setOpaque(true);
        jLinicio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLinicio1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLinicio1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLinicio1MouseExited(evt);
            }
        });
        Backg.add(jLinicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 40));

        jLREservas.setBackground(new java.awt.Color(51, 51, 51));
        jLREservas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLREservas.setForeground(new java.awt.Color(204, 204, 204));
        jLREservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/calendar_date_icon_231304.png"))); // NOI18N
        jLREservas.setText("Reservas");
        jLREservas.setToolTipText("");
        jLREservas.setAlignmentX(0.5F);
        jLREservas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jLREservas.setFocusCycleRoot(true);
        jLREservas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLREservas.setOpaque(true);
        jLREservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLREservasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLREservasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLREservasMouseExited(evt);
            }
        });
        Backg.add(jLREservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 110, 40));

        jLPedidos.setBackground(new java.awt.Color(51, 51, 51));
        jLPedidos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLPedidos.setForeground(new java.awt.Color(204, 204, 204));
        jLPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/shopping_cart_icon_192637.png"))); // NOI18N
        jLPedidos.setText("Pedidos");
        jLPedidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jLPedidos.setFocusCycleRoot(true);
        jLPedidos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLPedidos.setOpaque(true);
        jLPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPedidosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLPedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLPedidosMouseExited(evt);
            }
        });
        Backg.add(jLPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 110, 40));

        jLMenu.setBackground(new java.awt.Color(51, 51, 51));
        jLMenu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLMenu.setForeground(new java.awt.Color(204, 204, 204));
        jLMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/menu_food_cafe_vintage_icon_147397.png"))); // NOI18N
        jLMenu.setText("Menu");
        jLMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jLMenu.setFocusCycleRoot(true);
        jLMenu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLMenu.setOpaque(true);
        jLMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLMenuMouseExited(evt);
            }
        });
        Backg.add(jLMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 90, 40));

        jLMesas.setBackground(new java.awt.Color(51, 51, 51));
        jLMesas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLMesas.setForeground(new java.awt.Color(204, 204, 204));
        jLMesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/house_kitchen_table_icon-icons.com_74372 (1).png"))); // NOI18N
        jLMesas.setText("Mesas");
        jLMesas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jLMesas.setFocusCycleRoot(true);
        jLMesas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLMesas.setOpaque(true);
        jLMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMesasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLMesasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLMesasMouseExited(evt);
            }
        });
        Backg.add(jLMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 100, 40));

        jLPersonal.setBackground(new java.awt.Color(51, 51, 51));
        jLPersonal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLPersonal.setForeground(new java.awt.Color(204, 204, 204));
        jLPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono/Clients_27015.png"))); // NOI18N
        jLPersonal.setText("Personal");
        jLPersonal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jLPersonal.setFocusCycleRoot(true);
        jLPersonal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLPersonal.setOpaque(true);
        jLPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPersonalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLPersonalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLPersonalMouseExited(evt);
            }
        });
        Backg.add(jLPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLCobrosPagosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCobrosPagosMouseEntered
         
         jLCobrosPagos.setForeground(Color.yellow);
    }//GEN-LAST:event_jLCobrosPagosMouseEntered

    private void jLCobrosPagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCobrosPagosMouseExited
      
      jLCobrosPagos.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jLCobrosPagosMouseExited

    private void jLexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLexitMouseEntered
        jLexit.setBackground(Color.black);
       jLexit.setForeground(Color.red);
    }//GEN-LAST:event_jLexitMouseEntered

    private void jLexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLexitMouseClicked
       JOptionPane.showMessageDialog(this, "Saliendo");
       System.exit(0);
    }//GEN-LAST:event_jLexitMouseClicked

    private void jLexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLexitMouseExited
      jLexit.setBackground(new Color(240,240,240));
       jLexit.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLexitMouseExited

    private void jLCobrosPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCobrosPagosMouseClicked
         
        //clave
        String clave = JOptionPane.showInputDialog(this, "Ingrese clave de acceso:");
        String claveReal="alejandro";
        if (clave != null && !clave.isEmpty()) {
            try {
                if (claveReal.equals(clave)) {

                    JOptionPane.showMessageDialog(this, "Acceso permitido");

                    CobrosPagos p1 = new CobrosPagos();
                    p1.setSize(1000, 440);
                    p1.setLocation(0, 0);

                    jPCONTENEDOR.removeAll();
                    jPCONTENEDOR.add(p1, BorderLayout.CENTER);
                    jPCONTENEDOR.revalidate();
                    jPCONTENEDOR.repaint();
                    System.out.println("aqui");
                } else {
                    JOptionPane.showMessageDialog(this, "Clave incorrecta");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "ID de reserva no válido. Ingrese un número válido.");
            }
        }

      
      
      
      
      
        
//       CobrosPagos p1= new CobrosPagos();
//        p1.setSize(1000, 440);
//        p1.setLocation(0,0);
//        
//        jPCONTENEDOR.removeAll();
//        jPCONTENEDOR.add(p1, BorderLayout.CENTER);
//        jPCONTENEDOR.revalidate();
//        jPCONTENEDOR.repaint();
    }//GEN-LAST:event_jLCobrosPagosMouseClicked

    private void jPTOPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPTOPMousePressed
     xmouse=evt.getX();ymouse=evt.getY();
    }//GEN-LAST:event_jPTOPMousePressed

    private void jPTOPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPTOPMouseDragged
       
        int x= evt.getXOnScreen();
     int y= evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
        
        
        
    }//GEN-LAST:event_jPTOPMouseDragged

    private void jLinicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLinicio1MouseClicked
     Inicio p1= new Inicio();
        p1.setSize(1000, 440);
        p1.setLocation(0,0);
        
        jPCONTENEDOR.removeAll();
        jPCONTENEDOR.add(p1, BorderLayout.CENTER);
        jPCONTENEDOR.revalidate();
        jPCONTENEDOR.repaint();
    }//GEN-LAST:event_jLinicio1MouseClicked

    private void jLinicio1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLinicio1MouseEntered
jLinicio1.setForeground(Color.yellow);

    }//GEN-LAST:event_jLinicio1MouseEntered

    private void jLinicio1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLinicio1MouseExited
jLinicio1.setForeground(Color.LIGHT_GRAY);    }//GEN-LAST:event_jLinicio1MouseExited

    private void jLREservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLREservasMouseClicked
        Reservas p1= new Reservas();
        p1.setSize(1000, 440);
        p1.setLocation(0,0);
        
        jPCONTENEDOR.removeAll();
        jPCONTENEDOR.add(p1, BorderLayout.CENTER);
        jPCONTENEDOR.revalidate();
        jPCONTENEDOR.repaint();
    }//GEN-LAST:event_jLREservasMouseClicked

    private void jLREservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLREservasMouseEntered
jLREservas.setForeground(Color.yellow);    }//GEN-LAST:event_jLREservasMouseEntered

    private void jLREservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLREservasMouseExited
jLREservas.setForeground(Color.LIGHT_GRAY);    }//GEN-LAST:event_jLREservasMouseExited

    private void jLPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPedidosMouseClicked
       Pedidos p1= new Pedidos();
        p1.setSize(1000, 440);
        p1.setLocation(0,0);
        
        jPCONTENEDOR.removeAll();
        jPCONTENEDOR.add(p1, BorderLayout.CENTER);
        jPCONTENEDOR.revalidate();
        jPCONTENEDOR.repaint();
    }//GEN-LAST:event_jLPedidosMouseClicked

    private void jLPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPedidosMouseEntered
jLPedidos.setForeground(Color.yellow);    }//GEN-LAST:event_jLPedidosMouseEntered

    private void jLPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPedidosMouseExited
jLPedidos.setForeground(Color.LIGHT_GRAY);    }//GEN-LAST:event_jLPedidosMouseExited

    private void jLMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMenuMouseClicked
         MenuDeProductos p1 = null;
    try {
        p1 = new MenuDeProductos();
        p1.setSize(1000, 440);
        p1.setLocation(0,0);

        jPCONTENEDOR.removeAll();
        jPCONTENEDOR.add(p1, BorderLayout.CENTER);
        jPCONTENEDOR.revalidate();
        jPCONTENEDOR.repaint();
    } catch (SQLException ex) {
        Logger.getLogger(MenuRestaurante.class.getName()).log(Level.SEVERE, "Error al crear MenuDeProductos", ex);
    }
    }//GEN-LAST:event_jLMenuMouseClicked

    private void jLMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMenuMouseEntered
jLMenu.setForeground(Color.YELLOW);    }//GEN-LAST:event_jLMenuMouseEntered

    private void jLMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMenuMouseExited
jLMenu.setForeground(Color.LIGHT_GRAY);    }//GEN-LAST:event_jLMenuMouseExited

    private void jLMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMesasMouseClicked
        Mesas p1= new Mesas();
        p1.setSize(1000, 440);
        p1.setLocation(0,0);
        
        jPCONTENEDOR.removeAll();
        jPCONTENEDOR.add(p1, BorderLayout.CENTER);
        jPCONTENEDOR.revalidate();
        jPCONTENEDOR.repaint();
    }//GEN-LAST:event_jLMesasMouseClicked

    private void jLMesasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMesasMouseEntered
jLMesas.setForeground(Color.yellow);    }//GEN-LAST:event_jLMesasMouseEntered

    private void jLMesasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMesasMouseExited
      jLMesas.setForeground(Color.LIGHT_GRAY); 
    }//GEN-LAST:event_jLMesasMouseExited

    private void jLPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPersonalMouseClicked
        Personal  p1= new Personal();
        p1.setSize(1000, 440);
        p1.setLocation(0,0);
        
        jPCONTENEDOR.removeAll();
        jPCONTENEDOR.add(p1, BorderLayout.CENTER);
        jPCONTENEDOR.revalidate();
        jPCONTENEDOR.repaint();
    }//GEN-LAST:event_jLPersonalMouseClicked

    private void jLPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPersonalMouseEntered
jLPersonal.setForeground(Color.yellow);    }//GEN-LAST:event_jLPersonalMouseEntered

    private void jLPersonalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPersonalMouseExited
jLPersonal.setForeground(Color.LIGHT_GRAY);    }//GEN-LAST:event_jLPersonalMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRestaurante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backg;
    private javax.swing.JLabel jLCobrosPagos;
    private javax.swing.JLabel jLMenu;
    private javax.swing.JLabel jLMesas;
    private javax.swing.JLabel jLPedidos;
    private javax.swing.JLabel jLPersonal;
    private javax.swing.JLabel jLREservas;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JLabel jLexit;
    private javax.swing.JLabel jLinicio1;
    private javax.swing.JPanel jPCONTENEDOR;
    private javax.swing.JPanel jPTOP;
    // End of variables declaration//GEN-END:variables
}
