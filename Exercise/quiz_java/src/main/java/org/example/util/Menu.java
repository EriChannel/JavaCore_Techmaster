package org.example.util;

public class Menu {
    public static void mainMenu(){
        System.out.println("-------------------------------------------");
        System.out.println("Xin chào! Bạn có thể thực hiện các công việc sau: ");
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("3 - Quên mật khẩu");
        System.out.println("0 - Thoát chương trình");
        System.out.println("-------------------------------------------");
    }

    public static void loginSuccessMenu() {
        System.out.println("-------------------------------------------");
        System.out.println("Bạn có thể thực hiện các công việc sau: ");
        System.out.println("1 - Làm trắc nghiệm");
        System.out.println("2 - Xem kết quả trắc nghiệm");
        System.out.println("0 - Đăng xuất");
        System.out.println("-------------------------------------------");
    }

    public static void chooseQuizTypeMenu() {
        System.out.println("-------------------------------------------");
        System.out.println("Chọn mức độ trắc nghiệm: ");
        System.out.println("1 - Dễ");
        System.out.println("2 - Trung bình");
        System.out.println("3 - Khó");
        System.out.println("0 - Về trang trước");
        System.out.println("-------------------------------------------");
    }


    public static void resultTestMenu() {
        System.out.println("-------------------------------------------");
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Xem tất cả kết quả làm trắc nghiệm");
        System.out.println("2 - Xem các kết quả có mức độ dễ");
        System.out.println("3 - Xem các kết quả có mức độ trung bình");
        System.out.println("4 - Xem các kết quả có mức độ khó");
        System.out.println("0 - Về trang trước");
        System.out.println("-------------------------------------------");
    }
}
