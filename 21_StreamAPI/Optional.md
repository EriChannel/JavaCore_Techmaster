## Optional là gì?  
`Optional` trong java 8 là một container object, nó bao bọc các object, các object này có thể present hoặc không. Khi object là null thì `Optional` trả về empty. 

Ưu điểm chính của `Optional` là không có quá nhiều kiểm tra null và tránh lỗi `NullPointerException` lúc runtime.   

Đặc biệt `Optional` hỗ trợ lambda expression  
  

## Khởi tạo đối tượng Optional   
Khi muốn khởi tạo một `Optional` ta có thể sử dụng các phương thức static sau  
```java  
//Trả về một Optional instance rỗng 
public static<T> Optional<T> empty()  

//Trả về đối tượng Optional kiểu T chứa giá trị của value  
public static <T> Optional<T> of(T value)

//Trả về một Optional chứa giá trị được truyền vào nếu khác null, ngược lại sẽ trả về một Optional rỗng
public static <T> Optional<T> ofNullable(T value)

```

Ví dụ:  

```java
Optional<String> emptyOptional = Optional.empty();
        
Optional<String> fullOptional = Optional.of("Hello");

Optional<String> optional = Optional.ofNullable(object);
```  

## Các phương thức của Optional  

| Method | Description | 
| --- | --- |  
| `T get()` |   Nếu như có giá trị trong Optional này, nó sẽ trả về giá trị đó, ngược lại sẽ ném ra NoSuchElementException nếu như đối tượng rỗng | 
| `boolean isPresent()` | Trả về `true` nếu giá trị khác empty và ngược lại trả về `false` | 
| `boolean isEmpty()` | Trả về `true` nếu giá trị là null, ngược lại `false` |
| `void ifPresent(Consumer<? super T> action)` | Nếu như đối tượng Optional đang chứa giá trị, nó sẽ áp dụng consumer được truyền vào cho giá trị của nó. Ngược lại thì không làm gì cả |  
| `void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)` | Nếu đối tượng Optional đang chứa giá trị, nó sẽ áp dụng consumer được truyền vào cho giá trị của nó, ngược lại thì thực thi một tác vụ khác với đối tượng của interface Runnable |
| `Optional<T> filter(Predicate<? super T> predicate)` | Lọc và trả về giá trị thỏa mãn điều kiện lọc, ngược lại trả về empty Optional |
| `<U> Optional<U> map(Function<? super T, ? extends U> mapper)` | Nếu như có giá trị nó sẽ áp dụng Function lên giá trị đó và nếu kết quả sau khi áp dụng Function khác null thì nó sẽ trả về một Optional chứa giá trị của kết quả sau khi áp dụng Function | 
| `<U> Optional<U> flatMap(Function<? super T, ? extends Optional<? extends U>> mapper)` |  Nếu như có giá trị hiện diện trong Optional, nó sẽ áp dụng Function được truyền vào cho nó và trả về một Optional với kiểu U, ngược lại thì sẽ return về một empty Optional | 
| `T orElse(T other)` | Trả về giá trị nếu khác empty, ngược lại thì trả về `other` | 
| `T orElseGet(Supplier<? extends T> supplier)` | Trả về giá trị nếu giá trị khác empty, ngược lại thì trả về giá trị trả về của method supplier được gọi | 
| `T orElseThrow()` | Trả về giá trị nếu giá trị khác empty, ngược lại throw `NoSuchElementException` |

