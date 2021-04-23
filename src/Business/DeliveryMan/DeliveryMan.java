/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Organization;
import Business.Role.DeliverManRole;
import Business.Role.PharamacyAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan extends Organization{
       String deliveryManName;
    

    public String getDeliveryManName() {
        return deliveryManName;
    }

    
    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }


    
    @Override
    public String toString(){
        return deliveryManName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliverManRole());
        return roles;
    }
    
}
