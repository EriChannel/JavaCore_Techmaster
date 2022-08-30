import java.time.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Convert từ Date sang LocalDate");
        convertDateToLocalDate();

        System.out.println("Convert từ Date sang LocalTime");
        convertDateToLocalTime();

        System.out.println("Convert từ Date sang LocalDateTime");
        convertDateToLocalDateTime();

        System.out.println("Convert từ LocalDate sang Date");
        convertLocalDateToDate();

        System.out.println("Convert từ LocalTime sang Date");
        convertLocalTimeToDate();

        System.out.println("Convert từ LocalDateTime sang Date");
        convertLocalDateTimeToDate();

    }

    // Convert từ Date sang LocalDate
    public static void convertDateToLocalDate(){
        Date now = new Date();
        Instant instant = Instant.ofEpochMilli(now.getTime());
        LocalDate localDate = LocalDate.ofInstant(instant, ZoneId.systemDefault());

        System.out.println(now);
        System.out.println(localDate);
    }

    // Convert từ Date sang LocalTime
    public static void convertDateToLocalTime(){
        Date now = new Date();
        Instant instant = Instant.ofEpochMilli(now.getTime());
        LocalTime localTime = LocalTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(now);
        System.out.println(localTime);
    }

    //Convert từ Date sang LocalDateTime
    public static void convertDateToLocalDateTime(){
        Date now = new Date();
        Instant instant = Instant.ofEpochMilli(now.getTime());
        LocalDateTime currentDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(now);
        System.out.println(currentDateTime);
    }

    // Convert từ LocalDate sang Date
    public static void convertLocalDateToDate(){
        LocalDate localDate = LocalDate.of(2022,10,10);
        Instant instant = localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);

        System.out.println(localDate);
        System.out.println(date);
    }

    //Convert LocalTime sang Date
    public static void convertLocalTimeToDate(){
        LocalTime localTime = LocalTime.now();

        Instant instant = localTime.atDate(LocalDate.of(2022, 7, 11)).
                atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);

        System.out.println(localTime);
        System.out.println(date);
    }

    //Convert LocalDateTime sang date
    public static void convertLocalDateTimeToDate(){
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);

        System.out.println(localDateTime);
        System.out.println(date);
    }

}