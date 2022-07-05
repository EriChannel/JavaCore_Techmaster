## Lớp Wrapper là gì? 
Lớp wrapper thực chất chỉ là cái tên chung cho rất nhiều lớp khác nhau. Trong Java có 8 kiểu dữ liệu nguyên thuỷ, nên cũng sẽ có 8 lớp wrapper cho từng kiểu nguyên thuỷ này, các lớp đều nằm trong package `java.lang`.     


| Kiểu dữ liệu nguyên thuỷ | Lớp Wrapper tương ứng |   
| --- | --- | 
| byte | Byte | 
| short | Short | 
| int | Integer | 
| long | Long |
| float | Float | 
| double | Double | 
| char | Character | 
| boolean | Boolean |  

## Tác dụng của lớp Wrapper  
Lớp Wrapper giúp chuyển kiểu dữ liệu qua lại giữa kiểu dữ liệu nguyên thuỷ và kiểu dữ liệu tham chiếu   

Ví dụ: 
```java
int age = 25;
Integer i = Integer.valueOf(age);
```


