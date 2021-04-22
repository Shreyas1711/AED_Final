/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.InsuranceAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Apoorva
 */
public class InsuranceEnterprise extends Enterprise {

    public InsuranceEnterprise(String name) {
                 super(name,EnterpriseType.Insurance);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
                ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceAdminRole());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
}
