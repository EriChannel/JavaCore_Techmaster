import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listInteger = new ArrayList<>();
        listInteger.add(4);
        listInteger.add(9);
        listInteger.add(1);
        listInteger.add(7);
        listInteger.add(8);
        listInteger.add(2,5);

        int size = listInteger.size();
        System.out.println("Kích thước: " + size);

        for(int i = 0; i < size; i++){
            System.out.print(listInteger.get(i) + "\t");
        }
        System.out.println("\n-------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(37);
        list2.add(15);
        list2.addAll(1,listInteger);

        for(Integer i : list2){
            System.out.print(i + "\t");
        }

        //list2.removeAll(listInteger);
        list2.retainAll(listInteger);
        System.out.println("\nList2 sau khi xóa");
        for(Integer i : list2){
            System.out.print(i + "\t");
        }


    }
}