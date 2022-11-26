package org.example.controller;

import org.example.model.account.Account;


import org.example.model.account.Customer;
import org.example.model.product.Product;
import org.example.util.InputData;
import org.example.util.Menu;

import java.util.Map;


public class Controller {

    AccountController accountController;
    ProductController productController;

    public Controller() {

        accountController = new AccountController();
        productController = new ProductController();
    }



    public void main() {
        while (true) {
            Menu.mainMenu();
            int option = InputData.inputOption();
            switch (option) {
                case 1:
                    //Đăng nhập
                    login();
                    break;
                case 2:
                    //Đăng ký
                    accountController.addNewAccount();
                    break;
                case 3:
                    //Quên mật khẩu
                    accountController.forgetPassword();
                    break;
                case 4:
                    //Xem sản phẩm
                    //productController.productAction(null);
                    productController.productAction(null);
                    break;
                case 0:
                    //Thoát chương trình
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }




    private void login() {
        Account account = accountController.checkLogin();
        if(account == null){
            System.out.println("Đăng nhập thất bại");
        }else{
            System.out.println("Xin chào " + account.getFullName());
            loginSuccess(account);
        }
    }

    private void loginSuccess(Account account) {
        switch (account.getRole()){
            case ADMIN:
                adminAction(account);
                break;
            case CUSTOMER:
                customerAction(account);
                break;
        }
    }

    private void customerAction(Account account) {
        boolean isContinue = true;
        while (isContinue){
            Menu.customerMenu();
        }
    }

    private void adminAction(Account account) {
        boolean isContinue = true;
        while (isContinue){
            Menu.adminMenu();
            System.out.print("Lựa chọn của bạn là: ");
            int option = InputData.inputOption();
            switch (option){
                case 1:
                    //Xem thông tin cá nhân
                    accountController.getInformation(account);
                    break;
                case 2:
                    //Xem danh sách khách hàng
                    accountController.getListCustomer();
                    break;
                case 3:
                    //Xem danh sách sản phẩm
                    productController.getListProductByAdmin(account);
                    break;
                case 4:
                    //Đăng xuất
                    isContinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");

            }
        }
    }




}
