import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookService service = new BookService();
        Book[] arrayBook = service.getAllBooks();
        System.out.println("Danh sách");
        service.print(arrayBook);

        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập tên sách cần tìm: ");
//        String fTittle = sc.nextLine();
//
//        service.findBookByName(arrayBook, fTittle);

//        System.out.println("Nhập tên thể loại: ");
//        String fCategory = sc.nextLine();
//        service.findBookByCategory(arrayBook, fCategory);

        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        System.out.println("Những quyển sách xuất bản trong năm nay: ");
        service.findBookByYear(arrayBook, year);


    }
}