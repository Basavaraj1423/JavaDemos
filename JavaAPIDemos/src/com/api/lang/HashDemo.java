package com.api.lang;

public class HashDemo {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Black","X100","Audi");
        Vehicle vehicle2 = new Vehicle("White","X100","Audi");
        Vehicle vehicle3 = new Vehicle("White","A100","Audi");
        Vehicle vehicle4 = new Vehicle("Black","X100","Audi");
        System.out.println(vehicle1.equals(vehicle2));
        System.out.println(vehicle2.equals(vehicle3));
        System.out.println(vehicle1.equals(vehicle4));
        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());
        System.out.println(vehicle3.hashCode());
        System.out.println(vehicle4.hashCode());

    }
}
