/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InsuraceAdmin;

import Business.Organization;
import Business.Role.InsuranceAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreyascr
 */
public class InsuranceeAdmin extends Organization{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    String name;

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceAdminRole());
        return roles;
    }
}
