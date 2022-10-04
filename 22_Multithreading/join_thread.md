## Join các Thread  
Phương thức `join()` được sử dụng để đảm bảo cho quá trình thực thi của Thread đang chạy không bị gián đoạn bởi các Thread khác. Nói cách khác, nếu một Thread đang trong quá trình thực thi thì các Thread khác sẽ phải chờ đợi cho đến khi Thread đó thực thi xong. Phương thức `join()` được sử dụng khi trong một chương trình Java có nhiều hơn một Thread và chúng ta cần đảm bảo rằng các Thread thực thi và kết thúc đúng theo thứ tự mà chúng được khởi tạo.  

Hãy so sánh hai đoạn code dưới đây:  
```java
public class DemoSleep extends Thread{
    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            System.out.println(Thread.currentThread().getName() + " đang chạy");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Kết thúc " +Thread.currentThread().getName());
    }
}

```

```java
public class Main {
    public static void main(String[] args) {
        DemoSleep thread1 = new DemoSleep();
        thread1.setName("Thread 1");

        DemoSleep thread2 = new DemoSleep();
        thread2.setName("Thread 2");

        DemoSleep thread3 = new DemoSleep();
        thread3.setName("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
```

Và:
```java
public class Main {
    public static void main(String[] args) {
        DemoSleep thread1 = new DemoSleep();
        thread1.setName("Thread 1");

        DemoSleep thread2 = new DemoSleep();
        thread2.setName("Thread 2");

        DemoSleep thread3 = new DemoSleep();
        thread3.setName("Thread 3");

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
```

Trong ví dụ đầu tiên, mình không sử dụng `join()` thì cả 3 Thread chạy theo thứ tự `Thread 1` -> `Thread 2` -> `Thread 3`. Khi mình bổ sung thêm `join()` trong ví dụ thứ 2, thì khi `Thread 1` đang thực thi thì các `Thread 2` và `Thread 3` chưa được khởi chạy mà phải đợi đến khi `Thread 1` thực thi xong. 