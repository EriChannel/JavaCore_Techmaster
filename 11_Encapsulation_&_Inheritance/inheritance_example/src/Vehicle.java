public class Vehicle {
    private int wheel;
    private int speed;
    private String color;

    public Vehicle(int wheel, int speed, String color) {
        this.wheel = wheel;
        this.speed = speed;
        this.color = color;
    }

    public Vehicle() {
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String printInfo(){
        return wheel + " - " + speed + " - " + color;
    }
}
