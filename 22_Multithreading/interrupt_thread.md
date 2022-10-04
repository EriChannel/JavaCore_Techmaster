## Interrupt một Thread
Interrupt một Thread hay làm gián đoạn một luồng trong Java. Nếu Thread nằm trong trạng thái sleep hoặc wait, việc gọi phương thức `interrupt()` trên Thread đó sẽ phá vỡ trạng thái sleep hoặc wait và ném ra ngoại lệ. Nếu Thread không ở trong trạng thái sleep hoặc wait, việc gọi phương thức interrupt() thực hiện hành vi bình thường và không làm gián đoạn thread nhưng đặt cờ interrupt thành true

Lớp Thread cung cấp 3 phương thức để làm gián đoạn một luồng trong Java  
```java
public void interrupt()

public static boolean interrupted()

public boolean isInterrupted()
```

## Ví dụ về interrupt một thread trong Java khiến thread ngừng họat động

```java
public class ThreadDemo implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread thread = new Thread(threadDemo);
        thread.start();

        thread.interrupt();
    }
}
```

## Interrupt một thread mà thread không ngừng hoạt động

```java
public class ThreadDemo implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception handled");
            }
        }
    }
}
```

## Interrupt một thread trong java mà thread hoạt động bình thường

```java
public class ThreadDemo implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }
}
```