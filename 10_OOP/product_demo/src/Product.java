public class Product {
    public int id;
    public String name;
    public String description;
    public Category[] categories;
    public String brand;
    public long price;
    public Status status;

    public Product(int id, String name, String description, Category[] categories, String brand, long price, Status status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.categories = categories;
        this.brand = brand;
        this.price = price;
        this.status = status;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + description + " - " +
                Util.printCategory(categories) + " - " + brand +
                " - " + Util.formatPrice(price) +   " - " + status.value;
    }
}
