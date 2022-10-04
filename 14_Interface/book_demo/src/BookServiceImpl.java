import java.util.ArrayList;

public class BookServiceImpl implements BookService{
    @Override
    public boolean add(Book book, ArrayList<Book> list) {
        return false;
    }

    @Override
    public void updateQuantity(Book book, int quantity) {

    }

    @Override
    public boolean delete(Book book, ArrayList<Book> list) {
        return false;
    }

    @Override
    public ArrayList<Book> sortByName(ArrayList<Book> list) {
        return null;
    }

    @Override
    public ArrayList<Book> sortByReleaseYear(ArrayList<Book> list) {
        return null;
    }
}
