package model;

public enum Status {
    STOCKING ("Còn hàng"),
    SOLD_OUT ("Tạm hết hàng");

    private String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
