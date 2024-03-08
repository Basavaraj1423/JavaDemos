package com.oops.overriding;

public class Chinese extends Menu {
    public void showType(String type){
        System.out.println("The available items are Chinese");
        if(type.equalsIgnoreCase("Starter")){
            System.out.println("Items availables are in Starters are");
            System.out.println("Gobi Manchuri");
            System.out.println("Paneer Ghee Roast");
            System.out.println("Chicken Chilly");
            System.out.println("Masala Papd");
        }else if (type.equalsIgnoreCase("Lunch")){
            System.out.println("Items availables are in Lunch are");
            System.out.println("Chicken Biriyani");
            System.out.println("Mashroom Biriyani");
            System.out.println("Veg Meals");
            System.out.println("Non-Veg Meals");

        }else if(type.equalsIgnoreCase("Desserts")){
            System.out.println("Items availables are in Desserts are");
            System.out.println("Ice Creams");
            System.out.println("Soft Drinks");
            System.out.println("Sweets");
            System.out.println("Mojito");
        }
    }
    public void printGames(){
        System.out.println("Chinese games are etcte tec");
    }

}
