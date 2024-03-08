package com.inter.basics;

public class ManagerDetails implements IEnterainment {
    @Override
    public void showGames(String type) {
        if ((type.equals("indoor")))
            System.out.println("Chess and Tt available");
        else
            System.out.println("Football");
    }

    @Override
    public void showActivity() {
        System.out.println("Monthly trip with developers");
    }
}
