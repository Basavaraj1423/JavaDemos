package com.oops.assignments;


import java.util.Scanner;

public class MainBank {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Bank of Baroda");
        System.out.println("**************************");
        System.out.println("Enter the amount to Deposit");

        double amt = sc.nextDouble();


        Bank bank = new Bank(amt);

        System.out.println("\nSelect an option");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Enter the amount to be Deposited");
                double depositamount = sc.nextDouble();
                bank.deposit(depositamount);
                bank.thankyou();
                break;
            case 2:
                System.out.println("Enter the amount to be Withdraw");
                double withdrawamount = sc.nextDouble();
                bank.withdraw(withdrawamount);
                bank.thankyou();
                break;
            case 3:
                System.out.println("The Account Balance is");
                System.out.println(bank.getBalance());
                bank.thankyou();
                break;
            case 4:
                System.out.println("Exiting... ");
                sc.close();
                bank.thankyou();
                return;
            default:
                System.out.println("Ivalid entry");
                bank.thankyou();

        }

    }
}
