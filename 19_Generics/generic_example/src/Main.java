
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> intList = Arrays.asList(1,2,3,4,5);
//        List<String> strList = Arrays.asList("a","b","c","d","e");
//        List<Double> doubleList = Arrays.asList(2.5, 5.5, 7.1, 3.8);
//
//        print(intList);
//
//        print(strList);
//
//        print(doubleList);
//
//        Integer firstElement = getFirst(intList);
//        System.out.println(firstElement);
//
//        String firstEle = getFirst(strList);
//        System.out.println(firstEle);
//        ClassGeneric<Integer> classGeneric1 = new ClassGeneric<>();
//        classGeneric1.setObj(5);
//        System.out.println(classGeneric1.getObj());
//
//        ClassGeneric<String> classGeneric2 = new ClassGeneric<>("Java");
//        System.out.println(classGeneric2.getObj());

        ArrayDemo<Integer> arrayDemo = new ArrayDemo<>();
        arrayDemo.array = new Integer[5];
        arrayDemo.add(0, 6);
        arrayDemo.add(1, 2);
        arrayDemo.add(2, 9);
        arrayDemo.add(3, 8);
        arrayDemo.add(4, 5);
        System.out.println(arrayDemo.add(5, 7));

        System.out.println("Phần tử đầu tiên: " + arrayDemo.get(0));

        arrayDemo.print();

    }

    public static <E> void print(List<E> list){
        for(E e : list){
            System.out.print(e + "\t");
        }
        System.out.println();
    }

    public static <E> E getFirst(List<E> list){
        return list.get(0);
    }

//    public static void print1(List<Integer> list){
//        for (Integer i : list){
//            System.out.println(i);
//        }
//    }
//
//    public static void print2(List<String> list){
//        for (String i : list){
//            System.out.println(i);
//        }
//    }

}