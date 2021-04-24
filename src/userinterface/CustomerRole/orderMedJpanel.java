/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Enterprise;
import Business.HospitalAdmin.Hospital;
import Business.Patient.Patient;
import Business.Pharmacist.PharamacyAdmin;
import Business.PharmacyCatalog.PharmacyCatalog;
import Business.PharmacyCatalog.PharmacyCatalogDirectory;
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
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tharoon
 */

public class orderMedJpanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;

    private UserAccount user;
    private EcoSystem system;
    private String hospitalName;
     private String docname;
     private String timings;
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
    public orderMedJpanel(JPanel userProcessContainer,UserAccount user,EcoSystem system,String patName) {
        initComponents();
         this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.patName = patName;
        this.user = user;
        this.ml = new ArrayList<>();
        System.out.println("Pat"+patName);
        System.out.println("Test phar"+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList());
       populateComboBox();
        System.out.println(selectedPharmacy);
        System.out.println("Receiver "+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(selectedPharmacy));
        System.out.println("Sender "+user);
        //tableListener();
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
//        public void tableListener(){
//        dtm = (DefaultTableModel) medTable.getModel();
//        dtm.setRowCount(0);
//       
//        dtm.addTableModelListener(
//            new TableModelListener()
//            {
//                public void tableChanged(TableModelEvent evt)
//                {
//                    
//                    int col = evt.getColumn();
//                    int row = evt.getFirstRow();
//                    System.out.println(row+"as");
//                    System.out.println(col+"as1");
//                    catalog = (PharmacyCatalog)dtm.getValueAt(row, 0);
//
//                   
//                }
//            });
//    }

            

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderBtn = new javax.swing.JButton();
        pharmacyCom = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medTable = new javax.swing.JTable();
        addcartBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        orderBtn.setText("Order");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        pharmacyCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Pharmacy" }));
        pharmacyCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyComActionPerformed(evt);
            }
        });

        jLabel5.setText("Pharmacy:");

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

        addcartBtn.setText("Add");
        addcartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcartBtnActionPerformed(evt);
            }
        });

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

        jButton1.setText("Track");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(addcartBtn)
                        .addGap(63, 63, 63)
                        .addComponent(orderBtn)
                        .addGap(45, 45, 45)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(52, 52, 52)
                .addComponent(pharmacyCom, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pharmacyCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backBtn))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderBtn)
                    .addComponent(addcartBtn)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
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
            
            
        }
        populatetable();
        
        
    }//GEN-LAST:event_orderBtnActionPerformed

    private void pharmacyComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyComActionPerformed
        // TODO add your handling code here:
        selectedPharmacy = String.valueOf(pharmacyCom.getSelectedItem());
        getMenuItems(selectedPharmacy);
        
    }//GEN-LAST:event_pharmacyComActionPerformed

    private void addcartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcartBtnActionPerformed
        // TODO add your handling code here:
//                int rowCount =medTable.getRowCount();
//        for (int i = 0; i < rowCount; i++) {
//            //int quantity = Integer.parseInt(medTable.getValueAt(i, 2).toString());
//            PharmacyCatalog item = (PharmacyCatalog) medTable.getValueAt(i, 0);
//            //if (quantity > 0) {
//                PharmacyOrder orderItemTotal = new PharmacyOrder(item);
//                orderItemList.add(orderItemTotal);
//                
//            //}
//        }
//        System.out.println(orderItemList.get(0));
               int selectedRow = medTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "You must select a row first!");
        } else {
                PharmacyCatalog item = (PharmacyCatalog) medTable.getValueAt(selectedRow, 0);
                PharmacyOrder orderItemTotal = new PharmacyOrder(item);
              orderItemList.add(orderItemTotal);
            }

        
     
//        PharmacyCatalog menu1 = new PharmacyCatalog();
//        PharmacyCatalogDirectory md = new PharmacyCatalogDirectory();
//        
//        menu1.setItemName(catalog.getItemName());
//        menu1.setItemPrice(catalog.getItemPrice());
//        //menu1.setQuantity(Integer.parseInt(quantity));
//       
//        
//        PharmacyOrder orderItemTotal = new PharmacyOrder(menu1);
//                orderItemList.add(orderItemTotal);
//       
    }//GEN-LAST:event_addcartBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populatetable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
                userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcartBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable medTable;
    private javax.swing.JButton orderBtn;
    private javax.swing.JComboBox<String> pharmacyCom;
    // End of variables declaration//GEN-END:variables
}
