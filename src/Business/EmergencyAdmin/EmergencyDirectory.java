/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EmergencyAdmin;

import java.util.ArrayList;

/**
 *
 * @author Apoorva
 */
public class EmergencyDirectory {
        ArrayList<Emergency> emergencyUnitDirectory = new ArrayList<>();

    public ArrayList<Emergency> getEmergencyUnitDirectory() {
        return emergencyUnitDirectory;
    }

    public void setEmergencyUnitDirectory(ArrayList<Emergency> emergencyUnitDirectory) {
        this.emergencyUnitDirectory = emergencyUnitDirectory;
    }


    
        public Emergency createEmergencyUnit(String name,String id, String address, String phone){
        
        Emergency unit = new Emergency(name,address,phone,id);
        emergencyUnitDirectory.add(unit);
        return unit;
    
    }
        
    public boolean doesEmergencyUnitExist(String name){
        for(Emergency unit: emergencyUnitDirectory){
            if (unit.getEmergencyUnitName().equals(name)){
                return true;
            }
            
        }
        return false;
    }
    
    public Emergency findLab(String name){
        for(Emergency l: emergencyUnitDirectory) {
            if(l.getEmergencyUnitName().equals(name)){
                return l;
            }
        }
        Emergency l = new Emergency(name);
        return l;
    }
    
    public void deleteLab(Emergency l){
        emergencyUnitDirectory.remove(l);
    }
}
