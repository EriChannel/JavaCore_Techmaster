## Lớp java.util.Date  
Lớp `java.util.Date` đại diện cho một thời điểm cụ thể. Nó cung cấp các constructor và phương thức để xử lý ngày và giờ trong Java  

Tuy nhiên hầu hết các phương thức của nó đã lỗi thời và được khuyến cáo là không nên sử dụng. Mặc dù vậy nhưng lớp Date này vẫn được sử dụng rộng rãi  

```java
public class Date implements java.io.Serializable, Cloneable, Comparable<Date>
```  

## Constructors

| Constructors | Description |
| --- | --- | 
| `Date()` | Tạo ra đối tượng `Date` đại diện cho ngày và giờ hiện tại | 
| `Date(long milliseconds)` | Tạo ra đối tượng `Date` theo thời gian là milli giây tính từ 01/01/1970 |

Ví dụ:  
```java
public class Main {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);

        //Số milli giây tính từ 01/01/1970 đến hiện tại
        long milliseconds = System.currentTimeMillis();
        Date date2 = new Date(milliseconds);
        System.out.println(date2);
    }
}
```

## Một số phương thức   

| Methods | Description |
| --- | --- |
| `boolean after(Date date)` | Trả về `true` nếu ngày hiện tại là sau ngày chỉ định | 
| `boolean before(Date date)` | Trả về `true` nếu ngày hiện tại là trước ngày chỉ định | 
| `Object clone()` | Trả về đối tượng là clone của ngày hiện tại | 
| `int compareTo(Date date)` | So sánh ngày hiện tại với ngày được chỉ định và trả về kết quả kiểu `int` | 
| `boolean equals(Date date)` | so sánh ngày hiện tại với ngày được chỉ định và trả về kết quả kiểu `boolean` |  
| `static Date from(Instant instant)` | Trả về instance của đối tượng Date từ ngày instant |  
| `long getTime()` | Trả về thời gian được đại diện bởi đối tượng date | 
| `int hashCode()` | Trả về hash code cho đối tượng date |
| `void setTime(long time)` | Thay đổi ngày và giờ | 
| `Instant toInstant()` | Chuyển đổi date hiện tại thành Instant | 
| `String toString()` | Chuyển đổi date hiện tại thành String |
