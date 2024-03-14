package com.bookapp.client;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

import java.util.List;
import java.util.Scanner;

public class User {

    public static void main(String[] args) throws BookNotFoundException {
        Scanner scanner = new Scanner(System.in);
        IBookService bookService = new BookServiceImpl();
        System.out.println("Welcome to Library");
        System.out.println("Please select a Option");
        System.out.println("1. Available Books");
        System.out.println("2. select book by Authour Name");
        System.out.println("3. Get the Book by Category");
        System.out.println("4. Get the books with less price");
        System.out.println("5. get book By Author and Category");
        System.out.println("6. get book by Author");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                List<Book> bookList = bookService.getAll();
                for (Book books : bookList)
                    System.out.println(books);
                break;

            case 2:
                System.out.println("Please enter author name");
                String author = scanner.next();
                List<Book> bookServiceByAuthorStartsWith = bookService.getByAuthorStartsWith(author);
                for (Book books : bookServiceByAuthorStartsWith)
                    System.out.println(books);
                break;
            case 3:
                System.out.println("Please enter Category");
                String category = scanner.next();
                List<Book> bookServiceByCategory = bookService.getByCategory(category);
                for (Book books : bookServiceByCategory)
                    System.out.println(books);
                break;
            case 4:
                System.out.println("please select a price limit with less price");
                String category1 = scanner.next();
                List<Book> bookServiceByCategory1 = bookService.getByCategory(category1);
                for (Book books : bookServiceByCategory1)
                    System.out.println(books);
                break;
            case 5:
                System.out.println("Please enter Author and Category");
                String authorName = scanner.next();
                String category2 = scanner.next();
                List<Book> getBookByAuthorAndCategory = bookService.getByAuthorContainsAndCategory(authorName, category2);
                for (Book books : getBookByAuthorAndCategory)
                    System.out.println(books);
                break;

        }


    }
}
