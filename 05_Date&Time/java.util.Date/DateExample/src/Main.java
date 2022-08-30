import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        long millisecond = System.currentTimeMillis();
        Date date1 = new Date(millisecond + 200000);
        System.out.println(date1);

        System.out.println(date.before(date1));
        System.out.println(date.after(date1));

        System.out.println(date.equals(date1));

        System.out.println(date.getTime());
        System.out.println(date1.getTime());

        String strDate = date.toString();
        System.out.println(strDate);
    }
}