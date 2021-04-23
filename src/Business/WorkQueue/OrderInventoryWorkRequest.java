/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.SupplierAdmin.Inventory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Apoorva
 */
public class OrderInventoryWorkRequest extends WorkRequest{

    private List<Inventory> inventoryList = new ArrayList<Inventory>();

    public List<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }
    
    
}
