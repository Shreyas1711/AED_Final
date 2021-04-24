/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.DB4OUtil.DB4OUtil;
import userinterface.CustomerRole.*;
import Business.EcoSystem;
import Business.Enterprise;
import Business.HospitalAdmin.Hospital;
import Business.Patient.Patient;
import Business.Pharmacist.PharamacyAdmin;
import Business.PharmacyCatalog.PharmacyCatalog;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BookAppointment;
import Business.WorkQueue.PharmacyOrder;
import Business.WorkQueue.PlaceNewOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
//import com.sun.org.apache.xml.internal.resolver.Catalog;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tharoon
 */

public class orderMedHospitalJpanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;

    private UserAccount user;
    private EcoSystem system;
    private String hospitalName;
     private String docname;
     private String timings;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Hospital hosObj;
    Patient pat;
    PharmacyCatalog catalog;
    ArrayList<PharmacyCatalog> ml;
    DefaultTableModel dtm;
    ArrayList<Patient> array1;
    List<PharmacyOrder> orderItemList = new ArrayList<PharmacyOrder>();
    WorkRequest workrequest;
    private String selectedPharmacy;
    private PharamacyAdmin pharObj;
    String patName;
    PlaceNewOrderWorkRequest placeworkRequest;
    /**
     * Creates new form orderMedJpanel
     */
    public orderMedHospitalJpanel(JPanel userProcessContainer,UserAccount user,EcoSystem system,String patName) {
        initComponents();
         this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.patName = patName;
        this.user = user;
        System.out.println("Pat"+patName);
        System.out.println("Test phar"+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList());
       populateComboBox();
        System.out.println(selectedPharmacy);
        System.out.println("Receiver "+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(selectedPharmacy));
        System.out.println("Sender "+user);
//            System.out.println(pat.getMedicine().getMedicines().get(0));
//            txt1.setText(pat.getMedicine().getMedicines().get(0));
//            txt2.setText(pat.getMedicine().getMedicines().get(1));
//            txt3.setText(pat.getMedicine().getMedicines().get(2));
//            txt4.setText(pat.getComments());
            
    }      
            
    public void populateComboBox(){
         for(Enterprise res: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList()){
             if(res.getEnterpriseType().getValue().equals("Pharmacy")){
            pharmacyCom.addItem(res.getName());
         
        }else{
                 System.out.println("nothing");
             }
         }
    }
            public void getMenuItems(String pharName){
        dtm = (DefaultTableModel) medTable.getModel();
        dtm.setRowCount(0);

        pharObj = system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(pharName).getOrganizationDirectory().getPharmacyAdminDirectory().findPharmacy(pharName);
         
        if(pharObj!=null && pharObj.getPharDir()!=null){
            for(PharmacyCatalog m : pharObj.getPharDir().getCatalog()) {
                Object row[] = new Object[2];
                row[0] = m;
                row[1] = m.getItemPrice();

                dtm.addRow(row);
            }
        }
    }

    private void populatetable(){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        for(WorkRequest request : system.getWorkQueue().getWorkRequestList()){
            if(request instanceof PlaceNewOrderWorkRequest){
        placeworkRequest = (PlaceNewOrderWorkRequest) request;
        for (PharmacyOrder orderItemTotal : placeworkRequest.getOrderTotal()){
             if(request.getSender().getUsername().equals(user.getUsername())){
                Object row[] = new Object[5];
                row[0] = placeworkRequest.getOrderId();
                row[1] = orderItemTotal.getCatalog().getItemName();
                row[2] = orderItemTotal.getCatalog().getItemPrice();
                row[3] = request.getStatus();
     

                dtm.addRow(row);
             }
             System.out.println(request);
        }
        }
        }
    }      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        trackBtn = new javax.swing.JButton();
        pharmacyCom = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medTable = new javax.swing.JTable();
        addcartBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        orderBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        trackBtn.setBackground(new java.awt.Color(24, 31, 46));
        trackBtn.setForeground(new java.awt.Color(255, 255, 255));
        trackBtn.setText("Track");
        trackBtn.setPreferredSize(new java.awt.Dimension(156, 43));
        trackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackBtnActionPerformed(evt);
            }
        });
        add(trackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, -1, -1));

        pharmacyCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Pharmacy" }));
        pharmacyCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyComActionPerformed(evt);
            }
        });
        add(pharmacyCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 170, -1));

        jLabel5.setText("Select Pharmacy:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        medTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicine", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(medTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 410, 101));

        addcartBtn.setBackground(new java.awt.Color(24, 31, 46));
        addcartBtn.setForeground(new java.awt.Color(255, 255, 255));
        addcartBtn.setText("Add");
        addcartBtn.setPreferredSize(new java.awt.Dimension(156, 43));
        addcartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcartBtnActionPerformed(evt);
            }
        });
        add(addcartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Medicine", "Price", "Status"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 392, 115));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Hospital Pharmacy Order ");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 260, 30));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Back");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/shreyascr/Desktop/AED final/AED_final_project/icons/Humaaans - Standing.png")); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 60, 410, 400));

        orderBtn1.setBackground(new java.awt.Color(24, 31, 46));
        orderBtn1.setForeground(new java.awt.Color(255, 255, 255));
        orderBtn1.setText("Order");
        orderBtn1.setPreferredSize(new java.awt.Dimension(156, 43));
        orderBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtn1ActionPerformed(evt);
            }
        });
        add(orderBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void trackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackBtnActionPerformed
        // TODO add your handling code here:
     populatetable();
    }//GEN-LAST:event_trackBtnActionPerformed

    private void pharmacyComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyComActionPerformed
        // TODO add your handling code here:
        selectedPharmacy = String.valueOf(pharmacyCom.getSelectedItem());
        getMenuItems(selectedPharmacy);
        
    }//GEN-LAST:event_pharmacyComActionPerformed

    private void addcartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcartBtnActionPerformed
        // TODO add your handling code here:
               int selectedRow = medTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "You must select a row first!");
        } else {
                PharmacyCatalog item = (PharmacyCatalog) medTable.getValueAt(selectedRow, 0);
                PharmacyOrder orderItemTotal = new PharmacyOrder(item);
              orderItemList.add(orderItemTotal);
             
            }
    }//GEN-LAST:event_addcartBtnActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
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
    }//GEN-LAST:event_jButton6ActionPerformed

    private void orderBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtn1ActionPerformed
        // TODO add your handling code here:
                 Boolean flag = true;
         System.out.println(selectedPharmacy);
        System.out.println("Receiver "+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(selectedPharmacy));
        
        if (orderItemList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: There are no tests chosen!");
            flag = false;
        } else {
            PlaceNewOrderWorkRequest newWorkRequest = new PlaceNewOrderWorkRequest();
            newWorkRequest.setOrderTotal(orderItemList);
            //System.out.println(this.user.getEmployee().getName());
            newWorkRequest.setSender(user);
            //Lab = (Lab) LabTable.getValueAt(0, 0);
            newWorkRequest.setReceiver(system.getUserAccountDirectory().findUserAccount(selectedPharmacy));
            newWorkRequest.setRequestDate(new Date());
            newWorkRequest.setStatus("Ordered");
            system.getWorkQueue().addWorkRequest(newWorkRequest);
            System.out.println("Work req size"+system.getWorkQueue().getWorkRequestList().size());
            System.out.println("Sender000"+newWorkRequest.getSender());
            System.out.println("Receiver000"+newWorkRequest.getReceiver());
            System.out.println(newWorkRequest.getRequestDate());
            System.out.println(newWorkRequest.getStatus());
            
            addcartBtn.setVisible(false);
        }
        populatetable();
          dB4OUtil.storeSystem(system);
        
    }//GEN-LAST:event_orderBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcartBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable medTable;
    private javax.swing.JButton orderBtn1;
    private javax.swing.JComboBox<String> pharmacyCom;
    private javax.swing.JButton trackBtn;
    // End of variables declaration//GEN-END:variables
}
