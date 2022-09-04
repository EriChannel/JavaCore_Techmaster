import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 10; i++){
            list.add(i);
        }
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer +"\t");
            }
        };
        list.forEach(consumer);
        System.out.println();

        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 5;
            }
        });
        System.out.println(list);

        list.stream().map(new Function<Integer, Object>() {
            @Override
            public Object apply(Integer integer) {
                return integer * 10;
            }
        }).forEach(new Consumer<Object>() {
            @Override
            public void accept(Object o) {
                System.out.print(o + "\t");
            }
        });
        System.out.println();
        Random random = new Random();
        Stream<Integer> stream = Stream.generate(new Supplier<Integer>() {
            @Override
            public Integer get() {
                return random.nextInt(100);
            }
        }).limit(5);

        stream.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + "\t");
            }
        });




    }


}