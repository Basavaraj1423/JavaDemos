package com.inter.lam;

public class LamdaDemo {
    public static void main(String[] args) {
        IGreeter iGreeter = (String message) -> {
            System.out.println(message);
        };
        iGreeter.greetMessage("Great Day");

        iGreeter = message -> System.out.println(message+"!!!!");
        iGreeter.greetMessage("Wow");
    }
}
