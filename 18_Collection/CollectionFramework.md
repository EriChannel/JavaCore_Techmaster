Java Collections đề cập đến một tập hợp các đối tượng riêng lẻ được biểu diễn như một đơn vị duy nhất. Bạn có thể thực hiện tất cả các thao tác như tìm kiếm, sắp xếp, chèn, xóa,... trên Java Collections giống như bạn thao tác với dữ liệu.

Trong bài viết này, chúng ta sẽ tìm hiểu từng khía cạnh của Java Collections.

## Java Collection Framework là gì?

Java Collection Framework cung cấp một kiến trúc để lưu trữ và thao tác với một nhóm đối tượng. Một Java Collection Framework bao gồm:

- `Interfaces`: Interface trong Java đề cập đến các kiểu dữ liệu trừu tượng. Chúng cho phép Java collections được thao tác độc lập với các biểu diễn của chúng. Ngoài ra, chúng tạo thành một hệ thống phân cấp trong ngôn ngữ lập trình hướng đối tượng.
- `Classes`: Các lớp trong Java là sự triển khai của collection interface. Nó đề cấp đến các cấu trúc dữ liệu được sử dụng lặp đi lặp lại.
- `Algorithm`: Thuật toán đề cập đến các phương pháp được sử dụng để thực hiện các hoạt động như tìm kiếm và sắp xếp trên đối tượng triển khai của collection interface. Các thật toán có bản chất đa hình vì cùng một phương pháp có thể sử dụng được nhiều dạng hoặc bạn có thể nói có nhiều cách triển khai khác nhau của java collection interface

## Cấu trúc phân cấp Java Collection Framework

Java Collection Framework bao gồm các interface và các lớp. Bây giờ, chúng ta hãy xem hệ thống phân cấp java collection framework.

![image](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/c5rmgv451co8fjggubp0)

![image](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/c5rmh3k51co8fjggubpg)

Trong hai hình trên, phần màu xanh đề cập đến các interface khác nhau và phần màu vàng xác định lớp.

Ngoài các collections, framework còn xác định Map interface và class. Maps lưu trữ các cặp key/value. Mặc dù chúng không phải là collections, nhưng chúng được tích hợp đầy đủ với các collections.

### Collection interfaces

Trong collection interface chúng ta có các interface chính như: List interface, Set, SortedSet, Map và SortedMap. Giờ hãy cùng tìm hiểu tổng quan về các interface đó:

- `List interface`: Các phần tử trong List interface được sắp xếp có thứ tự và có thể có giá trị giống nhau.
- `Set`: Các phần tử trong Set là duy nhất, không chứa các phần tử chùng lặp.
- `SortedSet`: Là một dạng riêng của Set interface, trong đó các giá trị của các phần tử mặc định được sắp xếp tăng dần.
- `Map`: Lưu trữ các cặp key/value, key của các phần tử này là duy nhất,
- `SortedMap`: Là một dạng riêng của Map interface, trong đó key được sắp xếp theo thứ tự tăng dần.

### Class Collections

Java cung cấp một tập hợp các lớp tiêu chuẩn dùng để triển khai các interface collection. Trong class collections chúng ta có rất nhiều loại, giờ hãy cùng tìm hiểu tổng quan về từng loại:

- `AbstractCollection`: Triển khai hầu hết collection interface
- `AbstractList`: kế thừa từ AbstractCollection và implements hầu hết List interface
- `AbstractSequentialList`: Extends AbstractList, được sử dụng để triển khai một list không thể sửa đổi, truy cập tuần tự.
- `LinkedList`: Là 1 cấu trúc dữ liệu lưu trữ các phần tử dưới dạng danh sách. Các phần tử trong LinkedList được sắp xếp có thứ tự và có thể có giá trị giống nhau.
- `ArrayList`: Là kiểu danh sách sử dụng cấu trúc mảng để lưu trữ phần tử. Thứ tự các phần tử dựa theo thứ tự lúc thêm vào và giá trị của các phần tử này có thể trùng nhau.
- `AbstractSet`: extends AbstractCollection và implements hầu hết Set interface
- `HashSet`: Extends AbstractSet để sử dụng với bảng băm
- `AbstractSet`: Extends HashSet cho phép lặp lại thứ tự chèn
- `TreeSet`: Implements một tập hợp được lưu trữ bởi tree. Extends AbstractSet
- `AbstractMap`: Implements hầu hết Map interfaces
- `HashMap`: Extends AbstractMap để sử dụng bảng băm
- `TreeMap`: Extends AbstractMap để sử dụng tree
- `WeakHashMap`: Extends AbstractMap để sử dụng bảng băm với các khóa yếu.
- `LinkedHashMap`: Extends HashMap, cho phép lặp lại thứ tự chèn
- `IdentityHashMap`: Extends AbstractMap

### Collection Algorithms

Collection framework xác định một số thuật toán có thể được áp dụng cho collections và maps. Các thuật toán này được định nghĩa là các phương thức static trong class Collections

## Sử dụng Iterator

Khi muốn duyệt qua các phần tử của một đối tượng nào đó thì thông thường chúng ta hay sử dụng các loại vòng lặp như for, while hoặc do - while. Nhưng đối với Collections thì chúng ta sử dụng một cách mới để duyệt qua các phần tử của một Collection đó là Iterator.

Đối với Collections, Iterator là một Interface cung cấp một số các phương thức để duyệt (lặp) qua các phần tử của bất kỳ tập hợp nào. Ngoài ra, Iterator còn có khả năng xóa những phần tử của một tập hợp trong quá trình lặp.

