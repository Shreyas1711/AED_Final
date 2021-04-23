/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.LabAdmin.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Apoorva
 */
public class BookTestWorkRequest extends WorkRequest {
    private int testId;
    private static int count = 1;
    private Date DateBooked;
    private List<Test> testList = new ArrayList<Test>();

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        BookTestWorkRequest.count = count;
    }

    public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }

    public Date getDateBooked() {
        return DateBooked;
    }

    public void setDateBooked(Date DateBooked) {
        this.DateBooked = DateBooked;
    }
    
    
}
