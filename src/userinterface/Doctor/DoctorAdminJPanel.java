/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Doctor;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BookAppointment;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shreyascr
 */
public class DoctorAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorAdminJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount user;
    String hospname;
    
    public DoctorAdminJPanel(JPanel userProcessContainer,EcoSystem system,UserAccount user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.user = user;
        viewTable();
        jPanel1.setVisible(false);
    }
public void viewTable(){
         //System.out.println(system.getWorkQueue().findWorkRequest(user));
        //WorkRequest work = system.getWorkQueue().findWorkRequest(user);
        DefaultTableModel dtm = (DefaultTableModel) doctorDetails.getModel();
        dtm.setRowCount(0);
//        
//         //System.out.println("Res len "+ system.getDoctorDirectory().getDoctorList());
//         for(int i = 0;i< system.getHospitalDirectory().getHospitalList().size();i++){
//              for(int j = 0;j< system.getHospitalDirectory().getHospitalList().get(i).getDoctorDirectory().getDoctorList().size();j++){
//              System.out.println(user.getEmployee().getName());
//              System.out.println(system.getHospitalDirectory().getHospitalList().get(0).getDoctorDirectory().getDoctorList().get(1).getName());
//             if(user.getEmployee().getName().equals(system.getHospitalDirectory().getHospitalList().get(i).getDoctorDirectory().getDoctorList().get(j).getName())){
//                 System.out.println("true true true");
//                 hospname = system.getHospitalDirectory().getHospitalList().get(i).getName();
//             }else{
//                 System.out.println("nothing");
//                         
//             }}
//         }
        
       if( system.getWorkQueue()!=null){
        for(WorkRequest wq :system.getWorkQueue().findWorkRequest(user)) {
            // System.out.println("ssssss"+ wq.getSender().getEmployee().getName());
           
               // System.out.println("wq  "+wq );
                // System.out.println("work  "+work );
               // System.out.println("ssssss"+ wq.getSender().getEmployee().getName());
            Object row[] = new Object[4];
            row[0] = wq;
             row[1] = wq.getMessage();
            row[2] = wq.getStatus();
            row[3] = wq.getRequestDate();
            dtm.addRow(row);
        }}
    }
public void viewTable1(String name){
//        
        DefaultTableModel dtm = (DefaultTableModel) doctorDetails1.getModel();
        dtm.setRowCount(0);
//        
//         //System.out.println("Res len "+ system.getDoctorDirectory().getDoctorList());
        // int selectedRow = doctorDetails.getSelectedRow();
         int row1 = doctorDetails.getSelectedRow();
        int column = 0;
        String value = doctorDetails.getModel().getValueAt(row1, column).toString();
        for(WorkRequest wq : system.getWorkQueue().findWorkRequest(user)) {
            if(wq instanceof BookAppointment){
                System.out.println("reciever "+value);
                if(wq.getSender().getEmployee().getName().equals(value)){
                System.out.println("comm" + ((BookAppointment) wq).getComments());
           Object row[] = new Object[5];
            row[0] = wq.getSender().getEmployee().getName();
            row[1] = ((BookAppointment) wq).getMeds().getMedicines().get(0);
            row[2] = ((BookAppointment) wq).getMeds().getMedicines().get(1);
            row[3] = ((BookAppointment) wq).getMeds().getMedicines().get(2);
            row[4]=((BookAppointment) wq).getComments();
            dtm.addRow(row);
            }}}
           
        
         jPanel1.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        doctorDetails = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        doctorDetails1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        doctorDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient name", "Patient symtoms", "Patient Booking Status", "Scheduled Date"
            }
        ));
        jScrollPane1.setViewportView(doctorDetails);

        jLabel1.setText("Doctor Dashboard");

        jButton1.setText("Check prescription");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(doctorDetails1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
        );

        jButton2.setText("Create a prescription");
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
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(59, 59, 59)
                        .addComponent(jButton1)
                        .addGap(135, 135, 135))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = doctorDetails.getSelectedRow();
        int column = 0;
        String value = doctorDetails.getModel().getValueAt(row, column).toString();
        if(row < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        viewTable1(value);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = doctorDetails.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        BookAppointment pa = (BookAppointment)doctorDetails.getValueAt(selectedRow,0);
        PrescriptionJPanel prescriptionJPanel = new PrescriptionJPanel(userProcessContainer, system,pa);
        userProcessContainer.add("add Prescription", prescriptionJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable doctorDetails;
    private javax.swing.JTable doctorDetails1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
