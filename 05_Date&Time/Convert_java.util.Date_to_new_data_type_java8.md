Một trong những update feature của java 8 là có một hệ thống lớp mới để thao tác với dữ liệu kiểu date. Dễ hiểu hơn, dễ sử dụng hơn, tốt hơn so với kiểu cũ. Nhưng chưa phải hầu hết các thư viện, framework build trên Java đã support kiểu date mới. Do đó, đôi khi chúng ta cần phải chuyển đổi giữa kiểu date cũ với kiểu date mới

Mình sẽ sử dụng lớp `Instant` để hỗ trợ việc chuyển đổi  
Lớp này được sử dụng để biểu diễn thời điểm cụ thể trên dòng thời gian.   
```java
public final class Instant
        implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable 
```

## Chuyển đổi giữa LocalDate và java.util.Date  
### Chuyển đổi từ java.util.Date sang LocalDate  

```java
public static void convertDateToLocalDate(){
        Date now = new Date();
        Instant instant = Instant.ofEpochMilli(now.getTime());
        LocalDate localDate = LocalDate.ofInstant(instant, ZoneId.systemDefault());

        System.out.println(now);
        System.out.println(localDate);
}
```

Trong đó: 
- `ofEpochMilli()`: Đây là một phương thức static, nó sẽ trả về instance của Instant bằng cách sử dụng milli giây   
- `now.getTime()`: Trả về milli giây tính từ 01/01/1970, 00:00:00 GTM  
- `ofInstant()` : Trả về instance của LocalDate từ Instant và zoneId  
- `ZoneId.systemDefault()`: Nhận múi giờ mặc định của hệ thống

### Chuyển đổi từ LocalDate sang java.util.Date  

```java
public static void convertLocalDateToDate(){
        LocalDate localDate = LocalDate.of(2022,10,10);
        Instant instant = localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);

        System.out.println(localDate);
        System.out.println(date);
}
```  

## Chuyển đổi giữa LocalTime và java.util.Date  
### Chuyển đổi từ Date sang LocalTime  
```java
public static void convertDateToLocalTime(){
        Date now = new Date();
        Instant instant = Instant.ofEpochMilli(now.getTime());
        LocalTime localTime = LocalTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(now);
        System.out.println(localTime);
}
```

### Chuyển đổi từ LocalTime sang Date
```java
public static void convertLocalTimeToDate(){
        LocalTime localTime = LocalTime.now();

        Instant instant = localTime.atDate(LocalDate.of(2022, 7, 11)).
                atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);

        System.out.println(localTime);
        System.out.println(date);
}
```

## Chuyển đổi qua lại giữa LocalDateTime và java.util.Date

### Chuyển đổi từ Date sang LocalDateTime
```java
public static void convertDateToLocalDateTime(){
        Date now = new Date();
        Instant instant = Instant.ofEpochMilli(now.getTime());
        LocalDateTime currentDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(now);
        System.out.println(currentDateTime);
}
```

### Chuyển đổi từ LocalDateTime sang Date  
```java
public static void convertLocalDateTimeToDate(){
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);

        System.out.println(localDateTime);
        System.out.println(date);
}
```