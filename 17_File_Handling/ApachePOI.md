## Excel  

Excel là định dạng file rất phổ biến được tạo ra bởi Microsoft. Đây là một trong những phần mềm được sử dụng để ghi lại dữ liệu, trình bày thông tin dưới dạng bảng, tính toán, xử lý thông tin nhanh chóng, chính xác với một lượng dữ liệu lớn.  

## Apache POI  
Apache POI là một thư viện mã nguồn mở Java, được cung cấp bởi Apache. Thư viện này cung cấp các API làm việc với các tài liệu của Microsoft như Word, Excel, Power Point, ...  

**Tổng quan Apache POI Excel**  
Microsoft excel hiện tại có 2 phần mở rộng:  
- `.xls` tương ứng với phiên bản Microsoft Excel 2003 trở về trước. Định dạng này được Apache POI hỗ trợ bởi các lớp Java với tiếp đầu ngữ HSSF  
- `.xlsx` tương ứng với phiên bản Microsoft Excel 2007 trở về sau. Định dạng này được Apache POI hỗ trợ bởi các lớp Java với tiếp đầu ngữ là XSSF, SXSSF  

Apache POI cung cấp các interface Workbook, Sheet, Row, Cell,... và các class tương ứng:  
- `Workbook`: Đại diện cho một file excel. Nó được thể hiện dưới hai class: `HSSFWorkbook`, `XSSFWorkbook` tương ứng cho định dạng `.xls`, `.xlsx`  
- `Sheet`: Đại diện cho một sheet trong file Excel. Nó có 2 class là `HSSFSheet` và `XSSFSheet`  
- `Row`: Đại diện cho một hàng trong sheet. Nó có 2 class là `HSSFRow` và `XSSFRow`
- `Cell`: Đại diện cho một ô trong một hàng. Tương tự nó cũng có 2 class là `HSSFCell` và `XSSFCell`  

## Khai báo thư viện Apache POI  
Khi sử dụng maven để quán lý project Java:  

```java
<!-- Excel 2003 (.xls) -->
<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.2</version>
</dependency>

<!-- Excel 2007 (.xlsx) -->
<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.2</version>
</dependency>
```

## Thao tác với file Excel sử dụng Apache POI  
### Workbook  
Tạo `Workbook`  
```java
Workbook wb2003 = new HSSFWorkbook();
Workbook wb2007 = new XSSFWorkbook();
```

Tạo `Workbook` từ file excel có sẵn  
```java
String fileExcel2003 = "path/books.xls";
Workbook wb2003 = new HSSFWorkbook(fileExcel2003);
 
String fileExcel2007 = "path/books.xlsx";
Workbook wb2007 = new XSSFWorkbook(fileExcel2007);
```  

### Sheet  
Tạo `Sheet` mới  
```java
// Tạo sheet với tên mặc định Sheet0
Sheet sheet = wb2003.createSheet(); 
Sheet sheet = wb2007.createSheet(); 
 
// Tạo sheet với tên MySheetName
String safeName = WorkbookUtil.createSafeSheetName("MySheetName");
Sheet sheet = wb2003.createSheet(safeName);
Sheet sheet = wb2007.createSheet(safeName);
```

Tạo `Sheet` từ file excel có sẵn  
```java
// Lấy sheet theo index
// Lấy sheet thứ nhất (index = 0)
/*
getSheetAt(index) sẽ throw IllegalArgumentException nếu index < 0 hoặc index >= totalSheet
*/
Sheet sheet = wb2003.getSheetAt(0);
Sheet sheet = wb2007.getSheetAt(0);
 
// Lấy sheet theo tên Sheet
/*
getSheet(sheetName) sẽ trả về NULL nếu sheet không tồn tại
*/
Sheet sheet = wb2003.getSheet("MySheetName");
Sheet sheet = wb2007.getSheet("MySheetName");
```

### Row  
Tạo `Row`  
```java
Row row = sheet.createRow(rowIndex);
```

Tạo `Row` từ Sheet có sẵn  
```java
Row row = sheet.getRow(rowIndex);
```

*Lưu ý*: `getRow(rowIndex)` sẽ trả về `null` nếu không tồn tại rowIndex  

### Cell
Tạo `Cell`
```java
Cell cell = row.createCell(columnIndex);
//Hoặc
Cell cell = row.createCell(columnIndex, CellType.FORMULA);
```  

Tạo `Cell` từ Row có sẵn
```java
Cell cell = row.getCell(columnIndex);
```

*Lưu ý*: `getCell(columnIndex)` sẽ trả về `null` nếu không tồn tại column tại columnIndex    

Gán giá trị cho `Cell`  
```java
cell.setCellValue(stringValue);
cell.setCellValue(numberValue);
 
// Gán giá trị là một công thức Excel (lưu ý: không có dấu = trong công thức)
cell.setCellFormula("SUM(E2:E6)");
```

Lấy giá trị của `Cell`  
```java
boolean value = cell.getBooleanCellValue();
double value = cell.getNumericCellValue();
String value = cell.getStringCellValue();
 
// Get Formula value
Workbook workbook = cell.getSheet().getWorkbook();
FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
double value = evaluator.evaluate(cell).getNumberValue();
 
// ...
```

Tự động điều chỉnh độ rộng của cột vừa đủ để hiển thị đầy đủ nội dung
```java
for (int columnIndex = 0; columnIndex < lastColumn; columnIndex++) {
    sheet.autoSizeColumn(columnIndex);
}
```

*Lưu ý*: `autoSizeColumn()` xử lý khá chậm, do đó chỉ sử dụng sau khi đã hoàn thành xử lý đỗ dữ liệu hoặc chỉ sử dụng khi cần thiết

### CellStyle
CellStyle được sử dụng để format các dữ liệu xuất ra của file excel chẳng hạn: font chữ, màu sắc, border, format chữ số thập phân, ..
```java
// Tạo định dạng: font Times New Roman, in đậm, font-size 14, chữ màu trắng
Font font = sheet.getWorkbook().createFont();
font.setFontName("Times New Roman");
font.setBold(true);
font.setFontHeightInPoints((short) 14); // font size
font.setColor(IndexedColors.WHITE.getIndex()); // text color
 
// Tạo cell style áp dụng font ở trên
// Sử dụng màu nền xanh (Blue), định dạng border dưới 
CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
cellStyle.setFont(font);
cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
cellStyle.setBorderBottom(BorderStyle.THIN);
 
// Áp dụng định dạng CellStyle cho một Cell
cell.setCellStyle(cellStyle);
```
Ví dụ định dạng format hiển thị số:  
```java
// Tạo format số
short format = (short)BuiltinFormats.getBuiltinFormat("#,##0");
 
// hoặc 
DataFormat df = workbook.createDataFormat();
short format = df.getFormat("#,##0");
 
// Tạo CellStyle với format số
CellStyle cellStyle = workbook.createCellStyle();
cellStyle.setDataFormat(format);
 
// Áp dụng định dạng CellStyle cho một Cell
cell.setCellStyle(cellStyle);
```