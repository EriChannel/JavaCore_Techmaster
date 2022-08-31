## Inner class là gì?  
Lớp lồng nhau (Inner class) còn có tên gọi khác là nested class, là một lớp được khai báo trong một lớp hoặc interface khác  

Chúng ta sử dụng inner class để nhóm các lớp và các interface một cách logic lại với nhau ở một nơi để giúp code dễ đọc và dễ bảo trì hơn.  

Thêm vào đó, nó có thể truy cập tất cả các thành viên của lớp bên ngoài bao gồm cả các thuộc tính private và method  

Cú pháp:  
```java
public class OuterClass {
    public class InnerClass{
        
    }
}
```  

## Ưu điểm của inner class  
- Inner class biểu diễn cho một kiểu đặc biệt của mối quan hệ, đó là nó có thể truy cập tất cả các thuộc tính (kể cả private) và phương thức của lớp bên ngoài  
- Inner class được sử dụng để giúp code dễ đọc và dễ bảo trì hơn vì nó nhóm các lớp và các interface một các logic vào trong một nơi.  
- Code tối ưu hóa hơn  

## Phân loại inner class
### Non static inner class  
Non static inner class ngắn gọn là inner class. chúng ta có thể khai báo những inner class này trong một class khác 

- Member Inner Class: Một lớp được tạo ra bên trong một lớp và bên ngoài phương thức.
- Annomynous Inner Class: Một lớp được tạo ra để implements interface hoặc extends class. Tên của nó được quyết định bởi trình biên dịch java.
- Local Inner Class: Một lớp được tạo ra bên trong một phương thức.

### Static inner class  
Static inner class là những class được định nghĩa với từ khóa static. Nó là static member của outer class và do đó chúng ta không cần phải khởi tạo đối tượng của outer class và chính class này để truy cập tới nó.  

- Member Inner Class: Một lớp được tạo ra bên trong một lớp và bên ngoài phương thức.
- Anonymous Inner Class: Một lớp được tạo ra để implements interface hoặc extends class. Tên của nó được quyết định bởi trình biên dịch java.
- Local Inner Class: Một lớp được tạo ra bên trong một phương thức.
- Static Nested Class: Một lớp static được tạo ra bên trong một lớp.
- Nested Interface: Một interface được tạo ra bên trong một lớp hoặc một interface.

Ví dụ: 
```java
public class OuterClass {
    public static class InnerClass{

    }
}
```