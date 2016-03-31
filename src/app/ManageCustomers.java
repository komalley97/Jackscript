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
public class ManageCustomers extends javax.swing.JFrame {
    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Creates new form CreateItem
     */
    public ManageCustomers() {
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
            AddNewCustomer = new javax.swing.JPanel();
            IDLabel = new javax.swing.JLabel();
            FirstNameLabel = new javax.swing.JLabel();
            EmailLabel = new javax.swing.JLabel();
            IDNumField = new javax.swing.JTextField();
            FirstNameField = new javax.swing.JTextField();
            EmailField = new javax.swing.JTextField();
            AddCustomerButton = new javax.swing.JButton();
            LastNameField = new javax.swing.JTextField();
            LastNameLabel = new javax.swing.JLabel();
            PhoneNumField = new javax.swing.JTextField();
            PhoneNumLabel = new javax.swing.JLabel();

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

            AddNewCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

            IDLabel.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
            IDLabel.setText("ID Number");

            FirstNameLabel.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
            FirstNameLabel.setText("First Name");

            EmailLabel.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
            EmailLabel.setText("Email");

            IDNumField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    IDNumFieldActionPerformed(evt);
                }
            });

            FirstNameField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    FirstNameFieldActionPerformed(evt);
                }
            });

            EmailField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    EmailFieldActionPerformed(evt);
                }
            });

            AddCustomerButton.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
            AddCustomerButton.setText("Add New Customer");
            AddCustomerButton.setFocusPainted(false);
            AddCustomerButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    AddCustomerButtonActionPerformed(evt);
                }
            });

            LastNameField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    LastNameFieldActionPerformed(evt);
                }
            });

            LastNameLabel.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
            LastNameLabel.setText("Last Name");

            PhoneNumField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    PhoneNumFieldActionPerformed(evt);
                }
            });
            PhoneNumField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    PhoneNumFieldKeyPressed(evt);
                }
            });

            PhoneNumLabel.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
            PhoneNumLabel.setText("Phone #");

            javax.swing.GroupLayout AddNewCustomerLayout = new javax.swing.GroupLayout(AddNewCustomer);
            AddNewCustomer.setLayout(AddNewCustomerLayout);
            AddNewCustomerLayout.setHorizontalGroup(
                AddNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AddNewCustomerLayout.createSequentialGroup()
                    .addGroup(AddNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddNewCustomerLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(AddNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IDLabel)
                                .addComponent(FirstNameLabel)
                                .addComponent(LastNameLabel)
                                .addComponent(PhoneNumLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(AddNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PhoneNumField, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LastNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(IDNumField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(FirstNameField, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(AddNewCustomerLayout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(AddCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(AddNewCustomerLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(EmailLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                            .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );
            AddNewCustomerLayout.setVerticalGroup(
                AddNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AddNewCustomerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(AddNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IDNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IDLabel))
                    .addGap(18, 18, 18)
                    .addGroup(AddNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FirstNameLabel))
                    .addGap(18, 18, 18)
                    .addGroup(AddNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LastNameLabel))
                    .addGap(18, 18, 18)
                    .addGroup(AddNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PhoneNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PhoneNumLabel))
                    .addGap(18, 18, 18)
                    .addGroup(AddNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EmailLabel)
                        .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                    .addComponent(AddCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31))
            );

            jTabbedPane1.addTab("Add New Customer", null, AddNewCustomer, "");
            AddNewCustomer.getAccessibleContext().setAccessibleName("");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(BackButton)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jTabbedPane1))
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BackButton)
                    .addGap(37, 37, 37)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(184, Short.MAX_VALUE))
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
        CustomerMenu cm=new CustomerMenu();
        cm.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void PhoneNumFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneNumFieldKeyPressed
        // TODO add your handling code here:
        if(PhoneNumField.getText().length()<10){

        }
        else{
            PhoneNumField.setText(PhoneNumField.getText().substring(0,PhoneNumField.getText().length()-1));
        }
    }//GEN-LAST:event_PhoneNumFieldKeyPressed

    private void PhoneNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumFieldActionPerformed

    private void LastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameFieldActionPerformed

    private void AddCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerButtonActionPerformed
        if(
            (!MainThread.db.checkCustomers(Integer.parseInt(IDNumField.getText())))
            &&IDNumField.getText().length()>=1
            &&FirstNameField.getText().length()>=1
            &&LastNameField.getText().length()>=1
            &&PhoneNumField.getText().length()==10
            &&EmailField.getText().length()>=1){

            MainThread.db.addNewCustomer(Integer.parseInt(IDNumField.getText()), FirstNameField.getText(), LastNameField.getText(), Long.parseLong(PhoneNumField.getText()), EmailField.getText());
        }
    }//GEN-LAST:event_AddCustomerButtonActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void FirstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameFieldActionPerformed

    private void IDNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDNumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDNumFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCustomers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCustomerButton;
    private javax.swing.JPanel AddNewCustomer;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDNumField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField PhoneNumField;
    private javax.swing.JLabel PhoneNumLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
