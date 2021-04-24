/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise;
import Business.Organization;
import Business.Role.LabAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Apoorva
 */
public class AddLabJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddLabJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public AddLabJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labName = new javax.swing.JTextField();
        labUName = new javax.swing.JTextField();
        addLab = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        labPwd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dspe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dName1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dspe1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labName.setPreferredSize(new java.awt.Dimension(164, 30));
        labName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labNameActionPerformed(evt);
            }
        });
        add(labName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 164, -1));

        labUName.setPreferredSize(new java.awt.Dimension(164, 30));
        add(labUName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 164, -1));

        addLab.setBackground(new java.awt.Color(24, 31, 46));
        addLab.setForeground(new java.awt.Color(255, 255, 255));
        addLab.setText("Add lab ");
        addLab.setPreferredSize(new java.awt.Dimension(156, 43));
        addLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLabActionPerformed(evt);
            }
        });
        add(addLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "San francisco" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(140, 30));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 170, -1));

        labPwd.setPreferredSize(new java.awt.Dimension(164, 30));
        add(labPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel8.setText("Add Lab");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 270, 37));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setText("Lab Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel4.setText("Username");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel6.setText("City Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("/Users/shreyascr/Desktop/AED final/AED_final_project/icons/Humaaans - 1 Character copy 2.png")); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        dspe.setPreferredSize(new java.awt.Dimension(164, 30));
        add(dspe, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 164, -1));

        jLabel3.setText("Address");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel10.setText("Email");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        dName1.setPreferredSize(new java.awt.Dimension(15, 30));
        add(dName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 164, -1));

        jLabel11.setText("Phone");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        dspe1.setPreferredSize(new java.awt.Dimension(15, 30));
        add(dspe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 164, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLabActionPerformed
        // TODO add your handling code here:
        if (labName.getText().isEmpty() || labUName.getText().isEmpty() || labPwd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter all mandatory fields");
        } else {

            if (!labName.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper name");
                labName.setText("");
                return;
                
            } else if(!dspe.getText().matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")) {
                JOptionPane.showMessageDialog(this, "Enter proper Address in the format of 123 abcd");
                dspe.setText("");
                return;
            }
            
            else if(!dName1.getText().matches("^(.+)@(.+)$")){
                JOptionPane.showMessageDialog(this, "Enter proper Email in the format of abc@gmail.com");
                dName1.setText("");
                return;
            }
            else if(!dspe1.getText().matches("^\\d{10}$")){
                JOptionPane.showMessageDialog(this, "Enter a 10 digit phone number");
                dspe1.setText("");
                return;
            }
            
            else if (strongUsername() == false) {
                labUName.setText("");
                JOptionPane.showMessageDialog(null, "should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            } else if (strongPassword() == false) {
                labPwd.setText("");
                JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            } else {
            }

            String name = labName.getText();
//        String address = labAddr.getText();
//        String phoneNumber = labPhone.getText();
            String userName = labUName.getText();
            String pwd = labPwd.getText();
            Object selectedItem = jComboBox1.getSelectedItem();
            String city = selectedItem.toString();
            Employee emp = system.getEmployeeDirectory().createEmployee(name);

            emp.setCity(city);
            UserAccount account = system.getUserAccountDirectory().createUserAccount(userName, pwd, emp, new LabAdminRole());
            if (system.getNetworkList() == null || system.findNetwork(city) == null) {
                system.createNetwork(city);
                System.out.println("cities" + system.findNetwork(city));
            }

            if (system.findNetwork(city).getEnterpriseDirectory().getEnterpriseList() == null || system.findNetwork(city).getEnterpriseDirectory().findEnterprise(name) == null) {
                system.findNetwork(city).getEnterpriseDirectory().createAndAddEnterprise(name, Enterprise.EnterpriseType.Lab);
                system.findNetwork(city).getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().createOrganization(name, Organization.Type.LabAdmin, "Test");
                JOptionPane.showMessageDialog(this, " Lab created");
                labName.setText("");
                dspe.setText("");
                dName1.setText("");
                dspe1.setText("");
                labPwd.setText("");
                 labUName.setText("");
            } else {
                System.out.println("already there");
                JOptionPane.showMessageDialog(this, " Lab already Exist");
            }

             dB4OUtil.storeSystem(system);
        }
    }//GEN-LAST:event_addLabActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void labNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labNameActionPerformed

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
    private boolean strongUsername() {
        Pattern pat = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = pat.matcher(labUName.getText());
        boolean boo = m.matches();
        return boo;
    }

    private boolean strongPassword() {
        Pattern pat1;
        pat1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1 = pat1.matcher(labPwd.getText());
        boolean bat1 = m1.matches();
        return bat1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLab;
    private javax.swing.JTextField dName1;
    private javax.swing.JTextField dspe;
    private javax.swing.JTextField dspe1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField labName;
    private javax.swing.JTextField labPwd;
    private javax.swing.JTextField labUName;
    // End of variables declaration//GEN-END:variables
}
