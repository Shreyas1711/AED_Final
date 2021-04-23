/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
            ArrayList<DeliveryMan> deliveryList;
    
    public DeliveryManDirectory(){
        this.deliveryList = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(ArrayList<DeliveryMan> deliveryList) {
        this.deliveryList = deliveryList;
    }


    
   public DeliveryMan createDeliveryMan(String name){
       
       DeliveryMan dm = new DeliveryMan();
       dm.setDeliveryManName(name);
      // dm.setUsername(username);
       deliveryList.add(dm);
       return dm;      
       
   }
   
   public DeliveryMan findDeliveryMan(String name){
       for(DeliveryMan dm :deliveryList ){
           
           if(dm.getDeliveryManName().equals(name)){
               return dm;
           }
       }
       return null;
   }
   
   public void deleteDeliveryMan(DeliveryMan deliveryMan){
       deliveryList.remove(deliveryMan);
   }
}
