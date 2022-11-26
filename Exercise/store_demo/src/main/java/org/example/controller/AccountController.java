package org.example.controller;

import org.example.model.account.*;
import org.example.repository.AccountRepository;
import org.example.service.AccountServiceImpl;
import org.example.util.InputData;
import org.example.util.Menu;

import java.time.LocalDate;
import java.util.Scanner;

public class AccountController {
    Scanner sc;
    AccountServiceImpl accountService;

    public AccountController() {
        sc = new Scanner(System.in);
        accountService = new AccountServiceImpl();
    }


    public Account checkLogin() {

        System.out.print("Nhập số điện thoại: ");
        String mobile = sc.nextLine();
        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();

        return accountService.checkLogin(mobile, password);
    }

    public void getListCustomer() {
        boolean isContinue = true;
        while (isContinue){
            System.out.println("-----DANH SÁCH KHÁCH HÀNG-----");
            AccountRepository.accountList.stream().filter(i -> i.getRole() == Role.CUSTOMER)
                    .forEach(i -> System.out.println(i.getId() + " - " + i.getFullName() +
                            " - " + i.getMobile() + " - " + i.getStatus()));
            Menu.getAccountByIdMenu();
            int option = InputData.inputOption();
            if (option == 0) {
                isContinue = false;
            } else {
                getAccountById(option);
            }
        }

    }

    private void getAccountById(int id) {
        Account account = accountService.getAccountById(id);
        if(account == null){
            System.out.println("Không tìm thấy tài khoản có id " + id);
        }else{
            boolean isContinue = true;
            while (isContinue){
                printAccount(account);
                Menu.lockOrUnlockAccountMenu(account);
                int option = InputData.inputOption();
                switch (option){
                    case 1:
                        changeStatus(account);
                        break;
                    case 0:
                        isContinue = false;
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");

                }
            }

        }
    }

    public void getInformation(Account account) {
        boolean flag = true;
        while (flag) {
            System.out.println("------Thông tin cá nhân------");
            printAccount(account);
            Menu.updateInfor();
            int option = InputData.inputOption();
            switch (option) {
                case 1:
                    //Cập nhật thông tin cá nhân
                    updateInfo(account);
                    break;
                case 2:
                    //Đổi mật khẩu
                    updatePassword(account);
                    break;
                case 3:
                    flag = false;
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void printAccount(Account account) {
        System.out.println("ID: " + account.getId());
        System.out.println("Họ tên: " + account.getFullName());
        System.out.println("Số điện thoại: " + account.getMobile());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Giới tính : " + account.getGender().getValue());
        System.out.println("Ngày sinh: " + account.getDob());
        System.out.println("Địa chỉ: " + account.getAddress());
        System.out.println("Trạng thái: " + account.getStatus());
    }

    public void updatePassword(Account account) {
        System.out.print("Nhập password mới: ");
        String password = sc.nextLine();
        accountService.updatePassword(account, password);
        System.out.println("Cập nhật mật khẩu thành công");
    }

    public void updateInfo(Account account) {
        System.out.println("Nếu thông tin không cần cập nhật chọn 0 để bỏ qua");
        System.out.print("Nhập họ tên mới: ");
        String name = sc.nextLine();
        if (!name.equals("0")) {
            account.setFullName(name);
        }
        System.out.print("Nhập số điện thoại mới: ");
        String mobile = sc.nextLine();
        if (!mobile.equals("0")) {
            account.setMobile(mobile);
        }
        System.out.print("Nhập email mới: ");
        String email = sc.nextLine();
        if (!email.equals("0")) {
            account.setEmail(email);
        }
        Menu.chooseGender();
        int genderOption = InputData.inputOption();
        if (genderOption == 1) {
            account.setGender(Gender.MALE);
        } else if (genderOption == 2) {
            account.setGender(Gender.FEMALE);
        }
        System.out.print("Nhập ngày sinh: ");
        int day = InputData.inputOption();
        if (day != 0) {
            System.out.print("Nhập tháng: ");
            int month = InputData.inputOption();
            System.out.print("Nhập năm sinh: ");
            int year = InputData.inputOption();
            account.setDob(LocalDate.of(year, month, day));
        }

        account.setAddress(inputAddress(account.getAddress()));

    }

    private Address inputAddress(Address address) {
        if (address == null) {
            address = new Address();
        }
        System.out.print("Nhập tên người nhận: ");
        String name = sc.nextLine();
        if (!name.equals("0")) {
            address.setFullName(name);
        }

        System.out.print("Nhập số điện thoại người nhận: ");
        String mobile = sc.nextLine();
        if (!mobile.equals("0")) {
            address.setMobile(mobile);
        }

        System.out.print("Nhập địa chỉ chi tiết (Số nhà, đường): ");
        String specificAddress = sc.nextLine();
        if (!specificAddress.equals("0")) {
            address.setSpecificAddress(specificAddress);
        }

        System.out.print("Nhập xã/phường: ");
        String ward = sc.nextLine();
        if (!ward.equals("0")) {
            address.setWard(ward);
        }

        System.out.print("Nhập quận/huyện: ");
        String district = sc.nextLine();
        if (!district.equals("0")) {
            address.setDistrict(district);
        }

        System.out.print("Nhập thành tỉnh/thành phố: ");
        String city = sc.nextLine();
        if (!city.equals("0")) {
            address.setCity(city);
        }
        return address;

    }

    private Account createNewAccount(){
        Account account = new Account();
        account.setId(accountService.getMaxId());
        System.out.print("Nhập họ tên: ");
        String fullName = sc.nextLine();
        account.setFullName(fullName);

        System.out.print("Nhập số điện thoại: ");
        String mobile = sc.nextLine();
        account.setMobile(mobile);

        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();
        account.setPassword(password);

        account.setStatus(AccountStatus.ACTIVE);
        account.setGender(Gender.MALE);
        account.setRole(Role.CUSTOMER);
        return account;
    }

    public void addNewAccount(){
        Account account = createNewAccount();
        if(accountService.addNewAccount(account)){
            System.out.println("Đăng ký thành công");
        }else{
            System.out.println("Đăng ký thất bại");
        }
    }

    public void forgetPassword(){
        System.out.println("Nhập số điện thoại của bạn: ");
        String mobile = sc.nextLine();
        Account account = accountService.checkAccountExists(mobile);
        if(account == null){
            System.out.println("Số điện thoại chưa được đăng ký tài khoản");
        }else{
            updatePassword(account);
        }
    }

//    public Account getAccountById(int id){
//        return accountService.getAccountById(id);
//    }

    public void changeStatus(Account account){
        if(account.getStatus() == AccountStatus.ACTIVE){
            account.setStatus(AccountStatus.DISABLE);
            System.out.println("Đã khóa tài khoản này");
        }else{
            account.setStatus(AccountStatus.ACTIVE);
            System.out.println("Tài khoản đã được mở");
        }
    }
}
