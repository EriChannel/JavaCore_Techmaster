import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        TimeZone myZone = TimeZone.getDefault();
        String id = myZone.getID();
        String name = myZone.getDisplayName();

        System.out.println("ID: " + id);
        System.out.println("Tên múi giờ: " + name);

        String[] ids = TimeZone.getAvailableIDs();
        System.out.println("Danh sách TimeZone: ");
        for (String zone : ids){
            System.out.println(zone);
        }

        TimeZone zone = TimeZone.getTimeZone("Asia/Tokyo");
        System.out.println("Tên múi giờ: " + zone.getDisplayName());
    }
}