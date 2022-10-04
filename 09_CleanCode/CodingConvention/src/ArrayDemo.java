import java.util.Scanner;

public class ArrayDemo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = createArray();

        System.out.println("Mảng ban đầu: ");
        print(arr);

        System.out.println("Chọn index chứa phần tử muốn cập nhật: ");
        int index = sc.nextInt();
        System.out.println("Phần tử muốn cập nhật là: " + arr[index]);
        System.out.println("Nhập giá trị mới: ");
        int newValue = sc.nextInt();
        update(index, newValue, arr);

        System.out.println("Mảng sau khi cập nhật: ");
        print(arr);

        sort(arr);

        System.out.println("Mảng sau khi sắp xếp: ");
        print(arr);
    }

    public static int[] createArray() {
        int[] arr = new int[5];
        System.out.println("Nhập các phần tử mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            arr[i] = sc.nextInt();

        }
        return arr;
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void update(int index, int newValue, int[] arr) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Vị trí thêm không hợp lệ");
        } else {
            arr[index] = newValue;
        }

    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
