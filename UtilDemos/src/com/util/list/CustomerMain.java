package com.util.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        List<Customer> customerByCity = new ArrayList<>();


        customerList.add(new Customer("IronMan",101,"Bangalore"));
        customerList.add(new Customer("Thor",102,"Bangalore"));
        customerList.add(new Customer("CaptainAmerica",103,"Bangalore"));
        customerList.add(new Customer("The Hulk",104,"Mysore"));
        customerList.add(new Customer("SpiderMan",105,"Mysore"));
        for (Customer customers:customerList) {
            if(customers.getCity().equals("Mysore")){
                customerByCity.add(customers);
            }
        }
        Iterator<Customer> iterator = customerByCity.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            System.out.println(" "+customer);
        }
       // System.out.println(Collections.sort(customerByCity));
    }
}
