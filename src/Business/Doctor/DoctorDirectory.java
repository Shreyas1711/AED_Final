/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Patient.PatientDirectory;
import java.util.ArrayList;

/**
 *
 * @author shreyascr
 */
public class DoctorDirectory {
    ArrayList<Doctor> doctorList;
    

    public DoctorDirectory() {
        doctorList = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    public Doctor createDoctor(String name, String specialization){
        
        Doctor doc = new Doctor();
        doc.setName(name);
        doc.setSpecialization(specialization);
        
        doctorList.add(doc);
        return doc;
    
    }
     public Doctor findDoctor(String name){
        
         
         for(Doctor doc : doctorList){
             if(doc.getName().equals(name)){
                 return doc;
             }
         }
         return null;
     }
      public void deleteDoctor(Doctor doc){
       doctorList.remove(doc);
   }
}
