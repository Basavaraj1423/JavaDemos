package com.oops.inheritance;

public class InManager extends InEmployee{
    double salary;

    public InManager() {
        employeeName = "Naveen";
        employeeId = 302888;
        salary = 64538;
    }

    void printBonus(double amount){
        System.out.println("Salary :"+(amount+salary));
    }
}
