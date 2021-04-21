package Business.LabAdmin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Business.LabAdmin.Test;
import Business.LabAdmin.TestDirectory;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Apoorva
 */
public class Lab extends UserAccount {
    String name;
    String address;
    String phoneNumber;
    TestDirectory testlist;


    public Lab(String name, String username, String password) {
        setUsername(username);
        setPassword(password);
        this.name = name; //To change body of generated methods, choose Tools | Templates.
        testlist = new TestDirectory();
    }
    public Lab(String name) {
        this.name = name; //To change body of generated methods, choose Tools | Templates.
        testlist = new TestDirectory();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public TestDirectory getTestlist() {
        return testlist;
    }

    public void setTestlist(TestDirectory testlist) {
        this.testlist = testlist;
    }
    
    public void deleteTest(Test t){
        testlist.getTestList().remove(t);
    }

    @Override
    public String toString() {
        return  name;
    }
    
    
 
}
