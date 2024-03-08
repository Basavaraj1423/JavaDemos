package com.threads.basics;

class Runner1 implements Runnable{
    String name;
    Greetings greetings;
    public Runner1(String name, Greetings greetings){
        Thread thread = new Thread(this,name);
        this.name=name;
        this.greetings=greetings;
        thread.start();
    }
    @Override
    public void run() {
        synchronized (greetings){
            System.out.println(greetings.message(name));

        }
    }
}

public class RunThread {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        Runner1 runner1 = new Runner1("Raja", greetings);
        Runner1 runner2 = new Runner1("Tony", greetings);
        Runner1 runner3 = new Runner1("Sony", greetings);
        Runner1 runner4 = new Runner1("Kiran", greetings);


    }
}
