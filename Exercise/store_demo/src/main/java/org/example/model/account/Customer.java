package org.example.model.account;

import org.example.model.cart.Cart;

import java.time.LocalDate;

public class Customer extends Account{
    private Cart cart;

    public Customer() {
    }

    public Customer(int id, String mobile, String password, String fullName, String email, Gender gender, LocalDate dob, Address address, AccountStatus status, Role role, Cart cart) {
        super(id, mobile, password, fullName, email, gender, dob, address, status, role);
        this.cart = cart;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
