package com.oops.stat;

public class Trail {
    static int x;
    static int y = 10;

    static {
        System.out.println("In Trail static block 1");
        x = 200;
    }

    static {
        System.out.println("in Trail static block 2");
        x = 200;
    }

    static void getMessage() {
        System.out.println("in static method");
        System.out.println("sum " + (x + y));
    }

    public static void main(String[] args) {
        System.out.println("in main");
        getMessage();
        System.out.println("sum " + (x + y));
    }
}
