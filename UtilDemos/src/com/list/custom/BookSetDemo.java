package com.list.custom;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class BookSetDemo {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("IDGAF", "Steve", 300),
                new Book("Indian Polity", "Laxmikanth", 100),
                new Book("Geography", "Arun", 200),
                new Book("Leong", "PunithRajKumar", 800),
                new Book("Leong", "PunithRajKumar", 800));
        System.out.println("Set Books");
        Set<Book> bookSet = new LinkedHashSet<>(bookList);
        for (Book book : bookSet) {
            System.out.println(book);
        }

    }
}
