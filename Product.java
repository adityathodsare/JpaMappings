package com.SpringDataJPAMappings.JpaMappings.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "productTable")
public class Product {
    @Id
    private String productId;
    private String productName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "product_category_map",
            joinColumns = @JoinColumn(
                    name = "productId",
                    referencedColumnName = "productId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "CategoryId",
                    referencedColumnName = "CategoryId"
            )
    )
    private List<Category> categoryList;

}
