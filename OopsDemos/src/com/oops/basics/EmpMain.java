package com.oops.basics;

public class EmpMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Basavaraj",302888,20000);
        employee.getDetails();
        System.out.println(employee.greet("Welcome to Voya India,"));

//      All this six lines are in Employee clas now.
//        employee.employeeName = "Basavaraj";
//        employee.employeeId = 302888;
//        employee.salary = 20000;
//        System.out.println("Employee Name :" + employee.employeeName);
//        System.out.println("Employee Id :" + employee.employeeId);
//        System.out.println("Employee Salary :" + employee.salary);




    }
}
