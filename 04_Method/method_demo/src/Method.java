public class Method {

    public float bmiCalculator(){
        float height = 1.5f;
        float weight = 40f;

        float bmi = weight/(height*height);
        return bmi;
    }

    public float bmiCalculator1(float height, float weight){
        float bmi = weight/(height*height);
        return bmi;
    }

    public String upperCaseString(String str){
        //randomNumber();
        return str.toUpperCase();
    }

    public void randomNumber(){
        double rdNumber = Math.random();
        System.out.println("Số ngẫu nhiên: " + rdNumber);
    }
}
