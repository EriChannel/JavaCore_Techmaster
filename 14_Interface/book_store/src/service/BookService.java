package service;

import model.Book;

import java.util.ArrayList;

public interface BookService {

    void print(ArrayList<Book> list);

    ArrayList<Book> getBookByTitle(ArrayList<Book> list, String title);

    ArrayList<Book> getBookByCategory(ArrayList<Book> list, String category);

    ArrayList<Book> sortByTitle(ArrayList<Book> list);

    ArrayList<Book> sortByReleaseYear(ArrayList<Book> list);
}
