package com.oops.assignments;

public class Book {
    String title;
    String author;
    float price;
    String category;

    Book(String title,String author,float price,String category){
        this.title=title;
        this.author=author;
        this.price=price;
        this.category=category;
    }
    void getDetails(){
        System.out.println("The Title of the book is :"+title);
        System.out.println("The Author of the book is :"+author);
        System.out.println("The Price of the book is :"+price);
        System.out.println("Book Category :"+category);
    }
    void checkBookType() {
        if (price > 500) {
            System.out.println("Book belongs to Premium Books");
        } else {
            System.out.println("Book belongs to Standard Books");
        }
        System.out.println("**********************************************");
    }
}
