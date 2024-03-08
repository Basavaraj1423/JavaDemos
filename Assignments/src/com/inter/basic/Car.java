package com.inter.basic;

public class Car extends Vehicle implements IExternal,IInternal{
    String type;

    public Car(String brand, String model, double price, String type) {
        super(brand, model, price);
        this.type = type;
    }

    void carFeatures(){
        System.out.println("This is a Own method");
    }

    @Override
    public void showAccessories() {

    }

    @Override
    void getMileage() {

    }

    @Override
    public void Exterior() {

    }

    @Override
    public void Interior() {

    }
}
