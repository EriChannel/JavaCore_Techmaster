import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        long millisecond = System.currentTimeMillis();
        Date date = new Date(millisecond);
        System.out.println(date);

        String strDate = "2020-11-19";
        Date date1 = Date.valueOf(strDate);
        System.out.println(date1);

    }
}