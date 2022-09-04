public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        System.out.println("bán kính hình tròn: " +circle.getR());
        System.out.println("Chu vi hình tròn: " + circle.perimeter());
        System.out.println("Diện tích hình tròn: " +circle.area());

        Rectangle rectangle = new Rectangle(5,3);
        System.out.println("Chiều dài: " + rectangle.getLength());
        System.out.println("Chiều rộng: " + rectangle.getWidth());
        System.out.println("Chu vi hcn: " + rectangle.perimeter());
        System.out.println("Diện tích hcn: " + rectangle.area());
    }
}