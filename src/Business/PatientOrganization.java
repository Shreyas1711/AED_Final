/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.CustomerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreyascr
 */
public class PatientOrganization extends Organization{

  private String patientName;
  private int patientID;
    public PatientOrganization() {
        super(Organization.Type.Patient.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CustomerRole());
        return roles;
        }
    
}
