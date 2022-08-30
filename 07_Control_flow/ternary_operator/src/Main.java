import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //<Biến> = <Điều kiện> ? <Biểu thức 1> : <Biểu thức 2>;

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số ngẫu nhiên: ");
//        int number = sc.nextInt();
//        if(number % 2 == 0){
//            System.out.println(number + " là số chẵn");
//        }else {
//            System.out.println(number + " là số lẻ");
//        }
//
//        String result = number % 2 == 0 ? number + " là số chẵn" : number + " là số lẻ";
//        System.out.println(result);



        float height = 1.5f;
        float weight = 60f;
        float bmi = bmiCalculator(height, weight);

        if(bmi <  18.5){
            System.out.println("Bạn thiếu cân");
        }else if(bmi >= 18.5 && bmi <= 22.9){
            System.out.println("Bạn bình thường");
        }else{
            System.out.println("bạn thừa cân");
        }

        String bmiResult = bmi < 18.5 ? "Bạn thiếu cân" :
                bmi >= 23 ? "Bạn thừa cân" : "Bạn bình thường";

        System.out.println(bmiResult);


    }


    public static float bmiCalculator(float height, float weight){
        return weight/(height*height);
    }
}