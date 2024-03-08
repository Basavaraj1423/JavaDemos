package com.oops.overloading;

public class VarArgsDemo {
    public void calSum(String name, int... marks){
        int sum  = 0;
        for(int mark :marks)
            sum += mark;
        System.out.println("Sum :"+sum);
    }
    public void calSum(String name){
        System.out.println("Name :"+name);
    }

    public static void main(String[] args) {
        VarArgsDemo demo = new VarArgsDemo();
        demo.calSum("Arya",90,80,70);
        demo.calSum("Ajay");
        demo.calSum("Geetha",34,55);
    }

}
