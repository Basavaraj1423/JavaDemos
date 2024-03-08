package com.oops.inheritance;

public class InherMain {

    public static void main(String[] args) {
        InEmployee inEmployee = new InEmployee();
        inEmployee.getDetails();
        InManager inManager = new InManager();
        inManager.printBonus(1000);
    }
}
