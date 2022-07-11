import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int rdNumber = rd.nextInt(100);

        boolean flag = true;

        while (flag){
            System.out.println("Nhập số bất kỳ: ");
            int number = sc.nextInt();

            if(number > rdNumber){
                System.out.println("Bạn nhập số lớn hơn rồi");
            }else if(number < rdNumber){
                System.out.println("Bạn nhập số nhỏ hơn rồi");
            }else {
                System.out.println("Chúc mừng, bạn đoán đúng rồi");
                flag = false;
            }
        }
    }
}