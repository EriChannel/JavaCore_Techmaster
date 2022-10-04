package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.util.Util;

import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Product {
    private int id;
    private String name;
    private String description;
    private Category[] category;
    private String brand;
    private long price;
    private Status status;

    @Override
    public String toString() {
        return id + " - " + name + " - " + description + " - " + Util.printCategory(category) +
                " - " + brand + " - " + Util.formatPrice(price) +" - " + status.getValue();
    }
}
