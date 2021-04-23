/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tharoon
 */
public class PlaceNewOrderWorkRequest extends WorkRequest {
        private int orderId;
    private static int count = 1;
    private List<PharmacyOrder> orderTotal = new ArrayList<PharmacyOrder>();

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId() {
        this.orderId = orderId;
    }

    public List<PharmacyOrder> getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(List<PharmacyOrder> orderTotal) {
        this.orderTotal = orderTotal;
    }

    public PharmacyOrder addItem(PharmacyOrder orderItemTotal) {
        orderTotal.add(orderItemTotal);
        return orderItemTotal;
    }
        public PlaceNewOrderWorkRequest(){
        orderId = count;
        count++;

    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PlaceNewOrderWorkRequest.count = count;
    }
    
}
