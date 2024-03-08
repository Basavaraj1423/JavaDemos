package com.threads.basics;

//Three classes are in same file
public class Greetings {
    public String message(String name) {
        String result = null;
        try {
            System.out.println("Hi" + name);
            Thread.sleep(1000);
            result = "Great Day" + name;
            return "Welcome" + name;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

}
