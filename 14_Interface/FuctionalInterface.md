## Functional interface

Functional interface là một khái niệm mới được đưa vào từ java 8, nó là một interface chỉ có duy nhất một phương thức trừu tượng.  
Các biểu thức lambda thường được sử dụng để tạo nhanh một đối tượng của một Functional interface  
Functional interface sử dụng annotation `@FunctionalInterface` để khai báo. Tuy nhiên việc này là không bắt buộc, nó chỉ đảm bảo cho quá trình compile, giúp chương trình báo lỗi khí có từ 2 abstract method trở lên.  
Lợi ích chính của Functional interface là chúng có thể sử dụng lambda để tạo ra instance cho interface đó  

## Tạo Functional interface

```java
@FunctionalInterface
public interface MyFunctionalInterface {
    void doSomething();
}
```

Nếu trong interface này không chứa bất khi abstract method nào hoặc có từ 2 abstract method trở lên thì sẽ báo lỗi  

![image](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/H0KYvd0_)    
  

![image](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/Vq6kTEn9)

Tuy nhiên nó lại có thể chứa các phương thức của lớp Object  

```java
@FunctionalInterface
public interface MyFunctionalInterface {
    void doSomething();

    //Các phương thức của lớp Object
    String toString();
    int hashCode();
    boolean equals(Object obj);
}
```

ta cũng có thể truyền các phương thức có phần thân bằng cách sử dụng từ khóa `static` hoặc `default`  

```java
@FunctionalInterface
public interface MyFunctionalInterface {
    void doSomething();

    default void defaultMethod(){
        
    }
    
    static void staticMethod(){
        
    }
}
```

## Triển khai Functional interface  

```java
public class MyClass implements MyFunctionalInterface{
    @Override
    public void doSomething() {

    }

    @Override
    public void defaultMethod() {
        MyFunctionalInterface.super.defaultMethod();
    }
}
```

## Functional Interface API trong Java 8

Cho List như sau: 
```java
List<Integer> list = new ArrayList<>();
for(int i = 0; i <= 10; i++){
    list.add(i);
}
```
### java.util.function.Consumer  

Consumer thường được sử dụng với list, stream để xử lý các phần tử bên trong  

```java
list.forEach(new Consumer<Integer>() {
    @Override
    public void accept(Integer i) {
        System.out.println(i);
    }
});
```  

### java.util.function.Predicate

Predicate được sử dụng khi cần kiểm tra từng phần tử lúc xóa, lọc, ... dùng với list, stream,...
```java
list.removeIf(new Predicate<Integer>() {
    @Override
    public boolean test(Integer integer) {
        return integer < 3;
    }
});
System.out.println(list);
```

### java.util.function.Function
Function thường được dùng với Stream khi muốn thay đổi giá trị cho từng phần tử trong stream

```java
Stream<Integer> stream = list.stream();
stream.map(new Function<Integer, Object>() {
    @Override
    public Object apply(Integer integer) {
        return integer * 10;
    }
}).forEach(new Consumer<Object>() {
    @Override
    public void accept(Object o) {
        System.out.println(o);
    }
});
```

**Một số Function interface tương tự:**

java.util.function.IntFunction: dữ liệu chuyển về kiểu Integer
java.util.function.DoubleFunction: dữ liệu chuyển về kiểu Double
java.util.function.LongFunction: dữ liệu chuyển về kiểu Long

### java.util.function.Supplier

```java
Random random = new Random();
Stream<Integer> stream1 = Stream.generate(new Supplier<Integer>() {
    @Override
    public Integer get() {
        return random.nextInt(10);
    }
}).limit(5);
```