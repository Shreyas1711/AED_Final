/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.EmergencyAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Apoorva
 */
public class EmergencyEnterprise extends Enterprise {

    public EmergencyEnterprise(String name) {
                         super(name,EnterpriseType.Insurance);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
                        ArrayList<Role> roles = new ArrayList();
        roles.add(new EmergencyAdminRole());
        return roles; 
    }
    
}
