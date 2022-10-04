import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static int setAge() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        boolean isContinue = true;
        while (isContinue){
            try {
                System.out.println("Nhập tuổi của bạn: ");
                age = sc.nextInt();
                if(age <= 0 || age > 200){
                    throw new ArithmeticException("Tuổi không hợp lệ");
                }
                isContinue = false;
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại");
            }
        }


        return age;
    }

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("abc.xml");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int age = 0;
        try {
            age = setAge();
        }catch (InputMismatchException e){
            System.out.println("Tuổi không hợp lệ");
        }
        if(age >= 18){
            System.out.println("Bạn đủ tuổi bầu cử");
        }else {
            System.out.println("Bạn chưa đủ tuổi bầu cử");
        }
    }
}
