/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacist;

import Business.PharmacyEnterprise;
import java.util.ArrayList;

/**
 *
 * @author shreyascr
 */
public class PharamacyAdminDirectory {

    public PharamacyAdminDirectory(ArrayList<PharamacyAdmin> pharmacyList) {
        this.pharmacyList = pharmacyList;
    }
    ArrayList<PharamacyAdmin> pharmacyList;

    public ArrayList<PharamacyAdmin> getPharmacyList() {
        return pharmacyList;
    }

    public void setPharmacyList(ArrayList<PharamacyAdmin> pharmacyList) {
        this.pharmacyList = pharmacyList;
    }
            public PharamacyAdmin createPharmacy(String name){
        
        PharamacyAdmin phar = new PharamacyAdmin();
        phar.setName(name);;
       // phar.setPharlocation(location);
        pharmacyList.add(phar);
        return phar;
    
    }
     public PharamacyAdmin findPharmacy(String name){
        
         
         for(PharamacyAdmin phar : pharmacyList){
             if(phar.getName().equals(name)){
                 return phar;
             }
         }
         return null;
     }

    public PharamacyAdminDirectory() {
        pharmacyList = new ArrayList<>();
    }
    
}
