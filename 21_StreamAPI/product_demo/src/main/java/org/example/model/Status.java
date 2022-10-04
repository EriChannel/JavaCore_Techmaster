package org.example.model;

public enum Status {
    STOCKING ("Còn hàng"),
    SOLD_OUT ("Tạm hết hàng"),
    DISCONTINUES ("Sản phẩm ngừng kinh doanh"),
    PRE_ORDER ("Đặt trước");


    private String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
