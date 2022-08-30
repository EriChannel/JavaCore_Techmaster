package org.example;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileExcel {
    static final int COLUMN_INDEX_ROW_NUMBER = 0;
    static final int COLUMN_INDEX_NAME = 1;
    static final int COLUMN_INDEX_DOB = 2;
    static final int COLUMN_INDEX_GENDER = 3;
    static final int COLUMN_INDEX_MATH = 4;
    static final int COLUMN_INDEX_PHYSICS = 5;
    static final int COLUMN_INDEX_CHEMISTRY = 6;
    static final int COLUMN_INDEX_LITERATURE = 7;
    static final int COLUMN_INDEX_AVG = 8;
    static final int COLUMN_INDEX_CLASSIFICATION = 9;

    public static Workbook getWorkbook(String excelFilePath) {
        Workbook workbook = null;
        if(excelFilePath.endsWith("xlsx")){
            workbook = new XSSFWorkbook();
        }else if(excelFilePath.endsWith("xls")){
            workbook = new HSSFWorkbook();
        }else {
            throw new IllegalArgumentException("Không đúng định dạng file excel!!!");
        }
        return workbook;
    }

    public static void writeHeader(Sheet sheet, int rowIndex){
        //Tạo CellStyle
        CellStyle cellStyle = createStyleForHeader(sheet);

        //Tạo row
        Row row = sheet.createRow(rowIndex);

        //Cột STT
        Cell cell = row.createCell(COLUMN_INDEX_ROW_NUMBER);
        cell.setCellValue("STT");
        cell.setCellStyle(cellStyle);

        //Cột Họ và tên
        cell = row.createCell(COLUMN_INDEX_NAME);
        cell.setCellValue("Họ và tên");
        cell.setCellStyle(cellStyle);

        //Cột Ngày sinh
        cell = row.createCell(COLUMN_INDEX_DOB);
        cell.setCellValue("Ngày sinh");
        cell.setCellStyle(cellStyle);

        //Cột giới tính
        cell = row.createCell(COLUMN_INDEX_GENDER);
        cell.setCellValue("Giới tính");
        cell.setCellStyle(cellStyle);

        //Cột Toán
        cell = row.createCell(COLUMN_INDEX_MATH);
        cell.setCellValue("Toán học");
        cell.setCellStyle(cellStyle);

        //Cột Vật lý
        cell = row.createCell(COLUMN_INDEX_PHYSICS);
        cell.setCellValue("Vật lý");
        cell.setCellStyle(cellStyle);

        //Cột Hóa học
        cell = row.createCell(COLUMN_INDEX_CHEMISTRY);
        cell.setCellValue("Hóa học");
        cell.setCellStyle(cellStyle);

        //Cột Văn học
        cell = row.createCell(COLUMN_INDEX_LITERATURE);
        cell.setCellValue("Văn học");
        cell.setCellStyle(cellStyle);

        //Cột Điểm TB
        cell = row.createCell(COLUMN_INDEX_AVG);
        cell.setCellValue("Điểm TB");
        cell.setCellStyle(cellStyle);

        //Cột Học lực
        cell = row.createCell(COLUMN_INDEX_CLASSIFICATION);
        cell.setCellValue("Học lực");
        cell.setCellStyle(cellStyle);
    }

    //Tạo CellStyle cho header
    public static CellStyle createStyleForHeader(Sheet sheet){
        Font font = sheet.getWorkbook().createFont();
        font.setFontName("Times New Roman");
        font.setBold(true);
        font.setFontHeightInPoints((short) 14);
        font.setColor(IndexedColors.WHITE.getIndex());

        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        cellStyle.setFont(font);
        cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setBorderBottom(BorderStyle.THIN);

        return cellStyle;
    }

    public static void createOutputFile(Workbook workbook, String excelFilePath) throws IOException {
        try (OutputStream os = new FileOutputStream(excelFilePath)) {
            workbook.write(os);
        }
    }

    public static void autosizeColumn(Sheet sheet, int lastColumn) {
        for (int columnIndex = 0; columnIndex < lastColumn; columnIndex++) {
            sheet.autoSizeColumn(columnIndex);
        }
    }
}
