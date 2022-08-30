## Lớp Scanner
Lớp `Scanner` của package `java.util` được sử dụng để để đọc dữ liệu đầu vào từ các nguồn khác nhau như người dùng nhập thông tin từ bàn phím, đọc file,...

## Tạo đối tượng Scanner
***Cú pháp:***
```java
Scanner <Tên biến tham chiếu>  = new Scanner(Tham số truyền vào);
```

***Ví dụ:***
```Java
Scanner sc = new Scanner(System.in);
```
Trong đó:
- `sc`: Tên biến tham chiếu
- `System.in`: Tham số được sử dụng khi lấy đầu vào từ bàn phím

## Một số phương thức lớp Scanner
| Phương thức | Mô tả |
| --- | --- |
| `public String next()` | Trả về kết quả nội dung trước khoảng trắng (`String`) |
| `public String nextLine()` | Trả về kết quả nội dung của một chuỗi nhập vào (`String`) |
| `public byte nextByte()` | Trả về kiểu dữ liệu `byte` |
| `public short nextShort()` | Trả về kiểu dữ liệu `short` |
| `public int nextInt()` | Trả về kiểu dữ liệu `int` |
| `public long nextLong()` | Trả về kiểu dữ liệu `long` |
| `public float nextFloat()` | Trả về kiểu dữ liệu `float` |
| `public double nextDouble()` | Trả về kiểu dữ liệu `double` |

## Sử dụng các phương thức
**Nhập thông tin cá nhân gồm tên, địa chỉ, tuổi từ bàn phím và in thông tin ra màn hình**

```java
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Nhập tên: ");
 String name = sc.nextLine();

 System.out.println("Nhập địa chỉ: ");
 String address = sc.nextLine();

 System.out.println("Nhập tuổi: ");
 int age = sc.nextInt();



 System.out.println("Xin chào, tôi tên là " + name + ", " +
 "năm nay tôi " + age + " tuổi, " +
 "tôi đến từ " + address);
 }
}
```

**Nhập chiều cao và cân nặng, tính chỉ số BMI**
```java
import java.util.Scanner;

public class BMI {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Nhập chiều cao: ");
 double height = sc.nextDouble();

 System.out.println("Nhập cân nặng: ");
 double weight = sc.nextDouble();

 double bmi = weight/(height*height);

 System.out.println("Chỉ số bmi của bạn là: " +bmi);
 }
}
```

