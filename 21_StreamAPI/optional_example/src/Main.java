import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty();

        Optional<String> optional = Optional.of("Java");

        Optional<String> isNullable = Optional.ofNullable("not null");

//        boolean isPresent = emptyOptional.isPresent();
//        System.out.println(isPresent);
//
//        isPresent = optional.isPresent();
//        System.out.println(isPresent);
        if(isNullable.isPresent()){
            String result = isNullable.get();
            System.out.println(result);
        }

        isNullable.ifPresent(s -> System.out.println(s.length()));

        emptyOptional.ifPresent(s -> System.out.println(s.length()));

        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("Anna");
        System.out.println(name);

        String name2 = Optional.ofNullable(nullName).orElseGet(() -> "Chris");
        System.out.println(name2);

        boolean isPresent = optional.filter(s ->s.equals("Java")).isPresent();
        System.out.println(isPresent);

        isPresent = optional.filter(s ->s.equals("java")).isPresent();
        System.out.println(isPresent);
    }
}
