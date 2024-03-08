package com.oops.overloading;

public class Shape {
    public void calArea(int length){
        System.out.println("Sq "+(length*length));
    }
    public int calArea(int length,int breath){
        return length*breath;
    }
    public void calArea(double radius){
        System.out.println("circle "+Math.PI*Math.pow(radius,2));
    }
    public double calArea(double base, int height){
        return 0.5*base*height;
    }
}
