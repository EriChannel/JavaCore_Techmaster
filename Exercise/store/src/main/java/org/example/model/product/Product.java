package org.example.model.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String name;
    private String description;
    private String color;
    private Category[] categories;
    private String brand;
    private long price;
    private int quantity;
    private ProductStatus status;



}
