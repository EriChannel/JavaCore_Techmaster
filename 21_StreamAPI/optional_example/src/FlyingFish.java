public class FlyingFish implements Swimming, Flying{
    private String name;
    @Override
    public void fly() {
        System.out.println(name + " is flying!");
    }

    @Override
    public void flapWings() {
        System.out.println(name + " is flapping its wings!");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming!");
    }
}
