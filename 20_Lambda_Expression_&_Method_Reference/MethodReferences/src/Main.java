import java.util.Arrays;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = Main::print;
        myInterface.display();

        BiFunction<Integer, Integer, Integer> biFunction = Main::sum;
        int result = biFunction.apply(5,9);
        System.out.println(result);

        Main main = new Main();
        MyInterface myInterface1 = main::show;
        myInterface1.display();

        Integer[] arr = {1,6,4,9,3,5};
        Arrays.sort(arr, Integer::compare);
        System.out.println(Arrays.toString(arr));

        String[] strArray = {"Steve", "Anna", "Lucy", "John"};
        Arrays.sort(strArray, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strArray));

        FunctionalInterface functionalInterface = MyClass::new;
        functionalInterface.display("Java");
    }

    public static void print(){
        System.out.println("Xin chào!!!");
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public void show(){
        System.out.println("Hello!!!");
    }

}