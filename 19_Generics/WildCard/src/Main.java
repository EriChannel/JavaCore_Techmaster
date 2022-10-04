import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        List<Double> doubleList = Arrays.asList(3.5, 6.5, 7.5, 8.5);
        List<String> stringList = Arrays.asList("a","b","c", "d");

        print(intList);
        print(doubleList);
        print(stringList);

        System.out.println("-----------------------");
        printNumber(intList);
        printNumber(doubleList);
        //printNumber(stringList);

        System.out.println("------------------------");
        printList(intList);
//        printList(doubleList);
//        printList(stringList);


    }

    public static void print(List<?> list){
        for(Object o : list){
            System.out.print(o + "\t");
        }
        System.out.println();
    }

    public static void printNumber(List<? extends Number> list){
        for(Number n : list){
            System.out.print(n + "\t");
        }
        System.out.println();
    }

    public static void printList(List<? super Integer> list){
        for(Object i : list){
            System.out.print(i + "\t");
        }
        System.out.println();
    }

}