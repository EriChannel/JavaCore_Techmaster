public class App {

    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void print() {
                System.out.println("Tạm biệt");
            }
        };
        myInterface.print();
    }
}
