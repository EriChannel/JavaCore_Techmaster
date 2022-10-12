package org.example.controller;

import org.example.model.Category;
import org.example.model.Product;
import org.example.service.ProductServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Controller {
    Scanner sc;
    ProductServiceImpl productService;

    public Controller() {
        sc = new Scanner(System.in);
        productService = new ProductServiceImpl();
    }

    public void main(){
        while (true){
            Menu.mainMenu();
            System.out.println("Lựa chọn của bạn là: ");
            int option = inputOption();

            switch (option){
                case 1:
                    System.out.println("--------Danh sách sản phẩm--------");
                    productService.print();
                    break;
                case 2:
                    findProductsByName();
                    break;
                case 3:
                    findProductsByCategory();
                    break;
                case 4:
                    findProductsByPrice();
                    break;
                case 5:
                    countProductsByCategory();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");

            }
        }
    }

    private void countProductsByCategory() {
        Map<Category, Integer> map = productService.countProductByCategory();

        for(Map.Entry<Category, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    private void findProductsByPrice() {
        List<Product> list = new ArrayList<>();
        while(true){
            Menu.priceMenu();
            System.out.println("Chọn mức giá:");
            int option = inputOption();
            switch (option){
                case 1:
                    list = productService.getProductsByPrice(0, 2000000);
                    break;
                case 2:
                    list = productService.getProductsByPrice(2000000, 5000000);
                    break;
                case 3:
                    list = productService.getProductsByPrice(5000000, 10000000);
                    break;
                case 4:
                    list = productService.getProductsByPrice(10000000, Integer.MAX_VALUE);
                    break;
                case 5:
                    main();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }

            System.out.println("Tìm được " + list.size() + " sản phẩm");
            printListProduct(list);
        }

    }

    private void findProductsByCategory() {
        List<Product> list = new ArrayList<>();
        Category category = null;
        while (category == null){
            Menu.categoryMenu();
            System.out.println("Lựa chọn của bạn là: ");
            int option = inputOption();
            category = getCategory(option);
        }
        list = productService.getProductsByCategory(category);
        System.out.println("Tìm được " + list.size() +
                " sản phẩm thuộc danh mục " + category.getValue() );
        printListProduct(list);
    }

    private Category getCategory(int option) {
        Category category = null;
        switch (option){
            case 1:
                category = Category.PHONE;
                break;
            case 2:
                category = Category.LAPTOP;
                break;
            case 3:
                category = Category.TABLET;
                break;
            case 4:
                category = Category.APPLE;
                break;
            case 5:
                category = Category.ACCESSORY;
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
        return category;
    }

    private void findProductsByName() {
        System.out.println("Nhập tên sản phẩm cần tìm: ");
        String name = sc.nextLine();
        List<Product> list = productService.getProductsByName(name);
        if(list.size() == 0){
            System.out.println("Không tìm thấy sản phẩm có tên là " + name);
        }else{
            System.out.println("Tìm thấy " + list.size() + " sản phẩm ");
            printListProduct(list);
        }
    }

    private void printListProduct(List<Product> list){
        for(Product product: list){
            System.out.println(product);
        }
    }

    private int inputOption(){

        while (true){
            try{
                int option = Integer.parseInt(sc.nextLine());
                //flag = true;
                return option;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai kiểu dữ liệu, vui lòng nhập lại");
            }
        }


    }


}
