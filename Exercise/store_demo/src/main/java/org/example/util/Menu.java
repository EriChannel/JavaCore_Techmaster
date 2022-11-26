package org.example.util;

import org.example.model.account.Account;
import org.example.model.account.AccountStatus;

public class Menu {

    public static void mainMenu() {
        System.out.println("---------------------------------");
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("3 - Quên mật khẩu");
        System.out.println("4 - Xem thông tin sản phẩm");
        System.out.println("0 - Thoát chương trình");
        System.out.println("---------------------------------");
    }

    public static void adminMenu() {
        System.out.println("---------------------------------");
        System.out.println("Bạn có thể thực hiện các công việc sau: ");
        System.out.println("1 - Xem thông tin cá nhân");
        System.out.println("2 - Xem danh sách khách hàng");
        System.out.println("3 - Xem danh sách sản phẩm");
        System.out.println("4 - Đăng xuất");
        System.out.println("0 - Thoát chương trình");
        System.out.println("---------------------------------");
    }

    public static void updateInfor() {
        System.out.println("---------------------------------");
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Cập nhật thông tin cá nhân");
        System.out.println("2 - Đổi mật khẩu");
        System.out.println("3 - Về trang trước");
        System.out.println("0 - Thoát chương trình");
        System.out.println("---------------------------------");
    }

    public static void chooseGender() {
        System.out.println("Chọn giới tính");
        System.out.println("1 - Nam");
        System.out.println("2 - Nữ");
    }


    public static void getAccountByIdMenu() {
        System.out.println("---------------------------------");
        System.out.println("Nhập id khách hàng để xem thông tin chi tiết hoặc chọn 0 để về trang trước: ");
        System.out.println("---------------------------------");

    }

    public static void lockOrUnlockAccountMenu(Account account) {
        System.out.println("---------------------------------");
        if (account.getStatus() == AccountStatus.ACTIVE) {
            System.out.println("Bạn có muốn khóa tài khoản này: ");
        } else {
            System.out.println("Tài khoản đang bị khóa, bạn có muốn mở tài khoản này: ");
        }
        System.out.println("1 - Có");
        System.out.println("0 - Không");
        System.out.println("---------------------------------");
    }

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

    public static void chooseCategory() {
        System.out.println("---------------------------------");
        System.out.println("Chọn loại sản phẩm bạn muốn tìm");
        System.out.println("1 - Điện thoại");
        System.out.println("2 - Laptop");
        System.out.println("3 - Máy tính bảng");
        System.out.println("4 - Apple");
        System.out.println("5 - Phụ kiện");
        System.out.println("0 - Về trang trước");
        System.out.println("---------------------------------");
    }
    public static void createArrayCategory() {
        System.out.println("---------------------------------");
        System.out.println("Chọn loại sản phẩm bạn muốn tìm");
        System.out.println("1 - Điện thoại");
        System.out.println("2 - Laptop");
        System.out.println("3 - Máy tính bảng");
        System.out.println("4 - Apple");
        System.out.println("5 - Phụ kiện");
        System.out.println("0 - Dừng chọn");
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

    public static void productActionByAdmin(){
        System.out.println("---------------------------------");
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Tìm sản phẩm theo ID");
        System.out.println("2 - Tìm sản phẩm theo tên");
        System.out.println("3 - Xem sản phẩm theo danh mục");
        System.out.println("4 - Xem sản phẩm theo hãng");
        System.out.println("5 - Thêm sản phẩm mới");
        System.out.println("0 - Về trang trước");
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

    public static void getProductByIdMenu() {
        System.out.println("---------------------------------");
        System.out.println("Nhập id sản phẩm để xem thông tin chi tiết sản phẩm hoặc chọn 0 để về trang trước");
        System.out.println("---------------------------------");
    }

    public static void deleteOrUpdateProduct(){
        System.out.println("---------------------------------");
        System.out.println("1 - Xóa sản phẩm");
        System.out.println("2 - Cập nhật thông tin sản phẩm");
        System.out.println("0 - Về trang trước");
        System.out.println("---------------------------------");
    }

    public static void chooseProductStatusMenu(){
        System.out.println("---------------------------------");
        System.out.println("1 - Còn hàng");
        System.out.println("2 - Tạm hết hàng");
        System.out.println("3 - Đặt trước");
        System.out.println("4 - Ngừng kinh doanh");
        System.out.println("---------------------------------");
    }

    public static void customerMenu() {
        System.out.println("---------------------------------");
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Xem thông tin cá nhân");
        System.out.println("2 - Xem danh sách sản phẩm");
        System.out.println("3 - Xem giỏ hàng");
        System.out.println("4 - Quản lý đơn hàng");
        System.out.println("0 - Đăng xuất");
        System.out.println("---------------------------------");
    }
}
