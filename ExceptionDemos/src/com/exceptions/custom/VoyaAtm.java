package com.exceptions.custom;

import com.exceptions.basics.Bank;

public class VoyaAtm {
    public static void main(String[] args)  {
        VoyaBank voyaBank = new VoyaBank(10000);
        try {
            voyaBank.withdraw(500);
            System.out.println("Amount withdrawn sucessfully");
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        } catch (OutOfLimitsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("GoodBye");
    }
}
