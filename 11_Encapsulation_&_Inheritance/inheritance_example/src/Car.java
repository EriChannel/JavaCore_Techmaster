public class Car extends Vehicle{
    private String brand;

    public Car() {
    }

    public Car(int wheel, int speed, String color, String brand) {
        super(wheel, speed, color);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " - " + brand;
    }
}
