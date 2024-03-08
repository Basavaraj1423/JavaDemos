package com.oops.overloading;

import java.sql.SQLOutput;

public class Vehicle {
    String brand;
    double price;
    String model;

    public Vehicle() {
        System.out.println("default");
    }

    public Vehicle(String brand) {
        this();
        System.out.println("one");
        this.brand = brand;
    }

    public Vehicle(String brand, double price) {
        this(brand);
        this.price = price;
        System.out.println("two");
    }

    public Vehicle(String brand, double price, String model) {
        this(brand,price);
        this.model = model;
        System.out.println("three");
    }
    void getDetails(){
        if (brand!=null)
            System.out.println("The brand of vehicle is: "+brand);
        if (price>0)
            System.out.println("The price of vehicle is: "+price);
        if (model!=null)
            System.out.println("Vehicle model: "+model);
    }
}
