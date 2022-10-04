package model;

public class Product {
    private int id;
    private String name;
    private String description;
    private Category[] categories;
    private String brand;
    private long price;
    private Status status;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + description + " - " +
                Util.printCategory(categories) + " - " + brand +
                " - " + Util.formatPrice(price) +   " - " + status.getValue();
    }
}
