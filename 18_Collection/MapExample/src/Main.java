import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Anna");
        hashMap.put(8, "Chris");
        hashMap.put(3, "John");
        hashMap.put(6, "Emma");

        hashMap.put(1, "Scarlett");

        for(Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(hashMap);
    }
}