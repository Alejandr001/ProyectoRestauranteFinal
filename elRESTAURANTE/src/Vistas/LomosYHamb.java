/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author User
 */
public class LomosYHamb extends javax.swing.JPanel {

    /**
     * Creates new form PizzaYtacos
     */
    public LomosYHamb() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListHamburgesas = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListLomos = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jListHamburgesas.setBackground(new java.awt.Color(243, 241, 244));
        jListHamburgesas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jListHamburgesas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Hamburguesa Clásica - $2000", "Hamburguesa con Queso - $2200", "Hamburguesa BBQ - $2300", "Hamburguesa Vegetariana - $2000", "Hamburguesa Doble - $3000", "Hamburguesa Especial - $2800", "Hamburguesa Hawaiana - $2600", "Hamburguesa Picante - $2400", "Hamburguesa c/Champiñones-$2500", "Hamburguesa de Pollo - $2300", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListHamburgesas);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 230, 310));

        jListLomos.setBackground(new java.awt.Color(243, 241, 244));
        jListLomos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jListLomos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Lomo Completo - $2500", "Lomo Especial - $2400", "Lomo a la Mostaza - $2300", "Lomo Cheddar - $2400", "Lomo Clásico - $2300", "Lomo Vegetariano - $2300", "Lomo BBQ - $2600", "Lomo con Huevo - $2300", "Lomo con Jamón - $2500" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListLomos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 240, 310));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 240, 10));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lomos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 240, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Hamburguesas");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 240, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 240, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cuaderno-abierto-vacio_400.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.white));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListHamburgesas;
    private javax.swing.JList<String> jListLomos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
