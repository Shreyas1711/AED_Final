/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;



import Business.DeliveryMan.DeliveryManDirectory;
import Business.Doctor.DoctorDirectory;
import Business.Patient.PatientDirectory;
import Business.HospitalAdmin.HospitalDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    private ArrayList<Network> networkList; 
    private static EcoSystem business;
  public Network createNetwork(String name){
      
        Network network=new Network();
        network.setName(name);
        networkList.add(network);
        return network;
    }
     public Network findNetwork(String name){
        
         
         for(Network net : networkList){
             if(net.getName().equals(name)){
                 return net;
             }
         }
         return null;
     }

   
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

//    public HospitalDirectory getHospitalDirectory() {
//        return hospitalDirectory;
//    }
//
//    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
//        this.hospitalDirectory = hospitalDirectory;
//    }
//
//    public PatientDirectory getPatientDirectory() {
//        return patientDirectory;
//    }
//
//    public void setPatientDirectory(PatientDirectory patientDirectory) {
//        this.patientDirectory = patientDirectory;
//    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
