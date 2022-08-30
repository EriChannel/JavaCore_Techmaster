public class BookService {

    public Book[] getAllBooks(){
        Book book = new Book(1, "Nhà giả kim", "Paulo Coelho", "Phiêu lưu",
                "Editora Rocco Ltda., Rio de Janeiro", 1988);
//
//        System.out.println(book);

        Book[] arrayBook = new Book[6];
        arrayBook[0] = book;
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

        return arrayBook;
    }

    public void print(Book[] arr){
        for(Book book : arr){
            System.out.println(book);
        }
    }

    //Tìm sách theo tên
    public void findBookByName(Book[] arr, String name){
        for (Book book : arr){
            if(book.title.contains(name)){
                System.out.println(book);
            }
        }
    }

    public void findBookByCategory(Book[] arr, String fCategory){
        for (Book book : arr){
            if(book.category.contains(fCategory)){
                System.out.println(book);
            }
        }
    }

    public void findBookByYear(Book[] arr, int year){
        for(Book book : arr){
            if(book.releaseYear == year){
                System.out.println(book);
            }
        }
    }
}
