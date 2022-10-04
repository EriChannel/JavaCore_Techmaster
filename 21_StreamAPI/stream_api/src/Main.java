import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> emptyStream = Stream.empty();

        IntStream intStream1 = IntStream.range(1, 10);
        intStream1.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        IntStream intStream2 = IntStream.of(4,6,1,2,9,21,34);
        intStream2.forEach(i -> System.out.print(i + "\t"));

        DoubleStream doubleStream = DoubleStream.of(5.4, 9.2, 4.7, 7.3);

        LongStream longStream = LongStream.range(100, 200);

        List<Integer> intList = Arrays.asList(3,1,6,5,7,9,2,3);
        Stream<Integer> listToStream = intList.stream();

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        Stream<String> setToStream = set.stream();
        System.out.println();

        String[] strArray = {"Java", "PHP", "C/C++", "Python"};
        Stream<String> arrayToStream1 = Arrays.stream(strArray);
        Stream<String> arrayToStream2 = Arrays.stream(strArray, 1, 3);
        arrayToStream1.forEach(s -> System.out.print(s + "\t"));
        System.out.println();
        arrayToStream2.forEach(s -> System.out.print(s + "\t"));
    }
}