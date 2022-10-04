import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {

        boolean flag = true;
        while (flag){
            try {
                double height = input();
                System.out.println(height);
                flag = false;
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại");
            }catch (InputMismatchException e){
                System.out.println("Nhập sai kiểu dữ liệu");
                System.out.println("Vui lòng nhập lại");
            }
        }

    }

    public static double input() throws MyException, InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao" );
        double height = sc.nextDouble();
        if(height <= 0){
            throw new MyException("Chiều cao không hợp lệ");
        }

        return height;
    }
}
