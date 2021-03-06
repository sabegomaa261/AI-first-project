/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorywithagent;

import agents.Customer1;
import agents.factory;
import jade.core.AID;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ali Tahoon
 */
public class mainForm extends javax.swing.JFrame {

    /**
     * Creates new form mainForm
     */
    public mainForm() {
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

        txtProduct = new javax.swing.JTextField();
        txtPrse = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBuy = new javax.swing.JButton();
        btnStartAgents = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnSetOffer = new javax.swing.JButton();
        btnSetPrise = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNewPrise = new javax.swing.JTextField();
        comCustomerID = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtNewOffers = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtProduct.setPreferredSize(new java.awt.Dimension(150, 30));

        txtPrse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrse.setPreferredSize(new java.awt.Dimension(150, 30));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Products :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("balance :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Quantity :");

        btnBuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuy.setText("Confirm");
        btnBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        btnStartAgents.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnStartAgents.setText("Start Agents");
        btnStartAgents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStartAgents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartAgentsActionPerformed(evt);
            }
        });

        tblData.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Products", "Prise", "Quantity", "Offers"
            }
        ));
        tblData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Customer  :");

        btnSetOffer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSetOffer.setText("Set Offer");
        btnSetOffer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetOffer.setPreferredSize(new java.awt.Dimension(112, 36));
        btnSetOffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetOfferActionPerformed(evt);
            }
        });

        btnSetPrise.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSetPrise.setText("Set Prise");
        btnSetPrise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetPrise.setPreferredSize(new java.awt.Dimension(112, 36));
        btnSetPrise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetPriseActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("New Prise :");

        txtNewPrise.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNewPrise.setPreferredSize(new java.awt.Dimension(150, 30));

        comCustomerID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comCustomerID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comCustomerID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comCustomerID.setName(""); // NOI18N
        comCustomerID.setPreferredSize(new java.awt.Dimension(150, 30));
        comCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comCustomerIDActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("New Offer :");

        txtNewOffers.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNewOffers.setPreferredSize(new java.awt.Dimension(150, 30));
        txtNewOffers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewOffersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuy)
                                .addGap(54, 54, 54)
                                .addComponent(btnStartAgents)
                                .addGap(36, 36, 36)
                                .addComponent(btnSetOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(btnSetPrise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNewPrise, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                    .addComponent(comCustomerID, 0, 284, Short.MAX_VALUE)
                                    .addComponent(txtNewOffers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNewPrise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtNewOffers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuy)
                            .addComponent(btnStartAgents)
                            .addComponent(btnSetOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSetPrise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartAgentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartAgentsActionPerformed

//        String customer = txtCustInfo.getText();
//        f.setReciever(customer);
        try {
            jade.core.Runtime r = jade.core.Runtime.instance();
            Profile p = new ProfileImpl("localhost", 9000, "mainplateform");
            ContainerController cc = r.createMainContainer(p);
//            AgentController rma = cc.createNewAgent("rma", "jade.tools.rma.rma", null);
//            rma.start();
//            AgentController cust = cc.createNewAgent(f.getReciever(), "agents.Customer1", null);
//            cust.start();
            AgentController cust1 = cc.createNewAgent("customer1", "agents.Customer1", null);
            cust1.start();
            AgentController cust2 = cc.createNewAgent("customer2", "agents.Customer1", null);
            cust2.start();
            AgentController cust3 = cc.createNewAgent("customer3", "agents.Customer1", null);
            cust3.start();
            AgentController factory = cc.createNewAgent("Factory", "agents.factory", null);
            factory.start();
//            myProjectsTools.setOpenForm(new mainForm(), "Main Form");
        } catch (StaleProxyException ex) {
            Logger.getLogger(FactoryWithAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnStartAgentsActionPerformed

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        String product = txtProduct.getText();
        double prise = Double.parseDouble(txtPrse.getText());
        int Quntity = Integer.parseInt(jTextField3.getText());
//        new Customer1(product, prise, Quntity);
        Customer1 c = new Customer1();
        c.setProduct(product);
        c.setPrise(prise);
        c.setQuantity(Quntity);
        f.setReciever(comCustomerID.getSelectedItem().toString());
        myProjectsTools.cleartxt(this);

    }//GEN-LAST:event_btnBuyActionPerformed
    DefaultTableModel tbl;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        tbl = (DefaultTableModel) tblData.getModel();
        tbl.addRow(o1);
        tbl.addRow(o2);
        tbl.addRow(o3);
//        set s=new set("kiwi", "orange", "apple", 60.5, 40.5, 30.5, 100, 40, 20);
//        s.setdata();
        
        txtProduct.requestFocus();
        String customerChooser[] = new String[3];
        customerChooser[0] = "customer1";
        customerChooser[1] = "customer2";
        customerChooser[2] = "customer3";
        comCustomerID.setModel(new DefaultComboBoxModel<>(customerChooser));
//        HashMap<Double, Integer> product1 = new HashMap<>();
//        HashMap<Double, Integer> product2 = new HashMap<>();
//        HashMap<Double, Integer> product3 = new HashMap<>();
//
//        product1.put(4.5,50);
//        product2.put(5.5,40);
//        product3.put(6.5,30);
//        
//        for (Map.Entry<Double, Integer> c : product1.entrySet()) {
//            
//            tbl.addRow("product1", c.getKey() ,c.getValue());
//            
//        }
//        Object obj1[] = {"kiwi", "10.5", "10"};
//        Object obj2[] = {"orange", "6.0", "50"};
//        Object obj3[] = {"apple", "10.01", "20"};
//
//        tbl.addRow(obj1);
//        tbl.addRow(obj2);
//        tbl.addRow(obj3);

    }//GEN-LAST:event_formWindowOpened
    factory f = new factory();

    private void btnSetPriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetPriseActionPerformed
       // f.setPrise(Double.parseDouble(txtNewPrise.getText()));
        f.setCheckPrise("Prise have changed");
        int currant = tblData.getSelectedRow();
        String searchKey = txtProduct.getText();
        if ("kiwi".equals(searchKey)) {
            // mainForm.price1 = Double.parseDouble(txtNewPrise.getText());
            tbl.setValueAt(Double.parseDouble(txtNewPrise.getText()), currant, 1);
        } else if ("orange".equals(searchKey)) {
            // mainForm.price1  = Double.parseDouble(txtNewPrise.getText());
            tbl.setValueAt(Double.parseDouble(txtNewPrise.getText()), currant, 1);
        } else if ("apple".equals(searchKey)) {
            // mainForm.price1  = Double.parseDouble(txtNewPrise.getText());
            tbl.setValueAt(Double.parseDouble(txtNewPrise.getText()), currant, 1);
        }
    }//GEN-LAST:event_btnSetPriseActionPerformed
    private void comCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comCustomerIDActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int row = tblData.getSelectedRow();
        txtProduct.setText(tbl.getValueAt(row, 0).toString());
        txtNewPrise.setText(tbl.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnSetOfferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetOfferActionPerformed
        int currant = tblData.getSelectedRow();
        f.setCheckPrise("new offer");
        String searchKey = txtProduct.getText();
        if ("kiwi".equals(searchKey)) {
            // mainForm.price1 = Double.parseDouble(txtNewPrise.getText());
            tbl.setValueAt(txtNewOffers.getText(), currant, 3);
        } else if ("orange".equals(searchKey)) {
            // mainForm.price1  = Double.parseDouble(txtNewPrise.getText());
            tbl.setValueAt(txtNewOffers.getText(), currant, 3);
        } else if ("apple".equals(searchKey)) {
            // mainForm.price1  = Double.parseDouble(txtNewPrise.getText());
            tbl.setValueAt(txtNewOffers.getText(), currant, 3);
        }
    }//GEN-LAST:event_btnSetOfferActionPerformed

    private void txtNewOffersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewOffersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewOffersActionPerformed
    public static String p1 = "kiwi", p2 = "orange", p3 = "apple";
    public static double price1 = 50.5, price2 = 60.5, price3 = 40.5;
    public static int amount1 = 100, amount2 = 120, amount3 = 90;
    public static String  of1="No Offers",of2="No Offers",of3="No Offers";
  
    Object o1[] = {p1, price1, amount1,of1};
    Object o2[] = {p2, price2, amount2,of2};
    Object o3[] = {p3, price3, amount3,of3};

//    public class set {
//
//        private String p1, p2, p3;
//        private double price1, price2, price3;
//        private int amount1, amount2, amount3;
//
//        public set(String p1, String p2, String p3, double price1, double price2, double price3, int amount1, int amount2, int amount3) {
//            this.p1 = p1;
//            this.p2 = p2;
//            this.p3 = p3;
//            this.price1 = this.price1;
//            this.price2 = this.price2;
//            this.price3 = this.price3;
//            this.amount1 = amount1;
//            this.amount2 = amount2;
//            this.amount2 = amount3;
//        }
//
//        public String getP1() {
//            return p1;
//        }
//
//        public void setP1(String p1) {
//            this.p1 = p1;
//        }
//
//        public String getP2() {
//            return p2;
//        }
//
//        public void setP2(String p2) {
//            this.p2 = p2;
//        }
//
//        public String getP3() {
//            return p3;
//        }
//
//        public void setP3(String p3) {
//            this.p3 = p3;
//        }
//
//        public double getPrice1() {
//            return price1;
//        }
//
//        public void setPrice1(double price1) {
//            this.price1 = price1;
//        }
//
//        public double getPrice2() {
//            return price2;
//        }
//
//        public void setPrice2(double price2) {
//            this.price2 = price2;
//        }
//
//        public double getPrice3() {
//            return price3;
//        }
//
//        public void setPrice3(double price3) {
//            this.price3 = price3;
//        }
//
//        public int getAmount1() {
//            return amount1;
//        }
//
//        public void setAmount1(int amount1) {
//            this.amount1 = amount1;
//        }
//
//        public int getAmount2() {
//            return amount2;
//        }
//
//        public void setAmount2(int amount2) {
//            this.amount2 = amount2;
//        }
//
//        public int getAmount3() {
//            return amount3;
//        }
//
//        public void setAmount3(int amount3) {
//            this.amount3 = amount3;
//        }
//
//        public void setdata() {
//            Object o1[] = {getP1(), getPrice1(), getAmount1()};
//            Object o2[] = {getP2(), getPrice2(), getAmount2()};
//            Object o3[] = {getP3(), getPrice3(), getAmount3()};
//            tbl = (DefaultTableModel) tblData.getModel();
//            tbl.addRow(o1);
//            tbl.addRow(o2);
//            tbl.addRow(o3);
//        }
//
//    }

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
            java.util.logging.Logger.getLogger(mainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnSetOffer;
    private javax.swing.JButton btnSetPrise;
    private javax.swing.JButton btnStartAgents;
    private javax.swing.JComboBox<String> comCustomerID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtNewOffers;
    private javax.swing.JTextField txtNewPrise;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtPrse;
    // End of variables declaration//GEN-END:variables
}
