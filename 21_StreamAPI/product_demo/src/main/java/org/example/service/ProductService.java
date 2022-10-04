package org.example.service;

import org.example.model.Category;
import org.example.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductByName(List<Product> list, String name);

    List<Product> getProductByCategory(List<Product> list, Category category);

    List<Product> getProductsByPrice(List<Product> list, long firstPrice, long endPrice);

    List<Product> sortProductByPrice(List<Product> list);
}
