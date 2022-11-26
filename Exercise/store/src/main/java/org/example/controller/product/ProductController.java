package org.example.controller.product;

import org.example.model.account.Account;
import org.example.model.account.Role;
import org.example.model.product.Product;
import org.example.repository.ProductRepository;
import org.example.service.product.ProductServiceImpl;
import org.example.util.InputData;
import org.example.util.Menu;
import org.example.util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {

    ProductServiceImpl productService;
    Scanner sc;

    public ProductController() {
        productService = new ProductServiceImpl();
        sc = new Scanner(System.in);
    }

    public void productAction(Account account) {
        boolean isContinue = true;
        while (isContinue) {
            Menu.productMenu();
            int option = InputData.inputOption();
            switch (option) {
                case 1:
                    //xem tất cả sản phẩm
                    showAllProduct(account);
                    break;
                case 2:
                    //Tìm sản phẩm theo tên
                    getProductByName(account);
                    break;
                case 3:
                    //Xem sản phẩm theo danh mục
                    getProductByCategory(account);
                    break;
                case 4:
                    //Xem sản phẩm theo hãng
                    getProductByBrand(account);
                    break;
                case 0:
                    //Về trang trước
                    isContinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");

            }
        }
    }

    private void getProductByBrand(Account account) {
    }

    private void getProductByCategory(Account account) {

    }

    private void getProductByName(Account account) {
    }


    private void showAllProduct(Account account) {
        System.out.println("-----DANH SÁCH SẢN PHẨM-----");
        printProduct(ProductRepository.productList);
        if(account == null || account.getRole() == Role.CUSTOMER){
            sortProduct(account, productService.getAllProducts());
        }
    }

    private void sortProduct(Account account, List<Product> allProducts) {
        boolean isContinue = true;
        while (isContinue) {
            Menu.subMenuProduct();
            int option = InputData.inputOption();
            switch (option) {
                case 1:
                    //Tìm sản phẩm theo id
                    getProductById(account);
                    break;
                case 2:
                    //Lọc sản phẩm theo mức giá
                    filterProductByPrice(allProducts);
                    break;
                case 3:
                    //Sắp xếp theo giá tăng dần
                    sortAscending(allProducts);
                    break;
                case 4:
                    //sắp xếp theo giá giảm dần
                    sortDescending(allProducts);
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    private void getProductById(Account account) {
        Menu.getProductByIdMenu();
        int id = InputData.inputOption();
        Product product = productService.getProductById(id);
        if (product == null) {
            System.out.println("Không tìm thấy sản phẩm có id " + id);
        } else {
            System.out.println("-----THÔNG TIN SẢN PHẨM-----");
            printInfoProduct(product);
            if (account == null || account.getRole() == Role.CUSTOMER) {
                System.out.println("Thêm sản phẩm vào giỏ hàng");
            }else{
                //deleteOrUpdateProduct(product);
            }
        }
    }

    private void filterProductByPrice(List<Product> list){
        boolean isContinue = true;
        List<Product> listResult = new ArrayList<>();
        while (isContinue) {
            Menu.priceMenu();
            int option = InputData.inputOption();
            switch (option) {
                case 1:
                    listResult = productService.filterProductByPrice(list, 0, 2000000);
                    break;
                case 2:
                    listResult = productService.filterProductByPrice(list, 2000000, 5000000);
                    break;
                case 3:
                    listResult = productService.filterProductByPrice(list, 5000000, 10000000);
                    break;
                case 4:
                    listResult = productService.filterProductByPrice(list, 10000000, Integer.MAX_VALUE);
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
            if (option != 0) {
                System.out.println("Tìm được " + listResult.size() + " sản phẩm");
                printProduct(listResult);
            }
        }
    }

    private void sortDescending(List<Product> list) {
        System.out.println("-----DANH SÁCH SẮP XẾP GIẢM DẦN THEO GIÁ-----");
        list.stream().sorted((p1, p2) -> (int) (p2.getPrice() - p1.getPrice()))
                .forEach(p -> System.out.println(p.getId() + " - " + p.getName() + " - " +
                        Util.formatPrice(p.getPrice()) + " - " + p.getBrand()));
    }

    private void sortAscending(List<Product> list) {
        System.out.println("-----DANH SÁCH SẮP XẾP TĂNG DẦN THEO GIÁ-----");
        list.stream().sorted((p1, p2) -> (int) (p2.getPrice() - p1.getPrice()))
                .forEach(p -> System.out.println(p.getId() + " - " + p.getName() + " - " +
                        Util.formatPrice(p.getPrice()) + " - " + p.getBrand()));
    }

    private void printInfoProduct(Product product) {
        System.out.println("ID: " + product.getId());
        System.out.println("Tên sản phẩm: " + product.getName());
        System.out.println("Mô tả: " + product.getDescription());
        System.out.println("Màu: " + product.getColor());
        System.out.println("Hãng: " + product.getBrand());
        System.out.println("Danh mục: " + Util.printCategory(product.getCategories()));
        System.out.println("Giá sản phẩm: " + Util.formatPrice(product.getPrice()));
        System.out.println("Trạng thái: " + product.getStatus().getValue());
    }


    private void printProduct(List<Product> productList) {
        for (Product p : productList) {
            System.out.println(p.getId() + " - " + p.getName() + " - " + Util.formatPrice(p.getPrice()) +
                    " - " + p.getBrand());
        }
    }
}
