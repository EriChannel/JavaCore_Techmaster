## FileWriter  
Lớp `FileWriter` được sử dụng để ghi các dữ liệu theo định dạng ký tự vào một file  

Không giống như lớp `FileOutputStream`, khi ghi dữ liệu bạn không cần phải chuyển đổi chuỗi thành mảng byte vì nó cung cấp phương thức để viết chuỗi trực tiếp

```java
public class FileWriter extends OutputStreamWriter
```
nằm trong package `java.io` và kế thừa lớp `OutputStreamWriter` 

### Danh sách constructor

```java
public FileWriter(String fileName) throws IOException

public FileWriter(String fileName, boolean append) throws IOException

public FileWriter(File file) throws IOException

public FileWriter(File file, boolean append) throws IOException 

public FileWriter(FileDescriptor fd)

public FileWriter(String fileName, Charset charset) throws IOException 

public FileWriter(String fileName, Charset charset, boolean append) throws IOException

public FileWriter(File file, Charset charset) throws IOException

public FileWriter(File file, Charset charset, boolean append) throws IOException
```

**Tạo FileWriter sử dụng filename**
```java
String fileName = "c:\temp\test.txt";
FileWriter fw1 = new FileWriter(fileName);
```

**Tạo FileWriter sử dụng File**
```java
File file = new File("c:\temp\test.txt");
FileWriter fw2 = new FileWriter(file);
```

**Chỉ định mã hóa ký tự**  
```java
String fileName = "c:\temp\test.txt";
File file = new File(fileName);
 
FileWriter fw = new FileWriter(file, Charset.forName("UTF8"));
```

### các phương thức thường dùng trong FileWiter  

| Method | Description | 
| --- | --- | 
| `void write(String text)` | Sử dụng để ghi string vào FileWriter | 
| `void write(char c)` | Sử dụng để ghi char vào FileWriter | 
| `void write(char[] c)` | Sử dụng để ghi mảng char vào FileWriter | 
| `void flush()` | Sử dụng để xả dữ liệu của FileWriter | 
| `void close()` | Sử dụng để đóng FileWriter |  


```java
public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "MyFile.txt";
        FileWriter writer = new FileWriter(fileName);
        try {
            writer.write("Welcome");
        }finally {
            writer.close();
        }
    }
}
```

*Lưu ý* : Trong trường hợp file chưa tồn tại, hệ thống sẽ tự động tạo file và tiến hành ghi file