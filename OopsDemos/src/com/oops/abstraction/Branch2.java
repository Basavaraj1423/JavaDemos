package com.oops.abstraction;

public abstract class Branch2 extends Bank{
    @Override
    void educationLoan() {  //Have doubt clarify. I want to call this method
        System.out.println("I am education loan from Branch 2");
    }

    @Override
    void houseLoan() {
        System.out.println("I am houseLoan from Branch 2");
    }
   void staffDetails(){
       System.out.println("I am Staffdetails from Branch 2");
   }
}
//hl,el,lt