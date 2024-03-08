package com.inter.extend;

public class ScientificCalc extends BasicCalculator implements IScientific{
    public void square(int x,int y){
        System.out.println("Square "+Math.pow(x,2));
    }
    public void cube(int x){
        System.out.println("Cube "+Math.pow(x,3));
    }
}
