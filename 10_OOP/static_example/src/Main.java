public class Main {

    public static String name = "Ngọc";
    public int age;
    public static void main(String[] args) {
        System.out.println(name);

        Main m = new Main();
        m.myMethod();
        System.out.println(name);

        staticMethod();
        System.out.println(name);
    }

    public void myMethod(){
        name = "Linh";
        age = 20;
    }

    public static void staticMethod(){
        name = "Hưng";

    }

    static {
        System.out.println("Khối static");
    }
}