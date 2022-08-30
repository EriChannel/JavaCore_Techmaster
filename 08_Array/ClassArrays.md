## Class Arrays

Class Arrays nằm trong package `java.util` được sử dụng để thực hiện một số thao tác với mảng như: sao chép, sắp xếp, tìm kiếm,...  

## Một số phương thức của lớp Arrays 

### Phương thức `toString()`
Trả về nội dung mảng dưới dạng chuỗi. Nội dung đó sẽ gồm các phần tử của mảng được nằm trong cặp dấu ngoặc vuông "[]"

```java
int[] intArray = {5,3,9,10,2,1};

String arr = Arrays.toString(intArray);
System.out.println(arr);
```


### Phương thức deepToString()  
Trả về nội dung mảng dưới dạng chuỗi. Nếu mảng được chỉ định chứa các mảng khác như là các phần tử thì nó sẽ trả lại nội dung của các mảng đó.  

```java
int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};
String arr = Arrays.deepToString(array);
System.out.println(arr);
```

### Phương thức sort()
Phương thức `sort()` được sử dụng để sắp xếp các phần tử trong mảng theo thứ tự tăng dần.   
Đối với những phần tử có kiểu dữ liệu nguyên thuỷ thì sử dụng thuật toán `QuickSort` để sắp xếp  
Đối với những phần tử có kiểu dữ liệu tham chiếu thì sử dụng thuật toán `MergeSort`  
Lưu ý: Với kiểu `boolean`không thể áp dụng phương thứ `sort()`  

```java
int[] intArray = {5,3,9,10,2,1};

Arrays.sort(intArray);
System.out.println(Arrays.toString(intArray));
```

### Phương thức binarySearch()  
Phương thức `binarySearch()` được sử dụng để tìm vị trí của phần tử trong mảng bằng cách sử dụng thuật toán tìm kiếm nhị phân. Các phần tử trong mảng phải được sắp xếp trước khi gọi phương thức này. Nếu chưa sắp xếp, kết quả sẽ không chính xác.  

```java
int[] intArray = {5,3,9,10,2,1};

Arrays.sort(intArray);

int findIdx = Arrays.binarySearch(intArray, 10);
System.out.println(findIdx);
```  

### Phương thức fill()
Phương thức `fill()` được sử dụng để gán giá trị xác định cho mỗi phần tử của một mảng. Phương thức này hữu ích trong việc khởi tạo tất cả các phần tử của một mảng với một giá trị

```java
int[] intArray = {5,3,9,10,2,1};

Arrays.fill(intArray, 0);
System.out.println(Arrays.toString(intArray));
```

### Phương thức copyOf()
Phương thức `copyOf()` được sử dụng để sao chép mảng được chỉ định vào mảng mới của cùng một kiểu. Trong khi sao chép, mảng mới có thể được cắt ngắn hoặc có đệm với các giá trị mặc định để nó có chiều dài chỉ định

```java
int[] intArray = {5,3,9,10,2,1};
int[] arrayCopy = Arrays.copyOf(intArray, 10);
System.out.println(Arrays.toString(arrayCopy));
```

### Phương thức copyOfRange()
Phương thức `copyOfRange()` được sử dụng để sao chép một phần của một mảng vào mảng khác cùng kiểu. Trong khi sao chép mảng mới có thể được cắt ngắn hoặc đệm với các giá trị mặc định để có được chiều dài yêu cầu  
```java
int[] intArray = {5,3,9,10,2,1};
int[] arrayCopy = Arrays.copyOfRange(intArray, 1, 3);
System.out.println(Arrays.toString(arrayCopy));
```

### Phương thức equals()
Phương thức `equals()` được sử dụng để so sánh hai mảng có bằng nhau hay không. Phương pháp này lấy hai mảng làm tham số và trả về true nếu cả hai mảng có cùng một số phần tử và các cặp tương ứng của các phần tử của cả hai mảng đều bằng nhau  


```java
int[] intArray = {5,3,9,10,2,1};
int[] arrayCopy = Arrays.copyOf(intArray, 6);
int[] arr = {1,2,3,4,5,6};

System.out.println(Arrays.equals(intArray, arrayCopy));
System.out.println(Arrays.equals(intArray, arr));
```

### Phương thức deepEquals()  
Phương thức `deepequals()` được sử dụng để so sánh hai mảng hai chiều có bằng nhau hay không thay vì phương thức `equals()`. Bởi vì, `deepEquals()` thực hiện so sánh tất cả các phần tử của mảng con của cả hai mảng

```java
int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
int[][] arr2 = {{1,2,3},{4,5,6}};
int[][] arr3 = Arrays.copyOf(arr1, 3);

System.out.println(Arrays.deepEquals(arr1, arr2));
System.out.println(Arrays.deepEquals(arr1, arr3));
```



