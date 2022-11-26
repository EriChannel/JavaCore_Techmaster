package org.example.controller;

import org.example.controller.account.AccountController;
import org.example.controller.product.ProductController;
import org.example.model.account.Account;
import org.example.util.InputData;
import org.example.util.Menu;

public class MainController {
    AccountController accountController;
    ProductController productController;

    public MainController() {
        accountController = new AccountController();
        productController = new ProductController();
    }

    public void main(){
        while(true){
            Menu.mainMenu();
            int option = InputData.inputOption();
            switch (option){
                case 1: 
                    //Đăng nhập
                    login();
                    break;
                case 2:
                    //Đăng ký
                    accountController.register();
                    break;
                case 3:
                    //Quên mật khẩu
                    accountController.forgetPassword();
                    break;
                case 4:
                    //Xem sản phẩm
                    productController.productAction(null);
                    break;
                case 0:
                    //Thoát chương trình
                    System.out.println("---TẠM BIỆT---");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này, vui lòng chọn lại");
            }
        }
    }

    public void login(){
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
            case CUSTOMER:
                System.out.println("Xin chào khách hàng");
                break;
            case ADMIN:
                System.out.println("Xin chào admin");
                break;

        }
    }




}
