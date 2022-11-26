package org.example.model.account;

public enum Role {
    ADMIN ("Quản trị viên"),
    CUSTOMER ("Khách hàng");

    private String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
