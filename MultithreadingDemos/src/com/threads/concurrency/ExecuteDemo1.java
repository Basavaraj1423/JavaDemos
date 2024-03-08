package com.threads.concurrency;

import com.threads.basics.Booking;
import com.threads.basics.Greetings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(() -> {
            System.out.println("Doing Polling ");
            Greetings greetings = new Greetings();
            greetings.message("Hello");
        });
        executorService.execute(() -> {
            System.out.println("Reading from URl");
            Booking booking = new Booking();
            System.out.println(booking.bookTickets("Basva",20));

        });
        executorService.execute(() -> {
            System.out.println("Getting resources from databases ");

        });

        executorService.shutdown();
    }
}
