package com.inter.lam;

public class AnonyDemo {
    public static void main(String[] args) {
        IGreeter iGreeter = new GreeterImpl();
        iGreeter.greetMessage("Passing to GreetImpl");

        //Annonyms class is when you see the Interface with curly braces after new keyword.
        IGreeter iGreeter1 = new IGreeter() {
            @Override
            public void greetMessage(String message) {
                System.out.println(message);
            }
        };
        iGreeter1.greetMessage("Passing to Annonyms class");

    }
}
