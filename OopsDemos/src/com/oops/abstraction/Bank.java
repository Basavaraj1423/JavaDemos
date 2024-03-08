package com.oops.abstraction;

abstract public class Bank {
    abstract void carLoan();
    abstract void educationLoan();
    abstract void houseLoan();
    void admin(){
        System.out.println("Hey hi bro I am admin in Bank");
    }
}
