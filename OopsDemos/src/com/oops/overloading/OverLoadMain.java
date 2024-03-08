package com.oops.overloading;

public class OverLoadMain {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.calArea(10);
        shape.calArea(2.0);
        System.out.println(shape.calArea(10,20));
        System.out.println(shape.calArea(12.0,4));

    }
}
