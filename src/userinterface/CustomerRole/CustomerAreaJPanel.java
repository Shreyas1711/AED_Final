/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.EmergencyAdmin.Emergency;
import Business.Enterprise;
import Business.HospitalAdmin.Hospital;
import Business.Organization;
import Business.Patient.Patient;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.BookAppointment;
import Business.WorkQueue.EmergencyWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.HospitalAdminRole.AddSupportJPanel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private UserAccount user;
    private EcoSystem system;
    private String hospitalName;
     private String docname;
     private String timings;
    private Hospital resObj;
    ArrayList<Patient> array1;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount user,EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.user = user;
        array1 = new ArrayList<>();
        jPanel1.setVisible(false);
        //valueLabel.setText(enterprise.getName());
        populateComboBox();
    }
//     public void populateComboBox(){
//         for(Restaurant res: system().getRestaurantList()){
//            restList.addItem(res.getName());
//         
//        }
//    }
    public void populateRequestTable(){
        
    }

    public void populateComboBox(){
         for(Enterprise res: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList()){
             if(res.getEnterpriseType().getValue().equals("Hospital")){
            restList.addItem(res.getName());
         
        }else{
                 System.out.println("nothing");
             }
         }
    }
    public void populateComboBox1(String hospname){
         for(Organization org: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(hospitalName).getOrganizationDirectory().getOrganizationList()){
             if(org.getEnterpriseType1().getValue().equals("Doctor")){
            restList1.addItem(org.getName());
             }
        }
        
          
            
    }
    public void populateComboBox2(String docs){
        System.out.println(hospitalName+docs +" asasas");
       
         for(String timings: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(hospitalName).getOrganizationDirectory().getDoctorDirectory().findDoctor(docname).getTimings()){
            restList2.addItem(timings);
         
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

        enterpriseLabel = new javax.swing.JLabel();
        restList = new javax.swing.JComboBox<>();
        restList1 = new javax.swing.JComboBox<>();
        restList2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        doctorDetails1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        InsuranceJButton = new javax.swing.JButton();
        OrderBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Patient Dashboard");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 180, 30));

        restList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restListActionPerformed(evt);
            }
        });
        add(restList, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 293, -1));

        restList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restList1ActionPerformed(evt);
            }
        });
        add(restList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 293, -1));

        restList2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restList2ActionPerformed(evt);
            }
        });
        add(restList2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 293, -1));

        jButton1.setBackground(new java.awt.Color(24, 31, 46));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit Appointment");
        jButton1.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 220, 290, -1));

        jButton2.setBackground(new java.awt.Color(24, 31, 46));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Check prescription");
        jButton2.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        doctorDetails1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "medicine 1", "medicine 2", "medicine 3", "comments"
            }
        ));
        doctorDetails1.setPreferredSize(new java.awt.Dimension(375, 100));
        jScrollPane2.setViewportView(doctorDetails1);

        jPanel1.add(jScrollPane2);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 570, 190));

        jButton3.setBackground(new java.awt.Color(24, 31, 46));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Support");
        jButton3.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        InsuranceJButton.setBackground(new java.awt.Color(24, 31, 46));
        InsuranceJButton.setForeground(new java.awt.Color(255, 255, 255));
        InsuranceJButton.setText("Insurance");
        InsuranceJButton.setPreferredSize(new java.awt.Dimension(156, 43));
        InsuranceJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsuranceJButtonActionPerformed(evt);
            }
        });
        add(InsuranceJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        OrderBtn.setBackground(new java.awt.Color(24, 31, 46));
        OrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        OrderBtn.setText("Order Medicine");
        OrderBtn.setPreferredSize(new java.awt.Dimension(156, 43));
        OrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderBtnActionPerformed(evt);
            }
        });
        add(OrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        jButton4.setBackground(new java.awt.Color(24, 31, 46));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Book Test ");
        jButton4.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));

        jButton5.setBackground(new java.awt.Color(24, 31, 46));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("SOS");
        jButton5.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Back");
        jButton7.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/shreyascr/Desktop/AED final/AED_final_project/icons/Humaaans - 1 Character copy 5.png")); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 410, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void restListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restListActionPerformed
        restList1.removeAllItems();
        restList2.removeAllItems();
        hospitalName = String.valueOf(restList.getSelectedItem());
        populateComboBox1(hospitalName);

    }//GEN-LAST:event_restListActionPerformed

    private void restList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restList1ActionPerformed
        // TODO add your handling code here:
        restList2.removeAllItems();
         docname = String.valueOf(restList1.getSelectedItem());
            System.out.println(docname +" asasas");
              populateComboBox2(docname);
       
            
    }//GEN-LAST:event_restList1ActionPerformed

    private void restList2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restList2ActionPerformed
        // TODO add your handling code here:
        
           
    }//GEN-LAST:event_restList2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         timings = String.valueOf(restList2.getSelectedItem());
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    Date date = new Date(); 
         BookAppointment appointment = new BookAppointment();
         appointment.setSender(user);
         System.out.println("ajcjac       "+system.getUserAccountDirectory().findUserAccount(docname));
         appointment.setReceiver( system.getUserAccountDirectory().findUserAccount(docname));
         appointment.setStatus("Appointment Booked");
         appointment.setMessage(jTextArea1.getText());
         appointment.setRequestDate(date);
          system.getWorkQueue().addWorkRequest(appointment);
          system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(hospitalName).getOrganizationDirectory().getDoctorDirectory().findDoctor(docname).updateTimings(timings);
           JOptionPane.showMessageDialog(this, "Appointment fixed");
          dB4OUtil.storeSystem(system);
