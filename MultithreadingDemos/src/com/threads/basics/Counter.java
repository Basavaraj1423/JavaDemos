package com.threads.basics;

import java.awt.print.Book;

public class Counter implements Runnable {
    String name;
    int noOfTickets;
    Booking booking;

    public Counter(String name, int noOfTickets, Booking booking) {
        Thread thread = new Thread(this, name);
        this.name = name;
        this.noOfTickets = noOfTickets;
        this.booking = booking;
        thread.start();
    }

    @Override
    public void run() {
        synchronized (booking) {
            System.out.println("Welcome to PVR " + name);
            System.out.println("Amount to be paid : " + booking.bookTickets(name, noOfTickets));
        }
    }
}
