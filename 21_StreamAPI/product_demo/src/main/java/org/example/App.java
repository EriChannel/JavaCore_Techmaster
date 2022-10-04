package org.example;

import org.example.model.Category;
import org.example.model.Product;
import org.example.service.FileProduct;
import org.example.service.ProductService;
import org.example.service.ProductServiceImpl;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProductServiceImpl service = new ProductServiceImpl();
        List<Product> products = service.getAllProducts();

        List<Product> listByCategory = service.getProductByCategory(products, Category.LAPTOP);
        listByCategory.forEach(System.out::println);
        System.out.println("\n--------------------------------\n");
        List<Product> sortPrice = service.sortProductByPrice(products);
        sortPrice.forEach(System.out::println);

    }
}
