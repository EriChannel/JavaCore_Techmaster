## Tạo thread    
Có 2 cách để tạo thread:  
- Kế thừa từ lớp Thread  
- Triển khai interface Runnable  

### Tạo thread bằng cách kế thừa class Thread  
Để tạo luồng bằng cách kế thừa từ lớp `Thread`, ta cần thực hiện các công việc sau: 
1. Khai báo một lớp mới kế thừa lớp `Thread`  
2. Override lại phương thức `run()` của lớp `Thread`, những gì trong phương thức `run()` sẽ được thực thi khi luồng bắt đầu chạy. Sau khi luồng chạy xong tất cả các câu lệnh trong phương thức `run()` thì luồng cũng tự hủy  
3. Tạo một đối tượng của lớp ta vừa khai báo  
4. Gọi tới phương thức `start()` để luồng bắt đầu thực thi  

```java
public class ThreadDemo extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

    }
}
```

*Lưu ý*: 
- Tuy ta khai báo những công việc cần làm của luồng trong phương thức `run()`, nhưng khi muốn luồng được thực thi ta phải gọi phương thức `start()`. Vì đây là phương thức đặc biệt mà Java xây dựng sẵn trong lớp `Thread`, phương thức này sẽ cấp phát tài nguyên cho luồng mới rồi chạy phương thức `run()` ở luồng này. Vì vậy, nếu ta gọi phương thức `run()` mà không gọi phương thức `start()` thì cũng tương đương với việc gọi một phương thức của một đối tượng bình thường và phương thức vẫn chạy trên luồng mà gọi phương thức chứ không chạy ở luồng mới tạo ra, nên vẫn chỉ có một luồng chính làm việc chứ ứng dụng không phải đa luồng.  
- Sau khi start một thread, nó không bao giờ có thể start lại. Nếu bạn làm như vậy sẽ dẫn đến ngoại lệ `IllegalThreadStateException`  

### Tạo Thread bằng cách triển khai interface Runnable  
Để tạo luồng bằng cách triển khai interface Runnable, ta phải thực hiện các công việc sau:  
1. Khai báo 1 lớp mới implements từ interface Runnable   
2. Triển khai phương thức `run()` ở lớp này, những gì trong phương thức `run()` sẽ được thực thi khi luồng bắt đầu chạy. Sau khi luồng chạy xong tất cả các câu lệnh trong phương thức `run()` thì luồng cũng tự hủy. 
3. Tạo đối tượng của lớp mà ta vừa khai báo. 
4. Tạo instance của lớp Thread  
5. Gọi phương thức `start()`

```java
public class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread thread = new Thread(threadDemo);
        thread.start();
    }
}
```

- Cách hay được sử dụng và được yêu thích là dùng interface Runnable, bởi vì nó không yêu cầu phải tạo một lớp kế thừa từ lớp Thread. Trong trường hợp ứng dụng thiết kế yêu cầu sử dụng đa kế thừa, chỉ có interface mới có thể giúp giải quyết vấn đề. Ngoài ra, Thread Pool rất hiểu quả và có thể được cài đặt, sử dụng rất hơn giản.
- Trong trường hợp còn lại ta có thể kế thừa từ lớp Thread.