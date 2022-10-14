package org.example.service;

import org.example.model.Category;
import org.example.model.Product;
import org.example.repository.ProductRepository;

import java.util.*;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService{

    ProductRepository productRepo;
    List<Product> productList;

    public ProductServiceImpl() {
        productRepo = new ProductRepository();
        productList = productRepo.getAllProducts();
    }

    @Override
    public void print() {
//        for(Product product: productList){
//            System.out.println(product);
//        }

        productList.forEach(System.out::println);
    }

    @Override
    public List<Product> getProductsByName(String name) {
//        List<Product> list = new ArrayList<>();
//        for(Product p : productList){
//            if(p.getName().toLowerCase().contains(name.toLowerCase())){
//                list.add(p);
//            }
//        }
//        return list;
        List<Product> list = productList.stream()
                .filter(product -> product.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
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
//        List<Product> list = new ArrayList<>();
//        for(Product p : productList){
//            if(p.getPrice() > startPrice && p.getPrice() <= endPrice){
//                list.add(p);
//            }
//        }
//        return list;
        return productList.stream()
                .filter(product -> product.getPrice() > startPrice && product.getPrice() <= endPrice)
                .collect(Collectors.toList());
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

    @Override
    public void sortProductByPriceIncrease() {
        productList.stream()
                .sorted((p1, p2) -> (int) (p1.getPrice() - p2.getPrice()))
                .forEach(System.out::println);
    }

    @Override
    public void sortProductByPriceDecrease() {
        productList.stream()
                .sorted((p1, p2) -> (int) (p2.getPrice() - p1.getPrice()))
                .forEach(System.out::println);
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return productList.stream()
                .filter(product -> product.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }

    public Set<String> getAllBrands(){
        Set<String> brands = new HashSet<>();
        for(Product product: productList){
            brands.add(product.getBrand());
        }
        return brands;
    }
}
