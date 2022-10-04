import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact<String, String>[] contacts = new Contact[]{
                new Contact<>("Ngọc", "0123456789"),
                new Contact<>("Linh", "0123456788"),
                new Contact<>("Huy", "0123456785"),
                new Contact<>("Quang", "0123456787"),
                new Contact<>("Tuấn", "0123456786")
        };
        PhoneBook<String, String> phoneBook = new PhoneBook<>(contacts);

        Scanner sc = new Scanner(System.in);
        String input;
        do {
            //Lặp cho đến khi input nhập x
            System.out.println("Nhập tên liên hệ: ");
            input = sc.nextLine();

            String result = phoneBook.findName(input);
            if(result != null){
                System.out.println(result);
            }else {
                System.out.println("Không có liên hệ này");
            }

        }while (!input.equals("x"));
    }
}