/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharamacyAdmin;

import Business.EcoSystem;
import Business.Patient.Patient;
import Business.Pharmacist.PharamacyAdmin;
import Business.PharmacyCatalog.PharmacyCatalog;
import Business.PharmacyCatalog.PharmacyCatalogDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyOrder;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tharoon
 */
public class addMedicineJpanel extends javax.swing.JPanel {

    /**
     * Creates new form addMedicineJpanel
     */
    private JPanel userProcessContainer;
    private UserAccount user;
    private EcoSystem system;
    private String pharmName;
    ArrayList<Patient> array1;
    List<PharmacyOrder> orderItemList = new ArrayList<PharmacyOrder>();
    WorkRequest workrequest;
    PharmacyCatalog catalog;
    Patient pat;
    PharamacyAdmin pharm;
    String pharname;
    public addMedicineJpanel(JPanel userProcessContainer,EcoSystem system,String pharname) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.pharname = pharname;
        System.out.println("user"+pharname);
        //this.pharm = pharm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
        public void viewTable(){
        DefaultTableModel dtm = (DefaultTableModel) addMedTbl.getModel();
        dtm.setRowCount(0);
        
        
        // Restaurant ro1 = system.getRestaurantDirectory().findRestaurant(resName);
        PharamacyAdmin phar = system.findNetwork(pharname).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().getPharmacyAdminDirectory().findPharmacy(pharname);
            System.out.println("Username"+system.findNetwork(pharname).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().getPharmacyAdminDirectory().findPharmacy(pharname));
            //PharmacyDirectory pd = system.getPharmacyDirectory().getCatalog();
           // ArrayList<PharmacyCatalog> pd = system.getPharmacyDirectory().getCatalog();
                   if(phar.getPharDir()!=null){
           for(PharmacyCatalog m : phar.getPharDir().getCatalog()  ) {
               System.out.println(system.findNetwork(pharname).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().getPharmacyAdminDirectory().getPharmacyList().size());
                Object row[] = new Object[3];
                row[0] = m.getItemName();
                row[1] = m.getItemPrice();

                dtm.addRow(row);
            }
                    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        addMedTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        medNameTxt = new javax.swing.JTextField();
        medPriceTxt = new javax.swing.JTextField();
        addMedBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        addMedTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicine", "Price"
            }
        ));
        jScrollPane1.setViewportView(addMedTbl);

        jLabel1.setText("Medicine Name:");

        jLabel2.setText("Medicine Price:");

        medNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medNameTxtActionPerformed(evt);
            }
        });

        addMedBtn.setText("Add");
        addMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(addMedBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {medNameTxt, medPriceTxt});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(medNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(medPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(addMedBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void medNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medNameTxtActionPerformed

    private void addMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedBtnActionPerformed
        // TODO add your handling code here:
        String menuIt = medNameTxt.getText();
        Double ip = Double.valueOf(medPriceTxt.getText());
        PharmacyCatalog m = new PharmacyCatalog();
        PharamacyAdmin pha = system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().getPharmacyAdminDirectory().findPharmacy(pharname);
        
        m.setItemName(menuIt);
        m.setItemPrice(ip);
            
            if(pha.getPharDir() != null){
            //PharmacyDirectory d = new PharmacyCatalogDirectory();
            PharmacyCatalogDirectory pd = pha.getPharDir();
            ArrayList<PharmacyCatalog> am  = pha.getPharDir().getCatalog();
            am.add(m);
            pd.setCatalog(am);
            pha.setPharDir(pd);
//            system.getPharmacyDirectory().setCatalog(am);
//            System.out.println(system);
//            system.setPharmacyDirectory(system.getPharmacyDirectory());
//            System.out.println(m.getItemName());
        }
            else{
            PharmacyCatalogDirectory d = new PharmacyCatalogDirectory();
            ArrayList<PharmacyCatalog> am  = new ArrayList<>();
            am.add(m);
            d.setCatalog(am);
            pha.setPharDir(d);
//            System.out.println(system);
//            system.setPharmacyDirectory(d);
//            System.out.println(m.getItemName());
            }
            viewTable();
    }//GEN-LAST:event_addMedBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        viewTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedBtn;
    private javax.swing.JTable addMedTbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medNameTxt;
    private javax.swing.JTextField medPriceTxt;
    // End of variables declaration//GEN-END:variables
}