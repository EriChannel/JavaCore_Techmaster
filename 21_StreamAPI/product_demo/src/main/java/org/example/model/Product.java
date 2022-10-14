package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.util.Util;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    private int id;
    private String name;
    private String description;
    private String color;
    private Category[] categories;
    private String brand;
    private long price;
    private Status status;

    @Override
    public String toString() {
        return id + " - " + name + " - " + description + " - " + color + " - " +
                Util.printCategory(categories) + " - " + brand + " - " +
                Util.formatPrice(price) +" - " + status.getValue();
    }
}
