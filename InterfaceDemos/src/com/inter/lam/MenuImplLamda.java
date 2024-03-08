package com.inter.lam;

public class MenuImplLamda{

    public static void main(String[] args) {
        IMenu iMenu = ()-> System.out.println("These is Chinese food : Noodles");
        IMenu iMenu2 = ()-> System.out.println("These is Japaneese food : Cockroach");
        IMenu iMenu3 = ()-> System.out.println("These is Indian food : Masala Dosa");

        iMenu.showMenus();
        iMenu2.showMenus();
        iMenu3.showMenus();
    }
}
