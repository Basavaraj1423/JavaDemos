package com.list.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("IDGAF", "Steve", 300),
                new Book("Indian Polity", "Laxmikanth", 100),
                new Book("Geography", "Arun", 200),
                new Book("Leong", "PunithRajKumar", 400));
        System.out.println("Before Sorting");
        for (Book books:bookList) {
            System.out.println(books);
        }


        System.out.println("After Sorting");
        Collections.sort(bookList);
        for (Book books:bookList) {
            System.out.println(books);
        }
    }
}
