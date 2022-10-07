package controller;

import model.Book;
import service.BookServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner sc;
    BookServiceImpl bookService;
    ArrayList<Book> list;

    public Controller() {
        sc = new Scanner(System.in);
        bookService = new BookServiceImpl();
        list = bookService.getAllBooks();
    }

    public void main(){
        while (true){
            Menu.mainMenu();
            System.out.println("Lựa chọn của bạn là: ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    System.out.println("Danh sách tất cả quyển sách");
                    bookService.print(list);
                    break;
                case 2:
                    getBookByTitle();
                    break;
                case 3:
                    getBookByCategory();
                    break;
                case 4:
                    sortByTitle();
                    break;
                case 5:
                    sortByReleaseYear();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void getBookByTitle(){
        System.out.println("Nhập quyển sách mà bạn cần tìm: ");
        String title = sc.nextLine();
        ArrayList<Book> books = bookService.getBookByTitle(list, title);
        if(books.size() == 0){
            System.out.println("Không tìm thấy quyển sách có tên là " + title);
        }else {
            bookService.print(books);
        }
    }

    public void getBookByCategory(){
        System.out.println("Nhập thể loại sách cần tìm: ");
        String category = sc.nextLine();
        ArrayList<Book> books = bookService.getBookByCategory(list, category);
        if(books.size() == 0){
            System.out.println("Không tìm thấy quyển sách có thể loại " + category);
        }else {
            bookService.print(books);
        }
    }

    public void sortByTitle(){
        ArrayList<Book> books = bookService.sortByTitle(list);
        System.out.println("Sách được sắp xếp theo tiêu đề: ");
        bookService.print(books);
    }

    public void sortByReleaseYear(){
        ArrayList<Book> books = bookService.sortByReleaseYear(list);
        System.out.println("Danh sách được sắp xếp theo năm xuất bản: ");
        bookService.print(books);
    }
}
