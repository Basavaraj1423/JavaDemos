package com.threads.basics;

public class Dashboard {
    public static void main(String[] args) {
        Booking booking = new Booking();
        Counter counter1 = new Counter("Sony",10,booking);
        Counter counter2 = new Counter("Tony",20,booking);
        Counter counter3 = new Counter("Bunny",12,booking);
    }
}
