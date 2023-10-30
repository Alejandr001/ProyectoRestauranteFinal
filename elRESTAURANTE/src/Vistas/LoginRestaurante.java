
package Vistas;

import AccesoData.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginRestaurante extends javax.swing.JFrame {
 private Connection con = null;
 
    public LoginRestaurante() {
        initComponents();
          this.setLocationRelativeTo(null);
    }

    int xMouse, yMouse;
    
      
       
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        jLsalida = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jBRecuperar = new javax.swing.JButton();
        jBINGRESAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        JlTopWindow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesion");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        BackGround.setBackground(new java.awt.Color(0, 0, 0));
        BackGround.setForeground(new java.awt.Color(208, 208, 208));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLsalida.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLsalida.setForeground(new java.awt.Color(102, 102, 102));
        jLsalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLsalida.setText("X");
        jLsalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLsalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLsalida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLsalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLsalidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLsalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLsalidaMouseExited(evt);
            }
        });
        BackGround.add(jLsalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 20, 20));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(153, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("Iniciar Sesion");

        jPasswordField.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(255, 255, 153));
        jPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPasswordField.setOpaque(true);
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jTextFieldUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldUsuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(255, 255, 153));
        jTextFieldUsuario.setToolTipText("");
        jTextFieldUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jTextFieldUsuario.setOpaque(true);
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });

        jBRecuperar.setBackground(new java.awt.Color(51, 51, 51));
        jBRecuperar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBRecuperar.setForeground(new java.awt.Color(255, 255, 204));
        jBRecuperar.setText("Recuperar");
        jBRecuperar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBRecuperar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBRecuperarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBRecuperarMouseExited(evt);
            }
        });
        jBRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRecuperarActionPerformed(evt);
            }
        });

        jBINGRESAR.setBackground(new java.awt.Color(51, 51, 51));
        jBINGRESAR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBINGRESAR.setForeground(new java.awt.Color(255, 255, 204));
        jBINGRESAR.setText("Ingresar");
        jBINGRESAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBINGRESAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBINGRESARMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBINGRESARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBINGRESARMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jBRecuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBINGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRecuperar)
                    .addComponent(jBINGRESAR))
                .addContainerGap())
        );

        BackGround.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 390, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comidarap.png"))); // NOI18N
        jLabel1.setAutoscrolls(true);
        BackGround.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 560));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        BackGround.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 30));

        JlTopWindow.setBackground(new java.awt.Color(229, 35, 67));
        JlTopWindow.setForeground(new java.awt.Color(204, 204, 204));
        JlTopWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BackGround.add(JlTopWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLsalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLsalidaMouseClicked
       JOptionPane.showMessageDialog(this, "Saliendo");
       System.exit(0);
               
    }//GEN-LAST:event_jLsalidaMouseClicked

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
xMouse=evt.getX();
yMouse=evt.getY();
        
        
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
     int x= evt.getXOnScreen();
     int y= evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jLsalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLsalidaMouseEntered
       jLsalida.setBackground(Color.red);
       jLsalida.setForeground(Color.red);
    }//GEN-LAST:event_jLsalidaMouseEntered

    private void jLsalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLsalidaMouseExited
        jLsalida.setBackground(new Color(60,63,65));
         jLsalida.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLsalidaMouseExited

    private void jBRecuperarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRecuperarMouseEntered
          jBRecuperar.setBackground(new Color(204,204,204));
        jBRecuperar.setForeground(new Color(232,35,67));
    }//GEN-LAST:event_jBRecuperarMouseEntered

    private void jBRecuperarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRecuperarMouseExited
         jBRecuperar.setBackground(Color.black);
        jBRecuperar.setForeground(Color.yellow);   
    }//GEN-LAST:event_jBRecuperarMouseExited

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed

    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jBINGRESARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBINGRESARMouseExited
        jBINGRESAR.setBackground(Color.black);
        jBINGRESAR.setForeground(Color.yellow);    
    }//GEN-LAST:event_jBINGRESARMouseExited

    private void jBINGRESARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBINGRESARMouseEntered
       jBINGRESAR.setBackground(new Color(204,204,204));
        jBINGRESAR.setForeground(new Color(232,35,67));
    }//GEN-LAST:event_jBINGRESARMouseEntered

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jBINGRESARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBINGRESARMouseClicked
  
         char[] passwordChars = jPasswordField.getPassword();
        String password = new String(passwordChars);
        String usuario = jTextFieldUsuario.getText();
        
        usuarioContraseña(usuario, password);
     

  
  
} 
       
     public void usuarioContraseña(String user, String pass) {
         
         con = Conexion.getConexion();
    String sql = "SELECT `idMesero`, `nombre`, `apellido`, `usuario`, `contraseña`, `estado` FROM `mesero` WHERE `usuario` = ? AND `contraseña` = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, user);
        ps.setString(2, pass);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int idMesero = rs.getInt("idMesero");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String usuario = rs.getString("usuario");
            String contraseña = rs.getString("contraseña");
            String estado = rs.getString("estado");

            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. Bienvenido, " + nombre + " " + apellido);
            dispose();
        new MenuRestaurante().setVisible(true);
        
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Por favor, inténtalo nuevamente.");
        }

        rs.close();
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero: " + ex.getMessage());
    }    
        
        
    }//GEN-LAST:event_jBINGRESARMouseClicked

    private void jBRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRecuperarActionPerformed
         JOptionPane.showMessageDialog(this, "Se envio la contraseña al correo enlasado al usuario, gracias");
    }//GEN-LAST:event_jBRecuperarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginRestaurante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JLabel JlTopWindow;
    private javax.swing.JButton jBINGRESAR;
    private javax.swing.JButton jBRecuperar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLsalida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
