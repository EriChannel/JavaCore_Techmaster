import java.util.ArrayList;

public interface BookService {
    boolean add(Book book, ArrayList<Book> list);

    void updateQuantity(Book book, int quantity);

    boolean delete(Book book, ArrayList<Book> list);

    ArrayList<Book> sortByName(ArrayList<Book> list);

    ArrayList<Book> sortByReleaseYear(ArrayList<Book> list);


}
