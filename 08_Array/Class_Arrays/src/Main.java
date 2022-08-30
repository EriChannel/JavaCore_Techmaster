import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] array = {6,3,4,9,2,1};

        int[][] multiArray = {{8,5,7},{3,2,4}};

        String arr = Arrays.toString(array);
        System.out.println(arr);

        String multiArr = Arrays.deepToString(multiArray);
        System.out.println(multiArr);

        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp: ");
        System.out.println(Arrays.toString(array));

        int findIdx = Arrays.binarySearch(array, 6);
        System.out.println("Index của phần tử 6: " + findIdx);

        int[] arrayCopy = Arrays.copyOf(array, 10);
        System.out.println("mảng mới: ");
        System.out.println(Arrays.toString(arrayCopy));

        int[] arrCopy2 = Arrays.copyOfRange(array, 1, 3);
        System.out.println(Arrays.toString(arrCopy2));

        System.out.println(Arrays.equals(array, arrayCopy ));
        System.out.println(Arrays.equals(array, Arrays.copyOf(array, 6)));

    }
}