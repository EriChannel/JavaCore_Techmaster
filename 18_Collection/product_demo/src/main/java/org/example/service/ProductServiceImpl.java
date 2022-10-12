package org.example.service;

import org.example.model.Category;
import org.example.model.Product;
import org.example.repository.ProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{

    ProductRepository productRepo;
    List<Product> productList;

    public ProductServiceImpl() {
        productRepo = new ProductRepository();
        productList = productRepo.getAllProducts();
    }

    @Override
    public void print() {
        for(Product product: productList){
            System.out.println(product);
        }
    }

    @Override
    public List<Product> getProductsByName(String name) {
        List<Product> list = new ArrayList<>();
        for(Product p : productList){
            if(p.getName().toLowerCase().contains(name.toLowerCase())){
                list.add(p);
            }
        }
        return list;
    }

    @Override
    public List<Product> getProductsByCategory(Category category) {
        List<Product> list = new ArrayList<>();
        for(Product p: productList){
            Category[] categories = p.getCategories();
            for(Category c : categories){
                if(c.equals(category)){
                    list.add(p);
                }
            }
        }
        return list;
    }

    @Override
    public List<Product> getProductsByPrice(long startPrice, long endPrice) {
        List<Product> list = new ArrayList<>();
        for(Product p : productList){
            if(p.getPrice() > startPrice && p.getPrice() <= endPrice){
                list.add(p);
            }
        }
        return list;
    }

    @Override
    public Map<Category, Integer> countProductByCategory() {
        Map<Category, Integer> categoryMap = new HashMap<>();
        for(Product product : productList){
            for(Category category : product.getCategories()){
                if(categoryMap.containsKey(category)){
                    categoryMap.put(category, categoryMap.get(category) + 1);
                }else{
                    categoryMap.put(category, 1);
                }
            }
        }
        return categoryMap;
    }
}
