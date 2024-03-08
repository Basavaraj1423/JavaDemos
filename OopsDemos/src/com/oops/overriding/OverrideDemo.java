package com.oops.overriding;

import java.util.Scanner;

public class OverrideDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice of sports");
        String choice = sc.next();
        Sports sports = null;
        if (choice.equals("Indoor"))
            sports = new Indoor();
        else if (choice.equals("Outdoor"))
            sports = new Outdoor();
        else
            sports = new Sports();
        String[] games = sports.showTypes();
        if (games != null)
            for (String game : games) {
                System.out.println(game);
            }
    }
}


