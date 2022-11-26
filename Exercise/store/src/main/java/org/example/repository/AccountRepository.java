package org.example.repository;

import org.example.model.account.*;
import org.example.model.cart.Cart;
import org.example.model.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountRepository {

    public static List<Account> accountList = new ArrayList<Account>();

    static{
        accountList.add(new Administrator(1, "0987654321", "12345", "Ngọc Admin" ,"ngoc@gmail.com", Gender.FEMALE, LocalDate.of(1996,10,10),
                null , AccountStatus.ACTIVE, Role.ADMIN));
        accountList.add(new Customer(7, "0123456789", "12345", "Thanh Ngọc", "ngoc@gmail.com", Gender.FEMALE,
                LocalDate.of(1996, 8,19), new Address("Thanh Ngọc", "0123456789", "Ngõ 10",  "Trung Văn", "Nam Từ Liêm", "Hà Nội"),
                AccountStatus.ACTIVE, Role.CUSTOMER, createCart()));
    }

    public static Cart createCart(){
        Map<Product, Integer> listProduct = new HashMap<>();
        return new Cart(listProduct);
    }

    public static int getMaxId(){
        int max = 0;
        for(Account account: accountList){
            if(account.getId() > max){
                max = account.getId();
            }
        }
        return max + 1;
    }

}
