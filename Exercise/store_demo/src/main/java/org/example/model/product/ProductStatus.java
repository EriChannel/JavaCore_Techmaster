package org.example.model.product;

public enum ProductStatus {
    STOCKING ("Còn hàng"),
    DISCONTINUES ("Ngừng kinh doanh"),
    SOLD_OUT ("Tạm hết hàng"),
    PRE_ORDER ("Đặt trước");

    private String value;

    ProductStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
