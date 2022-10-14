package org.example.controller;

public class Menu {

    public static void mainMenu(){
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Xem toàn bộ sản phẩm");
        System.out.println("2 - Tìm sản phẩm theo tên");
        System.out.println("3 - Xem sản phẩm theo category");
        System.out.println("4 - Xem sản phẩm theo mức giá");
        System.out.println("5 - Liệt kê số lượng theo loại sản phẩm");
        System.out.println("6 - Sắp xếp sản phẩm theo giá tăng dần");
        System.out.println("7 - Sắp xếp sản phẩm theo giá giảm dần");
        System.out.println("8 - Tìm sản phẩm theo brand");
        System.out.println("0 - Thoát chương trình");
    }

    public static void categoryMenu(){
        System.out.println("Lựa chọn danh mục: ");
        System.out.println("1 - Điện thoại");
        System.out.println("2 - Laptop");
        System.out.println("3 - Máy tính bảng");
        System.out.println("4 - Apple");
        System.out.println("5 - Phụ kiện");
    }
    public static void priceMenu(){
        System.out.println("Lựa chọn mức giá: ");
        System.out.println("1 - Dưới 2 triệu");
        System.out.println("2 - Từ 2 - 5 triệu");
        System.out.println("3 - Từ 5 - 10 triệu");
        System.out.println("4 - Trên 10 triệu");
        System.out.println("5 - Quay về trang chủ");
    }

}
