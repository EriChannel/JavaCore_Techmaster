## Map interface là gì?

![image](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/c6dh7b451co50fuc8e10)

Map interface nằm trong gói java.util. Nó được sử dụng để lưu một cặp giá trị `key-value`. Key là giá trị duy nhất tương ứng với một value

**Các phương thức trong Map interface**

- `Object put(Object key, Object value)`: Thêm đối tượng được chỉ định vào map
- `void putAll(Map map)`: Thêm một map được chỉ định vào map hiện tại
- `Object remove(Object key)`: Xóa đối tượng được chỉ định dựa vào `key`
- `Object get(Object key)`: Lấy ra đối tượng được chỉ định dựa vào `key`
- `boolean containsKey(Object key)`: Kiểm tra `key` được chỉ định có tồn tại trong map hay không
- `Set keySet()`: Trả đối tượng `set` có chứa tất cả các `key`
- `Set entrySet()`: Trả đối tượng `set` có chứa `key` và `value`

## Map.Entry interface

Entry là một interface con của Map. Vì vậy, chúng ta có thể truy cập nó bằng tên Map.Entry. Nó cung cấp các phương thức để truy xuất `key` và `value`

## Triển khai Map interface

### HashMap

HashMap là một phần trong java collections. Nó cung cấp triển khai cơ bản của Map interface. Được sử dụng để lưu trữ dữ liệu theo cặp `key-value`. Để truy cập một giá trị, ta phải biết `key` của nó.

HashMap sử dụng một kỹ thuật được gọi là hashing. Hashing là một kỹ thuật chuyển đổi một chuỗi lớn thành chuỗi nhỏ đại diện cho cùng một chuỗi. Giá trị ngắn hơn giúp lập chỉ mục và tìm kiếm nhanh hơn.

Hãy xem ví dụ dưới đây:

```java
package vn.techmaster;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Khởi tạo map. key là các giá trị kiểu Integer, value là các giá trị kiểu String
        Map<Integer, String> map = new HashMap<>();

        //Thêm phần tử vào map
        map.put(5, "Anna");
        map.put(1, "John");
        map.put(7, "Chris");
        map.put(4, "Ryan");

        System.out.println("Map vừa tạo: ");
        //Sử dụng Map.Entry
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " +entry.getValue());
        }

        //Thêm 1 phần tử trùng key
        map.put(4, "Scarlett");
        System.out.println("Thêm phần tử trùng key: ");
        System.out.println(map);

        //Loại bỏ phần tử
        map.remove(5);
        System.out.println("Map sau khi loại bỏ phần tử: ");
        System.out.println(map);
    }
}
```

Kết quả:

```
Map vừa tạo:
1 - John
4 - Ryan
5 - Anna
7 - Chris
Thêm phần tử trùng key:
{1=John, 4=Scarlett, 5=Anna, 7=Chris}
Map sau khi loại bỏ phần tử:
{1=John, 4=Scarlett, 7=Chris}
```

Có thể thấy khi thêm phần tử vào map, thứ tự thêm không được duy trì mà sẽ được sắp xếp tăng dần theo `key`. Ngoài ra, khi thêm một phần tử bị trùng `key`, sẽ không có phần tử mới được thêm, thay vào đó phần tử có cùng `key` sẽ bị thay thế bằng phần tử mới thêm. Ta có thể áp dùng để chỉnh sửa phần tử cho map

### LinkedHashMap

LinkedHashMap cũng tương tự HashMap nhưng nó được bổ sung tính năng là duy trì thứ tự chèn vào map. HashMap có lợi thế là chèn, tìm kiếm và xóa nhanh chóng nhưng nó không bao giờ duy trì thứ tự chèn. Khi muốn duy trì thứ tự chèn ta có thể sử dụng LinkedHashMap

Hãy xem ví dụ dưới đây:

```java
package vn.techmaster;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Khởi tạo map. key là các giá trị kiểu Integer, value là các giá trị kiểu String
        Map<Integer, String> map = new LinkedHashMap<>();

        //Thêm phần tử vào map
        map.put(5, "Java");
        map.put(1, "HTML/CSS");
        map.put(7, "Python");
        map.put(4, "C/C++");

        System.out.println("Map vừa tạo: ");
        //Sử dụng Map.Entry
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " +entry.getValue());
        }

        //Thêm 1 phần tử trùng key
        map.put(1, "Ruby");
        System.out.println("Thêm phần tử trùng key: ");
        System.out.println(map);

        //Loại bỏ phần tử
        map.remove(5);
        System.out.println("Map sau khi loại bỏ phần tử: ");
        System.out.println(map);

    }
}
```

Kết quả:

```
Map vừa tạo:
5 - Java
1 - HTML/CSS
7 - Python
4 - C/C++
Thêm phần tử trùng key:
{5=Java, 1=Ruby, 7=Python, 4=C/C++}
Map sau khi loại bỏ phần tử:
{1=Ruby, 7=Python, 4=C/C++}
```

Vậy với kết quả trả về của ví dụ trên, ta thấy thứ tự chèn của LinkedhashMap là không thay đổi.

### TreeMap

TreeMap được sử dụng để triển khai Map interface và NavigableMap. TreeMap sắp xếp các phần tử theo thứ tự tự nhiên dựa vào `key` hoặc bởi Comparator được cung cấp tại thời điểm map được tạo, tùy vào constructor nào được sử dụng

hãy xem ví dụ dưới đây:

```java
package vn.techmaster;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<Integer, String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        //Thêm phần tử vào map
        map.put(5, "Ford");
        map.put(1, "Suzuki");
        map.put(7, "Mercedes");
        map.put(4, "Mazda");

        System.out.println("Map vừa tạo: ");
        //Sử dụng Map.Entry
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " +entry.getValue());
        }

        //Thêm 1 phần tử trùng key
        map.put(1, "Vinfast");
        System.out.println("Thêm phần tử trùng key: ");
        System.out.println(map);

        //Loại bỏ phần tử
        map.remove(5);
        System.out.println("Map sau khi loại bỏ phần tử: ");
        System.out.println(map);

    }
}
```

Kết quả trả về:

```
Map vừa tạo:
7 - Mercedes
5 - Ford
4 - Mazda
1 - Suzuki
Thêm phần tử trùng key:
{7=Mercedes, 5=Ford, 4=Mazda, 1=Vinfast}
Map sau khi loại bỏ phần tử:
{7=Mercedes, 4=Mazda, 1=Vinfast}
```

Với ví dụ trên, thay vì để map sắp xếp theo thứ tự tự nhiên, mình sắp xếp dựa Comparator được cung cấp trong thời điểm map được tạo. Do đó, map được sắp xếp với `key` giảm dần
