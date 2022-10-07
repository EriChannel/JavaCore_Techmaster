package service;

import model.Book;
import model.Status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BookServiceImpl implements BookService{

    public ArrayList<Book> getAllBooks(){
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book(1, "Twice Born", new String[]{"Amber Waddy"}, new String[]{"Drama","Romance","War"},
                "Fliptune", 2000, Status.STOCKING));
        list.add(new Book(2, "Supermen of Malegaon", new String[]{"Clemence Rowes"}, new String[]{"Documentary"},
                "Trilia", 2008, Status.STOCKING));
        list.add(new Book(3, "Life is a Miracle", new String[]{"Doll Ephgrave"}, new String[]{"Comedy","Drama","Romance","War"},
                "Fliptune", 1982, Status.SOLD_OUT));
        list.add(new Book(4, "Brazilian Western", new String[]{"Amber Waddy", "Pansie Patrie"}, new String[]{"Crime","Drama","Romance"},
                "Fliptune", 2003, Status.STOCKING));
        list.add(new Book(5, "Anger Management", new String[]{"Clio Shird"}, new String[]{"Comedy"},
                "Photobean", 2017, Status.SOLD_OUT));
        list.add(new Book(6, "Death and the Maiden", new String[]{"Geordie Nevin"}, new String[]{"Drama","Thriller"},
                "Photobean", 2020, Status.STOCKING));
        list.add(new Book(7, "Tactical Force", new String[]{"Amber Waddy"}, new String[]{"Action","Comedy","Crime","Thriller"},
                "Photobean", 2015, Status.STOCKING));
        list.add(new Book(8, "Albino Farm", new String[]{"Michale Halpeine"}, new String[]{"Horror"},
                "Fliptune", 2008, Status.STOCKING));
        return list;
    }
    @Override
    public void print(ArrayList<Book> list) {
        for(Book book: list){
            System.out.println(book.getId() + " - " + book.getTitle() + " - " + Arrays.toString(book.getAuthor()) + " - " +
                    Arrays.toString(book.getCategory()) + " - " + book.getPublisher() +" - " + book.getReleaseYear() +
                    " - " + book.getStatus().getValue());
        }
    }

    @Override
    public ArrayList<Book> getBookByTitle(ArrayList<Book> list, String title) {
        ArrayList<Book> books = new ArrayList<>();
        for(Book book : list){
            if(book.getTitle().toLowerCase().contains(title.toLowerCase())){
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public ArrayList<Book> getBookByCategory(ArrayList<Book> list, String category) {
        ArrayList<Book> books = new ArrayList<>();
        for(Book book : list){
            String[] categories = book.getCategory();
            for(String str : categories){
                if(str.equalsIgnoreCase(category)){
                    books.add(book);
                }
            }
        }
        return books;
    }

    @Override
    public ArrayList<Book> sortByTitle(ArrayList<Book> list) {
        ArrayList<Book> listClone = new ArrayList<>();
        listClone.addAll(list);
        Collections.sort(listClone, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        return listClone;
    }

    @Override
    public ArrayList<Book> sortByReleaseYear(ArrayList<Book> list) {
        ArrayList<Book> listClone = new ArrayList<>(list);
        listClone.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int sortByReleaseYear = o2.getReleaseYear() - o1.getReleaseYear();
                if(sortByReleaseYear == 0){
                    return o1.getTitle().compareTo(o2.getTitle());
                }
                return sortByReleaseYear;
            }
        });
        return listClone;
    }
}
