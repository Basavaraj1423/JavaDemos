package com.inter.lam;

public class MyCalculatorImplLamda  {
    public static void main(String[] args) {
        IMyCalculator iMyCalculator = (x,y)-> (x+y);
        System.out.println("The area is:" +iMyCalculator.calculate(10,20));
    }
}
