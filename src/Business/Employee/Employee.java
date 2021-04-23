/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Doctor.DoctorDirectory;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private String city;
    
    public String getCity() {
        return city;
    }
private boolean hasInsurance;
   

    public boolean isHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }
    public void setCity(String city) {
        this.city = city;
    }
    private int id;
    private static int count = 1;

    public Employee() {
        
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
