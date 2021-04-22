/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.DeliverManRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Tharoon
 */
public class DeliveryEnterprise extends Enterprise {

    public DeliveryEnterprise(String name) {
         super(name,EnterpriseType.Delivery);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliverManRole());
        return roles;
    }
   
}
