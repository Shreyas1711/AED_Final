/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.PharmacyCatalog.PharmacyCatalog;

/**
 *
 * @author Tharoon
 */
public class PharmacyOrder {

    public PharmacyOrder(PharmacyCatalog catalog) {
        this.catalog = catalog;
    }

    public PharmacyCatalog getCatalog() {
        return catalog;
    }

    public void setCatalog(PharmacyCatalog catalog) {
        this.catalog = catalog;
    }
    private PharmacyCatalog catalog;





}
