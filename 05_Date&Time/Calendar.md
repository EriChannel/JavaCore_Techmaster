## Lớp Calendar
Calendar trong Java là một lớp trừu tượng nằm trong package java.util, nó cung cấp các phương thức để chuyển đổi giữa ngày với một thời điểm cụ thể trong thời gian và một tập hợp các trường của calendar như MONTH, YEAR, HOUR,DAY_OF_MONTH,...  

```java
public abstract class Calendar implements Serializable, Cloneable, Comparable<Calendar>
```

Do Calendar là một lớp trừu tượng (Sẽ được tìm hiểu kỹ hơn trong phần OOP), do đó không thể tạo đối tượng từ constructor được. Thay vào đó, chúng ta có thể sử dụng các phương thức static  `Calendar.getInstance()` để khởi tạo instance 

- `Calendar.getInstance()`: Trả về instance của Calendar dựa trên múi giờ mặc định của vị trí hiện tại. 
- `Calendar.getInstance(TimeZone zone)`
- `Calendar.getInstance(Locale aLocale)`
- `Calendar.getInstance(TimeZone zone, Locale aLocale)`

## Một số phương thức trong Calendar  

| Method | Description | 
| --- | --- | 
| `abstract void add(int field, int amount)` | Dùng để thêm hoặc giảm số lượng thời gian nhất định vào trường calendar đã cho, dựa trên nguyên tắc của calendar | 
| `int get(int field)`  | Trả về một trường của lịch đã cho | 
| `abstract int getMaximum(int field)` | Trả về giá trị lớn nhất cho trường calendar đã cho của instance Calendar hiện tại | 
| `abstract int getMinimum(int field)` | Trả về giá trị nhỏ nhất cho trường calendar đã cho của instance Calendar hiện tại | 
| `Date getTime()` | Trả về đối tượng Date biểu diễn giá trị time của Calendar | 
| `void set(int field, int value)` | Thiết lập trường cho trước với giá trị đã cho | 
| `void setTime(Date date)` | Thiết lập time của Calendar với Date đã cho |
