## Iterable Interface
`Iterable` interface xuất hiện từ JDK 1.5, nằm trong package `java.lang`  
Việc triển khai interface này cho phép một object trở thành mục tiêu của vòng lặp `for` nâng cao.  

```java
public interface Iterable<T>
{
  Iterator<T>    iterator();
  
  Spliterator<T> spliterator();

  void           forEach(Consumer<? super T> action);
}
```

## Iterator Interface
`Iterator` là một interface hỗ trợ duyệt qua tất cả các phần tử có trong Collection.   
Các đặc điểm của `Iterator`: 
- Không đảm bảo thứ tự lặp  
- Cho phép loại bỏ phần tử ra khỏi Collection, điều này phụ thuộc vào phần tử

## Sử dụng Iterator thay cho vòng lặp  
Ngoài việc sử dụng `for` loop hoặc `foreach` thì Interface `Iterable` cung cấp phương thức `iterator()` giúp lặp các phần tử. Phương thức này trả về `Iterator`  
Các phương thức được sử dụng trong khi duyệt Collection bằng cách sử dụng `Iterator`:  
- `hasNext()`: Trả về `false` nếu đã đến cuối Collection, ngược lại trả về `true`  
- `next()` : Trả về phần tử tiếp theo trong Collection  
- `remove()`: Loại bỏ phần tử cuối cùng được trả về bởi `Iterator` trong Collection  
- `forEachRemaining()`: Thực hiện hành động cụ thể cho từng phần tử còn lại của Collection

```java
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JS");
        list.add("PHP");
        list.add("Python");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        
    }
}
```
