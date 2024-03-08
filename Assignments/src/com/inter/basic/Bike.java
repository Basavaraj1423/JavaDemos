package com.inter.basic;

public class Bike extends Vehicle implements IExternal{
    String capacity;

    public Bike(String brand, String model, double price,String capacity) {
        super(brand, model, price);
        this.capacity=capacity;
    }

    @Override
    public void showAccessories() {

    }

    @Override
    public void Exterior() {

    }

    @Override
    void getMileage() {

    }
}
