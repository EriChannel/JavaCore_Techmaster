package org.example.repository;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.model.Category;
import org.example.model.Product;
import org.example.model.Status;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetDataFromExcel {

    public static final int COLUMN_INDEX_ID = 0;
    public static final int COLUMN_INDEX_NAME = 1;
    public static final int COLUMN_INDEX_DESCRIPTION = 2;
    public static final int COLUMN_INDEX_COLOR = 3;
    public static final int COLUMN_INDEX_CATEGORY = 4;
    public static final int COLUMN_INDEX_BRAND = 5;
    public static final int COLUMN_INDEX_PRICE = 6;
    public static final int COLUMN_INDEX_STATUS = 7;


    public static List<Product> readFile(String excelFilePath) throws IOException {
        List<Product> productList = new ArrayList<>();
        File file = new File(excelFilePath);
        InputStream inputStream = Files.newInputStream(file.toPath());

        //Do đuôi file là .xlsx nên sử dụng XSSFWorkbook
        Workbook workbook = new XSSFWorkbook(inputStream);

        Sheet sheet = workbook.getSheet("data");

        for(Row nextRow : sheet){
            if(nextRow.getRowNum() == 0) continue;

            Iterator<Cell> cellIterator = nextRow.cellIterator();
            Product product = new Product();
            while (cellIterator.hasNext()){
                Cell cell = cellIterator.next();
                setProduct(product, cell);
            }
            productList.add(product);
        }
        workbook.close();
        inputStream.close();
        return productList;
    }

    private static void setProduct(Product product, Cell cell) {
        int columnIndex = cell.getColumnIndex();
        Object cellValue = getCellValue(cell);
        switch(columnIndex){
            case COLUMN_INDEX_ID:
                product.setId(BigDecimal.valueOf((double) cellValue).intValue());
                break;
            case COLUMN_INDEX_NAME:
                product.setName((String) cellValue);
                break;
            case COLUMN_INDEX_DESCRIPTION:
                product.setDescription((String) cellValue);
                break;
            case COLUMN_INDEX_COLOR:
                product.setColor((String) cellValue);
                break;
            case COLUMN_INDEX_CATEGORY:
                String category = (String) cellValue;
                product.setCategories(getArrayCategories(category));
                break;
            case COLUMN_INDEX_BRAND:
                product.setBrand((String) cellValue);
                break;
            case COLUMN_INDEX_PRICE:
                product.setPrice(BigDecimal.valueOf((double) cellValue).longValue());
                break;
            case COLUMN_INDEX_STATUS:
                String status = (String) cellValue;
                product.setStatus(Status.valueOf(status));
                break;

        }
    }

    private static Category[] getArrayCategories(String category){
        String[] arr = category.split(",");
        Category[] categories = new Category[arr.length];
        for(int i = 0; i < arr.length; i++){
            categories[i] = Category.valueOf(arr[i]);
        }

        return categories;
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


}
