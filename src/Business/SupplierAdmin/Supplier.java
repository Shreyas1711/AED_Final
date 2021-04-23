/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierAdmin;

import Business.Organization;
import Business.Role.Role;
import Business.Role.SupplierAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Apoorva
 */
public class Supplier extends Organization{
    
    String name;
    String address;
    String PhoneNumber;
    InventoryDirectory inventoryDirectory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public void setInventoryDirectory(InventoryDirectory inventoryDirectory) {
        this.inventoryDirectory = inventoryDirectory;
    }

    
    public Supplier(String name){
        this.name = name;
        inventoryDirectory = new InventoryDirectory();
    }

    public void deleteInventory(Inventory i){
        inventoryDirectory.getInventoryList().remove(i);
    }
    @Override
    public String toString() {
        return  name ;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        //To change body of generated methods, choose Tools | Templates.
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplierAdminRole());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
        public Supplier(){
        inventoryDirectory = new InventoryDirectory();
    
    }
       
    
    
    
}
