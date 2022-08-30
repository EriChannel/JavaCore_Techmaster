## So sánh Array với ArrayList  
| Array | ArrayList | 
| --- | --- | 
| Mảng có kích thước cố định, không thể thay đổi | Kích thước có thể thay đổi được, nếu thêm phần tử vượt quá kích thước hiện có của nó, kích thước của ArrayList sẽ tự động tăng | 
| Có thể lưu trữ dữ liệu kiểu nguyên thủy và kiểu tham chiếu | Chỉ có thể lưu trữ dữ liệu kiểu tham chiếu (Object). Đối với kiểu nguyên thủy thì có thể sử dụng các lớp wrapper để thay thế | 
| Kích thước của mảng có thể kiểm tra bằng thuộc tính `length` | Kích thước của ArrayList kiểm tra bằng phương thức `size()` | 
| Không hỗ trợ kiểu generic | Hỗ trợ kiểu generic | 
| Chỉ có thuộc tính `length` | Có nhiều phương thức để thao tác | 
| Tốc độ lưu trữ và thao tác nhanh hơn | Tốc độ lưu trữ và thao tác chậm hơn |

## Chuyển đổi Array thành ArrayList và ngược lại 
### Chuyển đổi từ Array sang ArrayList  

Trong lớp `Arrays` có phương thức `asList()` được sử dụng để tạo danh sách từ một mảng được chỉ định  

```java
String[] array = {"Java", "JS", "Python", "Ruby"};
List<String> arrayList = new ArrayList<>();
arrayList = Arrays.asList(array);

System.out.println(arrayList);
```  

### Chuyển đổi từ ArrayList sang Array  

Trong ArrayList có phương thức `toArray` được sử dụng để tả về mảng chứa tất cả các phần tử có trong ArrayList ban đầu    

```java
ArrayList<String> arrayList = new ArrayList<>();
arrayList.add("Python");
arrayList.add("Java");
arrayList.add("Ruby");
arrayList.add("C/C++");

String[] array = new String[arrayList.size()];
array = arrayList.toArray(array);
for (String s: array) {
    System.out.println(s);
}
```