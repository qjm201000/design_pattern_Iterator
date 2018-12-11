package com.pattern;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1,"空调说明书");
        Book book2 = new Book(2,"电脑说明书");

        BookList bookList = new BookList();
        bookList.addBook(book1);
        bookList.addBook(book2);
        Iterator<Book> iterator = bookList.iterator();
        while (iterator.hasNext()){
            iterator.next().display();
        }
    }
}
