## Toán tử số học
Giả sử ta có :
```java
int a = 30;
int b = 10;
```
| Toán tử | Ý nghĩa | Ví dụ |
| --- | --- | --- |
| + | Cộng | a + b = 40 |
| - | Trừ | a - b = 20 |
| * | Nhân | a * b = 300 |
| / | Chia lấy nguyên | a / b = 3 |
| % | Chia lấy dư | a % b = 0 |
| ++ | Tăng 1 | a++ = 31 |
| -- | Giảm 1 | b-- = 9 |

## Toán tử trên bit
Giả sử ta có:
```java
int a = 30; // 00011110
int b = 10; // 00001010
```
| Toán tử | Ý nghĩa | Ví dụ |
| --- | --- | --- |
| & | AND | a & b = 10 (00001010) |
| \| | OR | a \| b = 30 (00010100) |
| ^ | XOR | a ^ b = 20 (00010100) |
| << | Dịch trái | a << 2 = 120 (01111000) |
| >> | Dịch phải | a >> 2 = 7 (111) |
| >>> | Dịch phải và điền 0 vào bit trống | a >>> 2 = 7 (00000111) |
| ~ | Bù bit | ~a = -31 |

## Toán tử quan hệ
Giả sử ta có:
```java
int a = 30;
int b = 10;
```
| Toán tử | Ý nghĩa | Ví dụ |
| --- | --- | --- |
| == | So sánh bằng | a == b => false |
| != | So sánh khác | a != b => true |
| > | So sánh lớn hơn | a > b => true |
| < | So sánh nhỏ hơn | a < b => false |
| >= | So sánh lớn hơn hoặc bằng | a >= b => true |
| <= | So sánh nhỏ hơn hoặc bằng | a <= b => false |

## Toán tử logic
Giả sử ta có:
```java
boolean c = true;
boolean d = false;
```
| Toán tử | Ý nghĩa | Ví dụ |
| --- | --- | --- |
| && | Toán tử và | c && d => false |
| \|\| | Toán tử hoặc | c \|\| d => true |
| ! | Toán tử phủ định | !c => c = false |

## Toán tử gán

| Toán tử | Ý nghĩa | Ví dụ |
| --- | --- | --- |
| = | Toán tử đơn giản, gán giá trị toán hạng bên phải cho toán hạng trái | |
| += | Thêm giá trị toán hạng phải tới toán hạng trái và gán giá trị đó cho toán hạng trái | c += a => c = c + a |
| -= | Trừ đi giá trị toán hạng phải từ toán hạng trái và gán giá trị này cho toán hạng trái | c -= a => a = c - a |
| *= | Nhân giá trị toán hạng phải với toán hạng trái và gán giá trị này cho toán hạng trái | c *= a => c = c * a |
| /= | Chia toán hạng trái cho toán hạng phải và gán giá trị này cho toán hạng phải | c /= a => c = c / a;
| %= | Lấy phần dư của phép chia toán hạng trái cho toán hạng phải và gán cho toán hạng trái | c %= a => c = c % a |
| <<= | Dịch toán hạng trái sang số vị trí là giá trị toán hạng phải | c <<= a => c = c << a |
| >>= | Dịch toán hạng trái sang số vị trí là giá trị toán hạng phải | c >>= a => c = c >> a |
| &= | Phép AND bit | c &= a => c = c & a |
| ^= | Phép OR loại trừ bit | c ^= a => c = c ^ a |
| \|= | Phép OR bit | c \|= a => c = c \| a |

## Toán tử ba ngôi (Ternary Operator)
Toán tử ba ngôi hay còn gọi là toán tử điều kiện, là một toán tử được cấu tạo bởi ba đối số gồm *biểu thức điều kiện*, *kết quả khi điều kiện đúng* và *kết quả khi điều kiện sai*. Kết quả ở đây có thể là một giá trị được trả về, cũng có thể là một xử lý sẽ được thực hiện sau đó tùy thuộc *điều kiện* chỉ định là đúng hay sai.
Cú pháp:
```java
<điều kiện> ? <Biểu thức 1>  : <Biểu thức 2>;
```

Ví dụ:
```java
int a = 4;
int b = 2;

String s = (a % b == 0) ? "a chia hết cho b" : "a không chia hết cho b";
System.out.println(s);
```

Kết quả thực thi:
```
a chia hết cho b
```