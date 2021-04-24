/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Doctor;

import Business.DB4OUtil.DB4OUtil;
import Business.Doctor.Doctor;
import Business.Doctor.DoctorDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization;
import Business.Role.DoctorRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shreyascr
 */
public class AddDoctorJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDoctorJpanel
     */
     private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount user;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public AddDoctorJpanel(JPanel userProcessContainer,EcoSystem system,UserAccount user) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.user = user;
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
        addDeliveryMan = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Doctor Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 129, -1, -1));

        jLabel3.setText("Specialization");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 185, -1, -1));

        jLabel4.setText("Username");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));
        add(dName, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 124, 164, -1));
        add(dspe, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 180, 164, -1));
        add(dUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 164, -1));
        add(dPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 164, -1));

        addDeliveryMan.setBackground(new java.awt.Color(24, 31, 46));
        addDeliveryMan.setForeground(new java.awt.Color(255, 255, 255));
        addDeliveryMan.setText("Add Doctor");
        addDeliveryMan.setPreferredSize(new java.awt.Dimension(156, 43));
        addDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeliveryManActionPerformed(evt);
            }
        });
        add(addDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 377, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/shreyascr/Desktop/AED final/AED_final_project/icons/Humaaans - 2 Characters.png")); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 410, 310));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel6.setText("Add Doctor");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 300, 37));
    }// </editor-fold>//GEN-END:initComponents

    private void addDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDeliveryManActionPerformed
        // TODO add your handling code here:
                        if (dUname.getText().isEmpty() || dPass.getText().isEmpty() || dName.getText().isEmpty() || dspe.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter all mandatory fields");
        } else {
            
           if (!dName.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper name! Name should be string!");
                dName.setText("");
                return;
            }
            else if(!dspe.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper specialization name");
                dspe.setText("");
                return;
            }

            if (strongUsername() == false) {
                dUname.setText("");
                JOptionPane.showMessageDialog(null, "Username should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            } else {
                String userName = dUname.getText();
            }
            if (strongPassword() == false) {
                dPass.setText("");
                JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            } else {
            }
        String hospname = user.getEmployee().getName();
        System.out.println("HospitalName"+hospname);
        String name = dName.getText();
        String spcl = dspe.getText();
        String username = dUname.getText();
        String pass = dPass.getText();

        String city = "Boston";
        Employee emp = system.getEmployeeDirectory().createEmployee(name);
        emp.setCity(city);
        UserAccount account = system.getUserAccountDirectory().createUserAccount(username, pass, emp, new DoctorRole());
        if(system.findNetwork(city).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().getOrganizationList()==null ||system.findNetwork(city).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().findOrganization(name)==null){
         system.findNetwork(city).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().createOrganization(name, Organization.Type.Doctor,spcl);
         JOptionPane.showMessageDialog(this," Doctor created");
         dName.setText("");
            dspe.setText("");
             dUname.setText("");
              dPass.setText("");
        }else{
             System.out.println("Already exists");
             JOptionPane.showMessageDialog(this," Doctor already exists");
            // System.out.println(system.findNetwork(city).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().getOrganizationList().size());
//            DoctorDirectory doctordirectory =new DoctorDirectory();
//            Doctor doctor = new Doctor();
//            ArrayList<Doctor> doclist = new ArrayList<>();
//            doctor.setName(name);
//            doctor.setSpecialization(spcl);
//            doclist.add(doctor);
//            doctordirectory.setDoctorList(doclist);
//            system.getHospitalDirectory().findHospital(hospname).setDoctorDirectory(doctordirectory);
        }
            dB4OUtil.storeSystem(system);             }
    }//GEN-LAST:event_addDeliveryManActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDeliveryMan;
    private javax.swing.JTextField dName;
    private javax.swing.JTextField dPass;
    private javax.swing.JTextField dUname;
    private javax.swing.JTextField dspe;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    private boolean strongUsername() {
        Pattern pat = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = pat.matcher(dUname.getText());
        boolean boo = m.matches();
        return boo;
    }

    private boolean strongPassword() {
        Pattern pat1;
        pat1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1 = pat1.matcher(dPass.getText());
        boolean bat1 = m1.matches();
        return bat1;
    }
}
