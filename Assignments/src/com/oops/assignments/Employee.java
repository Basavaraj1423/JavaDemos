package com.oops.assignments;

public class Employee {
    String name;
    String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;


    }
    public double calBonus(double basicAllowance){
        return basicAllowance;
    }
    public double calBonus(double basicAllowance,double houseAllowance, String gift){
        System.out.println("the gift is"+gift);
        return basicAllowance+houseAllowance;

    }
    public double calBonus(double basicAllowance,double houseAllowance, String gift,double carAllowance){
        System.out.println("The gift is"+gift);
        return basicAllowance+houseAllowance+carAllowance;
    }

}
