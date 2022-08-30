public class Main {
    public static void main(String[] args) {
        Car car= new Car();
        car.setWheel(4);
        car.setSpeed(60);
        car.setColor("Black");
        car.setBrand("Toyota");

        System.out.println(car.printInfo());
    }
}