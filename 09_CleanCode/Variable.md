## Sử dụng tên có nghĩa, dễ phát âm  

Hãy đặt tên biến có nghĩa, sao cho khi người khác nhìn vào có thể hiểu được tác dụng của biến đó. Biến thông thường là danh từ.  
Đối với Java áp dung camel case để đặt tên biến ví dụ như: `age`, `name`, `currentDate`,...

Không tốt:  
```java
String yyyymmdstr = new SimpleDateFormat("YYYY/MM/DD").format(new Date());
```

Tốt: 
```java
String currentDate = new SimpleDateFormat("YYYY/MM/DD").format(new Date());
```  

## Tránh hại não người khác  
Hãy đặt một cái tên thật tường minh  

Không tốt: 
```java
String [] l = {"Austin", "New York", "San Francisco"};

for (int i = 0; i < l.length; i++) {
    String li = l[i];
    doStuff();
    doSomeOtherStuff();
    // ...
    // ...
    // ...
    // Khoan, `l` là cái gì vậy?
    dispatch(li);
 }
 ```

 Tốt: 
 ```java
 String[] locations = {"Austin", "New York", "San Francisco"};

for (String location : locations) {
    doStuff();
    doSomeOtherStuff();
    // ...
    // ...
    // ...
    dispatch(location);
}
```

## Đừng thêm những ngữ cảnh không cần thiết  
Nếu tên của lớp hay đối tượng của bạn đã nói lên điều gì đó rồi, đừng lặp lại điều đó trong tên biến nữa  

Không tốt:
```java
public class Person {

    public String personName;
    public int personAge;
    public String personAddress;
}
```

Tốt: 
```java
public class Person {

    public String name;
    public int age;
    public String address;
}
```

## Tránh magic number  
Chúng ta sẽ đọc code nhiều hơn là viết chúng. Điều quan trọng là code chúng ta viết có thể đọc được và tìm kiếm được. Việc đặt tên các biến không có ngữ nghĩa so với chương trình, chúng ta có thể sẽ làm người đọc code bị tổn thương tinh thần. Hãy làm cho các tên biến của bạn có thể tìm kiếm được.  

Không tốt:  
```java
// 86400000 là cái quái gì thế?
setTimeout(blastOff, 86400000);
```

Tốt:  
```java
// Khai báo chúng như một biến hằng global.
public static final int MILLISECONDS_IN_A_DAY = 86400000;

setTimeout(blastOff, MILLISECONDS_IN_A_DAY);
```