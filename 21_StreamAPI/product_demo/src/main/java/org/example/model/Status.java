package org.example.model;

public enum Status {
    STOCKING ("Còn hàng"),
    DISCONTINUES ("Ngừng kinh doanh"),
    SOLD_OUT ("Tạm hết hàng"),
    PRE_ORDER ("Đặt trước");

    private String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
