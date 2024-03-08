package com.threads.basics;

class Child extends Thread {
    public Child(String name, int priority) {
        super(name);
        System.out.println(this);
        //start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            int k = 5 * i;
            System.out.println("5 *" + i + "=" + k + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class ExThread {
    public static void main(String[] args)  {
 //       Child child1 = new Child("Child - 1", 10);
  //      Child child2 = new Child("Child - 2", 6);
        Child child3 = new Child("Child - 3", 1);
        child3.setDaemon(true);
       child3.start();
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            int k = 5 * i;
            System.out.println("5 *" + i + "=" + k + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

//        try {
//            //child1.join();
//            //child2.join();
//            child3.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("Main completed");
    }
}
