public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 9;

        double s = x * x * Math.PI;
        System.out.println("Diện tích: " + s);

        //Tính luỹ thừa
        System.out.println(Math.pow(x, 5));

        //Khai căn
        System.out.println(Math.sqrt(y));

        System.out.println("Số lớn nhất trong hai số : " + Math.max(x, y));
        System.out.println("Số nhỏ nhất trong hai số: " + Math.min(x, y));

        System.out.println("Giá trị tuyệt đối: " + Math.abs(y));

        double z = 5.6;
        System.out.println("Làm tròn tăng: " + Math.ceil(z));
        System.out.println("Làm tròn giảm: " + Math.floor(z));

        System.out.println("Số ngẫu nhiên: " + Math.random());

        System.out.println("Tính sin: " + Math.sin(z));
        System.out.println("Tính cos: " + Math.cos(z));
    }
}