## Phương thức là gì?

Một phương thức trong Java là một tập hợp các lệnh mà được nhóm cùng với nhau để thực hiện một hành động nào đó  
Các phương thức liên kết với một class và chúng định nghĩa hoạt động của class đó    
Có thể cung cấp các thông tin cần thiết cho một phương thức hoạt động thông qua tham số truyền vào  
Sử dụng phương thức để tái sử dụng code

## Các loại phương thức  
Dựa vào việc phương thức được định nghĩa bởi người dùng hay có sẵn trong thư viện chuẩn, ta có thể chia ra thành hai loại:  
- Phương thức của thư viện chuẩn
- Phương thức do người dùng tự định nghĩa

 
 ### Phương thức của thư viện chuẩn
Phương thức của thư viện chuẩn là các phương thức được tích hợp trong Java và có thể gọi ra sử dụng. ác thư viện đính kèm với thư viện Class (JCL) trong tệp lưu trữ Java (*.jar) cùng với JVM và JRE.   

Ví dụ như trong các bài trước, để dữ liệu ra console chúng ta đã sử dụng phương thức `println()` nằm trong lớp `PrintStream`    

![println](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/DjaJQhDR)

Hay ví dụ như để tính căn bậc hai, ta cũng sử dụng tới phương thức `sqrt()` nằm trong lớp `Math`  

![sqrt](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/OqeLxUq5)


### Phương thức do người dùng định nghĩa  

Bạn cũng có thể định nghĩa các phương thức bên trong một class theo ý muốn. Các phương thức này được gọi là phương thức do người dùng định nghĩa  

Cú pháp của một phương thức như sau:  

```java
<modifier> <returnType> <nameOfMethod> (parameters){
    //method body
} 
```


Trong đó:  
- `modifier`: Là phạm vi truy cập của phương thức (Các bạn có thể xem chi tiết hơn trong các bài sau)  
- `returnType`: Kiểu dữ liệu trả về, phương thức có thể trả về một giá trị có kiểu dữ liệu nguyên thuỷ như (int, float, char, ...) hoặc kiểu dữ liệu tham chiếu (String,...). Trong trương hợp không trả về dữ liệu nào thì sử dụng `void` (Kiểu trả về của nó là rỗng)  
- `nameOfMethod`: Tên của phương thức  
- `parameters`: Các tham số là giá trị được truyền vào của một phương thức. 
- `method body`: Phần thân của phương thức