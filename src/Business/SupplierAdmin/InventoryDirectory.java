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
public class InventoryDirectory {
    ArrayList<Inventory> inventoryList = new ArrayList<>();

    public ArrayList<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }
    
        public void getInventoryItem(Inventory inv) {
        inventoryList.add(inv);
    }

    public void deleteInventoryItem(Inventory inv) {
        inventoryList.remove(inv);
    }
    
        public void addInventory(Inventory i){
        inventoryList.add(i);
    }
}
