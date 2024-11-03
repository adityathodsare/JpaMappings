package com.SpringDataJPAMappings.JpaMappings.repository;

import com.SpringDataJPAMappings.JpaMappings.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface productRepository extends JpaRepository<Product,String> {
}
