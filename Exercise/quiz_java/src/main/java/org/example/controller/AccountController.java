package org.example.controller;

import org.example.exception.InputData;
import org.example.model.Account;
import org.example.repository.AccountRepository;
import org.example.service.AccountServiceImpl;
import org.example.util.Menu;

import java.util.Scanner;

public class AccountController {
    private Scanner sc;
    private AccountServiceImpl accountService;
    private QuizController quizController;
    private ResultController resultController;

    public AccountController() {
        sc = new Scanner(System.in);
        accountService = new AccountServiceImpl();
        quizController = new QuizController();
        resultController = new ResultController();
    }

    public void login(){
        System.out.print("Nhập tên đăng nhập: ");
        String username = sc.nextLine();
        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();

        AccountRepository.loginAccount = accountService.loginAccount(username, password);
        if(AccountRepository.loginAccount == null){
            System.out.println("Đăng nhập thất bại");
        }else{
            System.out.println("Xin chào " + AccountRepository.loginAccount.getUsername());
            loginSuccess();
        }
    }

    private void loginSuccess() {
        boolean isContinue = true;
        while (isContinue){
            Menu.loginSuccessMenu();
            int option = InputData.inputOption();
            switch (option){
                case 1:
                    //làm trắc nghiệm
                    quizController.quizAction();
                    break;
                case 2:
                    //Xem kết quả
                    resultController.getResultTest();
                    break;
                case 0:
                    isContinue= false;
                    logout();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void logout(){
        AccountRepository.loginAccount = null;
    }

    public void register() {
        Account account = createNewAccount();
        if(accountService.createAccount(account)){
            AccountRepository.updateListAccount();
            System.out.println("Đăng ký tài khoản mới thành công");
        }else{
            System.out.println("Thất bại");
        }
    }

    private Account createNewAccount() {
        Account account = new Account();

        System.out.print("Nhập tên đăng nhập: ");
        String username = InputData.inputUsername();
        account.setUsername(username);

        System.out.print("Nhập mật khẩu: ");
        String password = InputData.inputPassword();
        account.setPassword(password);

        return account;
    }


    public void forgetPassword() {
        System.out.println("Nhập tên đăng nhập của bạn: ");
        String username = sc.nextLine();
        Account account = getAccountByUsername(username);
        if(account == null){
            System.out.println("Tên đăng nhập chưa tồn tại");
        }else{
            System.out.print("Nhập mật khẩu mới: ");
            String password = InputData.inputPassword();
            accountService.updatePassword(account, password);
            System.out.println("Cập nhật thành công");
        }
    }

    private Account getAccountByUsername(String username){
        for(Account account: AccountRepository.allAccount){
            if(account.getUsername().equals(username)){
                return account;
            }
        }
        return null;
    }
}
