import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,3,8,2,6,1,7,9};
        int a = 9;
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                   swap(arr, i, j);
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}