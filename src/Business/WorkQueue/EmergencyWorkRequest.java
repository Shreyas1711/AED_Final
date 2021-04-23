/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;

/**
 *
 * @author Apoorva
 */
public class EmergencyWorkRequest extends WorkRequest{
  Patient p;

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }
  
  
}
