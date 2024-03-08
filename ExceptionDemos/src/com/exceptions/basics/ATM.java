package com.exceptions.basics;

public class ATM {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Bank bank = new Bank(10000);
        try {
            bank.withdraw(500);
            System.out.println("Amount withdrawn successfully");
        } catch (Exception e) {
            System.out.println("Exception...");
            System.out.println(e.getMessage());
        }
        System.out.println("GoodBye");

    }
}
