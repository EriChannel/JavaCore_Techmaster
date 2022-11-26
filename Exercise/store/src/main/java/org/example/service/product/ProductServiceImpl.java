package org.example.service.product;

import org.example.model.product.Category;
import org.example.model.product.Product;
import org.example.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl {
    public List<Product> getAllProducts(){
        return ProductRepository.productList;
    }


    public List<Product> getProductsByName(String name){
        return getAllProducts().stream().filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Product> getProductByCategory(Category category){
        List<Product> list = new ArrayList<>();
        for(Product p: getAllProducts()){
            for(Category c : p.getCategories()){
                if(c.equals(category)){
                    list.add(p);
                }
            }
        }
        return list;
    }

    public List<Product> getProductsByBrand(String brand){
        return getAllProducts().stream().filter(p -> p.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }

    public Product getProductById( int id){
        for(Product product: getAllProducts()){
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public List<Product> filterProductByPrice(List<Product> list, long startPrice, long endPrice){
        return list.stream().filter(p -> p.getPrice() > startPrice && p.getPrice() <= endPrice)
                .collect(Collectors.toList());
    }

    public boolean addNewProduct(Product product){
        return getAllProducts().add(product);
    }

    public int getMaxId(){
        int max = 0;
        for(Product product : getAllProducts()){
            if(product.getId() > max){
                max = product.getId();
            }
        }
        return max + 1;
    }

    public boolean deleteProduct(Product product){
        return getAllProducts().remove(product);
    }
}