//          System.out.println("timings " + timings);
//        if(system.getHospitalDirectory().findHospital(hospitalName).getDoctorDirectory().findDoctor(docname).getDoctorPatientList()==null){
//        Patient pa =new Patient();
//        ArrayList<Patient> paa = new ArrayList<>();
//        pa.setName(user.getEmployee().getName());
//        pa.setSymtoms(jTextArea1.getText());
//        system.getHospitalDirectory().findHospital(hospitalName).getDoctorDirectory().findDoctor(docname).updateTimings(timings);
//        paa.add(pa);
//        system.getHospitalDirectory().findHospital(hospitalName).getDoctorDirectory().findDoctor(docname).updateTimings(timings);
//        system.getHospitalDirectory().findHospital(hospitalName).getDoctorDirectory().findDoctor(docname).setDoctorPatientList(paa);
//        }else{
//            Patient pa =new Patient();
//        pa.setName(user.getEmployee().getName());
//        pa.setSymtoms(jTextArea1.getText());
//            System.out.println(system.getHospitalDirectory().findHospital(hospitalName).getDoctorDirectory().findDoctor(docname).getTimings());
//        system.getHospitalDirectory().findHospital(hospitalName).getDoctorDirectory().findDoctor(docname).updateTimings(timings);
//        
//         system.getHospitalDirectory().findHospital(hospitalName).getDoctorDirectory().findDoctor(docname).addPatientsToDoctor(pa);
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel dtm = (DefaultTableModel) doctorDetails1.getModel();
        dtm.setRowCount(0);
       
        for(WorkRequest wq : system.getWorkQueue().findWorkRequestByRec(user)) {
            if(wq instanceof BookAppointment){
                if(wq.getSender().getEmployee().getName().equals(user.getEmployee().getName())){
                System.out.println("comm" + ((BookAppointment) wq).getComments());
           Object row[] = new Object[5];
            row[0] = wq.getSender().getEmployee().getName();
            row[1] = ((BookAppointment) wq).getMeds().getMedicines().get(0);
            row[2] = ((BookAppointment) wq).getMeds().getMedicines().get(1);
            row[3] = ((BookAppointment) wq).getMeds().getMedicines().get(2);
            row[4]=((BookAppointment) wq).getComments();
            dtm.addRow(row);
            }}}
           
        
         //System.out.println("Res len "+ system.getDoctorDirectory().getDoctorList());
