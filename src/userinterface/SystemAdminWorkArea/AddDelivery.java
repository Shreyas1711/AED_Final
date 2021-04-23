/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise;
import Business.HospitalAdmin.Hospital;
import Business.Organization;
import Business.Role.DeliverManRole;
import Business.Role.DoctorRole;
import Business.Role.HospitalAdminRole;
import Business.Role.LabAdminRole;
import Business.Role.PharamacyAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shreyascr
 */
public class AddDelivery extends javax.swing.JPanel {

    /**
     * Creates new form AddHospital
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount user;
    public AddDelivery(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
         this.userProcessContainer=userProcessContainer;
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dName = new javax.swing.JTextField();
        dspe = new javax.swing.JTextField();
        dUname = new javax.swing.JTextField();
        dPass = new javax.swing.JTextField();
        addHospital = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Delivery Man Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel3.setText("Address");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel4.setText("Username");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));
        add(dName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 164, -1));
        add(dspe, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 164, -1));
        add(dUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 164, -1));
        add(dPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 164, -1));

        addHospital.setText("Add DeliveryMan");
        addHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHospitalActionPerformed(evt);
            }
        });
        add(addHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 360, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 37, -1, -1));

        jLabel1.setText("Add Delivery");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 37, 155, 37));

        jLabel6.setText("City Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "San francisco" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHospitalActionPerformed
        // TODO add your handling code here:
        String name = dName.getText();
        String add = dspe.getText();
        String username = dUname.getText();
        String pass = dPass.getText();
        Object selectedItem = jComboBox1.getSelectedItem();

        String city = selectedItem.toString();
        //String city = "Boston";
        Employee emp = system.getEmployeeDirectory().createEmployee(name);
        emp.setCity(city);
        UserAccount account = system.getUserAccountDirectory().createUserAccount(username, pass, emp, new DeliverManRole());
        if(system.getNetworkList()==null || system.findNetwork(city)==null){
            system.createNetwork(city);
             System.out.println("cities"+system.findNetwork(city));
        }
      
        if(system.findNetwork(city).getEnterpriseDirectory().getEnterpriseList()==null || system.findNetwork(city).getEnterpriseDirectory().findEnterprise(name)==null){
        system.findNetwork(city).getEnterpriseDirectory().createAndAddEnterprise(name, Enterprise.EnterpriseType.Delivery );
        system.findNetwork(city).getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().createOrganization(name, Organization.Type.DeliveryMan, "Test");
        }else{
            System.out.println("already there");
        }
        
        JOptionPane.showMessageDialog(this," Delivery created");
    }//GEN-LAST:event_addHospitalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addHospital;
    private javax.swing.JTextField dName;
    private javax.swing.JTextField dPass;
    private javax.swing.JTextField dUname;
    private javax.swing.JTextField dspe;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}