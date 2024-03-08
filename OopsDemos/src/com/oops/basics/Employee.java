package com.oops.basics;

public class Employee {
    String employeeName;
    int employeeId;
    double salary;

    public Employee(String employeeName, int employeeId, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void getDetails(){
        System.out.println("Employee Name :" +employeeName);
        System.out.println("Employee Name :" +employeeId);
        System.out.println("Employee Name :" +salary);
    }
    public String greet(String message){
        return message+ " " +employeeName;
    }


}
