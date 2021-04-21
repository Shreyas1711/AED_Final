/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.HospitalAdmin.Hospital;
import Business.HospitalAdmin.HospitalDirectory;
import Business.Role.HospitalAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreyascr
 */
public class HospitalEnterprise extends Enterprise {
   
    public HospitalEnterprise(String name) {
         super(name,EnterpriseType.Hospital);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalAdminRole());
        return roles;
    }
    
}
