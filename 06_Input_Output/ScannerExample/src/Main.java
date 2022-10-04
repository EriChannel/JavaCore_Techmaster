import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();

        System.out.println("Nhập tuổi của bạn: ");
//        int age = sc.nextInt();
//        sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập địa chỉ của bạn: ");
        String address = sc.nextLine();

        System.out.println("Tên tôi là " + name + ", năm nay tôi " +
                age + " tuổi, tôi đến từ " + address);

//        double height = Double.parseDouble(sc.nextLine());
//        long salary = Long.parseLong(sc.nextLine());

//        System.out.println("Nhập tên của bạn: ");
//        String name = sc.nextLine();
//
//        System.out.println("Tên của tôi là: " + name);
//
//        System.out.println("Nhập tuổi của bạn: ");
//        int age = sc.nextInt();
//
//        System.out.println("Tuổi của tôi là: " + age);
//
//        System.out.println("Nhập lương của bạn: ");
//        long salary = sc.nextLong();
//
//        System.out.println("Lương của tôi là: " + salary);

//        System.out.println("Nhập chiều cao của bạn: ");
//        float height = sc.nextFloat();
//
//        System.out.println("Chiều cao của tôi là: " + height);
//
//        System.out.println("Nhập cân nặng của bạn: ");
//        double weight = sc.nextDouble();
//
//        System.out.println("Cân nặng của tôi là: " + weight);
    }
}