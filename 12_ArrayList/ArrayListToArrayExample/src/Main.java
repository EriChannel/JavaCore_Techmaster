import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String[] array = {"Java","PHP", "Python", "Ruby"};
//
//        ArrayList<String> arrayList = new ArrayList<>();
//        for(String s : array){
//            //arrayList.add(s);
//            Collections.addAll(arrayList, s);
//        }
//
//        System.out.println(arrayList);
//
//        List<String> list = new ArrayList<>();
//        list = Arrays.asList(array);
//        System.out.println(list);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i <=5; i++){
            arrayList.add(i);
        }

        System.out.println(arrayList);

        int[] array = new int[arrayList.size()];
        for(int i = 0; i < arrayList.size(); i++){
            array[i] = arrayList.get(i);
        }

        System.out.println(Arrays.toString(array));

        Integer[] intArray = new Integer[arrayList.size()];
        intArray = arrayList.toArray(intArray);
        System.out.println("Mảng intArray: " + Arrays.toString(intArray));
    }
}