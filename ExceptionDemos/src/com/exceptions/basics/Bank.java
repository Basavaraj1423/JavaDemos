package com.exceptions.basics;

public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    void withdraw(int amount) throws Exception {
        try {
            if(amount>1000) {
                throw new Exception("Amount is greater than 1000");
            }
            balance = balance-amount;
            System.out.println(balance);
        }catch (Exception e){
            System.out.println("Error... ");
            throw e;
        }finally {
            System.out.println("Close Database");
        }
        System.out.println("Completed");

    }
}