//        System.out.println("hooooo" + hospitalName);
//         for(int i = 0;i< system.getHospitalDirectory().getHospitalList().size();i++){
//              for(int j = 0;j< system.getHospitalDirectory().getHospitalList().get(i).getDoctorDirectory().getDoctorList().size();j++){
//                   for(int k = 0;k< system.getHospitalDirectory().getHospitalList().get(i).getDoctorDirectory().getDoctorList().get(j).getDoctorPatientList().size();k++){
//                       System.out.println(system.getHospitalDirectory().getHospitalList().get(i).getDoctorDirectory().getDoctorList().get(j).getDoctorPatientList().get(k).getName());
//                       System.out.println(user.getEmployee().getName());
//             if(user.getEmployee().getName().equals(system.getHospitalDirectory().getHospitalList().get(i).getDoctorDirectory().getDoctorList().get(j).getDoctorPatientList().get(k).getName())){
//                 System.out.println("true1 true1 true1");
//              
//               
//                array1.add(system.getHospitalDirectory().getHospitalList().get(i).getDoctorDirectory().getDoctorList().get(j).getDoctorPatientList().get(k));
//             }else{
//                 System.out.println("nothing");
//                         
//             }}}
//         }
//        for(Patient pa :array1) {
//            
//            if(pa.getName().equals(user.getEmployee().getName())){
//                 Object row[] = new Object[5];
//            row[0] = pa;
//            row[1] = pa.getMedicine().getMedicines().get(0);
//             row[2] = pa.getMedicine().getMedicines().get(1);
//              row[3] = pa.getMedicine().getMedicines().get(2);
//               row[4] = pa.getComments();
//            dtm.addRow(row);
//            }
//           
//        }
         jPanel1.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         ClientJFrame jsupport = new ClientJFrame();
        jsupport.setVisible(true);
        jsupport.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void InsuranceJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceJButtonActionPerformed
        // TODO add your handling code here:
        if(this.user.getEmployee().isHasInsurance()){
            
                    ViewCurrentPlans viewCurrentPlans = new ViewCurrentPlans(userProcessContainer, user, system);
        userProcessContainer.add("viewCurentPlans", viewCurrentPlans);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

            }
        else {
        ViewInsurancePlans viewInsurance = new ViewInsurancePlans(userProcessContainer, user, system);
        userProcessContainer.add("viewInsurance", viewInsurance);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_InsuranceJButtonActionPerformed


    private void OrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderBtnActionPerformed
        // TODO add your handling code here:
        orderMedJpanel orderJPanel = new orderMedJpanel(userProcessContainer, user, system, user.getEmployee().getName());
        userProcessContainer.add("CreateSupport", orderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_OrderBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        BookTestJPanel bookTest = new BookTestJPanel(userProcessContainer, user, system);
        userProcessContainer.add("BookTest", bookTest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Random random_method = new Random();
        
        ArrayList<Enterprise> e = system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList();
        
        int index = 0;
        UserAccount name3 = null;
        for (Enterprise res:e)
        {
             System.out.println("sss1" + e);
              System.out.println("sss1" + res.getEnterpriseType().getValue());
            if(res.getEnterpriseType().getValue().equals("Emergency")){
                System.out.println("sss" + res.getName());
                              index = random_method.nextInt(e.size());
                              name3 = system.getUserAccountDirectory().findUserAccount(e.get(index).getName());
         
        }
         

        }
        EmergencyWorkRequest emergencyWorkRequest = new EmergencyWorkRequest();

        emergencyWorkRequest.setSender(this.user);
        
        //            System.out.println("getting sender uname "+bookNewTestWorkRequest.getSender().getUsername());
        emergencyWorkRequest.setReceiver(name3);
        
        System.out.println("asasqqqq555 " + emergencyWorkRequest.getReceiver());
        emergencyWorkRequest.setStatus("emergency assistance needed");
       
//         Patient patient = new Patient();
//        for(int i= 0;i<system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList().size();i++){
//            System.out.println("asok "+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList().size());
//            if(system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList().get(i).getOrganizationDirectory().findOrganization(this.user.getEmployee().getName()).equals(user.getEmployee().getName()))
//             patient = system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList().get(i).getOrganizationDirectory().getPatientDirectory().getPatientList().get(0);
//       
//        }
//         System.out.println(patient.getName());
//        emergencyWorkRequest.setP(patient);
        system.getWorkQueue().addWorkRequest(emergencyWorkRequest);
        JOptionPane.showMessageDialog(this, "Help is on the way!");
    }//GEN-LAST:event_jButton5ActionPerformed

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


// public void getDoctors(String resName){
//      
//        
//        System.out.println("RSSS "+ resName);
//        
//        System.out.println("Menu "+ system.getHospitalDirectory().getHospitalList().size());
//        resObj = system.getHospitalDirectory().findHospital(resName);
//         
//        if(resObj!=null && resObj.getDoctorDirectory()!=null){
//            for(Doctor d : resObj.getDoctorDirectory().getDoctorList()) {
//                Object row[] = new Object[3];
//                row[0] = d;
//                row[1] = d.getSpecialization();
//
//                dtm.addRow(row);
//            }
//        }
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsuranceJButton;
    private javax.swing.JButton OrderBtn;
    private javax.swing.JTable doctorDetails1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> restList;
    private javax.swing.JComboBox<String> restList1;
    private javax.swing.JComboBox<String> restList2;
    // End of variables declaration//GEN-END:variables
}
