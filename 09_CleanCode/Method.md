## Hàm chỉ nên giải quyết một vấn đề  
Đây là quy định quan trọng nhất của kỹ thuật phần mềm. Khi một hàm thực hiện nhiều hơn 1 việc, chúng sẽ trở nên khó khăn hơn để viết code, test, và suy luận. Khi bạn có thể tách biệt một hàm để chỉ thực hiện một hành động, thì sẽ dễ dàng hơn để tái cấu trúc và code của bạn sẽ dễ đọc hơn nhiều. Nếu bạn chỉ cần làm theo hướng dẫn này thôi mà không cần làm gì khác thì bạn cũng đã giỏi hơn nhiều developer khác rồi.  

Không tốt:  
```java
public void emailClients(List<Client> clients) {
    for (Client client : clients) {
        Client clientRecord = repository.findOne(client.getId());
        if (clientRecord.isActive()){
            email(client);
        }
    }
}
```  

Tốt:  
```java
public void emailClients(List<Client> clients) {
    for (Client client : clients) {
        if (isActiveClient(client)) {
            email(client);
        }
    }
}

private boolean isActiveClient(Client client) {
    Client clientRecord = repository.findOne(client.getId());
    return clientRecord.isActive();
}
```

## Tên hàm phải nói ra được những gì chúng làm  
Tên method nên được bắt đầu bằng một động từ hoặc một cụm động từ như postPayment(), deleteUser() , hoặc saveScore(). Các method dùng để access vào các trường trong class thì nên được tên theo tên trường đó và đước trước là set/get. Ví dụ Class User có trường là name. Thì các method để đọc và ghi dữ liệu cho 2 trường này sẽ là setName(...) , getName().

Không tốt:  
```java
private void addToDate(Date date, int month){
    //..
}

Date date = new Date();

// Khó để biết được hàm này thêm gì thông qua tên hàm.
addToDate(date, 1);
```

Tốt:  
```java
private void addMonthToDate(Date date, int month){
    //..
}

Date date = new Date();
addMonthToDate(1, date);
```

## Đối số của hàm  
Giới hạn số lượng tham số của hàm là điều cực kỳ quan trọng bởi vì nó làm cho hàm của bạn trở nên dễ test hơn. Trường hợp có nhiều hơn 3 tham số có thể dẫn tới việc bạn phải test rất nhiều test case khác nhau với những tham số riêng biệt.    
1 hoặc 2 đối số là trường hợp lý tưởng, còn trường hợp 3 đối số thì nên tránh nếu có thể. Những trường hợp khác (từ 3 params trở lên) thì nên được gộp lại. Thông thường nếu có nhiều hơn 2 đối số thì hàm của bạn đang cố thực hiện quá nhiều việc rồi đấy. Trong trường hợp ngược lại, phần lớn thời gian một đối tượng cấp cao sẽ là đủ để làm đối số  

## Xóa code trùng lặp  
Tuyệt đối tránh những dòng code trùng lặp. Code trùng lặp thì không tốt bởi vì nếu bạn cần thay đổi cùng một logic, bạn phải sửa ở nhiều hơn một nơi.

Hãy tưởng tượng nếu bạn điều hành một nhà hàng và bạn theo dõi hàng tồn kho: bao gồm cà chua, hành tây, tỏi, gia vị, vv.... Nếu bạn có nhiều danh sách quản lý, thì tất cả chúng phải được thay đổi khi bạn phục vụ một món ăn có chứa cà chua. Nếu bạn chỉ có 1 danh sách, thì việc cập nhật ở một nơi thôi.

Thông thường, bạn có những dòng code lặp lại bởi vì bạn có 2 hay nhiều hơn những thứ chỉ khác nhau chút ít, mà chia sẻ nhiều thứ chung, nhưng sự khác nhau của chúng buộc bạn phải có 2 hay nhiều hàm riêng biệt để làm nhiều điều tương tự nhau. Xóa đi những dòng code trùng có nghĩa là tạo ra một abstraction có thể xử lý tập những điểm khác biệt này chỉ với một hàm/module hay class.

Có được một abstraction đúng thì rất quan trọng, đó là lý do tại sao bạn nên tuân thủ các nguyên tắc SOLID được đặt ra trong phần Lớp. Những abstraction không tốt có thể còn tệ hơn cả những dòng code bị trùng lặp, vì thế hãy cẩn thận! Nếu bạn có thể tạo ra một abstraction tốt, hãy làm nó! Đừng lặp lại chính mình, nếu bạn không muốn đi cập nhật nhiều nơi bất cứ khi nào bạn muốn thay đổi một thứ gì đó.


## Tránh những ảnh hưởng phụ (Side Effect)

Một hàm tạo ra ảnh hưởng phụ nếu nó làm bất kì điều gì khác hơn là nhận một giá trị đầu vào và trả về một hoặc nhiều giá trị. Ảnh hưởng phụ có thể là ghi một file, thay đổi vài biến toàn cục, hoặc vô tình đưa tất cả tiền của bạn cho một người lạ.

Bây giờ, cũng có khi bạn cần ảnh hưởng phụ trong một chương trình. Giống như ví dụ trước, bạn cần ghi một file. Những gì bạn cần làm là tập trung vào nơi bạn sẽ làm nó. Đừng viết hàm và lớp riêng biệt để tạo ra một file cụ thể. Hãy có một service để viết nó. Một và chỉ một.

Điểm chính là để tránh những lỗi chung như chia sẻ trạng thái giữa những đối tượng mà không có bất kì cấu trúc nào, sử dụng các kiểu dữ liệu có thể thay đổi được mà có thể được ghi bởi bất cứ thứ gì, và không tập trung nơi có thể xảy ra các ảnh hưởng phụ. Nếu bạn có thể làm điều đó, bạn sẽ hạnh phúc hơn so với phần lớn các lập trình viên khác đấy.

Không tốt:  
```java
// Biến toàn cục được tham chiếu bởi hàm dưới đây.
// Nếu chúng ta có một hàm khác sử dụng name, thì biến đó sẽ bị thay đổi theo
static String name = "ryan";

static void upperCaseFirstCharater(){
    name = name.substring(0,1).toUpperCase() + name.substring(1);
}

public static void main(String[] args) {
    upperCaseFirstCharater();
    System.out.println(name);
}
```

Tốt:
```java
static String upperCaseFirstCharater(String name){
    return name.substring(0,1).toUpperCase() + name.substring(1);
}

public static void main(String[] args) {
    String name = "ryan";
    String newName = upperCaseFirstCharater(name);

    System.out.println(name);
    System.out.println(newName);
}
```