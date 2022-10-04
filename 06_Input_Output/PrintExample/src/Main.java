public class Main {
    public static void main(String[] args) {
        String name = "Ngọc";
        int age = 25;
        String address = "Hà Giang";

        double height = 1.5;
        double weight = 40;
        double bmi = weight/(height*height);

        System.out.println("Tôi tên là " + name + ", năm nay tôi " +
                age + " tuổi, tôi đến từ " + address);

        System.out.println("Cân nặng " + weight + ", chiều cao " + height +
                ", chỉ số BMI " + bmi);

        System.out.println("-------------------------");

        System.out.print("Tôi tên là " + name + ", năm nay tôi " +
                age + " tuổi, tôi đến từ " + address );

        System.out.print("Cân nặng " + weight + ", chiều cao " + height +
                ", chỉ số BMI " + bmi );

        System.out.println("\n-------------------------");

        System.out.printf("Tôi tên là %s, năm nay tôi %d tuổi, tôi đến từ %s\n",name, age,address);
        System.out.printf("Cân nặng: %.2f, chiều cao: %.2f, chỉ số BMI: %.2f", weight, height, bmi);

    }
}