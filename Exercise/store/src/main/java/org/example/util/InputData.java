package org.example.util;

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
}
