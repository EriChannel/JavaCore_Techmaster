## Lớp java.sql.Date
Lớp `java.sql.Date` chỉ biểu diễn ngày (date). Được sử dụng chủ yếu trong JDBC vì nó thể hiện ngày tháng được lưu trong database
```java
public class Date extends java.util.Date 
```

Tuy nhiên, hầu hết constructor và các phương thức này đều đã bị khuyến cáo là không nên sử dụng. Vì vậy, mình sẽ không liệt kê những cái không nên sử dụng nữa.

## Constructor

`Date(long milliseconds)` : Tạo đối tượng sql Date với mili giây đã cho tính từ ngày 1 tháng 1 năm 1970, 00:00:00 GMT.

```java
public class Main {
    public static void main(String[] args) {
        long milliseconds = System.currentTimeMillis();
        Date date = new Date(milliseconds);
        System.out.println(date);
    }
}
```

## Phương thức trong lớp Date
| Methods | Description | 
| --- | --- | 
| `void setTime(long time)` | Cập nhật lại sql date với time chỉ định | 
| `Instant toInstant()` | Chuyển đổi sql date thành đối tượng `Instant` | 
| `LocalDate toLocalDate()` | Chuyển sql date thành đối tượng `LocalDate` | 
| `String toString()` | Chuyển sql date thành chuỗi `String` | 
| `static Date valueOf(LocalDate date)` | Trả về đối tượng `Date` từ `LocalDate` chỉ định |
| `static Date valueOf(String date)` | Trả về đối tượng `Date` từ chuỗi `String` chỉ định | 