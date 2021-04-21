/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupportAdmin;

import Business.Role.SupportAdminRole;
import Business.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreyascr
 */
public class SupporttAdmin extends Organization{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupportAdminRole());
        return roles;
    }
}
