package com.oops.overriding;

public class Restaurant {
    public static void main(String[] args) {


        Menu menu = new Japanese();
        menu.showType("Starter");

        menu = new Chinese();
        menu.showType("Lunch");


        Chinese chinese = (Chinese) menu;
        chinese.printGames();



    }
}
