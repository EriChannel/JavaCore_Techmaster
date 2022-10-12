package org.example.service;

import org.example.model.Category;
import org.example.model.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {

    void print();

    List<Product> getProductsByName(String name);

    List<Product> getProductsByCategory(Category category);

    List<Product> getProductsByPrice(long startPrice, long endPrice);

    Map<Category, Integer>  countProductByCategory();
}
