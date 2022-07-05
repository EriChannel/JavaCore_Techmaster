## Biến là gì?
Biến là vùng nhớ dùng để lưu trữ các giá trị của chương trình. Mỗi biến gắn liền với một kiểu dữ liệu và một định danh duy nhất gọi là tên biến
Tên biến thông thường là một chuỗi các ký tự hoặc số.

Trong java, biến có thể được khai báo ở bất kỳ nơi đâu trong chương trình Java

**Cú pháp khai báo biến**
```
<Kiểu dữ liệu> <tên biến>;
```

**Gán giá trị cho biến**
```
 <tên biến> = <giá trị>;
```

## Các loại biến

### Biến toàn cục (Biến instance)
- Biến instance được khai báo trong một lớp(class), bên ngoài các phương thức, constructor và các block.
- Biến instance được lưu trong bộ nhớ heap.
- Biến instance được tạo khi một đối tượng được tạo bằng việc sử dụng từ khóa “new” và sẽ bị phá hủy khi đối tượng bị phá hủy.
- Biến instance có thể được sử dụng bởi các phương thức, constructor, block, ... Nhưng nó phải được sử dụng thông qua một đối tượng cụ thể.
- Bạn được phép sử dụng "access modifier" khi khai báo biến instance, mặc định là "default".
- Biến instance có giá trị mặc định phụ thuộc vào kiểu dữ liệu của nó. Ví dụ nếu là kiểu int, short, byte thì giá trị mặc định là 0, kiểu double thì là 0.0d, ... Vì vậy, bạn sẽ không cần khởi tạo giá trị cho biến instance trước khi sử dụng.
- Bên trong class mà bạn khai báo biến instance, bạn có thể gọi nó trực tiếp bằng tên khi sử dụng ở khắp nới bên trong class đó.  

Ví dụ:  
```java
public class Person {
    public String name;
    public int age;
    public String address;
    
   /* 
   Ba biến name, age, address là biến instance
   Trong đó với biến name và address có giá trị mặc định là null  
   Biến age có giá trị mặc định là 0
    */
}

```
### Biến cục bộ (Biến local)

- Biến local được khai báo trong các phương thức, hàm contructor hoặc trong các block.
- Biến local được tạo bên trong các phương thức, contructor, block và sẽ bị phá hủy khi kết thúc các phương thức, contructor và block.
- Không được sử dụng "access modifier" khi khai báo biến local.
- Các biến local được lưu trên vùng nhớ stack của bộ nhớ.
- Bạn cần khởi tạo giá trị mặc định cho biến local trước khi có thể sử dụng  

Ví dụ:  
```java
public class Main {
    public static void main(String[] args) {
        int x = 10; //Biến cục bộ
        System.out.println(x);
    }
}
```

## Quy tắc khai báo biến  

- Chỉ được bắt đầu bằng một ký tự(chữ), hoặc một dấu gạch dưới(_), hoặc một ký tự dollar($)
- Tên biến không được chứa khoảng trắng
- Bắt đầu từ ký tự thứ hai, có thể dùng ký tự(chữ), dấu gạch dưới(_), hoặc ký tự dollar($)
- Không được trùng với các từ khóa
- Có phân biệt chữ hoa và chữ thường

***Lưu ý***: Hãy đặt tên biến dễ nhớ, dễ đọc và có ý nghĩa