package com.oops.abstraction;

public class AbsMain {
    public static void main(String[] args) {
        Bank bank = new Branch1();
        bank.carLoan();
        bank.educationLoan();
        bank.educationLoan();
        Branch1 branch1 = (Branch1) bank;
        branch1.payInterest();

        Branch2 branch2 = new SubBranch();
        branch2.educationLoan();
        branch2.houseLoan();
        branch2.staffDetails();

    }


}

