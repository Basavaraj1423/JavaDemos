package com.oops.basics;

/*
Annonyms class :
Annonyms class is when you see the Interface with curly braces after new keyword.
Example:
  IGreeter iGreeter1 = new IGreeter() {
            @Override
            public void greetMessage(String message) {
                System.out.println(message);
            }
        };
        iGreeter1.greetMessage("Passing to Annonyms class");

**************************************************************************************

Lamda Expressions:
Similar to annonyms class. Provide the implementation(easy).
Example 1:
way 1:
        IGreeter iGreeter = (String message) -> {
            System.out.println(message);
        };
        iGreeter.greetMessage("Great Day");
way 2:
        iGreeter = message -> System.out.println(message+"!!!!");
        iGreeter.greetMessage("Wow");

Example 2:
way 3:
        IMyCalculator iMyCalculator = (int x,int y)-> (x+y);
        System.out.println("The area is:" +iMyCalculator.calculate(10,20));






 */


import java.util.HashSet;

public class OwnNotes {

    public static void main(String[] args) {

        HashSet <String> hashSet = new HashSet();
        hashSet.add("dd");
        hashSet.add(" ");

        System.out.println(hashSet);

    }
}










