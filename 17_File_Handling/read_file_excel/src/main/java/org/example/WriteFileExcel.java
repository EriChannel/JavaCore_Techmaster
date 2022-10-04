package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteFileExcel {

    public static final int COLUMN_INDEX_ID = 0;
    public static final int COLUMN_INDEX_NAME = 1;
    public static final int COLUMN_INDEX_EMAIL = 2;
    public static final int COLUMN_INDEX_MOBILE = 3;
    public static final int COLUMN_INDEX_ADDRESS = 4;

    static List<User> userList = new ArrayList<>();
    static {
        userList.add(new User(1, "Nguyễn Văn A", "a@gmail.com", "01234556789", "Hà Nội"));
        userList.add(new User(2, "Nguyễn Thị B", "b@gmail.com", "01234556789", "Quảng Ninh"));
        userList.add(new User(3, "Trần Thị C", "c@gmail.com", "01234556789", "Hải Phòng"));
        userList.add(new User(4, "Nguyễn Văn D", "d@gmail.com", "01234556789", "Tuyên Quang"));
        userList.add(new User(5, "Hoàng Văn E", "e@gmail.com", "01234556789", "Bắc Ninh"));
        userList.add(new User(6, "Lê Thị F", "f@gmail.com", "01234556789", "Hà Nội"));
    }

    public static void writeExcel(String excelFilePath) throws IOException {
        Workbook workbook = getWorkBook(excelFilePath);
        Sheet sheet = workbook.createSheet("users");

        int rowIndex = 0;
        writeHeader(sheet, rowIndex);

        rowIndex++;
        for(User user : userList){
            Row row = sheet.createRow(rowIndex);
            writeBook(user, row, sheet);
            rowIndex++;
        }

        int numberOfColumn = sheet.getRow(0).getPhysicalNumberOfCells();
        autoSizeColumn(sheet, numberOfColumn);

        OutputStream outputStream = new FileOutputStream(excelFilePath);
        workbook.write(outputStream);
    }

    private static void autoSizeColumn(Sheet sheet, int numberOfColumn) {
        for(int columnIndex = 0; columnIndex < numberOfColumn; columnIndex++){
            sheet.autoSizeColumn(columnIndex);
        }
    }

    private static void writeBook(User user, Row row, Sheet sheet) {
        Cell cell = row.createCell(COLUMN_INDEX_ID);
        cell.setCellValue(user.getId());

        cell = row.createCell(COLUMN_INDEX_NAME);
        cell.setCellValue(user.getName());

        cell = row.createCell(COLUMN_INDEX_EMAIL);
        cell.setCellValue(user.getEmail());

        cell = row.createCell(COLUMN_INDEX_MOBILE);
        cell.setCellValue(user.getMobile());

        cell = row.createCell(COLUMN_INDEX_ADDRESS);
        cell.setCellValue(user.getAddress());
    }

    private static void writeHeader(Sheet sheet, int rowIndex) {
        CellStyle cellStyle = createCellStypeForHeader(sheet);

        Row row = sheet.createRow(rowIndex);
        //Column id
        Cell cell = row.createCell(COLUMN_INDEX_ID);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("ID");

        //Column name
        cell = row.createCell(COLUMN_INDEX_NAME);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("NAME");

        //Column email
        cell = row.createCell(COLUMN_INDEX_EMAIL);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("EMAIL");

        //Column name
        cell = row.createCell(COLUMN_INDEX_MOBILE);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("MOBILE");

        //Column name
        cell = row.createCell(COLUMN_INDEX_ADDRESS);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("ADDRESS");
    }

    private static CellStyle createCellStypeForHeader(Sheet sheet) {
        Font font = sheet.getWorkbook().createFont();
        font.setFontName("Times New Roman");
        font.setBold(true);
        font.setFontHeightInPoints((short) 14);
        font.setColor(IndexedColors.WHITE.getIndex());

        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        cellStyle.setFont(font);
        cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cellStyle.setBorderBottom(BorderStyle.THIN);

        return cellStyle;
    }

    private static Workbook getWorkBook(String excelFilePath) {

        Workbook workbook = null;
        if(excelFilePath.endsWith("xlsx")){
            workbook = new XSSFWorkbook();
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new XSSFWorkbook();

        }else {
            System.out.println("Không đúng định dạng file");
        }

        return workbook;
    }
}
