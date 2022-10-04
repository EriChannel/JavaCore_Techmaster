public class TestSystem {
    public static void main(String[] args) {
//        Addable addable = () -> System.out.println(5 + 6);
//        addable.add();

//        Addable addable = (a, b) -> {
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(a + b);
//        };
//        addable.add(10, 20);

        Addable addable = (a, b) -> (a+b);
        int result = addable.add(3,7);
        System.out.println(result);

        Addable addable1 = (a, b) -> {
            int sum = a + b;
            return sum;
        };

        System.out.println(addable1.add(6,1));
    }
}
