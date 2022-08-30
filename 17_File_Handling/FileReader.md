## FileReader  
Class `FileReader` trong Java được sử dụng để đọc dữ liệu từ file. Nó trả về dữ liệu theo định dạng byte.   
Đây là lớp character-oriented được sử dụng để sử lý file trong Java  
Nằm trong package `java.io`, kế thừa class `InputStreamReader`  
```java
public class FileReader extends InputStreamReader
```

Lớp này không có thêm các phương thức nào ngoài các phương thức được thừa kế từ lớp `InputStreamReader`.  

### Danh sách constructor

```java
public FileReader(String fileName) throws FileNotFoundException

public FileReader(File file) throws FileNotFoundException

public FileReader(FileDescriptor fd) 

public FileReader(String fileName, Charset charset) throws IOException  

public FileReader(File file, Charset charset) throws IOException 
```  

Các constructor có tham số `Charset` được thêm vào từ phiên bản Java 11. Hầy hết các constructor đều `throws` ngoại lệ  


**Tạo `FileReader` sử dụng filename**

```java
String fileName = "c:\temp\test.txt";
FileReader input = new FileReader(fileName);
```  

**Tạo `FileReader` sử dụng File**
```java
File file = new File("c:\temp\test.txt");
FileReader input = new FileReader(file);
```

**Chỉ định mã hóa ký tự**  
```java
FileReader input = new FileReader(fileName, Charset.forName("UTF8"));

//or 

FileReader input = new FileReader(file, Charset.forName("UTF8"));
```

### Các phương thức thường dùng của lớp FileReader

| Method | Description | 
| --- | --- | 
| `int read()` | Nó được sử dụng để trả về một ký tự trong mẫu ASCII. Nó trả về -1 vào cuối tập tin|
| `void close()` | Sử dụng để đóng lớp `FileReader` | 

```java
public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "MyFile.txt";
        FileReader reader = new FileReader(fileName);
        try {
            int i;
            while ((i = reader.read()) != -1){
                System.out.println((char)i);
            }
        }finally {
            reader.close();
        }
    }
}
```
