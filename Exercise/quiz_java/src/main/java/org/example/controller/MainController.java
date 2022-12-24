package org.example.controller;

import org.example.exception.InputData;
import org.example.repository.AccountRepository;
import org.example.util.Menu;

public class MainController {

    private AccountController accountController;

    public MainController() {
        accountController = new AccountController();
        AccountRepository.updateListAccount();
    }

    public void main(){
        while (true){
            Menu.mainMenu();
            int option = InputData.inputOption();
            switch (option){
                case 1:
                    //Login
                    accountController.login();
                    break;
                case 2:
                    //Register
                    accountController.register();
                    break;
                case 3:
                    //forget password
                    accountController.forgetPassword();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }

        }
    }
}
