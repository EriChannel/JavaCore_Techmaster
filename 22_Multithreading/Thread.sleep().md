## Dừng thực thi với phương thức Thread.sleep()  
Phương thức `Thread.sleep()` khiến cho luồng hiện thời tạm ngừng thực thi trong một khoảng thời gian xác định. Đây là một cách hiệu quả để cung cấp thời gian xử lý cho các luồng khác của một ứng dụng hoặc các ứng dụng khác mà có thể chạy trên hệ thống máy tính. 

Cú pháp:  
```java
Thread.sleep(long millis); //Tạm dừng Thread với khoảng thời gian dừng tính bằng millisecond  
Thread.sleep(long millis, int nanos); //Tạm dừng Thread với khoảng thời gian dừng tính bằng thời gian millisecond cộng với nanosecond  
```   

Ví dụ:  
```java
public class DemoSleep extends Thread{
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
        DemoSleep thread = new DemoSleep();
        thread.start();
    }
}
```