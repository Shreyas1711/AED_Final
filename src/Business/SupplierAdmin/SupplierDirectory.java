/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierAdmin;

import java.util.ArrayList;

/**
 *
 * @author Apoorva
 */
public class SupplierDirectory {
    
    ArrayList<Supplier> supplierDirectory = new ArrayList<>();

    public ArrayList<Supplier> getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(ArrayList<Supplier> logisticsDirectory) {
        this.supplierDirectory = logisticsDirectory;
    }
    
    public Supplier createSupplier(String name)  {
        Supplier l = new Supplier(name);
        supplierDirectory.add(l);
        return l;
    }
    public boolean doesSupplierExist(String name){
        for(Supplier ic: supplierDirectory){
            if (ic.getName().equals(name)){
                return true;
            }
            
        }
        return false;
    }
    
    public Supplier findSupplier(String name){
        for(Supplier ic: supplierDirectory) {
            if(ic.getName().equals(name)){
                return ic;
            }
        }
        Supplier l = new Supplier(name);
        return l;
    }
    
    public void deleteSupplier(Supplier ic){
        supplierDirectory.remove(ic);
    }
    
    
}
