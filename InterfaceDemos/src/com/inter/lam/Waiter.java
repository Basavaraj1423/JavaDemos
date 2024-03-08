package com.inter.lam;

public class Waiter {
    void availableItems(IMenu imenu){
        System.out.println("welcome to My Hotel");
        imenu.showMenus();
        System.out.println("Order now");
    }
}
