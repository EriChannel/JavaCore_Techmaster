public class Bird implements Flying{
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying!");
    }

    @Override
    public void flapWings() {
        System.out.println(name + " is flapping its wings!");
    }
}
