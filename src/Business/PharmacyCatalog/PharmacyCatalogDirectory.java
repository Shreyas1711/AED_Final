/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PharmacyCatalog;

import java.util.ArrayList;

/**
 *
 * @author Tharoon
 */
public class PharmacyCatalogDirectory {

        ArrayList<PharmacyCatalog> catalog;
    
    public PharmacyCatalogDirectory(){
        this.catalog = new ArrayList<>();
        
    }

    public ArrayList<PharmacyCatalog> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<PharmacyCatalog> catalog) {
        this.catalog = catalog;
    }


}
    
