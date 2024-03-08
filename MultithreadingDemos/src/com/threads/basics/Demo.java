package com.threads.basics;

public class Demo {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Task-1");
        };
        Thread thread1 = new Thread(runnable,"Pop");
        Thread thread2 = new Thread(()->{
            System.out.println("Task-2");
        },"top");
        thread1.start();
        thread2.start();
    }
}
