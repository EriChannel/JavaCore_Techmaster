## ArrayList là gì?
Lớp ArrayList trong java được sử dụng như một mảng động để lưu trữ các phần tử   

**Những điểm cần ghi nhớ về ArrayList:**
* Lớp ArrayList trong java có thể chứa các phần tử trùng lặp.
* Lớp ArrayList duy trì thứ tự của phần tử được thêm vào.
* Lớp ArrayList là không đồng bộ (non-synchronized).
* Lớp ArrayList cho phép truy cập ngẫu nhiên vì nó lưu dữ liệu theo chỉ mục.
* Lớp ArrayList trong java, thao tác chậm vì cần nhiều sự dịch chuyển nếu bất kỳ phần tử nào bị xoá khỏi danh sách.


## Tạo ArrayList  
**Cú pháp:**
```java
ArrayList<Kiểu dữ liệu> arrayList= new ArrayList<>();
```  

**Ví dụ:**
```// Tạo một ArrayList với kiểu Integer
ArrayList<Integer> numbers = new ArrayList<>();

// Tạo một ArrayList với kiểu String
ArrayList<String> names = new ArrayList<>();
```  

## Constructor của lớp ArrayList  
- `ArrayList()`: Được sử dụng để tạo arraylist trống
- `ArrayList(int initialCapacity)`: Được sử dụng để xây dựng một danh sách mảng mà có dung lượng ban đầu được chỉ định.
- ` ArrayList(Collection c)`: Được sử dụng để xây dựng một danh sách mảng được khởi tạo với các phần tử của collection c


## Phương thức của ArrayList
| Phương thức | Mô tả |
| --- | --- |
| boolean add(Object o) | Được sử dụng để thêm phần tử được chỉ định vào cuối một danh sách |
| void add(int index, Object element) | Được sử dụng để chèn phần tử element tại vị trí index vào danh sách |
| boolean addAll(Collection c) | Được sử dụng để thêm tất cả các phần tử trong collection c vào cuối của danh sách, theo thứ tự chúng được trả về bởi bộ lặp iterator |
| boolean addAll(int index, Collection c) | Được sử dụng để chèn tất cả các phần tử trong collection c vào danh sách, bắt đầu từ vị trí index |
| void retainAll(Collection c) | Được sử dụng để xóa những phần tử không thuộc collection c ra khỏi danh sách |
| void removeAll(Collection c) | Được sử dụng để xóa những phần tử thuộc collection c ra khỏi danh sách |
| int indexOf(Object o) | Được sử dụng để trả về chỉ mục trong danh sách với sự xuất hiện đầu tiên của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này |  
| int lastIndexOf(Object o) | Được sử dụng để trả về chỉ mục trong danh sách với sự xuất hiện cuối cùng của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này |  
| Object[] toArray() | Được sử dụng để trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự |
| Object clone() | Được sử dụng để trả về một bản sao của ArrayList |
| void clear() | Được sử dụng để xóa tất cả các phần tử từ danh sách này | 
| void trimToSize() | Được sử dụng để cắt dung lượng của thể hiện ArrayList này là kích thước danh sách hiện tại | 
| boolean contains(element) | Kết quả trả về là true nếu tìm thấy element trong danh sách, ngược lại trả về false |