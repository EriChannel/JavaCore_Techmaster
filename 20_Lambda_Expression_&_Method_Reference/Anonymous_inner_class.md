## Anonymous inner class  
Lớp vô danh là một inner class nhưng không có tên. Nó được sử dụng khi bạn cần ghi đè phương thức abstract của một lớp hoặc interface.   
Nó có thể được tạo bằng 2 cách sau:  
- Class: Có thể là abstract class hoặc một class cụ thể  
- Interface

Ví dụ: 
```java
public abstract class MyClass {
    public abstract void print();
}
```
Thông thường để triển khai phần thân của phương thức `print()` ta cần tạo class cụ thể để kế thừa MyClass và ghi đè phương thức `print()` để thực hiện phần thân cho phương thức này. Tuy nhiên thay vì tạo class mới ta có thể áp dụng lớp vô danh như sau:  

```java
public class App {

    public static void main(String[] args) {
        MyClass myClass = new MyClass() {
            @Override
            public void print() {
                System.out.println("Xin chào");
            }
        };
        myClass.print();
    }
}
```

Hoặc triển khai từ interface:  

```java
public interface MyInterface {
    void print();
}
```

```java
public class App {

    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void print() {
                System.out.println("Tạm biệt");
            }
        };
        myInterface.print();
    }
}
```