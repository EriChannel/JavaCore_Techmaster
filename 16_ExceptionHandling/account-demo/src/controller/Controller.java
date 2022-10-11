package controller;

import exception.InvalidEmailException;
import exception.InvalidPasswordException;
import model.Account;
import service.AccountServiceImpl;
import utils.Validator;

import java.time.LocalDate;
import java.util.Scanner;

public class Controller {
    Scanner sc;
    AccountServiceImpl accountService;

    public Controller() {
        sc = new Scanner(System.in);
        accountService = new AccountServiceImpl();
    }

    public void main() {
        boolean isLogin = false;
        while (!isLogin) {
            Menu.mainMenu();
            System.out.println("Lựa chọn của bạn là: ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    //login
                    login();
                    isLogin = true;
                    break;
                case 2:
                    //register
                    register();
                    break;
                case 3:
                    //forget password
                    forgetPassword();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    private void login(){
        System.out.println("Nhập email: ");
        String email = sc.nextLine();

        System.out.println("Nhập password: ");
        String password = sc.nextLine();

        Account loginAccount = accountService.checkLogin(email, password);
        if(loginAccount != null){
            System.out.println("Xin chào " + loginAccount.getUsername());
        }else {
            System.out.println("Đăng nhập thất bại");
            main();
        }
    }

    private void register(){
        System.out.println("nhập username");
        String username = inputUsername();

        System.out.println("Nhập email: ");
        String email = inputEmail();

        System.out.println("Nhập password: ");
        String password = inputPassword();

        Account newAccount = new Account(username, email, password, LocalDate.now());
        if(accountService.addNewAccount(newAccount)){
            System.out.println("Đăng ký thành công, quay về trang chủ");
        }else{
            System.out.println("Đăng ký thất bại");
        }
    }

    private String inputUsername(){
        boolean isValis = false;
        String username = new String();
        while (!isValis){
            username = sc.nextLine();
            if(username.length() >= 5 && username.length() <= 20){
                isValis = true;
            }else{
                System.out.println("Username cần dài từ 5 đến 20 ký tự");
                System.out.println("vui lòng nhập lại: ");
            }
        }
        return username;
    }

    private String inputEmail(){
        String email = new String();
        boolean isValid = false;
        while (!isValid){
            email = sc.nextLine();
            if(!accountService.checkEmailContains(email)){
                try {
                    if(!Validator.validateEmail(email))
                        throw new InvalidEmailException("Email không hợp lệ.");
                    else
                        isValid = true;
                }catch (InvalidEmailException e){
                    System.out.println(e.getMessage() + " Vui lòng nhập lại");
                }
            }else{
                System.out.println("Email đã được đăng ký tài khoản, vui lòng sử dụng email khác");
            }
        }
        return email;
    }

    private String inputPassword(){
        String password = new String();
        boolean isValid = false;
        while (!isValid){
            password = sc.nextLine();
            if(password.length() >= 8 && password.length() <= 20){
                try {
                    if(!Validator.validatePassword(password))
                        throw new InvalidPasswordException("Password yếu.");
                    else
                        isValid = true;
                }catch (InvalidPasswordException e){
                    System.out.println(e.getMessage() + " Vui lòng nhập lại");
                }
            }else{
                System.out.println("Password cần dài từ 8 đến 20 ký tự");
                System.out.println("Vui lòng nhập lại");
            }
        }
        return password;
    }

    private void forgetPassword(){
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        if(accountService.checkEmailContains(email)){
            System.out.println("Nhập mật khẩu mới: ");
            String password = inputPassword();
            accountService.updatePassword(email, password);
        }else{
            System.out.println("Email chưa được đăng ký");
        }
    }
}
