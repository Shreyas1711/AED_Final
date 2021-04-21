/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        HospitalAdmin("HospitalAdmin"),
        Patient("Patient"),
        DeliveryMan("DeliveryMan"),
        SysAdmin("Sysadmin"),
        InsuranceAdmin("InsuranceAdmin"),
        PharamacyAdmin("PharamacyAdmin"),
        SupportAdmin("SupportAdmin"),
        EmergencyAdmin("EmergencyAdmin"),
        VoluntaryAdmin("VoluntaryAdmin"),
        LabAdmin("LabAdmin"),
        Doctor("Doctor");
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}