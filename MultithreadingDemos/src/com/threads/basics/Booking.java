package com.threads.basics;

public class Booking {
    public double bookTickets(String name, int noOfTickets){
        double costPerTicket = 200;
        System.out.println("Booked for "+name);
        double totalprice = costPerTicket*noOfTickets;
        System.out.println("Total "+totalprice);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //System.out.println("Total"+totalprice);
        return totalprice;
    }
}
