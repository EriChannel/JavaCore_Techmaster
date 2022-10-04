package org.example;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ReadFileExcel {

    public static final int COLUMN_INDEX_ID = 0;
    public static final int COLUMN_INDEX_NAME = 1;
    public static final int COLUMN_INDEX_EMAIL = 2;
    public static final int COLUMN_INDEX_MOBILE = 3;
    public static final int COLUMN_INDEX_ADDRESS = 4;

    public static List<User> readExcel(String excelFilePath) throws IOException {
        List<User> list = new ArrayList<>();

        File file = new File(excelFilePath);
        InputStream inputStream = Files.newInputStream(file.toPath());

        //Get Workbook

        Workbook workbook = getWorkbook(inputStream, excelFilePath);

        //Sheet sheet = workbook.getSheetAt(0);
        Sheet sheet = workbook.getSheet("data");

        //Get Row
        for(Row nextRow : sheet){
            if(nextRow.getRowNum() == 0){
                //Bỏ qua header
                continue;
            }

            //Get cell
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            User user = new User();
            while (cellIterator.hasNext()){
                Cell cell = cellIterator.next();
                setUser(user, cell);
            }
            list.add(user);
        }
        workbook.close();
        inputStream.close();

        return list;
    }

    private static void setUser(User user, Cell cell) {
        int columnIndex = cell.getColumnIndex();
        Object cellValue = getCellValue(cell);
        switch (columnIndex){
            case COLUMN_INDEX_ID:
                user.setId(BigDecimal.valueOf((double)cellValue).intValue());
                break;
            case COLUMN_INDEX_NAME:
                user.setName((String) cellValue);
                break;
            case COLUMN_INDEX_EMAIL:
                user.setEmail((String) cellValue);
                break;
            case COLUMN_INDEX_MOBILE:
                user.setMobile((String) cellValue);
                break;
            case COLUMN_INDEX_ADDRESS:
                user.setAddress((String) cellValue);
                break;
            default:
                break;
        }
    }

    private static Object getCellValue(Cell cell) {
        CellType cellType = cell.getCellType();

        Object cellValue = null;
        switch(cellType){
            case NUMERIC:
                cellValue = cell.getNumericCellValue();
                break;
            case STRING:
                cellValue = cell.getStringCellValue();
                break;
            default:
                break;
        }

        return cellValue;
    }

    private static Workbook getWorkbook(InputStream inputStream, String excelFilePath) throws IOException {
        Workbook workbook = null;
        if(excelFilePath.endsWith("xlsx")){
            workbook = new XSSFWorkbook(inputStream);
        }else if(excelFilePath.endsWith("xls")){
            workbook = new HSSFWorkbook(inputStream);
        }else{
            System.out.println("File không đúng định dạng");
        }
        return workbook;
    }
}
