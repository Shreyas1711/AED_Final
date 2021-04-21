/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.DeliveryMan.DeliveryManDirectory;
import Business.Doctor.DoctorDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

     String name;
     Type enterpriseType1;
      

    public Type getEnterpriseType1() {
        return enterpriseType1;
    }

    public void setEnterpriseType1(Type enterpriseType) {
        this.enterpriseType1 = enterpriseType;
    }
//    public void getDirectory(String type) {
//        if(type.equals("Doctor")){
//            getDoctorDirectory();
//        }else if(type.equals("Patient")){
//            getPatientDirectory();
//        }
//        else if(type.equals("DeliveryMan")){
//            getDeliveryManDirectory();
//        }
//         else if(type.equals("PharamacyAdmin")){
//            getDeliveryManDirectory();
//        }
//         else if(type.equals("InsuranceAdmin")){
//            getDeliveryManDirectory();
//        }
//         else if(type.equals("LabAdmin")){
//            getDeliveryManDirectory();
//        }
//         else if(type.equals("SupportAdmin")){
//            getDeliveryManDirectory();
//        }
//         else if(type.equals("VoluntaryAdmin")){
//            getDeliveryManDirectory();
//        }
//    }

   
   
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
   
    private int organizationID;
    private static int counter=1;
    
    public enum Type{
        HospitalAdmin("HospitalAdmin"),
        Patient("Patient"),
        DeliveryMan("DeliveryMan"),
        SysAdmin("Sysadmin"),
        LabAdmin("LabAdmin"),
        InsuranceAdmin("InsuranceAdmin"),
        Doctor("Doctor"),
        SupportAdmin("SupportAdmin"),
        EmergencyAdmin("EmergencyAdmin"),
        VoluntaryAdmin("VoluntaryAdmin"),
        PharamacyAdmin("PharamacyAdmin");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
       
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
