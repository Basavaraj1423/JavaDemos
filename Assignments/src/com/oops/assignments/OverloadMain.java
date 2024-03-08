package com.oops.assignments;

import java.util.Scanner;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Employee []emplist = new Employee[3];
        Scanner sc = new Scanner(System.in);


        for(int i=0;i<3;i++){
            System.out.println("Enter the name");
            String name = sc.next();
            System.out.println("Enter Designation");
            String designation = sc.next();
            emplist[i] = new Employee(name,designation);
        }
        System.out.println("Enter the designation to know the Bonus");
        String choice = sc.next();
        for(Employee emp:emplist){
            if(choice.equals("Programmer")){
                emp.calBonus(2000);
            }else if(choice.equals("Manager")){
                System.out.println(emp.calBonus(2000,3000,"Car"));
            }else if(choice.equals("Direcor")){
                System.out.println(emp.calBonus(2000,3000,"Car",4000));
            }
        }
    }
}
