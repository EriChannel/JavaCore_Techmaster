package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static final int COLUMN_INDEX_ID = 0;
    public static final int COLUMN_INDEX_NAME = 1;
    public static final int COLUMN_INDEX_DOB = 2;
    public static final int COLUMN_INDEX_GENDER = 3;
    public static final int COLUMN_INDEX_EMAIL = 4;
    public static final int COLUMN_INDEX_MOBILE = 5;


    public static void main( String[] args ) throws IOException {
        List<Person> list = getPerson();
        //list.forEach(i -> System.out.println(i.getName() + " - " + i.getDob()));
        String excelFilePath = "person_excel.xlsx";
        writeExcel(list, excelFilePath);

    }

    private static List<Person> getPerson(){
        List<Person> list = new ArrayList<>();

        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("person.json");
            Type type = new TypeToken<ArrayList<Person>>(){}.getType();

            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



        return list;

    }

    public static void writeExcel(List<Person> list, String excelFilePath) throws IOException {
        Workbook workbook = getWorkBook(excelFilePath);

        Sheet sheet = workbook.createSheet("Person");

        int rowIndex = 0;

        //Write header
        writeHeader(sheet, rowIndex);

        //Write data
        rowIndex++;
        for(Person p : list){
            //Create row
            Row row = sheet.createRow(rowIndex);
            writeBook(p, row, sheet);
            rowIndex++;
        }

        // Auto resize column witdth
        int numberOfColumn = sheet.getRow(0).getPhysicalNumberOfCells();
        autosizeColumn(sheet, numberOfColumn);

        // Create file excel
        createOutputFile(workbook, excelFilePath);
        System.out.println("Done!!!");

    }

    public static Workbook getWorkBook(String excelFilePath){
        Workbook workbook = null;
        if(excelFilePath.endsWith("xlsx")){
            workbook = new XSSFWorkbook();
        }else if(excelFilePath.endsWith("xls")){
            workbook = new HSSFWorkbook();
        }else{
            throw new IllegalArgumentException("Không phải file excel!!!");
        }
        return workbook;
    }

    public static void writeHeader(Sheet sheet, int rowIndex){
        CellStyle cellStyle = createStyleForHeader(sheet);

        Row row = sheet.createRow(rowIndex);

        //Column id
        Cell cell = row.createCell(COLUMN_INDEX_ID);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("ID");

        //Column name
        cell = row.createCell(COLUMN_INDEX_NAME);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("NAME");

        //Column name
        cell = row.createCell(COLUMN_INDEX_DOB);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("DATE OF BIRTH");

        //Column name
        cell = row.createCell(COLUMN_INDEX_GENDER);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("GENDER");

        //Column name
        cell = row.createCell(COLUMN_INDEX_EMAIL);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("EMAIL");

        //Column name
        cell = row.createCell(COLUMN_INDEX_MOBILE);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("MOBILE");
    }

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
        cellStyle.setBorderBottom(BorderStyle.THIN);

        return cellStyle;
    }

    // Write data
    private static void writeBook(Person person, Row row, Sheet sheet) {

        CellStyle cellStyle = cellStyleFormatDate(sheet);

        Cell cell = row.createCell(COLUMN_INDEX_ID);
        cell.setCellValue(person.getId());

        cell = row.createCell(COLUMN_INDEX_NAME);
        cell.setCellValue(person.getName());

        cell = row.createCell(COLUMN_INDEX_DOB);
        cell.setCellStyle(cellStyle);
        cell.setCellValue(person.getDob());


        cell = row.createCell(COLUMN_INDEX_GENDER);
        cell.setCellValue(person.getGender());

        cell = row.createCell(COLUMN_INDEX_EMAIL);
        cell.setCellValue(person.getEmail());


        cell = row.createCell(COLUMN_INDEX_MOBILE);
        cell.setCellValue(person.getMobile());

    }

    private static void autosizeColumn(Sheet sheet, int lastColumn) {
        for (int columnIndex = 0; columnIndex < lastColumn; columnIndex++) {
            sheet.autoSizeColumn(columnIndex);
        }
    }

    // Create output file
    private static void createOutputFile(Workbook workbook, String excelFilePath) throws IOException {
        try (OutputStream os = new FileOutputStream(excelFilePath)) {
            workbook.write(os);
        }
    }

//    public static void writeFooter(Sheet sheet, int rowIndex){
//        Row row = sheet.createRow(rowIndex);
//        Cell cell = row.createCell();
//    }

    public static CellStyle cellStyleFormatDate(Sheet sheet){
        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        CreationHelper helper = sheet.getWorkbook().getCreationHelper();
        cellStyle.setDataFormat(helper.createDataFormat().getFormat("yyyy/MM/dd"));
        return cellStyle;
    }
}
