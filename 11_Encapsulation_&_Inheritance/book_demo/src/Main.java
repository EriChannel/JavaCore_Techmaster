import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookService service = new BookService();
        service.print();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập tên quyển sách cần tìm: ");
//        String title = sc.nextLine();
//        service.findBookByName(title);


        Book fBook = service.findBookById(1);
        System.out.println("Quyển sách tìm được là: " + fBook.getTitle());

        service.updateTitle(fBook, "NHA GIA KIM");
        System.out.println("----------");
        service.print();

    }
}