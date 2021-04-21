/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author shreyascr
 */
public class PatientDirectory {
    ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
     public Patient createPatient(String name, String age){
        
        Patient pa = new Patient();
        pa.setName(name);
        pa.setAge(age);
        
        patientList.add(pa);
        return pa;
    
    }
     public Patient findPatient(String name){
        
         
         for(Patient pa : patientList){
             if(pa.getName().equals(name)){
                 return pa;
             }
         }
         return null;
     }
      public void deleteDoctor(Patient pa){
       patientList.remove(pa);
   }
}
