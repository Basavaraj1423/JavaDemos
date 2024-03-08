package com.exceptions.custom;

public class VoyaBank {
    double balance;

    public VoyaBank(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount) throws NegativeBalanceException, OutOfLimitsException {
        try {
            if (balance - amount <= 0)
                throw new NegativeBalanceException("Balance is Negative");
            if (amount > 1000)
                throw new OutOfLimitsException("Limit Exceeded");

            balance = balance - amount;
            System.out.println("Balance :" + balance);
        }catch (NegativeBalanceException e){
            System.out.println("Negative Balance");
            throw e;
        }catch(OutOfLimitsException e){
            System.out.println("Exceeding");
            throw e;
        }finally {
            System.out.println("Close DataBase");
        }
        System.out.println("Work Done");
    }
}
