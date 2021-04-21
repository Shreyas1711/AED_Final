/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Medicine;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author shreyascr
 */
public class BookAppointment extends WorkRequest{
    String comments;
    Medicine meds;

    public Medicine getMeds() {
        return meds;
    }

    public void setMeds(Medicine meds) {
        this.meds = meds;
    }
   
   
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    
    
}
