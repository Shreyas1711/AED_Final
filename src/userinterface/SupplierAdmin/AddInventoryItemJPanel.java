/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplierAdmin;

import Business.EcoSystem;
import Business.SupplierAdmin.Inventory;
import Business.SupplierAdmin.InventoryDirectory;
import Business.SupplierAdmin.Supplier;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Apoorva
 */
public class AddInventoryItemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddInventoryItemJPanel
     */
        JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    public AddInventoryItemJPanel(JPanel userProcessContainer,UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount= userAccount;
        this.system=system;
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
        jLabel2 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        manufacTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        priceTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        availTxtField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("BACK");

        jLabel1.setText("ADD INVENTORY ITEMS");

        jLabel2.setText("Name:");

        jLabel3.setText("Manufacturer:");

        jLabel4.setText("Price per Item:");

        jLabel5.setText("Number of units available: ");

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manufacTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addComponent(jLabel5))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(manufacTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(priceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(availTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
            if (nameTxtField.getText().isEmpty() || manufacTxtField.getText().isEmpty() || priceTxtField.getText().isEmpty() || availTxtField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all details of the Inventory Item");
            return;
        } else {
            String name = nameTxtField.getText();
            String manufacturer = manufacTxtField.getText();
            double price = Double.parseDouble(priceTxtField.getText());
            int avail = Integer.parseInt(availTxtField.getText());
            Inventory i = new Inventory(name,manufacturer,price,avail);
                if( system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getSupplierDirectory().findSupplier(userAccount.getEmployee().getName()).getInventoryDirectory()==null ||
                        system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getSupplierDirectory().findSupplier(i.getName()) == null ) {
                    InventoryDirectory inventoryList = new InventoryDirectory();
                    inventoryList.addInventory(i);
                    system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getSupplierDirectory().findSupplier(userAccount.getEmployee().getName()).setInventoryDirectory(inventoryList);
                }
                else {
                    system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getSupplierDirectory().findSupplier(userAccount.getEmployee().getName()).getInventoryDirectory().addInventory(i);
                    //System.out.println("test list is here "+system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getLabDirectory().findLab(userAccount.getEmployee().getName()).getTestlist().getTestList());
                }

            
            JOptionPane.showMessageDialog(null, " Inventory Item added");
            nameTxtField.setText("");
            manufacTxtField.setText("");
            priceTxtField.setText("");
            availTxtField.setText("");
    } 
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField manufacTxtField;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField priceTxtField;
    // End of variables declaration//GEN-END:variables
}
