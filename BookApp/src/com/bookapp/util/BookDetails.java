package com.bookapp.util;


import com.bookapp.model.Book;

import java.util.Arrays;
import java.util.List;

//(String title, String author, String category, Integer bookId, double price)
public class BookDetails {
    public static List<Book> showDetails(){
        return Arrays.asList(
                new Book("Social","Naveen","GS",101,4000),
                new Book("Java","Surya","Tech",101,5000),
                new Book("IDGAF","Suman","Fiction",101,6000),
                new Book("EVS","Arul","GS",101,7000),
                new Book("The power of subconcious mind","Amith","Fiction",101,2000)

        );
    }
}
