package com.inter.def;

public class DefMain {
    public static void main(String[] args) {
        IBonusCalculator bonusCalculator = new CalculatorImpl();
        bonusCalculator.calculate(2000);
        bonusCalculator.policyType();
        IBonusCalculator.show();


        IAllowanceCalculator iAllowanceCalculator = (IAllowanceCalculator) bonusCalculator;
        iAllowanceCalculator.calculate(1000);
        iAllowanceCalculator.policyType();

    }
}
