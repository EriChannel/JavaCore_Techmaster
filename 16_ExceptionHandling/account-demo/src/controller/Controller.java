package controller;

import exception.InvalidEmailException;
import exception.InvalidPasswordException;
import model.Account;
import service.AccountServiceImpl;
import utils.Validator;

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
                    //Đăng nhập
                    login();
                    isLogin = true;
                    break;
                case 2:
                    //Đăng ký
                    register();
                    break;
                case 3:
                    //Quên mật khẩu
                    forgotPassword();
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

        Account loginAccount = accountService.login(email, password);
        if(loginAccount != null){
            System.out.println("Đăng nhập thành công, xin chào " + loginAccount.getUserName());
        }else{
            System.out.println("Đăng nhập thất bại");
            main();
        }
    }

    private void register(){
        System.out.println("Nhập username: ");
        String username = inputUsername();
        System.out.println("Nhập email: ");
        String email = inputEmail();
        System.out.println("Nhập password: ");
        String password = inputPassword();

        Account newAccount = accountService.createAccount(username, email, password);
        if(accountService.addNewAccount(newAccount)){
            System.out.println("Đăng ký thành công, quay về trang chủ");
        }else{
            System.out.println("Đăng ký thất bại");
        }
    }

    private void forgotPassword(){
        System.out.println("Nhập email của bạn: ");
        String email = sc.nextLine();
        if(accountService.checkEmailContains(email)){
            System.out.println("Nhập mật khẩu mới: ");
            String password = inputPassword();
            accountService.updatePassword(email, password);
        }else{
            System.out.println("Email chưa được đăng ký");
        }
    }

    private String inputEmail(){
        String email = new String();
        boolean flag = false;
        while (!flag){
            try{
                email = sc.nextLine();
                if(!accountService.checkEmailContains(email)){
                    if(!Validator.validateEmail(email))
                        throw new InvalidEmailException("Email không hợp lệ.");
                    else{
                        flag = true;
                    }
                }else{
                    System.out.println("Email đã tồn tại, hãy sử dụng một email khác");
                }
            }catch (InvalidEmailException e){
                System.out.println(e.getMessage() + " Vui lòng nhập lại");
            }

        }
        return email;
    }
    private String inputPassword(){
        String password = new String();
        boolean flag = false;
        while (!flag){
            password = sc.nextLine();
            if(password.length() >= 8 && password.length() <= 20){
                if(!Validator.validatePassword(password))
                    try {
                        throw new InvalidPasswordException("Password yếu.");
                    } catch (InvalidPasswordException e) {
                        System.out.println(e.getMessage() + " Vui lòng nhập lại");
                    }
                else{
                    flag = true;
                }
            }else{
                System.out.println("Mật khẩu cần dài từ 8 đến 20 ký tự");
            }

        }
        return password;
    }

    private String inputUsername(){
        boolean flag = false;
        String username = new String();
        while(!flag){
            username = sc.nextLine();
            if(username.length() >= 5 && username.length() <= 20){
                flag = true;
            }else{
                System.out.println("Username cần dài từ 5 đến 20 ký tự");
                System.out.println("Vui lòng nhập lại: ");
            }
        }
        return username;
    }
}
