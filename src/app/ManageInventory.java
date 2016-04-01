/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Kevin
 */
public class ManageInventory extends javax.swing.JFrame {

    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Creates new form CreateItem
     */
    public ManageInventory() {
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

        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                java.awt.Graphics2D g2d1 = (java.awt.Graphics2D) g.create();
                java.awt.RenderingHints hints1 = new java.awt.RenderingHints(
                    java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
                java.awt.RenderingHints render1 = new java.awt.RenderingHints(java.awt.RenderingHints.KEY_RENDERING, java.awt.RenderingHints.VALUE_RENDER_SPEED);
                hints1.add(render1);
                g2d1.setRenderingHints(hints1);
                java.awt.Polygon p1 = new java.awt.Polygon();
                p1.addPoint(0, 0);
                p1.addPoint(0, 200);

                p1.addPoint(this.getWidth() + 50, 200);
                p1.addPoint(this.getWidth() + 50, 0);
                java.awt.GradientPaint gp1 = new java.awt.GradientPaint(0.0f, 200.0f, new java.awt.Color(20, 60, 100),
                    0.0f, 0.0f, new java.awt.Color(100, 200, 200, 255), true);

                g2d1.setColor(new java.awt.Color(20, 60, 100));
                g2d1.fill(getBounds());
                g2d1.setPaint(gp1);
                g2d1.fill(p1);
                //Image img=	image.getImage("/resources/GameIcon2.jpg");
            }};
            BackButton = new javax.swing.JButton();
            jTabbedPane1 = new javax.swing.JTabbedPane();
            CreateNewItem = new javax.swing.JPanel();
            IDLabel = new javax.swing.JLabel();
            NameLabel = new javax.swing.JLabel();
            PriceLabel = new javax.swing.JLabel();
            QuantityLabel = new javax.swing.JLabel();
            IDNumField = new javax.swing.JTextField();
            NameField = new javax.swing.JTextField();
            PriceField = new javax.swing.JTextField();
            QuantityField = new javax.swing.JTextField();
            AddItemButton = new javax.swing.JButton();
            AddExistingItems = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Create Item");

            jPanel1.setBackground(new java.awt.Color(0, 102, 153));

            BackButton.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
            BackButton.setText("Back to Menu");
            BackButton.setFocusPainted(false);
            BackButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BackButtonActionPerformed(evt);
                }
            });

            jTabbedPane1.setOpaque(false);
            jTabbedPane1.setName(""); // NOI18N

            CreateNewItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

            IDLabel.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
            IDLabel.setText("Item ID Number");

            NameLabel.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
            NameLabel.setText("Item Name");

            PriceLabel.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
            PriceLabel.setText("Selling Price");

            QuantityLabel.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
            QuantityLabel.setText("Quantity");

            IDNumField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    IDNumFieldActionPerformed(evt);
                }
            });

            NameField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    NameFieldActionPerformed(evt);
                }
            });

            AddItemButton.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
            AddItemButton.setText("Add New Item");
            AddItemButton.setFocusPainted(false);
            AddItemButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    AddItemButtonActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout CreateNewItemLayout = new javax.swing.GroupLayout(CreateNewItem);
            CreateNewItem.setLayout(CreateNewItemLayout);
            CreateNewItemLayout.setHorizontalGroup(
                CreateNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateNewItemLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(CreateNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(IDLabel)
                        .addComponent(NameLabel)
                        .addComponent(PriceLabel)
                        .addComponent(QuantityLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CreateNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(QuantityField)
                        .addComponent(IDNumField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addComponent(NameField, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(PriceField, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap())
                .addGroup(CreateNewItemLayout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(AddItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(111, Short.MAX_VALUE))
            );
            CreateNewItemLayout.setVerticalGroup(
                CreateNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CreateNewItemLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(CreateNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IDNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IDLabel))
                    .addGap(18, 18, 18)
                    .addGroup(CreateNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NameLabel))
                    .addGap(18, 18, 18)
                    .addGroup(CreateNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PriceLabel))
                    .addGap(18, 18, 18)
                    .addGroup(CreateNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(QuantityLabel)
                        .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                    .addComponent(AddItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25))
            );

            jTabbedPane1.addTab("Create New Item", null, CreateNewItem, "");
            CreateNewItem.getAccessibleContext().setAccessibleName("");

            AddExistingItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

            jLabel1.setText("jLabel1");

            jLabel2.setText("jLabel2");

            jLabel3.setText("jLabel3");

            javax.swing.GroupLayout AddExistingItemsLayout = new javax.swing.GroupLayout(AddExistingItems);
            AddExistingItems.setLayout(AddExistingItemsLayout);
            AddExistingItemsLayout.setHorizontalGroup(
                AddExistingItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AddExistingItemsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(AddExistingItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(241, Short.MAX_VALUE))
            );
            AddExistingItemsLayout.setVerticalGroup(
                AddExistingItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AddExistingItemsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(32, 32, 32)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(122, Short.MAX_VALUE))
            );

            jTabbedPane1.addTab("Add Existing Items", AddExistingItems);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BackButton)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BackButton)
                    .addGap(46, 46, 46)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(228, Short.MAX_VALUE))
            );

            jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // exit
        dispose();
        InventoryMenu im=new InventoryMenu();
        im.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void IDNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDNumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDNumFieldActionPerformed

    private void AddItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemButtonActionPerformed
    
                if(
               (!MainThread.oItems.checkItems((int)Integer.parseInt(IDNumField.getText())))
               &&NameField.getText().length()>=1
               &&PriceField.toString().length()>=1
               &&QuantityField.getText().length()>=1){
                    /////////////////////////////////>>>>
                    MainThread.oItems.addItem(
                        Integer.parseInt(IDNumField.getText()), 
                        NameField.getText(), 
                        Double.parseDouble(PriceField.getText()), 
                        Integer.parseInt(QuantityField.getText()));
       }
    }//GEN-LAST:event_AddItemButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ManageInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddExistingItems;
    private javax.swing.JButton AddItemButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel CreateNewItem;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDNumField;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField PriceField;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTextField QuantityField;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
