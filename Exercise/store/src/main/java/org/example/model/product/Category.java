package org.example.model.product;

public enum Category {
    PHONE ("Điện thoại"),
    LAPTOP ("Laptop"),
    TABLET ("Máy tính bảng"),
    APPLE ("Apple"),
    ACCESSORY ("Phụ kiện");

    private String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
