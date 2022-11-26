package org.example.controller;

import org.example.model.account.Account;
import org.example.model.account.Customer;
import org.example.model.account.Role;
import org.example.model.product.Category;
import org.example.model.product.Product;
import org.example.model.product.ProductStatus;
import org.example.repository.ProductRepository;
import org.example.service.ProductServiceImpl;
import org.example.util.InputData;
import org.example.util.Menu;
import org.example.util.Util;

import java.util.*;

public class ProductController {
    ProductServiceImpl productService;
    Scanner sc;

    public ProductController() {
        productService = new ProductServiceImpl();
        sc = new Scanner(System.in);
    }

    //Admin action
    public void getListProductByAdmin(Account account) {
        boolean isContinue = true;
        while (isContinue){
            System.out.println("-----DANH SÁCH SẢN PHẨM-----");
            printProduct(productService.getAllProducts());
            Menu.productActionByAdmin();
            int option = InputData.inputOption();
            switch (option){
                case 1:
                    //Tìm sản phẩm theo id
                    getProductById(account);
                    break;
                case 2:
                    //Tìm sản phẩm theo tên
                    getProductByName(account);
                    break;
                case 3:
                    getProductByCategory(account);
                    break;
                case 4:
                    getProductByBrand(account);
                    break;
                case 5:
                    //Add new product
                    addNewProduct();
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    private void addNewProduct() {
        Product product = createProduct();
        if(productService.addNewProduct(product)){
            System.out.println("Thêm sản phẩm mới thành công");
            printInfoProduct(product);
        }else{
            System.out.println("Thêm thất bại");
        }
    }

    public Product createProduct(){
        Product product = new Product();
        product.setId(productService.getMaxId());
        System.out.print("Nhập tên sản phẩm: ");
        product.setName(sc.nextLine());
        System.out.print("Nhập mô tả: ");
        product.setDescription(sc.nextLine());
        System.out.print("Nhập màu sắc: ");
        product.setColor(sc.nextLine());
        System.out.print("Chọn danh mục: ");
        product.setCategories(chooseCategory());
        System.out.print("Nhập hãng: ");
        product.setBrand(sc.nextLine());
        System.out.print("Nhập giá: ");
        product.setPrice(Long.parseLong(sc.nextLine()));
        System.out.print("Nhập số lượng: ");
        product.setQuantity(InputData.inputOption());
        product.setStatus(ProductStatus.STOCKING);
        return product;
    }

    //Customer
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
        System.out.print("Nhập tên hãng cần tìm: ");
        String brand = sc.nextLine();
        List<Product> list = productService.getProductsByBrand(brand);
        if (list.size() == 0) {
            System.out.println("Không tìm thấy sản phẩm thuộc hãng " + brand);
        } else {
            System.out.println("Tìm thấy " + list.size() + " sản phẩm thuộc hãng " + brand);
            printProduct(list);
            sortProduct(account, list);
        }
    }

    private void sortProduct(Account account, List<Product> list) {
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
                    filterProductByPrice(list);
                    break;
                case 3:
                    //Sắp xếp theo giá tăng dần
                    sortAscending(list);
                    break;
                case 4:
                    //sắp xếp theo giá giảm dần
                    sortDescending(list);
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
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

    private void filterProductByPrice(List<Product> list) {
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
                addProductToCart(product, account);
            }else{
                deleteOrUpdateProduct(product);
            }
        }
    }

    private void deleteOrUpdateProduct(Product product) {
        boolean isContinue = true;
        while (isContinue){
            Menu.deleteOrUpdateProduct();
            int option = InputData.inputOption();
            switch (option){
                case 1:
                    //Xóa sản phẩm
                    deleteProduct(product);
                    isContinue = false;
                    break;
                case 2:
                    //Cập nhật sản phẩm
                    updateProduct(product);
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    private void updateProduct(Product product) {
        System.out.println("Nếu thông tin không cần cập nhật chọn 0 để bỏ qua");
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        if(!name.equals("0")){
            product.setName(name);
        }

        System.out.print("Nhập mô tả sản phẩm: ");
        String description = sc.nextLine();
        if(!description.equals("0")){
           product.setDescription(description);
        }

        System.out.print("Nhập màu sản phẩm: ");
        String color = sc.nextLine();
        if(!color.equals("0")){
            product.setColor(color);
        }

        System.out.println("Chọn danh mục sản phẩm: ");
        Category[] categories = chooseCategory();
        if(categories != null){
            product.setCategories(categories);
        }

        System.out.print("Nhập hãng sản phẩm: ");
        String brand = sc.nextLine();
        if(!brand.equals("0")){
            product.setBrand(brand);
        }

        System.out.print("Nhập giá sản phẩm: ");
        long price = Long.parseLong(sc.nextLine());
        if(price != 0){
            product.setPrice(price);
        }

        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(sc.nextLine());
        if(quantity != 0){
            product.setQuantity(quantity);
        }

        System.out.print("Cập nhật trạng thái: ");
        ProductStatus productStatus = chooseProductStatus(product);
        product.setStatus(productStatus);

        printInfoProduct(product);
    }

    private ProductStatus chooseProductStatus(Product product) {
        ProductStatus productStatus = null;
        boolean isContinue = true;
        while (isContinue){
            isContinue = false;
            Menu.chooseProductStatusMenu();
            int option = InputData.inputOption();
            switch (option){
                case 1:
                    productStatus = ProductStatus.STOCKING;
                    break;
                case 2:
                    productStatus = ProductStatus.SOLD_OUT;
                    break;
                case 3:
                    productStatus = ProductStatus.PRE_ORDER;
                    break;
                case 4:
                    productStatus = ProductStatus.DISCONTINUES;
                    break;
                case 0:
                    productStatus = product.getStatus();
                    break;
                default:
                    System.out.println("Không có lựa chọn này, vui lòng chọn lại");
            }
        }
        return productStatus;
    }

    private void deleteProduct(Product product) {
        if(productService.deleteProduct(product)){
            System.out.println("Xóa sản phẩm thành công");
        }else{
            System.out.println("Xóa thất bại");
        }
    }

    private void addProductToCart(Product product, Account account) {
        boolean isContinue = true;
        while (isContinue) {
            Menu.addProductToCartMenu();
            int option = InputData.inputOption();
            if (option == 0) {
                isContinue = false;
            } else if (option == 1) {
                if (account == null) {
                    System.out.println("Bạn cần phải đăng nhập mới có thể mua hàng");
                } else {
                    Customer customer = (Customer) account;
                    int amount = 0;
                    do {
                        System.out.print("Nhập số sản phẩm bạn muốn thêm: ");
                        amount = InputData.inputOption();
                    } while (amount <= 0 && amount > product.getQuantity());


                    customer.getCart().getListProduct().put(product, amount);
                    System.out.println("Thêm thành công");
                }
                isContinue = false;
            } else {
                System.out.println("Không có lựa chọn này, vui lòng chọn lại");
            }
        }

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

    private void getProductByCategory(Account account) {
        boolean isContinue = true;
        Category category = null;

        while (isContinue) {
            Menu.chooseCategory();
            int option = InputData.inputOption();
            isContinue = false;
            switch (option) {
                case 1:
                    //Điện thoại
                    category = Category.PHONE;
                    break;
                case 2:
                    //Laptop
                    category = Category.LAPTOP;
                    break;
                case 3:
                    //Máy tính bảng
                    category = Category.TABLET;
                    break;
                case 4:
                    //Apple
                    category = Category.APPLE;
                    break;
                case 5:
                    //Phụ kiện
                    category = Category.ACCESSORY;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    isContinue = true;
            }
        }
        List<Product> productList = productService.getProductByCategory(category);
        if (productList.size() == 0) {
            System.out.println("Không tìm thấy sản phẩm");
        } else {
            System.out.println("Tìm thấy " + productList.size() + " sản phẩm thuộc danh mục " + category);
            printProduct(productList);
            if(account == null || account.getRole() == Role.CUSTOMER){
                sortProduct(account, productList);
            }
        }


    }

    public Category[] chooseCategory() {
        boolean isContinue = true;
        List<Category> categoryList = new ArrayList<>();
        while (isContinue) {
            Menu.chooseCategory();
            int option = InputData.inputOption();
            switch (option) {
                case 1:
                    //Điện thoại
                    categoryList.add(Category.PHONE);
                    break;
                case 2:
                    //Laptop
                    categoryList.add(Category.LAPTOP);
                    break;
                case 3:
                    //Máy tính bảng
                    categoryList.add(Category.TABLET);
                    break;
                case 4:
                    //Apple
                    categoryList.add(Category.APPLE);
                    break;
                case 5:
                    //Phụ kiện
                    categoryList.add(Category.ACCESSORY);
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }

        }
        Category[] categories = new Category[categoryList.size()];
        return categoryList.toArray(categories);
    }

    private void getProductByName(Account account) {
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String name = sc.nextLine();
        List<Product> productList = productService.getProductsByName(name);
        if (productList.size() == 0) {
            System.out.println("không tìm thấy sản phẩm có tên là " + name);
        } else {
            System.out.println("Tìm thấy " + productList.size() + " sản phẩm");
            printProduct(productList);
            if(account == null || account.getRole() == Role.CUSTOMER){
                sortProduct(account, productList);
            }

        }
    }

    private void showAllProduct(Account account) {
        System.out.println("-----DANH SÁCH SẢN PHẨM-----");
        printProduct(ProductRepository.productList);
        if(account == null || account.getRole() == Role.CUSTOMER){
            sortProduct(account, productService.getAllProducts());
        }
    }

    private void printProduct(List<Product> list) {
        for (Product p : list) {
            System.out.println(p.getId() + " - " + p.getName() + " - " + Util.formatPrice(p.getPrice()) +
                    " - " + p.getBrand());
        }
    }

}
