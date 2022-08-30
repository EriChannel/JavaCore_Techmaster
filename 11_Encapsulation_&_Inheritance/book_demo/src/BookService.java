public class BookService {
    static Book[] arrayBook = null;
    static {
        arrayBook = new Book[6];
        arrayBook[0] = new Book(1, "Nhà giả kim", "Paulo Coelho", "Phiêu lưu",
                "Editora Rocco Ltda., Rio de Janeiro", 1988);
        arrayBook[1] = new Book(2, "Đắc nhân tâm", "Dale Carnegie", "Sách tự lực",
                "Simon and Schuster", 1936);
        arrayBook[2] = new Book(3, "Bố già", "Mario Puzo", "Tội phạm",
                "G. P. Putnam's Sons", 1969);
        arrayBook[3] = new Book(4,"Harry Potter và Hòn đá Phù thủy", "J. K. Rowling", "Giả tưởng",
                "Bloomsbury", 1997);
        arrayBook[4] = new Book(5,"Harry Potter và Chiếc cốc lửa ", "J. K. Rowling", "Giả tưởng",
                "Bloomsbury", 2000);
        arrayBook[5] = new Book(6, "Que Que thích khám phá", "Catherine Chambers", "Thiếu nhi",
                "NXB Trẻ", 2022);
    }

    public void print(){
        for(Book b : arrayBook){
            System.out.println(b);
        }
    }

    public void findBookByName(String title){
        for(Book b : arrayBook){
            if(b.getTitle().contains(title)){
                System.out.println(b);
            }
        }
    }

    public Book findBookById(int id){
        for(Book b : arrayBook){
            if(b.getId() == id){
                return b;
            }
        }

        return null;
    }

    public void updateTitle(Book book, String newTitle){
        book.setTitle(newTitle);
    }




}
