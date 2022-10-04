## Deque interface là gì?

Deque interface là một collection mà nó hỗ trợ thêm và loại bỏ phần tử ở cả hai đầu. Deque là viết tắt của **Double Ended Queue**.

Nó cung cấp các phương thức cần thiết hỗ trợ việc chèn, truy xuất và loại bỏ các phần tử từ hai đầu.

Ta có thể sử dụng deque như một stack hoặc như một queue

![image](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/c6ji5cc51cof74mrqo6g)

**Các phương thức trong Deque Interface**

- `boolean add(E e)`: Sử dụng để chèn một phần tử được chỉ định vào deque. Nếu thêm thành công trả về `true`
- `boolean offer(E e)`: Sử dụng để chèn một phần tử được chỉ định vòa deque
- `E remove()`: Sử dụng để lấy ra và loại bỏ phần tử đầu tiên trong deque
- `E poll()`: Sử dụng để lấy ra và loại bỏ phần tử đầu tiên trong deque, nếu deque rỗng trả về `null`
- `E element()`: Lấy ra phần tử đầu tiên trong deque
- `E peek()`: Lấy ra phần tử đầu tiên trong deque, nếu deque rỗng trả về `null`

## Class ArrayDeque

![image](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/c6ji5is51cof74mrqo70)

### Đặc điểm của class ArrayDeque

- Deque có thể thêm hoặc xóa phần tử ở cả hai đầu
- Không cho phép chứa phần tử null
- ArrayDeque không an toàn với thread
- ArrayDeque không bị giới hạn dung lượng
- ArrayDeque nhanh hơn LinkedList và Stack

### Triển khai deque

**Sử dụng ArrayDeque như một collection**

```java
package vn.techmaster;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAsCollection {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("John");
        deque.add("Anna");
        deque.add("Victor");
        deque.add("Mike");

        System.out.println(deque);

        System.out.println("Loại bỏ phần tử đầu tiên: " + deque.remove());
        System.out.println(deque);
    }
}
```

Kết quả trả về:

```
[John, Anna, Victor, Mike]
Loại bỏ phần tử đầu tiên: John
[Anna, Victor, Mike]
```

**Sử dụng ArrayDeque như một Queue**

```java
package vn.techmaster;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAsQueue {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("John");
        deque.add("Anna");
        deque.offer("Victor");
        deque.offer("Mike");

        System.out.println(deque);

        System.out.println("Phần tử đầu tiên: " + deque.element());
        System.out.println("Phần tử đầu tiên: " + deque.peek());

        System.out.println("Lấy phần tử đầu tiên và xóa phần tử đó: " +deque.remove());
        System.out.println("Lấy phần tử đầu tiên và xóa phần tử đó: " +deque.poll());
    }
}
```

Kết quả trả về:

```
[John, Anna, Victor, Mike]
Phần tử đầu tiên: John
Phần tử đầu tiên: John
Lấy phần tử đầu tiên và xóa phần tử đó: John
Lấy phần tử đầu tiên và xóa phần tử đó: Anna
```

**Sử dụng ArrayDeque như một Stack**

```java
package vn.techmaster;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAsStack {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.push("John");
        deque.push("Anna");
        deque.push("Victor");
        deque.push("Mike");

        System.out.println(deque);

        System.out.println("Phần tử đầu tiên: " + deque.peek());
        System.out.println("Phần tử sẽ bị xóa: " + deque.pop());

        System.out.println(deque);
    }
}
```

Kết quả trả về:

```
[Mike, Victor, Anna, John]
Phần tử đầu tiên: Mike
Phần tử sẽ bị xóa: Mike
[Victor, Anna, John]
```

### Java ArrayDeque Example: Movie

```java
package vn.techmaster;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        Deque<Movie> movies = new ArrayDeque<>();
        movies.add(new Movie(1, "Red notice", "Rawson Marshall Thurber", "US Movie, Action, Comedies", 117));
        movies.add(new Movie(2, "Annabelle: Comes home", "Gary Dauberman", "US Movie, Horror", 106));
        movies.add(new Movie(3, "Jumanji", "Joe Johnston", "US Movie, Family Movie, Teen Movie", 119));
        movies.add(new Movie(4, "The Amazing Spider-man", "Marc Webb", "Sci-Fi, Action & Adventure, US Movie", 136));

        for(Movie movie: movies){
            System.out.println(movie);
        }
    }
}
```

Kết quả:

```
1 - Red notice - Rawson Marshall Thurber - US Movie, Action, Comedies - 117
2 - Annabelle: Comes home - Gary Dauberman - US Movie, Horror - 106
3 - Jumanji - Joe Johnston - US Movie, Family Movie, Teen Movie - 119
4 - The Amazing Spider-man - Marc Webb - Sci-Fi, Action & Adventure, US Movie - 136
```