package com.oops.bean;

public class BeanDemo{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setModel("G-class");
        System.out.println(vehicle.getModel());
        vehicle.setBrand("BMW");
        System.out.println(vehicle.getBrand());
        vehicle.setPrice(70000000);
        System.out.println(vehicle.getPrice());
        System.out.println(vehicle);


    }
}
