/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Doctor.Doctor;
import Business.Organization;
import Business.Role.CustomerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreyascr
 */
public class Patient extends Organization{
    String name;
    String age;
    String comments;
    String symtoms;

    public String getSymtoms() {
        return symtoms;
    }

    public void setSymtoms(String symtoms) {
        this.symtoms = symtoms;
    }
    Medicine medicine;

   

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
    @Override
    public String toString(){
        return name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CustomerRole());
        return roles;
    }
   
}
