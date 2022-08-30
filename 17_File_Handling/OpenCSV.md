## File CSV  
CSV - Comma Separated Values, tức là những giá trị trong tệp được phân tách bởi dấu phẩy. Tuy nhiên, đôi khi những giá trị trong tệp cũng sẽ cách nhau bởi dấu chấm phẩy.  

Đây là tệp chứa dữ liệu dưới dạng văn bản và thường dùng để trao đổi dữ liệu giữa các ứng dụng khác nhau. 

## Thư viên OpenCSV 
`OpenCSV` là một thư viên phân tích cú pháp CSV cho Java. Do Java không hỗ trợ cách để xử lý file CSV do đó chúng ta cần import thêm `OpenCSV` để xử lý các tệp CSV trong Java  

**Import thư viện**  
Đối với maven:  
```java
<dependency>
    <groupId>com.opencsv</groupId>
    <artifactId>opencsv</artifactId>
    <version>5.6</version>
</dependency>
```

Đối với gradle:
```java
compile group: 'com.opencsv', name: 'opencsv', version: '5.6'
```

Hoặc bạn có thể download OpenCSV Jar và đưa nó vàp project của bạn  


**Một số class trong OpenCSV**
| Class | Description | 
| --- | --- | 
| `CSVReader` | Cung cấp các thao tác để đọc file CSV | 
| `CSVWriter` | Hỗ trợ ghi dữ liệu vào file CSV | 
| `CsvToBean` | Chuyển đổi nội dung file CSV sang object | 
| `BeanToCsv` | Xuất file CSV từ ứng dụng Java | 

## Một số ví dụ  
Mình có filer CSV data.csv có nội dung như sau:  

```
name,email,mobile,address
Cullan Bushen,cbushen0@utexas.edu,602-338-7482,Philippines
Tasia Knagges,tknagges1@yellowpages.com,269-891-7180,Mexico
Rupert Fleeming,rfleeming2@yale.edu,658-440-8475,Russia
Brian Hughs,bhughs3@abc.net.au,968-924-5194,Indonesia
Felizio Wardle,fwardle4@irs.gov,948-843-8286,Mongolia
```

```java
public class App 
{
    public static void main( String[] args )
    {
        try {
            FileReader fr = new FileReader("data.csv");

            CSVReader csvReader = new CSVReader(fr);

            String[] records;
            while((records = csvReader.readNext()) != null){
                for (String cell : records) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
```