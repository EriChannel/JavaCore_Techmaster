package org.example.util;

import org.example.model.account.Account;
import org.example.model.product.Category;
import org.example.repository.AccountRepository;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Iterator;

public class Util {
    public static String printCategory(Category[] categories){
        StringBuilder builder = new StringBuilder();
        Iterator<Category> iterator = Arrays.stream(categories).iterator();
        while (iterator.hasNext()){
            String category = iterator.next().getValue();
            builder.append(category);
            if(iterator.hasNext()){
                builder.append(", ");
            }
        }
        return builder.toString();

    }

    public static String formatPrice(long price){
        DecimalFormat format = new DecimalFormat("#,###,###,##0");
        return format.format(price);
    }

}
