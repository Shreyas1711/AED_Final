/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharamacyAdmin;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Enterprise;
import Business.Patient.Patient;
import Business.Pharmacist.PharamacyAdmin;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyOrder;
import Business.WorkQueue.PlaceNewOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tharoon
 */

public class manageOrderJpanel extends javax.swing.JPanel {

    /**
     * Creates new form manageOrderJpanel
     */
    private JPanel userProcessContainer;
    private UserAccount user;
    private EcoSystem system;
    Patient pat;
    DefaultTableModel dtm;
    ArrayList<Patient> array1;
    List<PharmacyOrder> orderItemList = new ArrayList<PharmacyOrder>();
    WorkRequest workrequest;
    private PharamacyAdmin pharObj;
    PlaceNewOrderWorkRequest placeWorkRequest;
    String patname;
    String pharName;
    DeliveryManDirectory delDir;
    String selectedPharmacy;

    
    public manageOrderJpanel(JPanel userProcessContainer,EcoSystem system,UserAccount user,String pharmacy,String patient) {
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        //this.placeWorkRequest= placeNewOrderWorkRequest;
        this.pharName = pharmacy;
        this.patname = patient;
        this.user = user;
        initComponents();
        //System.out.println("check "+systeuser.getEmployee().getCity()));
       //populateFields();
       populatetable();
        populateComboBox();
        System.out.println("Work request"+system.getWorkQueue().getWorkRequestList());
        
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//        private void populateRequestTable() {
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//
//        model.setRowCount(0);
////        System.out.println("R is");
//        for (WorkRequest request : system.getWorkQueue().getWorkRequestList()) {
////       System.out.println("Receiver would be");
////System.out.println(request.getReceiver());
////System.out.println("Restaurant would be "+restaurant.getName()) ;
//            if (request.getReceiver().getUsername().equals(pharObj.getPharname())) {
//                Object[] row = new Object[4];
//                row[0] = request;
//                row[1] = request.getReceiver();
//                row[2] = request.getStatus();
//                row[3] = request.getRequestDate();
//
//                model.addRow(row);
//            }

       // }
    
   // }
//        private void populateFields() {
//            
//            for(WorkRequest request : system.getWorkQueue().getWorkRequestList()){
//                placeWorkRequest = (PlaceNewOrderWorkRequest) request;
//        System.out.println("Here it is" + placeWorkRequest.getOrderTotal());
//        for (PharmacyOrder orderItemTotal : placeWorkRequest.getOrderTotal()) {
//            itmNameTxt.setText(orderItemTotal.getCatalog().getItemName());
//            //QuantityJTxtField.setText(String.valueOf(orderItemTotal.getQuantity()));
//            itmPriceTxt.setText(String.valueOf(orderItemTotal.getCatalog().getItemPrice()));
//            custNameTxt.setText(placeWorkRequest.getSender().getUsername());
//            stsTxt.setText(placeWorkRequest.getStatus());
//        }
//            }
//    }
        
    public void populateComboBox(){
         for(Enterprise res: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList()){
             if(res.getEnterpriseType().getValue().equals("Delivery")){
            delManCombo.addItem(res.getName());
         
        }else{
                 System.out.println("nothing");
             }
         }
    }
    private void populatetable(){
        DefaultTableModel dtm = (DefaultTableModel) orderTbl.getModel();
        dtm.setRowCount(0);
        for(WorkRequest request : system.getWorkQueue().getWorkRequestList()){
            if(request instanceof PlaceNewOrderWorkRequest){
        placeWorkRequest = (PlaceNewOrderWorkRequest) request;
        for (PharmacyOrder orderItemTotal : placeWorkRequest.getOrderTotal()){
                Object row[] = new Object[4];
                row[0] = request;
                row[1] = orderItemTotal.getCatalog().getItemName();
                row[2] = orderItemTotal.getCatalog().getItemPrice();
                row[3] = request.getStatus();

                dtm.addRow(row);
        }      
        }
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        acceptOrder = new javax.swing.JButton();
        declineOrder = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        delManCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTbl = new javax.swing.JTable();

        jLabel1.setText("Pharmacy");

        acceptOrder.setText("Accept");
        acceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptOrderActionPerformed(evt);
            }
        });

        declineOrder.setText("Decline");
        declineOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineOrderActionPerformed(evt);
            }
        });

        jLabel6.setText("Assign DeliveryMan:");

        delManCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        delManCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delManComboActionPerformed(evt);
            }
        });

        jButton1.setText("Assign");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        orderTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Name", "Item Name", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(orderTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(acceptOrder))
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(declineOrder)
                            .addComponent(delManCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jButton1)))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acceptOrder)
                            .addComponent(declineOrder))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel6))
                    .addComponent(delManCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(412, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void acceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptOrderActionPerformed
        // TODO add your handling code here:
                int selectedRow = orderTbl.getSelectedRow();
                System.out.println("Status "+orderTbl.getValueAt(selectedRow, 3)); 
       if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "You must select a row first!");
        } else {
            if (orderTbl.getValueAt(selectedRow, 3).equals("Completed")) {
                JOptionPane.showMessageDialog(null, "Order is already completed!");
            } else {
                WorkRequest request = (WorkRequest) orderTbl.getValueAt(selectedRow, 0);
                request.setStatus("Accepted");
                populatetable();
            }

        }

        //stsTxt.setText(placeWorkRequest.getStatus());
    }//GEN-LAST:event_acceptOrderActionPerformed

    private void declineOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineOrderActionPerformed
        // TODO add your handling code here:
                int selectedRow = orderTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "You must select a row first!");
        }

        WorkRequest request = (WorkRequest) orderTbl.getValueAt(selectedRow, 0);
        if (orderTbl.getValueAt(selectedRow, 1).equals("Completed")) {
            JOptionPane.showMessageDialog(null, "Order is already processed and completed!");
        } else {
               
                request.setStatus("Declined");
                populatetable();
        }

        
        //stsTxt.setText(placeWorkRequest.getStatus());
    }//GEN-LAST:event_declineOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("Selected del++"+selectedPharmacy+"++");
        System.out.println("Testing "+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(selectedPharmacy).getOrganizationDirectory().getDeliveryManDirectory().getDeliveryList().get(0).getDeliveryManName());
         System.out.println("Testing111 "+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(selectedPharmacy).getOrganizationDirectory().getDeliveryManDirectory().getDeliveryList().size());
                int selectedValue = delManCombo.getSelectedIndex();
        if (selectedValue >= 0) {
            DeliveryMan deliveryMan = system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(selectedPharmacy).getOrganizationDirectory().getDeliveryManDirectory().findDeliveryMan(selectedPharmacy);
           placeWorkRequest.setDeliveryMan(system.getUserAccountDirectory().findUserAccount(deliveryMan.getDeliveryManName()));
           System.out.println(placeWorkRequest.getDeliveryMan());
           placeWorkRequest.setStatus("Assigned");
           System.out.println("assignment");
            System.out.println(placeWorkRequest.getDeliveryMan().getUsername());
            JOptionPane.showMessageDialog(null, "Delivery man has been assigned");
            
        }
        populatetable();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void delManComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delManComboActionPerformed
        // TODO add your handling code here:
        selectedPharmacy = String.valueOf(delManCombo.getSelectedItem());
        
    }//GEN-LAST:event_delManComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptOrder;
    private javax.swing.JButton declineOrder;
    private javax.swing.JComboBox<String> delManCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderTbl;
    // End of variables declaration//GEN-END:variables
}
