/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabAdmin;

import java.util.ArrayList;

/**
 *
 * @author Apoorva
 */
public class TestDirectory {
    ArrayList<Test> testList = new ArrayList<>();

    public ArrayList<Test> getTestList() {
        return testList;
    }

    public void setTestList(ArrayList<Test> testList) {
        this.testList = testList;
    }
    
    public void addTest(Test t) {
        testList.add(t);
    }
}
