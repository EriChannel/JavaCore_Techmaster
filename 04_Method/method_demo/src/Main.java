public class Main {
    public static void main(String[] args) {
        //Tạo đối tượng
        Method method = new Method();
        float bmi = method.bmiCalculator();
        System.out.println("BMI = " + bmi);

        float bmi2 = method.bmiCalculator1(1.7f, 60f);

        float height = 1.5f;
        float weight = 60f;
        float bmi3 = method.bmiCalculator1(height, weight);
        System.out.println("BMI = " + bmi3);

        String str = "ngọc";
        String result = method.upperCaseString(str);
        System.out.println(result);

        method.randomNumber();

        bmi = StaticMethod.bmiCalculator(height, weight);
        System.out.println("Chỉ số bmi tính được là: " + bmi);
        StaticMethod.result(bmi);

    }



}