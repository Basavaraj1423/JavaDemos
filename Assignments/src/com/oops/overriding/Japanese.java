package com.oops.overriding;

public class Japanese extends Menu {

    public void showType(String type) {
        System.out.println("The available items are Japanese");
        if (type.equalsIgnoreCase("Starter")) {
            System.out.println("Items availables are in Starters are");
            System.out.println("Gobi Manchuri");
            System.out.println("Paneer Ghee Roast");

        } else if (type.equalsIgnoreCase("Lunch")) {
            System.out.println("Items availables are in Lunch are");
            System.out.println("Chicken Biriyani");
            System.out.println("Mashroom Biriyani");


        } else if (type.equalsIgnoreCase("Desserts")) {
            System.out.println("Items availables are in Desserts are");
            System.out.println("Ice Creams");
            System.out.println("Soft Drinks");

        }
    }
}
