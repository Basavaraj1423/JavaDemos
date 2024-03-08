package com.oops.stat;

public class Demo {
    static {
        System.out.println("In demo static block");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("In main method");
        Class.forName("com.oops.stat.Trail");
    }

}
