import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(3);

        System.out.println("Danh sách ban đầu: ");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("Danh sách sau khi sắp xếp: ");
        System.out.println(list);

        int idx = Collections.binarySearch(list, 5);
        System.out.println("Phần tử 5 có index là: " + idx);

        Collections.reverse(list);
        System.out.println("Danh sách đảo ngược: ");
        System.out.println(list);

        Collections.swap(list, 0, list.size()-1);
        System.out.println("Danh sách sau khi đảo vị trí của i và j");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println("Danh sách hoán đổi ngẫu nhiên: ");
        System.out.println(list);

        Collections.replaceAll(list, 3, 8);
        System.out.println("Danh sách sau khi cập nhật: ");
        System.out.println(list);
    }
}