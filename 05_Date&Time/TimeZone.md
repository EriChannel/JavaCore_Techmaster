## TimeZone
TimeZone trong java được sử dụng để biểu diễn múi giờ. 

```java
public abstract class TimeZone implements Serializable, Cloneable{}
```  

Thông thường, ta có thể lấy TimeZone bằng cách sử dụng phương thức `getDefault()` để lấy TimeZone mặc định nơi chương trình bạn đang chạy. Ví dụ: khi mình đang chạy chương trình tại Việt Nam, `getDefault()` sẽ tạo một đối tượng TimeZone dựa theo giờ chuẩn của Việt Nam.  

## Các phương thức của lớp TimeZone 

| Method | Description |
| --- | --- |
| `static String[] getAvailableIDs()` | Sử dụng để lấy toàn bộ ID có sẵn được hỗ trợ | 
| `static TimeZone getDefault()` | Lấy TimeZone ở máy chủ hiện tại | 
| `String getDisplayName()` | Trả về tên của múi giờ | 
| `String getID()` | Trả về ID của múi giờ | 
| `int getOffset(long date)` | Trả về offset của múi giờ | 
| `void setID(String ID)` | Thiết lập ID cho múi giờ |  



```