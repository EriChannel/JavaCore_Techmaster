package org.example.repository;

import org.example.model.product.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    public static List<Product> productList = new ArrayList<>();

    static {
        String excelFilePath = "product.xlsx";
        try {
            productList = GetDataFromExcel.readFile(excelFilePath);
        } catch (IOException e) {
            System.out.println("Sai đường dẫn file");
        }
    }

}
