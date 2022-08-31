import java.util.ArrayList;

public class BookService {
    static ArrayList<Book> books;

    static {
        books = new ArrayList<>();
        books.add(new Book(1, "Nhà giả kim", "Paulo Coelho", "Phiêu lưu",
                "Editora Rocco Ltda., Rio de Janeiro", 1988));
        books.add(new Book(2, "Đắc nhân tâm", "Dale Carnegie", "Sách tự lực",
                "Simon and Schuster", 1936));
        books.add(new Book(3, "Bố già", "Mario Puzo", "Tội phạm",
                "G. P. Putnam's Sons", 1969));
        books.add(new Book(4,"Harry Potter và Hòn đá Phù thủy", "J. K. Rowling", "Giả tưởng",
                "Bloomsbury", 1997));
        books.add(new Book(5,"Harry Potter và Chiếc cốc lửa ", "J. K. Rowling", "Giả tưởng",
                "Bloomsbury", 2000));
        books.add(new Book(6, "Que Que thích khám phá", "Catherine Chambers", "Thiếu nhi",
                "NXB Trẻ", 2022));
    }

    public void print(){
        for (Book b : books){
            System.out.println(b);
        }
    }
}
