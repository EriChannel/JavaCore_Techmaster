package org.example.exception;

import org.example.model.Account;
import org.example.model.Quiz;
import org.example.repository.AccountRepository;
import org.example.util.Validator;

import java.util.List;
import java.util.Scanner;

public class InputData {

    static Scanner sc = new Scanner(System.in);

    public static int inputOption(){
        while (true){
            try{
                return Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Nhập sai dữ liệu, vui lòng nhập lại!");
            }
        }
    }

    public static String inputUsername(){
        boolean isValid = false;
        String username = null;
        while (!isValid){
            username = sc.nextLine();
            if(username.length() == 0){
                System.out.println("Vui lòng nhập dữ liệu");
            }else if(username.length() < 5 || username.length() > 20){
                System.out.println("Tên đăng nhập phải lớn hơn 5 ký tự và nhỏ hơn 20 ký tự");
            }else if(username.contains(" ")) {
                System.out.println("Tên đăng nhập không được phép chứa khoảng trắng");
            }else if(checkUserNameExist(username)){
                System.out.println("Tên dăng nhập này đã tồn tại hãy chọn một tên khác");
            }else{
                isValid = true;
            }
        }
        return username;
    }

    public static String inputPassword(){
        String password = "";
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

    public static boolean checkUserNameExist(String username){
        for(Account account : AccountRepository.allAccount){
            if(account.getUsername().equalsIgnoreCase(username)){
                return true;
            }
        }
        return false;
    }

    public static int inputAnswer(Quiz quiz) {
        boolean isContinue = true;
        int input = 0;
        while (isContinue){
            try {
                input = Integer.parseInt(sc.nextLine());
                if(input <= 0 || input > quiz.getAnswers().size()){
                    System.out.println("Không có đáp án  này vui lòng nhập lại");
                }else {
                    isContinue = false;
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập sai dữ liệu ");
            }
        }
        return input;

    }
}
