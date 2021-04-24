/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BuyInsuranceWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author Apoorva
 */
public class ViewCurrentPlans extends javax.swing.JPanel {

    /**
     * Creates new form ViewCurrentPlans
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    public ViewCurrentPlans(JPanel userProcessContainer,UserAccount userAccount,EcoSystem system ) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.system=system;
        for (WorkRequest request :  system.getWorkQueue().getWorkRequestList()) {
            if (request.getSender().getUsername().equals(userAccount.getUsername())){
                BuyInsuranceWorkRequest buyInsurance = (BuyInsuranceWorkRequest) request;
                nameTxtField.setText(buyInsurance.getPlan().getName());
                yrsTxtField.setText(String.valueOf(buyInsurance.getPlan().getTotalYears()));
                monthlTxtField.setText(String.valueOf(buyInsurance.getPlan().getMonthlyPremium()));
                totalTxtField.setText(String.valueOf(buyInsurance.getPlan().getTotalPremium()));
                purchaseDateTxtField.setText(String.valueOf(request.getRequestDate()));
                Calendar c = Calendar.getInstance();
                c.setTime(request.getRequestDate());
                c.add(Calendar.YEAR, buyInsurance.getPlan().getTotalYears());
                Date validity = c.getTime();
                validityTxtField.setText(String.valueOf(validity));
                statusTxtField.setText(buyInsurance.getStatus());
                
                
//            System.out.println("Receiver would be");
//            System.out.println(request.getReceiver());
            }}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        yrsTxtField = new javax.swing.JTextField();
        monthlTxtField = new javax.swing.JTextField();
        totalTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        purchaseDateTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        validityTxtField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        statusTxtField = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(164, 30));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 160, -1));

        yrsTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        yrsTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yrsTxtFieldActionPerformed(evt);
            }
        });
        add(yrsTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 160, -1));

        monthlTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        monthlTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlTxtFieldActionPerformed(evt);
            }
        });
        add(monthlTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 160, -1));

        totalTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        totalTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTxtFieldActionPerformed(evt);
            }
        });
        add(totalTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 160, -1));

        jLabel3.setText("Plan Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jLabel4.setText("Total years of duration:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 117, -1));

        jLabel5.setText("Monthly premium amount:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jLabel6.setText("Total premium amount:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        jLabel7.setText("Purchased on:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        purchaseDateTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        add(purchaseDateTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 160, -1));

        jLabel8.setText("Validity:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        validityTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        add(validityTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 160, -1));

        jLabel10.setText("Status:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        statusTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        add(statusTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 160, -1));

        enterpriseLabel.setBackground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("View Current Plans");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 180, 30));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Back");
        jButton7.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("/Users/shreyascr/Desktop/AED final/AED_final_project/icons/Humaaans - 1 Character copy 3.png")); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFieldActionPerformed

    private void yrsTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yrsTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yrsTxtFieldActionPerformed

    private void monthlTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthlTxtFieldActionPerformed

    private void totalTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTxtFieldActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        //
        //        Component[] comps = this.userProcessContainer.getComponents();
        //        for(Component comp : comps){
            //            if(comp instanceof SystemAdminWorkAreaJPanel){
                //                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
                //                systemAdminWorkAreaJPanel.populateTree();
                //            }
            //        }
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField monthlTxtField;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField purchaseDateTxtField;
    private javax.swing.JTextField statusTxtField;
    private javax.swing.JTextField totalTxtField;
    private javax.swing.JTextField validityTxtField;
    private javax.swing.JTextField yrsTxtField;
    // End of variables declaration//GEN-END:variables
}
