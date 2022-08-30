## Toán tử 3 ngôi

Toán tử 3 ngôi hay còn được gọi là toán tử điều kiện, là một toán tử đặc biệt vì nó gồm ba thành phần cấu thành   

### Cú pháp  

```java
<Biến> = <Điều kiện> ? <Biểu thức 1> : <Biểu thức 2>;
```

Nếu `<Điều kiện>` đúng thì thức hiện `<Biểu thức 1>`, ngược lại thực hiện `<Biểu thức 2>`  

Trong đó: 
- Điều kiện: Là một biểu thức logic, trả về giá trị `true` hoặc `false`  
- `<Biểu thức 1>`, `<Biểu thức 2>`: Có thể là giá trị, biểu thức hoặc hành động  

## Một số ví dụ

### Kiểm tra chẵn lẻ  

Sử dụng `if else`
```java
int x = 10;
if (x % 2 == 0) {
    System.out.println(x + " là số chẵn");
} else {
    System.out.println(x + " là số lẻ");
}
```

Sử dụng toán tử 3 ngôi  
```java
int x = 10;
String result = x % 2 == 0 ? x + " là số chẵn" : x + " là số lẻ";
System.out.println(result);
```  

### Chỉ số bmi  

Cho phương thức tính chỉ số bmi như sau:  

```java
public static float bmiCalculator(float height, float weight){
    return weight/(height*height);
}
```  

Sử dụng `if else`  
```java
float weight = 60;
float height = 1.5f;
float bmi = bmiCalculator(height, weight);

if(bmi < 18.5){
    System.out.println("Bạn gầy");
}else if(bmi >= 18.5 && bmi <= 22.5){
    System.out.println("Bạn bình thường");
}else{
    System.out.println("Bạn thừa cân");
}
```

Sử dụng toán tử 3 ngôi 
```java
float weight = 60;
float height = 1.5f;
float bmi = bmiCalculator(height, weight);  

String rs = bmi < 18.5 ? "Bạn gầy" : bmi > 22.5 ? "Bạn thừa cân" : "Bạn bình thường";
System.out.println(rs);
```