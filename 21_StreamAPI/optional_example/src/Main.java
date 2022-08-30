import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        IGamer gamer = new ItStudent();
//        gamer.playGame();
//        gamer.sleep("no sleep :)");
//
//        ICoder coder = new ItStudent();
//        coder.code();
//        coder.sleep("I work on morning and sleep in the evening");
//
//        IHacker hacker = new ItStudent();
//        hacker.hackFacebook();
//        hacker.sleep("I work on evening and sleep in the morning");

//        int[] intArray = {5,3,9,10,2,1};
//        int[] arrayCopy = Arrays.copyOf(intArray, 6);
//        int[] arr = {1,2,3,4,5,6};
//
//        System.out.println(Arrays.equals(intArray, arrayCopy));
//        System.out.println(Arrays.equals(intArray, arr));

//        Arrays.fill(intArray, 0);
//        System.out.println(Arrays.toString(intArray));

//        Arrays.sort(intArray);
//
//        int findIdx = Arrays.binarySearch(intArray, 10);
//        System.out.println(findIdx);

        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{1,2,3},{4,5,6}};
        int[][] arr3 = Arrays.copyOf(arr1, 3);

        System.out.println(Arrays.deepEquals(arr1, arr2));
        System.out.println(Arrays.deepEquals(arr1, arr3));
    }
}