package com.oops.assignments;

import jdk.swing.interop.SwingInterOpUtils;

public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
            System.out.println("Account Balance is : "+balance);
        } else {
            System.out.println("Insufficient funds or invalid entry");
        }
    }
    public void deposit(double amount){
        if(amount>0) {
            balance += amount;
            System.out.println("Account Balance is : "+balance);
        }
        else
            System.out.println("Ivalid Entry");

    }
    public double getBalance(){
        return balance;
    }
    public void thankyou(){
        System.out.println("Thank you Visit Again");
        System.out.println("***********************");
    }
}
