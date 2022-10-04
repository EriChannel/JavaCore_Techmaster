import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperation {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,6,4,3,9,8,1);
        Stream<Integer> stream = list.stream().distinct();
        stream.forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        stream =list.stream().sorted();
        stream.forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        stream = list.stream().sorted( (o1, o2) -> o2-o1);
        stream.forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        stream = list.stream().filter(i -> i%2==0);
        stream.forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        stream = list.stream().limit(3);
        stream.forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        stream = list.stream().skip(4);
        stream.forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        stream = list.stream().map(i -> i*10);
        stream.forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        stream = list.stream().distinct().map(i -> i*10).sorted();
        stream.forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        stream = list.stream().distinct().sorted().skip(2).limit(4);
        stream.forEach(s -> System.out.print(s + "\t"));
        System.out.println();


    }
}
