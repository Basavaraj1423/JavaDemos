package com.inter.def;

public interface IBonusCalculator {
    void calculate(double amount);
    default void policyType(){
        System.out.println("Policy for Bonus from IBonusCalculator ");
    }
    static void show(){
        System.out.println("Show the static data");
    }
}
