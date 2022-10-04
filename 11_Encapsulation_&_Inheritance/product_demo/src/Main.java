import model.Category;
import model.Product;
import model.Status;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "iPhone 13 128GB", "6.1 inch, OLED, Super Retina XDR, 2532 x 1170 Pixels",
                new Category[]{Category.PHONE, Category.APPLE}, "Apple (iPhone)",
                18990000, Status.STOCKING);
        System.out.println(product);

        product.setName("iPhone 13 256G");
        System.out.println(product.getName());
    }
}