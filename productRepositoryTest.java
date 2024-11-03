package com.SpringDataJPAMappings.JpaMappings.repository;

import com.SpringDataJPAMappings.JpaMappings.entity.Category;
import com.SpringDataJPAMappings.JpaMappings.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.annotation.Id;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class productRepositoryTest {

    @Autowired
    productRepository productRepository;

    @Test
    public void addDetails(){
        Category category = Category.builder()
                .CategoryId("ele123")
                .categoryTitle("Electronics")
                .build();

        Category category1 = Category.builder()
                .CategoryId("mob123")
                .categoryTitle("mobile phones")
                .build();

        Product product= Product.builder()
                .productId("samsung123")
                .productName("samsung s23")
                .categoryList(List.of(category,category1)).build();

        Product product1= Product.builder()
                .productId("apple123")
                .productName("iphone 15")
                .categoryList(List.of(category,category1)).build();


        productRepository.saveAll(List.of(product,product1));


    }

}