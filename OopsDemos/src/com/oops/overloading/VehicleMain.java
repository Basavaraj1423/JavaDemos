package com.oops.overloading;

public class VehicleMain {
    public static void main(String[] args) {
        System.out.println("********************************");
        Vehicle vehicle=new Vehicle();
        vehicle.getDetails();
        System.out.println("********************************");
        Vehicle vehicle1=new Vehicle("Mercedes");
        vehicle1.getDetails();
        System.out.println("********************************");
        Vehicle vehicle2=new Vehicle("BMW",800490);
        vehicle2.getDetails();
        System.out.println("********************************");
        Vehicle vehicle3=new Vehicle("Lamborgini",1000000,"GLE");
        vehicle3.getDetails();
        System.out.println("********************************");
    }
}
