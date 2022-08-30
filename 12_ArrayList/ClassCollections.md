## Lớp Collections
Lớp `Collections` trong Java bao gồm các phương thức static được sử dụng để thao tác trên các đối tượng của Collection như ArrayList, LinkedList, Set,...  

Những điểm quan trọng của lớp `Collections`:  
- Lớp Collection hỗ trợ các polymorphic algorithms hoạt động hoạt động trên các collection  
- Lớp `Collections` sẽ ném ra ngoại lệ `NullPointerException` nếu các collection hoặc các đối tượng lớp cung cấp cho chúng là null

## Một số phương thức của lớp Collections  

| Method | Description | 
| --- | --- |
| `static <T extends Comparable<? super T>> void sort(List<T> list)` | Sắp xếp danh sách được chỉ định theo thứ tự tăng dần | 
| `static <T> void sort(List<T> list, Comparator<? super T> c)` | Sắp xếp danh sách được chỉ định theo thứ tự được tạo ra bởi Comparator | 
| `static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)` | Tìm kiếm đối tượng được chỉ định trong list dựa vào thuật toán tìm kiếm nhị phân | 
| `static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c)` | Tìm kiếm danh sách được chỉ định cho đối tượng được chỉ định sử dụng thuật toán tìm kiếm nhị phân. Các phần tử so sánh dựa vào bộ so sánh comparator đã cung cấp | 
| `static <T> T get(ListIterator<? extends T> i, int index)` | Tìm kiếm đối tượng được chỉ định trong list dựa vào thuật toán tìm kiếm nhị phân. Các phần tử được so sánh dựa vào comparator đã cung cấp |  
| `static <T> T get(ListIterator<? extends T> i, int index)` | Lấy ra phần tử thứ i từ danh sách đã cho |  
| `static void reverse(List<?> list)` | Đảo ngược thứ tự của các phần tử trong danh sách được chỉ định | 
| `static void shuffle(List<?> list)` | Hóan đổi ngẫu nhiên danh sách đã được chỉ định, sử dụng nguồn xác định ngẫu nhiên mặc định |  
| `static void shuffle(List<?> list, Random rnd)` | Hoán đổi ngẫu nhiên danh sách đã được chỉ định, sử dụng nguồn xác định ngẫu nhiên cung cấp |
| `static void swap(List<?> list, int i, int j)` | Hoán đổi các phần tử ở các vị trí được chỉ định trong danh sách được chỉ định |  
| `static void swap(Object[] arr, int i, int j)` | Hoán đổi hai phần tử được chỉ định trong mảng được chỉ định |
| `static <T> void fill(List<? super T> list, T obj)`| Thay thế tất cả các phần tử của danh sách list được chỉ định bằng phần tử obj được chỉ định |
| `static <T> void copy(List<? super T> dest, List<? extends T> src)` | Sao chép tất cả các phần tử từ một danh sách này sang một danh sách khác | 
| `static <T extends Object & Comparable<? super T>> T min(Collection<? extends T> coll)` | Trả về phần tử nhỏ nhất của Collection, theo trật tự tự nhiên của các phần tử |  
| `static <T> T min(Collection<? extends T> coll, Comparator<? super T> comp)` | Trả về phần tử nhỏ nhất của Collection đã cho, theo thứ tự bởi bộ so sánh được chỉ định | 
| `static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll)` | Trả về phần tử lớn nhất của Collection, theo trật tự tự nhiên của các phần tử |  
| `static <T> T max(Collection<? extends T> coll, Comparator<? super T> comp)` | Trả về phần tử lớn nhất của Collection đã cho, theo thứ tự bởi bộ so sánh được chỉ định | 
| `static void rotate(List<?> list, int distance)` | Xoay các phần tử trong danh sách được chỉ định theo khoảng cách chỉ định | 
| `static <T> boolean replaceAll(List<T> list, T oldVal, T newVal)` | Thay thế tất cả các lần xuất hiện của một giá trị được chỉ định trong danh sách với một giá trị mới | 
| `static int indexOfSubList(List<?> source, List<?> target)` | Trả về vị trí bắt đầu của lần xuất hiện đầu tiên của List `target` trong List `source` hoặc -1 nếu không xuất hiện | 
| `static int lastIndexOfSubList(List<?> source, List<?> target)` | rả về vị trí bắt đầu của lần xuất hiện cuối cùng của List `target` trong List `source` hoặc -1 nếu không xuất hiện |

