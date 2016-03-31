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
public class CustomerList extends javax.swing.JFrame {
    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Creates new form InventoryList
     */
    public CustomerList() {
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(MainThread.db.getCustomers().size(),5);
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel1.setText("Customer Database");

        int ct=MainThread.db.getCustomers().size();
        jTable1.setCellSelectionEnabled(false);
        jTable1.setFont(new java.awt.Font("Monotype Corsiva",4,40));
        int count=0;
        for(int r=0;r<ct;r++){

            for(int c=0;c<5;c++){
                if(c==0){
                    jTable1.setValueAt(Integer.toString(MainThread.db.getCustomers().get(r).getCustomerID()),r,c);
                }
                else if(c==1){
                    jTable1.setValueAt(MainThread.db.getCustomers().get(r).getFirstName(),r,c);
                    jTable1.getCellEditor(r,c).cancelCellEditing();
                }
                else if(c==2){
                    jTable1.setValueAt(MainThread.db.getCustomers().get(r).getLastName(),r,c);
                }
                else if(c==3){
                    jTable1.setValueAt(MainThread.db.getCustomers().get(r).getStringPhoneNumber(), r, c);
                }
                else if(c==4){
                    jTable1.setValueAt(MainThread.db.getCustomers().get(r).getEmail(),r,c);
                }
            }
        }

        javax.swing.table.JTableHeader tabhead=new javax.swing.table.JTableHeader(){
            @Override
            protected void paintComponent(java.awt.Graphics gr){
                super.paintComponent(gr);
                //background-------------------
                java.awt.Graphics2D g2d1=(java.awt.Graphics2D)gr.create();
                java.awt.RenderingHints hints1 = new java.awt.RenderingHints(
                    java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
                java.awt.RenderingHints render1 =new java.awt.RenderingHints(java.awt.RenderingHints.KEY_RENDERING,java.awt.RenderingHints.VALUE_RENDER_QUALITY);
                hints1.add(render1);
                g2d1.setRenderingHints(hints1);
                java.awt.Polygon p = new java.awt.Polygon();
                p.addPoint(0,0);
                p.addPoint(0,100);
                p.addPoint(100,0);
                java.awt.GradientPaint gp = new java.awt.GradientPaint(0.0f, 0.0f,new java.awt.Color(20,60,120),
                    100.0f, 100.0f,new java.awt.Color(0,130,200), true);
                g2d1.setPaint(gp);
                g2d1.fill(p);}

        };
        tabhead=jTable1.getTableHeader();
        //tab.getTableHeader().getUI().paint(tabhead.getGraphics(), tab);
        //tabhead.setUI(tab.getTableHeader().getUI());
        //tabhead.setUI(null);
        //tabhead.setOpaque(false);
        jTable1.setTableHeader(tabhead);
        jTable1.repaint();
        tabhead.repaint();
        tabhead.getColumnModel().getColumn(0).setHeaderValue("Customer ID");
        tabhead.getColumnModel().getColumn(1).setHeaderValue("First Name");
        tabhead.getColumnModel().getColumn(2).setHeaderValue("Last Name");
        tabhead.getColumnModel().getColumn(3).setHeaderValue("Phone #");
        tabhead.getColumnModel().getColumn(4).setHeaderValue("Email");
        tabhead.setFont(new java.awt.Font("OCR A STD",1,20));
        //tabhead.setBackground(new Color(120,120,230,160));
        //tabhead.setFont(new Font("Monotype Corsiva",4,40));
        //TableColumnModel tabcolmod= (TableColumnModel) new JTableHeader();//tabcolmod.getColumn(0).setHeaderValue("Username");
        //tabcolmod.getColumn(0).setHeaderValue("Username");

        jTable1.setCellEditor(null);
        jTable1.setCellSelectionEnabled(false);
        jTable1.setFont(new java.awt.Font("OCR A STD",4,16));
        jScrollPane1.setViewportView(jTable1);
        //	tab.setBackground(new Color(100,100,220,190));
        //tab.setUI();
        //Fill the table

        BackButton.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        BackButton.setText("Back to Menu");
        BackButton.setFocusPainted(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(209, 209, 209))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(BackButton))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
