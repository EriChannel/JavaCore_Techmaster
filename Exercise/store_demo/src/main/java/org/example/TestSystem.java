package org.example;

import org.example.controller.ProductController;
import org.example.model.product.Category;

import java.util.Arrays;

public class TestSystem {
    public static void main(String[] args) {
        ProductController controller = new ProductController();
        Category[] categories = controller.chooseCategory();
        System.out.println(Arrays.toString(categories));
    }
}
