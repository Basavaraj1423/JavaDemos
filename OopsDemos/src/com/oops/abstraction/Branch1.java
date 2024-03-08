package com.oops.abstraction;

public class Branch1 extends Bank {
    @Override
    void carLoan() {
        System.out.println("CarLoan in Branch 1");

    }

    @Override
    void educationLoan() {
        System.out.println("educationLoan in Branch 1");

    }

    @Override
    void houseLoan() {
        System.out.println("houseLoan in Branch 1");

    }
    void payInterest(){
        System.out.println("I am PayInterest from Branch1");
    }


}
