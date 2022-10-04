package org.example.service;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.model.Category;
import org.example.model.Product;
import org.example.model.Status;

import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileProduct {

    public static final int COLUMN_INDEX_ID = 0;
    public static final int COLUMN_INDEX_NAME = 1;
    public static final int COLUMN_INDEX_DESCRIPTION = 2;
    public static final int COLUMN_INDEX_CATEGORY = 3;
    public static final int COLUMN_INDEX_BRAND = 4;
    public static final int COLUMN_INDEX_PRICE = 5;
    public static final int COLUMN_INDEX_STATUS = 6;

    public static List<Product> readExcel(String excelFilePath) throws IOException {
        List<Product> listProducts = new ArrayList<Product>();

        File file = new File(excelFilePath);
        InputStream inputStream = Files.newInputStream(file.toPath());

        //workbook
        Workbook workbook = new XSSFWorkbook(inputStream);

        //Sheet
        Sheet sheet = workbook.getSheet("data");

        //Get row

        for (Row nextRow : sheet) {
            if (nextRow.getRowNum() == 0) {
                //Bỏ qua header
                continue;
            }

            //Get cell
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            Product product = new Product();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();

                setProduct(product, cell);
            }
            listProducts.add(product);
        }
        workbook.close();
        inputStream.close();

        return listProducts;

    }

    private static Object getCellValue(Cell cell) {
        CellType cellType = cell.getCellType();

        Object cellvalue = null;
        switch (cellType){
            case NUMERIC:
                cellvalue = cell.getNumericCellValue();
                break;
            case STRING:
                cellvalue = cell.getStringCellValue();
                break;
        }
        return cellvalue;
    }

    private static Category[] getArrayCategory(String categories){
        String[] arr =  categories.split(",");
        Category[] category = new Category[arr.length];
        for(int i = 0; i < arr.length; i++){
            category[i] = Category.valueOf(arr[i]);
        }
        return category;
    }

    private static void setProduct(Product product, Cell cell){
        int columnIndex = cell.getColumnIndex();
        Object cellValue = getCellValue(cell);
        switch (columnIndex){
            case COLUMN_INDEX_ID:
                product.setId(BigDecimal.valueOf((double) cellValue).intValue());
                break;
            case COLUMN_INDEX_NAME:
                product.setName((String) cellValue);
                break;
            case COLUMN_INDEX_DESCRIPTION:
                product.setDescription((String) cellValue);
                break;
            case COLUMN_INDEX_CATEGORY:
                String category = (String) cellValue;
                Category[] arrCategory = getArrayCategory(category);
                product.setCategory(arrCategory);
                break;
            case COLUMN_INDEX_BRAND:
                product.setBrand((String) cellValue);
                break;
            case COLUMN_INDEX_PRICE:
                product.setPrice(BigDecimal.valueOf((double) cellValue).longValue());
                break;
            case COLUMN_INDEX_STATUS:
                String status = (String) cellValue;
                Status s = Status.valueOf(status);
                product.setStatus(s);
                break;
            default:
                break;


        }
    }

//    private static Workbook getWorkBook(InputStream inputStream, String excelFilePath) throws IOException {
//        Workbook workbook = null;
//        if(excelFilePath.endsWith("xlsx")){
//            workbook = new XSSFWorkbook(inputStream);
//        }else if(excelFilePath.endsWith("xls")){
//
//        }
//
//        return workbook;
//    }

}
