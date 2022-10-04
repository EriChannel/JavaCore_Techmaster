import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,6,4,3,9,8,1);

        list.stream().distinct().forEach(i -> System.out.print(i +"\t"));
        System.out.println();

        long count = list.stream().distinct().count();
        System.out.println(count);

        Integer min = list.stream().min(Integer::compare).get();
        Integer max = list.stream().max(Integer::compare).get();

        System.out.println("min: " + min + " - " + "max: " + max);

        List<Integer> list1 = list.stream().map(i -> i*10).collect(Collectors.toList());
        System.out.println(list1);

        boolean flag = list.stream().anyMatch(i -> i == 4);
        System.out.println("anyMatch = " + flag);

        flag = list.stream().allMatch(i -> i < 10);
        System.out.println("allMatch = " + flag);

        flag = list.stream().noneMatch(i -> i == 5);
        System.out.println("noneMatch = " + flag);
    }
}
