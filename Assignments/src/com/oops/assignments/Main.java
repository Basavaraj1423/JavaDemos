package com.oops.assignments;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java","Naveen",2000,"CS");
        book.getDetails();
        book.checkBookType();
        Book book1 = new Book("C#","Ajay",300,"CS");
        book1.getDetails();
        book1.checkBookType();

    }
}
