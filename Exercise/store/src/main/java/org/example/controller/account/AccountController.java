package org.example.controller.account;

import org.example.model.account.Account;
import org.example.model.account.AccountStatus;
import org.example.model.account.Gender;
import org.example.model.account.Role;
import org.example.repository.AccountRepository;
import org.example.service.account.AccountServiceImpl;

import java.util.Scanner;

public class AccountController {
    Scanner sc;
    AccountServiceImpl accountService;

    public AccountController() {
        sc = new Scanner(System.in);
        accountService = new AccountServiceImpl();
    }

    public Account checkLogin(){
        System.out.print("Nhập số điện thoại: ");
        String mobile = sc.nextLine();

        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();
        return accountService.checkLogin(mobile, password);
    }


    private Account createAccountCustomer(){
        Account account = new Account();
        account.setId(AccountRepository.getMaxId());
        System.out.print("Nhập số điện thoại: ");
        account.setMobile(sc.nextLine());
        System.out.print("Nhập họ tên: ");
        account.setFullName(sc.nextLine());
        System.out.print("Nhập mật khẩu: ");
        account.setPassword(sc.nextLine());
        account.setStatus(AccountStatus.ACTIVE);
        account.setGender(Gender.MALE);
        account.setRole(Role.CUSTOMER);

        return account;
    }

    public void register(){
        Account account = createAccountCustomer();
        if(accountService.addNewAccount(account)){
            System.out.println("Đăng ký thành công");
        }else{
            System.out.println("Đăng ký thất bại");
        }
    }

    public void forgetPassword() {
        System.out.print("Nhập số điện thoại của bạn: ");
        String mobile = sc.nextLine();
        Account account = accountService.getAccountByMobile(mobile);
        if(account == null){
            System.out.println("Số điện thoại chưa được đăng ký tài khoản");
        }else{
            System.out.print("Nhập mật khẩu mới: ");
            String newPassword = sc.nextLine();
            accountService.updatePassword(account, newPassword);
            System.out.println("Thay đổi mật khẩu thành công");
        }
    }
}
