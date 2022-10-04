package org.example.service;

import org.example.model.Category;
import org.example.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<Product>();
        try {
            products = FileProduct.readExcel("FPTProduct.xlsx");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    public List<Product> getProductByName(List<Product> list, String name) {

        return null;
    }

    public List<Product> getProductByCategory(List<Product> list, Category category) {


        return null;
    }

    public List<Product> getProductsByPrice(List<Product> list, long firstPrice, long endPrice) {
        return null;
    }

    public List<Product> sortProductByPrice(List<Product> list) {
        return null;
    }





}
