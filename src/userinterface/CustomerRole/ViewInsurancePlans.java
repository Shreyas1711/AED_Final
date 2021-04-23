/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Enterprise;
import Business.InsuraceAdmin.InsuranceAdminDirectory;
import Business.InsuraceAdmin.InsurancePlan;
import Business.InsuraceAdmin.InsuranceeAdmin;
import Business.Organization;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.BuyInsuranceWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Apoorva
 */
public class ViewInsurancePlans extends javax.swing.JPanel {

    /**
     * Creates new form ViewInsurancePlans
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    InsuranceAdminDirectory id;
    InsuranceeAdmin ic;
    String name;
    public ViewInsurancePlans(JPanel userProcessContainer,UserAccount userAccount,EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.system=system;
//        id= system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise();
        insuranceCompanyJComboBox.removeAllItems();
//        populateInsuranceJComboBox(id);
        populateLogComboBox();
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        insuranceCompanyJComboBox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        plansJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        yrsTxtField = new javax.swing.JTextField();
        monthlTxtField = new javax.swing.JTextField();
        totalTxtField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSURANCE COMPANIES AND PLANS");

        jButton1.setText("BACK");

        jLabel2.setText("SELECT COMPANY: ");

        insuranceCompanyJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        insuranceCompanyJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insuranceCompanyJComboBoxActionPerformed(evt);
            }
        });

        jButton2.setText("PAY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        plansJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Insurance Plan Name", "Total years", "Monthly premium amount", "Total amount"
            }
        ));
        plansJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plansJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(plansJTable);

        jLabel3.setText("Plan Name:");

        jLabel4.setText("Total years of duration:");

        jLabel5.setText("Monthly premium amount:");

        jLabel6.setText("Total premium amount:");

        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });

        yrsTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yrsTxtFieldActionPerformed(evt);
            }
        });

        monthlTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlTxtFieldActionPerformed(evt);
            }
        });

        totalTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTxtFieldActionPerformed(evt);
            }
        });

        jButton3.setText("VIEW PLANS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(498, 498, 498)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monthlTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yrsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(49, 49, 49)
                                        .addComponent(insuranceCompanyJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(insuranceCompanyJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(yrsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(monthlTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(totalTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void plansJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plansJTableMouseClicked
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) plansJTable.getModel();

        String name = dtm.getValueAt(plansJTable.getSelectedRow(), 0).toString();
        int years = Integer.parseInt(dtm.getValueAt(plansJTable.getSelectedRow(), 1).toString());
        Double monthlyPremiumAmount = Double.parseDouble(dtm.getValueAt(plansJTable.getSelectedRow(), 2).toString());
        Double totalAmount = Double.parseDouble(dtm.getValueAt(plansJTable.getSelectedRow(), 3).toString());

        nameTxtField.setText(name);
        yrsTxtField.setText(String.valueOf(years));
        monthlTxtField.setText(String.valueOf(monthlyPremiumAmount));
        totalTxtField.setText(String.valueOf(totalAmount));
    }//GEN-LAST:event_plansJTableMouseClicked

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

    private void insuranceCompanyJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insuranceCompanyJComboBoxActionPerformed
        // TODO add your handling code here:
        
        int selectedValue = insuranceCompanyJComboBox.getSelectedIndex();
         name = insuranceCompanyJComboBox.getItemAt(selectedValue);
//        populatePlans(name);
        
    }//GEN-LAST:event_insuranceCompanyJComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ic = system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().getInsuranceAdminDirectory().findInsuranceAdmin(name);        
        int rowCount = plansJTable.getRowCount();
        for (int i = 0; i < rowCount; i++) {
        InsurancePlan ip = (InsurancePlan) plansJTable.getValueAt(i, 0);
        ic.getInsurancePlanDirectory().addPlan(ip);
        }
//        System.out.println(lab.getTestlist().getTestList());
        Boolean flag = true;
        if (ic.getInsurancePlanDirectory().getIpDirectory().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: There are no tests chosen!");
            flag = false;
        } else {
            
            BuyInsuranceWorkRequest buyInsuranceRequest = new BuyInsuranceWorkRequest();
//            buyInsuranceRequest.set(lab.getTestlist().getTestList());
//            System.out.println(this.userAccount.getEmployee().getName());
            InsurancePlan ip = (InsurancePlan) plansJTable.getValueAt(0, 0);
            buyInsuranceRequest.setSender(this.userAccount);
            buyInsuranceRequest.setPlan(ip);
//            System.out.println("getting sender uname "+bookNewTestWorkRequest.getSender().getUsername());
           // buyInsuranceRequest.getSender().setUsername(this.userAccount.getUsername());
//            Lab l= (Lab) LabTable.getValueAt(0, 0);
            int selectedValue = insuranceCompanyJComboBox.getSelectedIndex();
            
            InsuranceeAdmin  icc = system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().getInsuranceAdminDirectory().getInsuranceList().get(selectedValue);
//            Lab lab2 = labDirectory.findLab(l1.getUsername());
            
            buyInsuranceRequest.setReceiver(system.getUserAccountDirectory().findUserAccount(icc.getName()));
//            System.out.println(" YO " +l1.getUsername());
//            buyInsuranceRequest.getReceiver().);
//            bookNewTestWorkRequest.setRec(l);
//            bookNewTestWorkRequest.setTestId(1);
//            System.out.println("OOOOOOO" + l1.g);
//            System.out.println("ppppppp" + user);
//            System.out.println("Lab is " + l1.getUsername());
//            buyInsuranceRequest.getReceiver().setUsername(l1.getUsername());
//            System.out.println("getting receiver uname "+bookNewTestWorkRequest.getRec().getUsername());
//            System.out.println("receiver is aaa " +l1.getUsername());
//            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
//            String d = sdf.format(jDateChooser1.getDate());
//            buyInsuranceRequest.setRequestDate();
            buyInsuranceRequest.setRequestDate(new Date());
            buyInsuranceRequest.setStatus("Insurance ordered");
            system.getWorkQueue().addWorkRequest(buyInsuranceRequest);
            
        }
//            if (customer != null) {
//                System.out.println(customer.getName());
//                placeNewOrderWorkRequest.setSender(customer);
//            } else {
//                System.out.println("Customer is null");
//            }
//            int selectedValue = RestaurantJComboBox.getSelectedIndex();
//            Restaurant restaurant = rd.getRestaurantList().get(selectedValue);
//            if (restaurant != null) {
//                System.out.println(restaurant.getName());
//                placeNewOrderWorkRequest.setReceiver(restaurant);
//            } else {
//                System.out.println("Restaurant is null");
//            }
//            placeNewOrderWorkRequest.setRequestDate(new Date());
//            placeNewOrderWorkRequest.setStatus("Ordered");
//            ecosystem.getWorkQueue().addWorkRequest(placeNewOrderWorkRequest);
//        }
       if (flag) {
            JOptionPane.showMessageDialog(null, "Insurance ordered successfully! Thank you for your payment");
            System.out.println(userAccount.getWorkQueue().getWorkRequestList());
//            System.out.println("prev");
            List<WorkRequest> r = this.userAccount.getWorkQueue().getWorkRequestList();
            
            ViewCurrentPlans view = new ViewCurrentPlans(userProcessContainer, userAccount, system);
            userProcessContainer.add("ViewPlans", view);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> insuranceCompanyJComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monthlTxtField;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTable plansJTable;
    private javax.swing.JTextField totalTxtField;
    private javax.swing.JTextField yrsTxtField;
    // End of variables declaration//GEN-END:variables

//    private void populateInsuranceJComboBox(InsuranceDirectory id) {
//         //To change body of generated methods, choose Tools | Templates.
//        for (InsuranceCompany ic : id.getInsuranceList()) {
//            insuranceCompanyJComboBox.addItem(ic.getName());
//    }
//    }

    private void populateTable() {
         //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel dtm = (DefaultTableModel) plansJTable.getModel();
        dtm.setRowCount(0);
        int selectedValue = insuranceCompanyJComboBox.getSelectedIndex();
        String Admin = insuranceCompanyJComboBox.getItemAt(selectedValue);
        System.out.println("name"+name);
        System.out.println("insur"+Admin);
        InsuranceeAdmin ic = system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().getInsuranceAdminDirectory().findInsuranceAdmin(Admin);
//        System.out.println("Lab in table is "+lab.getName());

        for (InsurancePlan p : ic.getInsurancePlanDirectory().getIpDirectory()) {
            {
                Object[] row = new Object[4];
                row[0] = p;
                row[1] = p.getTotalYears();
                row[2] = p.getMonthlyPremium();
                row[3] = p.getTotalPremium();
                dtm.addRow(row);
            }
    }
    }

//    private void populatePlans(String name) {
//            for (InsuranceeAdmin ic : system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().getInsuranceAdminDirectory().getInsuranceList()) {
//            if (ic.getName().equals(name)) {
//                InsuranceeAdmin ic1 = ic;
//                for (InsurancePlan ip :ic1.getInsurancePlanDirectory().getIpDirectory() ) {
//                    insuranceCompanyJComboBox.addItem(ip.getName());
//                }
//                break;
//            }
//        }
//    }
     private void populateLogComboBox() {
      for(Enterprise res: system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList()){
             if(res.getEnterpriseType().getValue().equals("Insurance")){
                            insuranceCompanyJComboBox.addItem(res.getName());
         
        }else{
                 System.out.println("No Companies");
             }
        }
    }
}
