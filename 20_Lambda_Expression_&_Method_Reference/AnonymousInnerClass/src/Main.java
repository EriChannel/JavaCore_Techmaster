public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass() {
            @Override
            public void print() {
                System.out.println("Xin chào");
            }

            @Override
            public void myMethod() {
                super.myMethod();
                System.out.println("Override lại myrethod()");
            }
        };
        myClass.print();
        myClass.myMethod();

        MyInterface myInterface = new MyInterface() {
            @Override
            public void print() {
                System.out.println("hello!!!");
            }

            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        myInterface.print();

        System.out.println(myInterface.sum(4,5));
    }
}