Từ phiên bản Java 8, chúng ta được giới thiệu thêm một API mới về Date và Time.  
Package `java.time` chứa các lớp hỗ trợ xử lý về Date và Time  

## Danh sách các lớp 

| Classes | Description |
| --- | --- | 
| `LocalDate` | Đại diện cho ngày (year, month, day (yyyy-MM-dd) |
| `LocalTime` | Đại diện cho giờ (hour, minute, second and nanoseconds (HH-mm-ss-ns) |  
| `LocalDateTime` | Đại diện cho cả ngày và giờ (yyyy-MM-dd-HH-mm-ss-ns) | 
| `MonthDay` | Là một đối tượng date-time bất biến, đại diện cho sự kết hợp cho một tháng và ngày trong tháng | 
| `OffsetTime` | Đại diện cho thời gian, thường xem như sự chênh lệch về giờ, phút, giây| 
| `OffsetDateTime` | Đại diện cho ngày và giờ với khoảng thời gian chênh lệch | 
| `Clock` | Cung cấp các phương thức liên quan đến ngày và giờ bằng cách sử dụng múi giờ | 
| `ZonedDateTime` | Đại diện cho ngày và giờ với múi giờ | 
| `ZoneId` | Chỉ định id múi giờ và cung cấp các phương thức chuyển đổi giữa Instant với LocalDateTime | 
| `ZoneOffset` | Biểu diễn độ chênh lệch vùng mặc định từ múi giờ UTC | 
| `Year` | Đại diện cho một năm | 
| `YearMonth` | Đại diện cho sự kết hợp giữa năm và tháng | 
| `Period` | Dùng để đo thời gian theo năm, tháng, ngày | 
| `Duration` | Dùng để đo thời gian tính bằng giây và nano giây | 
| `Instant` | Biểu diễn thời điểm cụ thể trên dòng thời gian | 


## Danh sách Enum  
| Enum | Description | 
| --- | --- | 
| `DayOfWeek` | Đại diện cho 7 ngày trong một tuần | 
| `Month` | Đại diện cho 12 tháng trong một năm | 

Trong nội dung bài học chúng ta sẽ chủ yếu tìm hiểu về `LocalDate`, `LocalTime`, `LocalDateTime`


## Lớp LocalDate  
`LocalDate` là một lớp bất biến đại diện cho ngày với định dạng mặc định là yyyy-MM-dd  

```java
public final class LocalDate
        implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable
```  

### Khởi tạo LocalDate
Để khởi tạo LocalDate object ta có thể sử dụng hai phương thức static là `now()` và `of()`   
Với `now` sẽ lấy ra ngày hiện tại, `of` giúp bạn chỉ định một ngày cụ thể

```java
public static LocalDate now()

public static LocalDate now(ZoneId zone)

public static LocalDate now(Clock clock)  

public static LocalDate of(int year, Month month, int dayOfMonth)

public static LocalDate of(int year, int month, int dayOfMonth)
```

## Lớp LocalTime
Lớp `LocalTime` là một lớp bất biến đại diện cho thời gian (giờ, phút, giây,...) trong một ngày  

```java
public final class LocalTime
        implements Temporal, TemporalAdjuster, Comparable<LocalTime>, Serializable 
```  

### Khởi tạo LocalTime

Để khởi tạo LocalTime object ta có thể sử dụng hai phương static là `now()` và `of()` 

Với `now()` giúp lấy ra thời gian hiện tại, `of()` chỉ định thời gian cụ thể dựa theo tham số truyền vào  

```java
public static LocalTime now()

public static LocalTime now(ZoneId zone)  

public static LocalTime now(Clock clock)  

public static LocalTime of(int hour, int minute)  

public static LocalTime of(int hour, int minute, int second)  

public static LocalTime of(int hour, int minute, int second, int nanoOfSecond)
```

## Lớp LocalDateTime  
`LocalDateTime` đại diện cho cả ngày và giờ trong hệ thống lịch ISO.  
```java
public final class LocalDateTime
        implements Temporal, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable 
```

### Khởi tạo LocalDateTime
Lớp `LocalDateTime` không cung cấp bất kỳ một constructor nào, nhưng nó cung cấp các phương thức `static` để tạo đối tượng  

```java
public static LocalDateTime now()  

public static LocalDateTime now(Clock clock) 

public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)

public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second)

public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)

public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)

public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)

public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)

public static LocalDateTime of(LocalDate date, LocalTime time)
```