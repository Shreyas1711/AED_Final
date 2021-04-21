/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Doctor.Doctor;
import Business.Doctor.DoctorDirectory;
import Business.Organization.Type;
import Business.Patient.Patient;
import Business.HospitalAdmin.Hospital;
import Business.InsuraceAdmin.InsuranceeAdmin;
import Business.LabAdmin.LabbAdmin;
import Business.Patient.PatientDirectory;
import Business.Pharmacist.PharamacyAdmin;
import Business.VoluntaryAdmin.VoluntaryyAdmin;
import java.util.ArrayList;

/**
 *
 * @author shreyascr
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;
DoctorDirectory doctorDirectory;
    PatientDirectory patientDirectory;
    DeliveryManDirectory deliveryManDirectory;
    EcoSystem system;

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
     public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
     public Organization findOrganization(String name){
        
         
         for(Organization net : organizationList){
             if(net.getName().equals(name)){
                 return net;
             }
         }
         return null;
     }
      public ArrayList<Organization> findOrganizationType(Type type){
        
         
         for(Organization net : organizationList){
             if(net.getName().equals(Type.Doctor.getValue())){
                 ArrayList<Organization> array1 = new ArrayList<>();
                  array1.add(net);
                  return array1;
             }
         }
         return null;
     }
    public Organization createOrganization(String name,Type type,String random){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new Doctor();
            organization.setName(name);
            if(getDoctorDirectory()==null){
                DoctorDirectory doctordirectory =new DoctorDirectory();
            Doctor doctor = new Doctor();
            ArrayList<Doctor> doclist = new ArrayList<>();
            doctor.setName(name);
            doctor.setSpecialization(random);
            doclist.add(doctor);
            doctordirectory.setDoctorList(doclist);
            setDoctorDirectory(doctordirectory);
            }else{
                getDoctorDirectory().createDoctor(name, random);
            }
            
            organization.setEnterpriseType1(type);
            organizationList.add(organization);
            
        }
        else if (type.getValue().equals(Type.Patient.getValue())){
            organization = new Patient();
             organization.setName(name);
             organization.setEnterpriseType1(type);
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.DeliveryMan.getValue())){
            organization = new DeliveryMan();
             organization.setName(name);
             organization.setEnterpriseType1(type);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PharamacyAdmin.getValue())){
            organization = new PharamacyAdmin();
             organization.setName(name);
             organization.setEnterpriseType1(type);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.InsuranceAdmin.getValue())){
            organization = new InsuranceeAdmin();
             organization.setName(name);
             organization.setEnterpriseType1(type);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.LabAdmin.getValue())){
            organization = new LabbAdmin();
             organization.setName(name);
             organization.setEnterpriseType1(type);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.SupportAdmin.getValue())){
            organization = new LabbAdmin();
             organization.setName(name);
             organization.setEnterpriseType1(type);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.VoluntaryAdmin.getValue())){
            organization = new VoluntaryyAdmin();
            organization.setEnterpriseType1(type);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.EmergencyAdmin.getValue())){
            organization = new LabbAdmin();
             organization.setName(name);
             organization.setEnterpriseType1(type);
            organizationList.add(organization);
        }
        return organization;
    }
}

