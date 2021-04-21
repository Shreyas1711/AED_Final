/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    public void addWorkRequest(WorkRequest workRequest) {
workRequestList.add(workRequest);
}
     public  ArrayList<WorkRequest> findWorkRequest(UserAccount name){
         ArrayList<WorkRequest> array1 = new ArrayList<>();
         
         for(WorkRequest net : workRequestList){
             if(net.getReceiver().equals(name)){
                
                 array1.add(net);
                 //return array1;
             }
         }
         return array1;
         // null;
     }
       public  ArrayList<WorkRequest> findWorkRequestByRec(UserAccount name){
         ArrayList<WorkRequest> array1 = new ArrayList<>();
         
         for(WorkRequest net : workRequestList){
             if(net.getSender().equals(name)){
                
                 array1.add(net);
                 //return array1;
             }
         }
         return array1;
         // null;
     }
}