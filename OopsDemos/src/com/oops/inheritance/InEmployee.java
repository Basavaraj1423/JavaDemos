package com.oops.inheritance;

public class InEmployee {
    String employeeName;
    int employeeId;


    public InEmployee() {
        employeeName="Surya";
        employeeId=654645;
    }

    void getDetails(){

        System.out.println(employeeName + "\n" +employeeId);
    }
}
