/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Labadmin;

import Business.EcoSystem;
import Business.LabAdmin.Lab;
import Business.LabAdmin.Test;
import Business.LabAdmin.TestDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Apoorva
 */
public class ViewUpdateDeleteTestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewUpdateDeleteTestJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Lab lab;
    public ViewUpdateDeleteTestJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lowerRangeTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        apparatusTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        upperRangeTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        sampleTxtField = new javax.swing.JTextField();
        priceTxtField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TestDetailsTable = new javax.swing.JTable();

        jButton1.setText("<< BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("TEST DETAILS");

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Lower Range:");

        jLabel6.setText("Apparatus:");

        jLabel7.setText("Upper Range:");

        jLabel2.setText("Name:");

        upperRangeTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperRangeTxtFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Price: ");

        jLabel4.setText("Sample Required:");

        TestDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Sample Required", "Lower Range", "Upper Range", "Apparatus", "Price"
            }
        ));
        TestDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TestDetailsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TestDetailsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameTxtField)
                                .addComponent(priceTxtField)
                                .addComponent(sampleTxtField)
                                .addComponent(lowerRangeTxtField)
                                .addComponent(apparatusTxtField)
                                .addComponent(upperRangeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sampleTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lowerRangeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(upperRangeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(apparatusTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(priceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
        int selectedRow = TestDetailsTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");

        } else {
            Test t = (Test) TestDetailsTable.getValueAt(selectedRow, 0);
            Lab lab= system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getLabDirectory().findLab(userAccount.getEmployee().getName());
            lab.deleteTest(t);
            JOptionPane.showMessageDialog(null, "Test " + nameTxtField.getText() + " deleted");
            populateTable();
            nameTxtField.setText("");
            priceTxtField.setText("");
            sampleTxtField.setText("");
            lowerRangeTxtField.setText("");
            upperRangeTxtField.setText("");
            apparatusTxtField.setText("");
            priceTxtField.setText("");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void upperRangeTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperRangeTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upperRangeTxtFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TestDetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TestDetailsTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) TestDetailsTable.getModel();

        String name = dtm.getValueAt(TestDetailsTable.getSelectedRow(), 0).toString();
        String sample = dtm.getValueAt(TestDetailsTable.getSelectedRow(), 1).toString();
        Double lowerRange = Double.parseDouble(dtm.getValueAt(TestDetailsTable.getSelectedRow(), 2).toString());
        Double upperRange = Double.parseDouble(dtm.getValueAt(TestDetailsTable.getSelectedRow(), 3).toString());
        String apparatus = dtm.getValueAt(TestDetailsTable.getSelectedRow(),4).toString();
        Double price = Double.parseDouble(dtm.getValueAt(TestDetailsTable.getSelectedRow(), 5).toString());
        
        nameTxtField.setText(name);
        sampleTxtField.setText(sample);
        lowerRangeTxtField.setText(String.valueOf(lowerRange));
        upperRangeTxtField.setText(String.valueOf(upperRange));
        apparatusTxtField.setText(apparatus);
        priceTxtField.setText(String.valueOf(price));
    }//GEN-LAST:event_TestDetailsTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = TestDetailsTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
//            updateJPanel.setVisible(true);
            System.out.println("I am here");

            Test t = (Test) TestDetailsTable.getValueAt(selectedRow, 0);
            System.out.println("item : " + t.getName());
            t.setName(nameTxtField.getText());
            t.setSample(sampleTxtField.getText());
            t.setLowerRange(Double.parseDouble(lowerRangeTxtField.getText()));
            t.setUpperRange(Double.parseDouble(upperRangeTxtField.getText()));
            t.setApparatus(apparatusTxtField.getText());
            t.setPrice(Double.parseDouble(priceTxtField.getText()));
            populateTable();
            nameTxtField.setText("");
            priceTxtField.setText("");
            sampleTxtField.setText("");
            lowerRangeTxtField.setText("");
            upperRangeTxtField.setText("");
            apparatusTxtField.setText("");
            priceTxtField.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TestDetailsTable;
    private javax.swing.JTextField apparatusTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lowerRangeTxtField;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField priceTxtField;
    private javax.swing.JTextField sampleTxtField;
    private javax.swing.JTextField upperRangeTxtField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) TestDetailsTable.getModel();
        model.setRowCount(0);

        

       Lab lab= system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getLabDirectory().findLab(userAccount.getEmployee().getName());
                

            for(Test t1: lab.getTestlist().getTestList()){
            Object[] row = new Object[6];
            row[0] = t1;
            row[1] = t1.getSample();
            row[2] = t1.getLowerRange();
            row[3] = t1.getUpperRange();
            row[4] = t1.getApparatus();
            row[5] = t1.getPrice();
            model.addRow(row);
               }
        }
    
}
