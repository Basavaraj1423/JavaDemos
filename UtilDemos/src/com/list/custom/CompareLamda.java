package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLamda {
    public static void main(String[] args) {


        List<Vehicle> vehicles = Arrays.asList(
                new Vehicle("City", "Honda", 23_90_000),
                new Vehicle("Hexa", "Tata", 12_90_000),
                new Vehicle("Santro", "Hyundai", 43_90_000),
                new Vehicle("A100", "Audi", 45_90_000),
                new Vehicle("X100", "Maruthi", 11_90_000)
        );
        System.out.println("Before");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);

        }
        Collections.sort(vehicles, (o1, o2) -> o1.getModel().compareTo(o2.getModel()));
        System.out.println("After Sort by Model");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        Collections.sort(vehicles, (o1, o2) -> o1.getBrand().compareTo(o2.getBrand()));
        System.out.println("After Sort by Brand");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        Collections.sort(vehicles, (o1, o2) -> ((Double)o1.getPrice()).compareTo(o2.getPrice()));
        System.out.println("After Sort by Price");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

    }
}