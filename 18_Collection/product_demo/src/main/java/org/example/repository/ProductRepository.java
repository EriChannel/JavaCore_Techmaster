package org.example.repository;

import org.example.model.Product;

import java.io.IOException;
import java.util.List;

public class ProductRepository {

    public List<Product> getAllProducts(){
        String excelFilePath = "product.xlsx";
        List<Product> productList = null;
        try {
            productList = GetDataFromExcel.readFile(excelFilePath);
        } catch (IOException e) {
            System.out.println("Sai đường dẫn file");
        }


        return productList;
    }
}
