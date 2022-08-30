import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        System.out.println("pi = " + Math.PI);
        int r = 5;
        double area = r*r * Math.PI;
        System.out.println("Diện tích hình tròn: " + area);

        int x = 5;
        int y = 9;
        System.out.println("Giá trị tuyệt đối của y = " + Math.abs(y));

        System.out.println("Số lớn nhất trong hai số x và y là : " + Math.max(x, y));
        System.out.println("Số nhỏ nhất trong hai số x và y là : " +Math.min(x, y));

        System.out.println("Căn bậc hai: " +Math.sqrt(y));
        System.out.println("Lũy thừa: " + Math.pow(y, x));

        System.out.println("Làm trong tăng: " +Math.ceil(area));
        System.out.println("Làm tròn giảm: " + Math.floor(area));

        System.out.println("Sin " + Math.sin(Math.PI/2));
        System.out.println("Cos " + Math.cos(Math.PI));

        System.out.println("Đổi từ radian sang độ: " +Math.toDegrees(Math.PI/2));
        System.out.println("Đổi từ độ sang radian: " + Math.toRadians(45));

        System.out.println("Sinh số ngẫu nhiên từ 0 đến 1: " + Math.random());
    }
}