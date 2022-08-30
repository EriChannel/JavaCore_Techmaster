import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar myCalendar = Calendar.getInstance();
        System.out.println("Thời gian hiện tại: " + myCalendar.getTime());

        System.out.println("Năm hiện tại: " + myCalendar.get(Calendar.YEAR));
        System.out.println("Ngày hôm nay: " + myCalendar.get(Calendar.DATE));
        System.out.println("Giờ hiện tại: " + myCalendar.get(Calendar.HOUR));
        System.out.println("Phút hiện tại: " + myCalendar.get(Calendar.MINUTE));

        int max = myCalendar.getMaximum(Calendar.DAY_OF_MONTH);
        int min = myCalendar.getMinimum(Calendar.DAY_OF_MONTH);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        myCalendar.add(Calendar.DATE, -1);
        System.out.println("Ngày hôm qua: " + myCalendar.getTime());

        myCalendar.add(Calendar.MONTH, 2);
        System.out.println("Hai tháng sau: " + myCalendar.getTime());

        myCalendar.add(Calendar.YEAR, 4);
        System.out.println("4 năm sau: " + myCalendar.getTime());

    }
}