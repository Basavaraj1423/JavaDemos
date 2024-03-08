package com.list.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
                new Vehicle("City", "Honda", 23_90_000),
                new Vehicle("Hexa", "Tata", 12_90_000),
                new Vehicle("Santro", "Hyundai", 43_90_000),
                new Vehicle("A100", "Audi", 45_90_000),
                new Vehicle("X100", "Maruthi", 11_90_000)
        );
        System.out.println("Before Sorting");
        for (Vehicle vehicle:vehicles) {
            System.out.println(vehicle);
        }
        System.out.println("After Sorting using Comprator by Brand");
        Collections.sort(vehicles,new BrandSort());
        for (Vehicle vehicle:vehicles) {
            System.out.println(vehicle);
        }
        System.out.println();
        System.out.println("After Sorting using Comprator by Model");
        Collections.sort(vehicles,new ModelSort());
        for (Vehicle vehicle:vehicles) {
            System.out.println(vehicle);
        }
        System.out.println();
        System.out.println("After Sorting using Comprator by Price");
        Collections.sort(vehicles,new PriceSort());
        for (Vehicle vehicle:vehicles) {
            System.out.println(vehicle);
        }

    }
}
