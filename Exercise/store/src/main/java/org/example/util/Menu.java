package org.example.util;

public class Menu {
    public static void mainMenu(){
        System.out.println("---------------------------------");
        System.out.println("Bạn có thể thực hiện các công việc sau: ");
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("3 - Quên mật khẩu");
        System.out.println("4 - Xem thông tin sản phẩm");
        System.out.println("0 - Thoát chương trình");
        System.out.println("---------------------------------");
    }

//    public static void customerMenu() {
//        System.out.println("---------------------------------");
//        System.out.println("Bạn có thể thực hiện: ");
//        System.out.println("1 - Xem thông tin cá nhân");
//        System.out.println("2 - Xem danh sách sản phẩm");
//        System.out.println("3 - Xem giỏ hàng");
//        System.out.println("4 - Quản lý đơn hàng");
//        System.out.println("0 - Đăng xuất");
//        System.out.println("---------------------------------");
//    }
//
//    public static void getInformationMenu() {
//        System.out.println("---------------------------------");
//        System.out.println("Bạn có thể thực hiện: ");
//        System.out.println("1 - Cập nhật thông tin cá nhân");
//        System.out.println("2 - Đổi mật khẩu");
//        System.out.println("3 - Khóa tài khoản");
//        System.out.println("0 - Về trang trước");
//        System.out.println("---------------------------------");
//    }
//
//    public static void chooseGender() {
//        System.out.println("Chọn giới tính");
//        System.out.println("1 - Nam");
//        System.out.println("2 - Nữ");
//    }
//
//    public static void lockAccountByCustomer(){
//        System.out.println("---------------------------------");
//        System.out.println("Bạn có thực sự muốn khóa tài khoản: ");
//        System.out.println("1 - Có");
//        System.out.println("2 - Không");
//        System.out.println("---------------------------------");
//    }
//
    public static void productMenu() {
        System.out.println("---------------------------------");
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Xem danh sách tất sản phẩm");
        System.out.println("2 - Tìm sản phẩm theo tên");
        System.out.println("3 - Xem sản phẩm theo danh mục");
        System.out.println("4 - Xem sản phẩm theo hãng");
        System.out.println("0 - Về trang trước");
        System.out.println("---------------------------------");
    }

    public static void subMenuProduct() {
        System.out.println("---------------------------------");
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Xem thông tin chi tiết sản phẩm");
        System.out.println("2 - Lọc sản phẩm theo mức giá");
        System.out.println("3 - Sắp xếp theo giá tăng dần");
        System.out.println("4 - Sắp xếp theo giá giảm dần");
        System.out.println("0 - Về trang trước");
        System.out.println("---------------------------------");
    }

    public static void getProductByIdMenu() {
        System.out.println("---------------------------------");
        System.out.println("Nhập id sản phẩm để xem thông tin chi tiết sản phẩm hoặc chọn 0 để về trang trước");
        System.out.println("---------------------------------");
    }

    public static void addProductToCartMenu() {
        System.out.println("---------------------------------");
        System.out.println("Bạn có muốn thêm sản phẩm vào giỏ hàng");
        System.out.println("1 - Có");
        System.out.println("0 - Không");
        System.out.println("---------------------------------");
    }

    public static void priceMenu() {
        System.out.println("---------------------------------");
        System.out.println("Lựa chọn mức giá: ");
        System.out.println("1 - Dưới 2 triệu");
        System.out.println("2 - Từ 2 - 5 triệu");
        System.out.println("3 - Từ 5 - 10 triệu");
        System.out.println("4 - Trên 10 triệu");
        System.out.println("0 - Về trang trước");
        System.out.println("---------------------------------");
    }
}
