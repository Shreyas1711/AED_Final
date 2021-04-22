/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.PharamacyAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Tharoon
 */
public class PharmacyEnterprise extends Enterprise {

    public PharmacyEnterprise(String name) {
         super(name,EnterpriseType.Pharmacy);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharamacyAdminRole());
        return roles;
    }
     
}
