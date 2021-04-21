/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HospitalAdmin;

import java.util.ArrayList;

/**
 *
 * @author shreyascr
 */
public class HospitalDirectory {
    ArrayList<Hospital> hospitalList;

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }


    public Hospital createHospital(String name, String address){
        
        Hospital hosp = new Hospital();
        hosp.setName(name);
        hosp.setAddress(address);
        
        hospitalList.add(hosp);
        return hosp;
    
    }

    public HospitalDirectory() {
        hospitalList = new ArrayList<>();
    }
     public Hospital findHospital(String name){
        
         
         for(Hospital doc : hospitalList){
             if(doc.getName().equals(name)){
                 return doc;
             }
         }
         return null;
     }
      public void deleteDoctor(Hospital hosp){
       hospitalList.remove(hosp);
   }
}
