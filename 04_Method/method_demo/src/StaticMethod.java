public class StaticMethod {

    public static float bmiCalculator(float height, float weight){
        return weight/(height*height);
    }

    public static void result(float bmi){
        if(bmi <  18.5){
            System.out.println("Bạn thiếu cân");
        }else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Bạn bình thường");
        }else{
            System.out.println("bạn thừa cân");
        }
    }
}
